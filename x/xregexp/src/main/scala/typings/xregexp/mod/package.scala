package typings.xregexp.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Pick
import typings.std.Record
import typings.std.Required
import typings.std.TemplateStringsArray
import typings.xregexp.mod.^
import typings.xregexp.xregexpStrings.all
import typings.xregexp.xregexpStrings.one
import typings.xregexp.xregexpStrings.sticky
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


//#region constructor
/**
  * Creates an extended regular expression object for matching text with a pattern. Differs from a
  * native regular expression in that additional syntax and flags are supported. The returned object
  * is in fact a native `RegExp` and works with all native methods.
  *
  * @param pattern - Regex pattern string, or an existing regex object to copy.
  * @param flags - Any combination of flags.
  *
  *   Native flags:
  *     - `d` - indices for capturing groups (ES2021)
  *     - `g` - global
  *     - `i` - ignore case
  *     - `m` - multiline anchors
  *     - `u` - unicode (ES6)
  *     - `y` - sticky (Firefox 3+, ES6)
  *
  *   Additional XRegExp flags:
  *     - `n` - named capture only
  *     - `s` - dot matches all (aka singleline) - works even when not natively supported
  *     - `x` - free-spacing and line comments (aka extended)
  *     - `A` - 21-bit Unicode properties (aka astral) - requires the Unicode Base addon
  *
  *   **Flags cannot be provided when constructing one `RegExp` from another.**
  * @returns Extended regular expression object.
  * @example
  *
  * // With named capture and flag x
  * XRegExp('(?<year>  [0-9]{4} ) -?  # year  \n\
  *          (?<month> [0-9]{2} ) -?  # month \n\
  *          (?<day>   [0-9]{2} )     # day   ', 'x');
  *
  * // Providing a regex object copies it. Native regexes are recompiled using native (not XRegExp)
  * // syntax. Copies maintain extended data, are augmented with `XRegExp.prototype` properties, and
  * // have fresh `lastIndex` properties (set to zero).
  * XRegExp(/regex/);
  */
inline def apply(pattern: String): js.RegExp = ^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any]).asInstanceOf[js.RegExp]
inline def apply(pattern: String, flags: String): js.RegExp = (^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[js.RegExp]
inline def apply(
  pattern: String,
  flags: /* import warning: importer.ImportType#apply Failed type conversion: string extends std.RegExp ? undefined : string | undefined */ js.Any
): js.RegExp = (^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[js.RegExp]
inline def apply(pattern: js.RegExp): js.RegExp = ^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any]).asInstanceOf[js.RegExp]
inline def apply(
  pattern: js.RegExp,
  flags: /* import warning: importer.ImportType#apply Failed type conversion: std.RegExp extends std.RegExp ? undefined : string | undefined */ js.Any
): js.RegExp = (^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[js.RegExp]

//#endregion
//#region methods
/**
  * Extends XRegExp syntax and allows custom flags. This is used internally and can be used to
  * create XRegExp addons. If more than one token can match the same string, the last added wins.
  *
  * @param regex - Regex object that matches the new token.
  * @param handler - Function that returns a new pattern string (using native regex syntax)
  *   to replace the matched token within all future XRegExp regexes. Has access to persistent
  *   properties of the regex being built, through `this`.  The handler function becomes part
  *   of the XRegExp construction process, so be careful not to construct XRegExps within the
  *   function or you will trigger infinite recursion.
  * @param options - Options object with optional properties.
  * @example
  *
  * // Basic usage: Add \a for the ALERT control code
  * XRegExp.addToken(
  *   /\\a/,
  *   () => '\\x07',
  *   { scope: 'all' }
  * );
  * XRegExp('\\a[\\a-\\n]+').test('\x07\n\x07'); // -> true
  *
  * // Add the U (ungreedy) flag from PCRE and RE2, which reverses greedy and lazy quantifiers.
  * // Since `scope` is not specified, it uses 'default' (i.e., transformations apply outside of
  * // character classes only)
  * XRegExp.addToken(
  *   /([?*+]|{\d+(?:,\d*)?})(\??)/,
  *   (match) => `${match[1]}${match[2] ? '' : '?'}`,
  *   { flag: 'U' }
  * );
  * XRegExp('a+', 'U').exec('aaa')[0]; // -> 'a'
  * XRegExp('a+?', 'U').exec('aaa')[0]; // -> 'aaa'
  */
inline def addToken(
  regex: js.RegExp,
  handler: js.Function3[/* match */ MatchArray, /* scope */ TokenScope, /* flags */ String, String]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addToken")(regex.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addToken(
  regex: js.RegExp,
  handler: js.Function3[/* match */ MatchArray, /* scope */ TokenScope, /* flags */ String, String],
  options: TokenOptions
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addToken")(regex.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * Adds to the list of Unicode tokens that XRegExp regexes can match via `\p` or `\P`.
  *
  * @param data - Objects with named character ranges. Each object may have properties
  *   `name`, `alias`, `isBmpLast`, `inverseOf`, `bmp`, and `astral`. All but `name` are
  *   optional, although one of `bmp` or `astral` is required (unless `inverseOf` is set). If
  *   `astral` is absent, the `bmp` data is used for BMP and astral modes. If `bmp` is absent,
  *   the name errors in BMP mode but works in astral mode. If both `bmp` and `astral` are
  *   provided, the `bmp` data only is used in BMP mode, and the combination of `bmp` and
  *   `astral` data is used in astral mode. `isBmpLast` is needed when a token matches orphan
  *   high surrogates *and* uses surrogate pairs to match astral code points. The `bmp` and
  *   `astral` data should be a combination of literal characters and `\xHH` or `\\uHHHH` escape
  *   sequences, with hyphens to create ranges. Any regex metacharacters in the data should be
  *   escaped, apart from range-creating hyphens. The `astral` data can additionally use
  *   character classes and alternation, and should use surrogate pairs to represent astral code
  *   points. `inverseOf` can be used to avoid duplicating character data if a Unicode token is
  *   defined as the exact inverse of another token.
  * @param typePrefix - Enables optionally using this type as a prefix for all of the
  *   provided Unicode tokens, e.g. if given `'Type'`, then `\p{TokenName}` can also be written
  *   as `\p{Type=TokenName}`.
  * @example
  *
  * // Basic use
  * XRegExp.addUnicodeData([{
  *   name: 'XDigit',
  *   alias: 'Hexadecimal',
  *   bmp: '0-9A-Fa-f'
  * }]);
  * XRegExp('\\p{XDigit}:\\p{Hexadecimal}+').test('0:3D'); // -> true
  */
inline def addUnicodeData(data: js.Array[UnicodeCharacterRange]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addUnicodeData")(data.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def addUnicodeData(data: js.Array[UnicodeCharacterRange], typePrefix: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addUnicodeData")(data.asInstanceOf[js.Any], typePrefix.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * Builds regexes using named subpatterns, for readability and pattern reuse. Backreferences in
  * the outer pattern and provided subpatterns are automatically renumbered to work correctly.
  * Native flags used by provided subpatterns are ignored in favor of the `flags` argument.
  *
  * @param pattern - XRegExp pattern using `{{name}}` for embedded subpatterns. Allows
  *   `({{name}})` as shorthand for `(?<name>{{name}})`. Patterns cannot be embedded within
  *   character classes.
  * @param subs - Lookup object for named subpatterns. Values can be strings or regexes. A
  *   leading `^` and trailing unescaped `$` are stripped from subpatterns, if both are present.
  * @param flags - Any combination of XRegExp flags.
  * @returns Regex with interpolated subpatterns.
  * @example
  *
  * const time = XRegExp.build('(?x)^ {{hours}} ({{minutes}}) $', {
  *   hours: XRegExp.build('{{h12}} : | {{h24}}', {
  *     h12: /1[0-2]|0?[1-9]/,
  *     h24: /2[0-3]|[01][0-9]/
  *   }, 'x'),
  *   minutes: /^[0-5][0-9]$/
  * });
  * time.test('10:59'); // -> true
  * XRegExp.exec('10:59', time).groups.minutes; // -> '59'
  */
inline def build(pattern: String, subs: Record[String, Pattern]): js.RegExp = (^.asInstanceOf[js.Dynamic].applyDynamic("build")(pattern.asInstanceOf[js.Any], subs.asInstanceOf[js.Any])).asInstanceOf[js.RegExp]
inline def build(pattern: String, subs: Record[String, Pattern], flags: String): js.RegExp = (^.asInstanceOf[js.Dynamic].applyDynamic("build")(pattern.asInstanceOf[js.Any], subs.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[js.RegExp]

/**
  * Caches and returns the result of calling `XRegExp(pattern, flags)`. On any subsequent call with
  * the same pattern and flag combination, the cached copy of the regex is returned.
  *
  * @param pattern - Regex pattern string.
  * @param [flags] - Any combination of XRegExp flags.
  * @returns Cached XRegExp object.
  * @example
  *
  * let match;
  * while (match = XRegExp.cache('.', 'gs').exec('abc')) {
  *   // The regex is compiled once only
  * }
  */
inline def cache(pattern: String, flags: String): js.RegExp = (^.asInstanceOf[js.Dynamic].applyDynamic("cache")(pattern.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[js.RegExp]

/**
  * Escapes any regular expression metacharacters, for use when matching literal strings. The result
  * can safely be used at any position within a regex that uses any flags.
  *
  * @param str - String to escape.
  * @returns String with regex metacharacters escaped.
  * @example
  *
  * XRegExp.escape('Escaped? <.>');
  * // -> 'Escaped\?\\u0020<\.>'
  */
inline def escape(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escape")(str.asInstanceOf[js.Any]).asInstanceOf[String]

/**
  * Executes a regex search in a specified string. Returns a match array or `null`. If the provided
  * regex uses named capture, named capture properties are included on the match array's `groups`
  * property. Optional `pos` and `sticky` arguments specify the search start position, and whether
  * the match must start at the specified position only. The `lastIndex` property of the provided
  * regex is not used, but is updated for compatibility. Also fixes browser bugs compared to the
  * native `RegExp.prototype.exec` and can be used reliably cross-browser.
  *
  * @param str - String to search.
  * @param regex - Regex to search with.
  * @param pos - Zero-based index at which to start the search.
  * @param sticky - Whether the match must start at the specified position
  *   only. The string `'sticky'` is accepted as an alternative to `true`.
  * @returns Match array with named capture properties on the `groups` object, or `null`. If
  *   the `namespacing` feature is off, named capture properties are directly on the match array.
  * @example
  *
  * // Basic use, with named capturing group
  * let match = XRegExp.exec('U+2620', XRegExp('U\\+(?<hex>[0-9A-F]{4})'));
  * match.groups.hex; // -> '2620'
  *
  * // With pos and sticky, in a loop
  * let pos = 3, result = [], match;
  * while (match = XRegExp.exec('<1><2><3><4>5<6>', /<(\d)>/, pos, 'sticky')) {
  *   result.push(match[1]);
  *   pos = match.groups.index + match[0].length;
  * }
  * // result -> ['2', '3', '4']
  */
inline def exec(str: String, regex: js.RegExp): ExecArray | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(str.asInstanceOf[js.Any], regex.asInstanceOf[js.Any])).asInstanceOf[ExecArray | Null]
inline def exec(str: String, regex: js.RegExp, pos: Double): ExecArray | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(str.asInstanceOf[js.Any], regex.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[ExecArray | Null]
inline def exec(str: String, regex: js.RegExp, pos: Double, sticky: Boolean): ExecArray | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(str.asInstanceOf[js.Any], regex.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], sticky.asInstanceOf[js.Any])).asInstanceOf[ExecArray | Null]
inline def exec(str: String, regex: js.RegExp, pos: Unit, sticky: Boolean): ExecArray | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(str.asInstanceOf[js.Any], regex.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], sticky.asInstanceOf[js.Any])).asInstanceOf[ExecArray | Null]

inline def exec_sticky(str: String, regex: js.RegExp, pos: Double, sticky: sticky): ExecArray | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(str.asInstanceOf[js.Any], regex.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], sticky.asInstanceOf[js.Any])).asInstanceOf[ExecArray | Null]
inline def exec_sticky(str: String, regex: js.RegExp, pos: Unit, sticky: sticky): ExecArray | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(str.asInstanceOf[js.Any], regex.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], sticky.asInstanceOf[js.Any])).asInstanceOf[ExecArray | Null]

/**
  * Executes a provided function once per regex match. Searches always start at the beginning of the
  * string and continue until the end, regardless of the state of the regex's `global` property and
  * initial `lastIndex`.
  *
  * @param str - String to search.
  * @param regex - Regex to search with.
  * @param callback - Function to execute for each match. Invoked with four arguments:
  *   - The match array, with named capture groups properties.
  *   - The zero-based match index.
  *   - The string being traversed.
  *   - The regex object being used to traverse the string.
  * @example
  *
  * // Extracts every other digit from a string
  * const evens = [];
  * XRegExp.forEach('1a2345', /\d/, (match, i) => {
  *   if (i % 2) evens.push(+match[0]);
  * });
  * // evens -> [2, 4]
  */
inline def forEach(
  str: String,
  regex: js.RegExp,
  callback: js.Function4[
  /* matches */ MatchArray, 
  /* index */ Double, 
  /* str */ String, 
  /* regex */ js.RegExp, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(str.asInstanceOf[js.Any], regex.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * Copies a regex object and adds flag `g`. The copy maintains extended data, is augmented with
  * `XRegExp.prototype` properties, and has a fresh `lastIndex` property (set to zero). Native
  * regexes are not recompiled using XRegExp syntax.
  *
  * @param regex - Regex to globalize.
  * @returns Copy of the provided regex with flag `g` added.
  * @example
  *
  * const globalCopy = XRegExp.globalize(/regex/);
  * globalCopy.global; // -> true
  */
inline def globalize(regex: js.RegExp): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("globalize")(regex.asInstanceOf[js.Any]).asInstanceOf[js.RegExp]

/**
  * Installs optional features according to the specified options. Can be undone using
  * `XRegExp.uninstall`.
  *
  * @param options - Options object or string.
  * @example
  *
  * // With an options object
  * XRegExp.install({
  *   // Enables support for astral code points in Unicode addons (implicitly sets flag A)
  *   astral: true,
  *
  *   // Adds named capture groups to the `groups` property of matches
  *   namespacing: true
  * });
  *
  * // With an options string
  * XRegExp.install('astral namespacing');
  */
inline def install(options: FeatureOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("install")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * Checks whether an individual optional feature is installed.
  *
  * @param feature - Name of the feature to check. One of:
  *   - `astral`
  *   - `namespacing`
  * @returns Whether the feature is installed.
  * @example
  *
  * XRegExp.isInstalled('astral');
  */
inline def isInstalled(feature: Feature): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstalled")(feature.asInstanceOf[js.Any]).asInstanceOf[Boolean]

/**
  * Returns `true` if an object is a regex; `false` if it isn't. This works correctly for regexes
  * created in another frame, when `instanceof` and `constructor` checks would fail.
  *
  * @param value - Object to check.
  * @returns Whether the object is a `RegExp` object.
  * @example
  *
  * XRegExp.isRegExp('string'); // -> false
  * XRegExp.isRegExp(/regex/i); // -> true
  * XRegExp.isRegExp(RegExp('^', 'm')); // -> true
  * XRegExp.isRegExp(XRegExp('(?s).')); // -> true
  */
inline def isRegExp(value: Any): /* is std.RegExp */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRegExp")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.RegExp */ Boolean]

inline def `match`(str: String, regex: js.RegExp): String | js.Array[String] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(str.asInstanceOf[js.Any], regex.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[String] | Null]
inline def `match`(str: String, regex: js.RegExp, scope: MatchScope): String | js.Array[String] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(str.asInstanceOf[js.Any], regex.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[String] | Null]
inline def `match`(str: String, regex: js.RegExp, scope: MatchScopeAll): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(str.asInstanceOf[js.Any], regex.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
/**
  * Returns the first matched string, or in global mode, an array containing all matched strings.
  * This is essentially a more convenient re-implementation of `String.prototype.match` that gives
  * the result types you actually want (string instead of `exec`-style array in match-first mode,
  * and an empty array instead of `null` when no matches are found in match-all mode). It also lets
  * you override flag g and ignore `lastIndex`, and fixes browser bugs.
  *
  * @param str - String to search.
  * @param regex - Regex to search with.
  * @param scope - Use 'one' to return the first match as a string. Use 'all' to
  *   return an array of all matched strings. If not explicitly specified and `regex` uses flag g,
  *   `scope` is 'all'.
  * @returns In match-first mode: First match as a string, or `null`. In match-all
  *   mode: Array of all matched strings, or an empty array.
  * @example
  *
  * // Match first
  * XRegExp.match('abc', /\w/); // -> 'a'
  * XRegExp.match('abc', /\w/g, 'one'); // -> 'a'
  * XRegExp.match('abc', /x/g, 'one'); // -> null
  *
  * // Match all
  * XRegExp.match('abc', /\w/g); // -> ['a', 'b', 'c']
  * XRegExp.match('abc', /\w/, 'all'); // -> ['a', 'b', 'c']
  * XRegExp.match('abc', /x/, 'all'); // -> []
  */
inline def `match`(str: String, regex: js.RegExp, scope: MatchScopeOne): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(str.asInstanceOf[js.Any], regex.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[String | Null]

/**
  * Retrieves the matches from searching a string using a chain of regexes that successively search
  * within previous matches. The provided `chain` array can contain regexes and or objects with
  * `regex` and `backref` properties. When a backreference is specified, the named or numbered
  * backreference is passed forward to the next regex or returned.
  *
  * @param str - String to search.
  * @param chain - Regexes that each search for matches within preceding results.
  * @returns Matches by the last regex in the chain, or an empty array.
  * @example
  *
  * // Basic usage; matches numbers within <b> tags
  * XRegExp.matchChain('1 <b>2</b> 3 <b>4 a 56</b>', [
  *   XRegExp('(?is)<b>.*?</b>'),
  *   /\d+/
  * ]);
  * // -> ['2', '4', '56']
  *
  * // Passing forward and returning specific backreferences
  * const html = `<a href="http://xregexp.com/api/">XRegExp</a>
  *               <a href="http://www.google.com/">Google</a>`;
  * XRegExp.matchChain(html, [
  *   {regex: /<a href="([^"]+)">/i, backref: 1},
  *   {regex: XRegExp('(?i)^https?://(?<domain>[^/?#]+)'), backref: 'domain'}
  * ]);
  * // -> ['xregexp.com', 'www.google.com']
  */
inline def matchChain(str: String, chain: MatchChainArray): MatchArray = (^.asInstanceOf[js.Dynamic].applyDynamic("matchChain")(str.asInstanceOf[js.Any], chain.asInstanceOf[js.Any])).asInstanceOf[MatchArray]

/**
  * Returns an array of match strings between outermost left and right delimiters, or an array of
  * objects with detailed match parts and position data. By default, an error is thrown if
  * delimiters are unbalanced within the subject string.
  *
  * @param str - String to search.
  * @param left - Left delimiter as an XRegExp pattern.
  * @param right - Right delimiter as an XRegExp pattern.
  * @param flags - Any combination of XRegExp flags, used for the left and right delimiters.
  * @param options - Options object with optional properties:
  *   - `valueNames` {Array} Providing `valueNames` changes the return value from an array of
  *     matched strings to an array of objects that provide the value and start/end positions
  *     for the matched strings as well as the matched delimiters and unmatched string segments.
  *     To use this extended information mode, provide an array of 4 strings that name the parts
  *     to be returned:
  *     1. String segments outside of (before, between, and after) matches.
  *     2. Matched outermost left delimiters.
  *     3. Matched text between the outermost left and right delimiters.
  *     4. Matched outermost right delimiters.
  *     Taken together, these parts include the entire subject string if used with flag g.
  *     Use `null` for any of these values to omit unneeded parts from the returned results.
  *   - `escapeChar` {String} Single char used to escape delimiters within the subject string.
  *   - `unbalanced` {String} Handling mode for unbalanced delimiters. Options are:
  *     - 'error' - throw (default)
  *     - 'skip' - unbalanced delimiters are treated as part of the text between delimiters, and
  *       searches continue at the end of the unbalanced delimiter.
  *     - 'skip-lazy' - unbalanced delimiters are treated as part of the text between delimiters,
  *       and searches continue one character after the start of the unbalanced delimiter.
  * @returns Array of matches, or an empty array.
  * @example
  *
  * // Basic usage
  * const str1 = '(t((e))s)t()(ing)';
  * XRegExp.matchRecursive(str1, '\\(', '\\)', 'g');
  * // -> ['t((e))s', '', 'ing']
  *
  * // Extended information mode with valueNames
  * const str2 = 'Here is <div> <div>an</div></div> example';
  * XRegExp.matchRecursive(str2, '<div\\s*>', '</div>', 'gi', {
  *   valueNames: ['between', 'left', 'match', 'right']
  * });
  * // -> [
  * // {name: 'between', value: 'Here is ',       start: 0,  end: 8},
  * // {name: 'left',    value: '<div>',          start: 8,  end: 13},
  * // {name: 'match',   value: ' <div>an</div>', start: 13, end: 27},
  * // {name: 'right',   value: '</div>',         start: 27, end: 33},
  * // {name: 'between', value: ' example',       start: 33, end: 41}
  * // ]
  *
  * // Omitting unneeded parts with null valueNames, and using escapeChar
  * const str3 = '...{1}.\\{{function(x,y){return {y:x}}}';
  * XRegExp.matchRecursive(str3, '{', '}', 'g', {
  *   valueNames: ['literal', null, 'value', null],
  *   escapeChar: '\\'
  * });
  * // -> [
  * // {name: 'literal', value: '...',  start: 0, end: 3},
  * // {name: 'value',   value: '1',    start: 4, end: 5},
  * // {name: 'literal', value: '.\\{', start: 6, end: 9},
  * // {name: 'value',   value: 'function(x,y){return {y:x}}', start: 10, end: 37}
  * // ]
  *
  * // Sticky mode via flag y
  * const str4 = '<1><<<2>>><3>4<5>';
  * XRegExp.matchRecursive(str4, '<', '>', 'gy');
  * // -> ['1', '<<2>>', '3']
  *
  * // Skipping unbalanced delimiters instead of erroring
  * const str5 = 'Here is <div> <div>an</div> unbalanced example';
  * XRegExp.matchRecursive(str5, '<div\\s*>', '</div>', 'gi', {
  *     unbalanced: 'skip'
  * });
  * // -> ['an']
  */
inline def matchRecursive(str: String, left: String, right: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchRecursive")(str.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
inline def matchRecursive(str: String, left: String, right: String, flags: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchRecursive")(str.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
inline def matchRecursive[T /* <: js.UndefOr[MatchRecursiveOptions | Null] */](str: String, left: String, right: String, flags: String, options: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends / * Inlined std.Required<std.Pick<xregexp.xregexp.MatchRecursiveOptions, 'valueNames'>> * /
{  valueNames :xregexp.xregexp.MatchRecursiveValueNames} ? std.Array<xregexp.xregexp.MatchRecursiveValueNameMatch> : std.Array<string> */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("matchRecursive")(str.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends / * Inlined std.Required<std.Pick<xregexp.xregexp.MatchRecursiveOptions, 'valueNames'>> * /
{  valueNames :xregexp.xregexp.MatchRecursiveValueNames} ? std.Array<xregexp.xregexp.MatchRecursiveValueNameMatch> : std.Array<string> */ js.Any]
inline def matchRecursive[T /* <: js.UndefOr[MatchRecursiveOptions | Null] */](str: String, left: String, right: String, flags: Null, options: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends / * Inlined std.Required<std.Pick<xregexp.xregexp.MatchRecursiveOptions, 'valueNames'>> * /
{  valueNames :xregexp.xregexp.MatchRecursiveValueNames} ? std.Array<xregexp.xregexp.MatchRecursiveValueNameMatch> : std.Array<string> */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("matchRecursive")(str.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends / * Inlined std.Required<std.Pick<xregexp.xregexp.MatchRecursiveOptions, 'valueNames'>> * /
{  valueNames :xregexp.xregexp.MatchRecursiveValueNames} ? std.Array<xregexp.xregexp.MatchRecursiveValueNameMatch> : std.Array<string> */ js.Any]
inline def matchRecursive[T /* <: js.UndefOr[MatchRecursiveOptions | Null] */](str: String, left: String, right: String, flags: Unit, options: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends / * Inlined std.Required<std.Pick<xregexp.xregexp.MatchRecursiveOptions, 'valueNames'>> * /
{  valueNames :xregexp.xregexp.MatchRecursiveValueNames} ? std.Array<xregexp.xregexp.MatchRecursiveValueNameMatch> : std.Array<string> */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("matchRecursive")(str.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends / * Inlined std.Required<std.Pick<xregexp.xregexp.MatchRecursiveOptions, 'valueNames'>> * /
{  valueNames :xregexp.xregexp.MatchRecursiveValueNames} ? std.Array<xregexp.xregexp.MatchRecursiveValueNameMatch> : std.Array<string> */ js.Any]

inline def matchRecursive_T_Any[T /* <: js.UndefOr[MatchRecursiveOptions | Null] */](str: String, left: String, right: String): /* import warning: importer.ImportType#apply Failed type conversion: T extends / * Inlined std.Required<std.Pick<xregexp.xregexp.MatchRecursiveOptions, 'valueNames'>> * /
{  valueNames :xregexp.xregexp.MatchRecursiveValueNames} ? std.Array<xregexp.xregexp.MatchRecursiveValueNameMatch> : std.Array<string> */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("matchRecursive")(str.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends / * Inlined std.Required<std.Pick<xregexp.xregexp.MatchRecursiveOptions, 'valueNames'>> * /
{  valueNames :xregexp.xregexp.MatchRecursiveValueNames} ? std.Array<xregexp.xregexp.MatchRecursiveValueNameMatch> : std.Array<string> */ js.Any]
inline def matchRecursive_T_Any[T /* <: js.UndefOr[MatchRecursiveOptions | Null] */](str: String, left: String, right: String, flags: String): /* import warning: importer.ImportType#apply Failed type conversion: T extends / * Inlined std.Required<std.Pick<xregexp.xregexp.MatchRecursiveOptions, 'valueNames'>> * /
{  valueNames :xregexp.xregexp.MatchRecursiveValueNames} ? std.Array<xregexp.xregexp.MatchRecursiveValueNameMatch> : std.Array<string> */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("matchRecursive")(str.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends / * Inlined std.Required<std.Pick<xregexp.xregexp.MatchRecursiveOptions, 'valueNames'>> * /
{  valueNames :xregexp.xregexp.MatchRecursiveValueNames} ? std.Array<xregexp.xregexp.MatchRecursiveValueNameMatch> : std.Array<string> */ js.Any]

/**
  * Returns a new string with one or all matches of a pattern replaced. The pattern can be a string
  * or regex, and the replacement can be a string or a function to be called for each match. To
  * perform a global search and replace, use the optional `scope` argument or include flag g if using
  * a regex. Replacement strings can use `$<n>` or `${n}` for named and numbered backreferences.
  * Replacement functions can use named backreferences via the last argument. Also fixes browser bugs
  * compared to the native `String.prototype.replace` and can be used reliably cross-browser.
  *
  * @param str - String to search.
  * @param search - Search pattern to be replaced.
  * @param replacement - Replacement string or a function invoked to create it.
  * @param scope - Use 'one' to replace the first match only, or 'all'. Defaults to 'one'.
  *        Defaults to 'all' if using a regex with flag g.
  * @returns New string with one or all matches replaced.
  * @example
  *
  * // Regex search, using named backreferences in replacement string
  * const name = XRegExp('(?<first>\\w+) (?<last>\\w+)');
  * XRegExp.replace('John Smith', name, '$<last>, $<first>');
  * // -> 'Smith, John'
  *
  * // Regex search, using named backreferences in replacement function
  * XRegExp.replace('John Smith', name, (...args) => {
  *   const groups = args[args.length - 1];
  *   return `${groups.last as string}, ${groups.first as string}`;
  * });
  * // -> 'Smith, John'
  *
  * // String search, with replace-all
  * XRegExp.replace('RegExp builds RegExps', 'RegExp', 'XRegExp', 'all');
  * // -> 'XRegExp builds XRegExps'
  */
inline def replace(str: String, search: Pattern, replacement: ReplacementValue): String = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(str.asInstanceOf[js.Any], search.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any])).asInstanceOf[String]
inline def replace(str: String, search: Pattern, replacement: ReplacementValue, scope: MatchScope): String = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(str.asInstanceOf[js.Any], search.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[String]

/**
  * Performs batch processing of string replacements. Used like `XRegExp.replace`, but accepts an
  * array of replacement details. Later replacements operate on the output of earlier replacements.
  * Replacement details are accepted as an array with a regex or string to search for, the
  * replacement string or function, and an optional scope of 'one' or 'all'. Uses the XRegExp
  * replacement text syntax, which supports named backreference properties via `$<name>` or
  * `${name}`.
  *
  * @param str - String to search.
  * @param replacements - Array of replacement detail arrays.
  * @returns New string with all replacements.
  * @example
  *
  * str = XRegExp.replaceEach(str, [
  *   [XRegExp('(?<name>a)'), 'z$<name>'],
  *   [/b/gi, 'y'],
  *   [/c/g, 'x', 'one'], // scope 'one' overrides /g
  *   [/d/, 'w', 'all'],  // scope 'all' overrides lack of /g
  *   ['e', 'v', 'all'],  // scope 'all' allows replace-all for strings
  *   [/f/g, (match) => match.toUpperCase()]
  * ]);
  */
inline def replaceEach(str: String, replacements: js.Array[ReplacementDetail]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceEach")(str.asInstanceOf[js.Any], replacements.asInstanceOf[js.Any])).asInstanceOf[String]

/**
  * Splits a string into an array of strings using a regex or string separator. Matches of the
  * separator are not included in the result array. However, if `separator` is a regex that contains
  * capturing groups, backreferences are spliced into the result each time `separator` is matched.
  * Fixes browser bugs compared to the native `String.prototype.split` and can be used reliably
  * cross-browser.
  *
  * @param str - String to split.
  * @param separator - Regex or string to use for separating the string.
  * @param limit - Maximum number of items to include in the result array.
  * @returns Array of substrings.
  * @example
  *
  * // Basic use
  * XRegExp.split('a b c', ' ');
  * // -> ['a', 'b', 'c']
  *
  * // With limit
  * XRegExp.split('a b c', ' ', 2);
  * // -> ['a', 'b']
  *
  * // Backreferences in result array
  * XRegExp.split('..word1..', /([a-z]+)(\d+)/i);
  * // -> ['..', 'word', '1', '..']
  */
inline def split(str: String, separator: Pattern): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("split")(str.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
inline def split(str: String, separator: Pattern, limit: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("split")(str.asInstanceOf[js.Any], separator.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]

/**
  * Provides tagged template literals that create regexes with XRegExp syntax and flags. The
  * provided pattern is handled as a raw string, so backslashes don't need to be escaped.
  *
  * Interpolation of strings and regexes shares the features of `XRegExp.build`. Interpolated
  * patterns are treated as atomic units when quantified, interpolated strings have their special
  * characters escaped, a leading `^` and trailing unescaped `$` are stripped from interpolated
  * regexes if both are present, and any backreferences within an interpolated regex are
  * rewritten to work within the overall pattern.
  *
  * @param flags - Any combination of XRegExp flags.
  * @returns Handler for template literals that construct regexes with XRegExp syntax.
  * @example
  *
  * XRegExp.tag()`\b\w+\b`.test('word'); // -> true
  *
  * const hours = /1[0-2]|0?[1-9]/;
  * const minutes = /(?<minutes>[0-5][0-9])/;
  * const time = XRegExp.tag('x')`\b ${hours} : ${minutes} \b`;
  * time.test('10:59'); // -> true
  * XRegExp.exec('10:59', time).groups.minutes; // -> '59'
  *
  * const backref1 = /(a)\1/;
  * const backref2 = /(b)\1/;
  * XRegExp.tag()`${backref1}${backref2}`.test('aabb'); // -> true
  */
inline def tag(): js.Function2[/* literals */ TemplateStringsArray, /* repeated */ Any, js.RegExp] = ^.asInstanceOf[js.Dynamic].applyDynamic("tag")().asInstanceOf[js.Function2[/* literals */ TemplateStringsArray, /* repeated */ Any, js.RegExp]]
inline def tag(flags: String): js.Function2[/* literals */ TemplateStringsArray, /* repeated */ Any, js.RegExp] = ^.asInstanceOf[js.Dynamic].applyDynamic("tag")(flags.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* literals */ TemplateStringsArray, /* repeated */ Any, js.RegExp]]

/**
  * Executes a regex search in a specified string. Returns `true` or `false`. Optional `pos` and
  * `sticky` arguments specify the search start position, and whether the match must start at the
  * specified position only. The `lastIndex` property of the provided regex is not used, but is
  * updated for compatibility. Also fixes browser bugs compared to the native
  * `RegExp.prototype.test` and can be used reliably cross-browser.
  *
  * @param str - String to search.
  * @param regex - Regex to search with.
  * @param pos - Zero-based index at which to start the search.
  * @param sticky - Whether the match must start at the specified position
  *   only. The string `'sticky'` is accepted as an alternative to `true`.
  * @returns Whether the regex matched the provided value.
  * @example
  *
  * // Basic use
  * XRegExp.test('abc', /c/); // -> true
  *
  * // With pos and sticky
  * XRegExp.test('abc', /c/, 0, 'sticky'); // -> false
  * XRegExp.test('abc', /c/, 2, 'sticky'); // -> true
  */
inline def test(str: String, regex: Pattern): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(str.asInstanceOf[js.Any], regex.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def test(str: String, regex: Pattern, pos: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(str.asInstanceOf[js.Any], regex.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def test(str: String, regex: Pattern, pos: Double, sticky: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(str.asInstanceOf[js.Any], regex.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], sticky.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def test(str: String, regex: Pattern, pos: Unit, sticky: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(str.asInstanceOf[js.Any], regex.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], sticky.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def test_sticky(str: String, regex: Pattern, pos: Double, sticky: sticky): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(str.asInstanceOf[js.Any], regex.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], sticky.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def test_sticky(str: String, regex: Pattern, pos: Unit, sticky: sticky): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(str.asInstanceOf[js.Any], regex.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], sticky.asInstanceOf[js.Any])).asInstanceOf[Boolean]

/**
  * Uninstalls optional features according to the specified options. Used to undo the actions of
  * `XRegExp.install`.
  *
  * @param options - Options object or string.
  * @example
  *
  * // With an options object
  * XRegExp.uninstall({
  *   // Disables support for astral code points in Unicode addons (unless enabled per regex)
  *   astral: true,
  *
  *   // Don't add named capture groups to the `groups` property of matches
  *   namespacing: true
  * });
  *
  * // With an options string
  * XRegExp.uninstall('astral namespacing');
  */
inline def uninstall(options: FeatureOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("uninstall")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * Returns an XRegExp object that is the union of the given patterns. Patterns can be provided as
  * regex objects or strings. Metacharacters are escaped in patterns provided as strings.
  * Backreferences in provided regex objects are automatically renumbered to work correctly within
  * the larger combined pattern. Native flags used by provided regexes are ignored in favor of the
  * `flags` argument.
  *
  * @param patterns - Regexes and strings to combine.
  * @param flags - Any combination of XRegExp flags.
  * @param options - Options object with optional properties.
  * @returns Union of the provided regexes and strings.
  * @example
  *
  * XRegExp.union(['a+b*c', /(dogs)\1/, /(cats)\1/], 'i');
  * // -> /a\+b\*c|(dogs)\1|(cats)\2/i
  *
  * XRegExp.union([/man/, /bear/, /pig/], 'i', {conjunction: 'none'});
  * // -> /manbearpig/i
  */
inline def union(patterns: js.Array[Pattern]): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(patterns.asInstanceOf[js.Any]).asInstanceOf[js.RegExp]
inline def union(patterns: js.Array[Pattern], flags: String): js.RegExp = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(patterns.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[js.RegExp]
inline def union(patterns: js.Array[Pattern], flags: String, options: UnionOptions): js.RegExp = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(patterns.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.RegExp]
inline def union(patterns: js.Array[Pattern], flags: Null, options: UnionOptions): js.RegExp = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(patterns.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.RegExp]
inline def union(patterns: js.Array[Pattern], flags: Unit, options: UnionOptions): js.RegExp = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(patterns.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.RegExp]

//#endregion
//#region constants
/**
  * The XRegExp version number as a string containing three dot-separated parts. For example,
  * '2.0.0-beta-3'.
  */
inline def version: String = ^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[String]

/**
  * An array of valid items to use for chain matching.
  */
type MatchChainArray = js.Array[ChainArrayElement | js.RegExp]

/**
  * Valid match or replacement scopes for when doing a match or replace.
  */
type MatchScope = MatchScopeOne | MatchScopeAll

/**
  * Match or replacement scope that will match or replace all occurances.
  */
type MatchScopeAll = all

/**
  * Match or replacement scope that will only match or replace the first occurance.
  */
type MatchScopeOne = one

/**
  * Repesents a list of named capture groups. Only valid if the `namespacing` feature is turned on.
  */
type NamedGroupsArray = /**
  * Named capture groups are accessible as properties.
  */
StringDictionary[String]

/**
  * Valid ways os specifying a pattern to use.
  */
type Pattern = js.RegExp | String

/**
  * Special helper type that sets only specific properties to required.
  */
type PickRequired[T, K /* <: /* keyof T */ String */] = T & (Required[Pick[T, K]])

/**
  *   Replacement strings can include special replacement syntax:
  *     - `$$` - Inserts a literal $ character.
  *     - `$&`, `$0` - Inserts the matched substring.
  *     - ``$` `` - Inserts the string that precedes the matched substring (left context).
  *     - `$'` - Inserts the string that follows the matched substring (right context).
  *     - `$n`, `$nn` - Where n/nn are digits referencing an existing capturing group, inserts
  *       backreference n/nn.
  *     - `$<n>`, `${n}` - Where n is a name or any number of digits that reference an existing capturing
  *       group, inserts backreference n.
  *
  *   Replacement functions are invoked with three or more arguments:
  *     - {string} args[0] - The matched substring (corresponds to `$&` above). If the `namespacing` feature
  *       is off, named backreferences are accessible as properties of this argument.
  *     - {string} args[1..n] - One argument for each backreference (corresponding to `$1`, `$2`, etc. above).
  *       If the regex has no capturing groups, no arguments appear in this position.
  *     - {number} args[n+1] - The zero-based index of the match within the entire search string.
  *     - {string} args[n+2] - The total string being searched.
  *     - {XRegExp.NamedGroups} args[n+3] - If the the search pattern is a regex with named capturing groups, the last
  *       argument is the groups object. Its keys are the backreference names and its values are the
  *       backreference values. If the `namespacing` feature is off, this argument is not present.
  */
type ReplacementValue = String | ReplacementFunction
