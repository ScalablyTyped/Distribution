package typings.yaml

import typings.yaml.applyReviverMod.Reviver
import typings.yaml.directivesMod.Directives
import typings.yaml.lineCounterMod.LineCounter
import typings.yaml.logMod.LogLevelId
import typings.yaml.nodeMod.ParsedNode
import typings.yaml.pairMod.Pair
import typings.yaml.scalarMod.Scalar.Type
import typings.yaml.schemaSchemaMod.Schema
import typings.yaml.tagsMod.TagId
import typings.yaml.tagsMod.Tags
import typings.yaml.typesMod.CollectionTag
import typings.yaml.typesMod.ScalarTag
import typings.yaml.yamlStrings.`1Dot1`
import typings.yaml.yamlStrings.`1Dot2`
import typings.yaml.yamlStrings.any
import typings.yaml.yamlStrings.block
import typings.yaml.yamlStrings.flow
import typings.yaml.yamlStrings.folded
import typings.yaml.yamlStrings.literal
import typings.yaml.yamlStrings.next
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsMod {
  
  trait CreateNodeOptions extends StObject {
    
    /**
      * During node construction, use anchors and aliases to keep strictly equal
      * non-null objects as equivalent in YAML.
      *
      * Default: `true`
      */
    var aliasDuplicateObjects: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Default prefix for anchors.
      *
      * Default: `'a'`, resulting in anchors `a1`, `a2`, etc.
      */
    var anchorPrefix: js.UndefOr[String] = js.undefined
    
    /** Force the top-level collection node to use flow style. */
    var flow: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Keep `undefined` object values when creating mappings, rather than
      * discarding them.
      *
      * Default: `false`
      */
    var keepUndefined: js.UndefOr[Boolean | Null] = js.undefined
    
    var onTagObj: js.UndefOr[js.Function1[/* tagObj */ ScalarTag | CollectionTag, Unit]] = js.undefined
    
    /**
      * Specify the top-level collection type, e.g. `"!!omap"`. Note that this
      * requires the corresponding tag to be available in this document's schema.
      */
    var tag: js.UndefOr[String] = js.undefined
  }
  object CreateNodeOptions {
    
    inline def apply(): CreateNodeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateNodeOptions]
    }
    
    extension [Self <: CreateNodeOptions](x: Self) {
      
      inline def setAliasDuplicateObjects(value: Boolean): Self = StObject.set(x, "aliasDuplicateObjects", value.asInstanceOf[js.Any])
      
      inline def setAliasDuplicateObjectsUndefined: Self = StObject.set(x, "aliasDuplicateObjects", js.undefined)
      
      inline def setAnchorPrefix(value: String): Self = StObject.set(x, "anchorPrefix", value.asInstanceOf[js.Any])
      
      inline def setAnchorPrefixUndefined: Self = StObject.set(x, "anchorPrefix", js.undefined)
      
      inline def setFlow(value: Boolean): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
      
      inline def setFlowUndefined: Self = StObject.set(x, "flow", js.undefined)
      
      inline def setKeepUndefined(value: Boolean): Self = StObject.set(x, "keepUndefined", value.asInstanceOf[js.Any])
      
      inline def setKeepUndefinedNull: Self = StObject.set(x, "keepUndefined", null)
      
      inline def setKeepUndefinedUndefined: Self = StObject.set(x, "keepUndefined", js.undefined)
      
      inline def setOnTagObj(value: /* tagObj */ ScalarTag | CollectionTag => Unit): Self = StObject.set(x, "onTagObj", js.Any.fromFunction1(value))
      
      inline def setOnTagObjUndefined: Self = StObject.set(x, "onTagObj", js.undefined)
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
  
  trait DocumentOptions extends StObject {
    
    /**
      * @internal
      * Used internally by Composer. If set and includes an explicit version,
      * that overrides the `version` option.
      */
    var _directives: js.UndefOr[Directives] = js.undefined
    
    /**
      * Control the logging level during parsing
      *
      * Default: `'warn'`
      */
    var logLevel: js.UndefOr[LogLevelId] = js.undefined
    
    /**
      * The YAML version used by documents without a `%YAML` directive.
      *
      * Default: `"1.2"`
      */
    var version: js.UndefOr[`1Dot1` | `1Dot2` | next] = js.undefined
  }
  object DocumentOptions {
    
    inline def apply(): DocumentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocumentOptions]
    }
    
    extension [Self <: DocumentOptions](x: Self) {
      
      inline def setLogLevel(value: LogLevelId): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      inline def setVersion(value: `1Dot1` | `1Dot2` | next): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      inline def set_directives(value: Directives): Self = StObject.set(x, "_directives", value.asInstanceOf[js.Any])
      
      inline def set_directivesUndefined: Self = StObject.set(x, "_directives", js.undefined)
    }
  }
  
  trait ParseOptions extends StObject {
    
    /**
      * Whether integers should be parsed into BigInt rather than number values.
      *
      * Default: `false`
      *
      * https://developer.mozilla.org/en/docs/Web/JavaScript/Reference/Global_Objects/BigInt
      */
    var intAsBigInt: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Include a `srcToken` value on each parsed `Node`, containing the CST token
      * that was composed into this node.
      *
      * Default: `false`
      */
    var keepSourceTokens: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If set, newlines will be tracked, to allow for `lineCounter.linePos(offset)`
      * to provide the `{ line, col }` positions within the input.
      */
    var lineCounter: js.UndefOr[LineCounter] = js.undefined
    
    /**
      * Include line/col position & node type directly in parse errors.
      *
      * Default: `true`
      */
    var prettyErrors: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Detect and report errors that are required by the YAML 1.2 spec,
      * but are caused by unambiguous content.
      *
      * Default: `true`
      */
    var strict: js.UndefOr[Boolean] = js.undefined
    
    /**
      * YAML requires map keys to be unique. By default, this is checked by
      * comparing scalar values with `===`; deep equality is not checked for
      * aliases or collections. If merge keys are enabled by the schema,
      * multiple `<<` keys are allowed.
      *
      * Set `false` to disable, or provide your own comparator function to
      * customise. The comparator will be passed two `ParsedNode` values, and
      * is expected to return a `boolean` indicating their equality.
      *
      * Default: `true`
      */
    var uniqueKeys: js.UndefOr[Boolean | (js.Function2[/* a */ ParsedNode, /* b */ ParsedNode, Boolean])] = js.undefined
  }
  object ParseOptions {
    
    inline def apply(): ParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseOptions]
    }
    
    extension [Self <: ParseOptions](x: Self) {
      
      inline def setIntAsBigInt(value: Boolean): Self = StObject.set(x, "intAsBigInt", value.asInstanceOf[js.Any])
      
      inline def setIntAsBigIntUndefined: Self = StObject.set(x, "intAsBigInt", js.undefined)
      
      inline def setKeepSourceTokens(value: Boolean): Self = StObject.set(x, "keepSourceTokens", value.asInstanceOf[js.Any])
      
      inline def setKeepSourceTokensUndefined: Self = StObject.set(x, "keepSourceTokens", js.undefined)
      
      inline def setLineCounter(value: LineCounter): Self = StObject.set(x, "lineCounter", value.asInstanceOf[js.Any])
      
      inline def setLineCounterUndefined: Self = StObject.set(x, "lineCounter", js.undefined)
      
      inline def setPrettyErrors(value: Boolean): Self = StObject.set(x, "prettyErrors", value.asInstanceOf[js.Any])
      
      inline def setPrettyErrorsUndefined: Self = StObject.set(x, "prettyErrors", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      inline def setUniqueKeys(value: Boolean | (js.Function2[/* a */ ParsedNode, /* b */ ParsedNode, Boolean])): Self = StObject.set(x, "uniqueKeys", value.asInstanceOf[js.Any])
      
      inline def setUniqueKeysFunction2(value: (/* a */ ParsedNode, /* b */ ParsedNode) => Boolean): Self = StObject.set(x, "uniqueKeys", js.Any.fromFunction2(value))
      
      inline def setUniqueKeysUndefined: Self = StObject.set(x, "uniqueKeys", js.undefined)
    }
  }
  
  trait SchemaOptions extends StObject {
    
    /**
      * When parsing, warn about compatibility issues with the given schema.
      * When stringifying, use scalar styles that are parsed correctly
      * by the `compat` schema as well as the actual schema.
      *
      * Default: `null`
      */
    var compat: js.UndefOr[String | Tags | Null] = js.undefined
    
    /**
      * Array of additional tags to include in the schema, or a function that may
      * modify the schema's base tag array.
      */
    var customTags: js.UndefOr[Tags | (js.Function1[/* tags */ Tags, Tags]) | Null] = js.undefined
    
    /**
      * Enable support for `<<` merge keys.
      *
      * Default: `false` for YAML 1.2, `true` for earlier versions
      */
    var merge: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When using the `'core'` schema, support parsing values with these
      * explicit YAML 1.1 tags:
      *
      * `!!binary`, `!!omap`, `!!pairs`, `!!set`, `!!timestamp`.
      *
      * Default `true`
      */
    var resolveKnownTags: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The base schema to use.
      *
      * The core library has built-in support for the following:
      * - `'failsafe'`: A minimal schema that parses all scalars as strings
      * - `'core'`: The YAML 1.2 core schema
      * - `'json'`: The YAML 1.2 JSON schema, with minimal rules for JSON compatibility
      * - `'yaml-1.1'`: The YAML 1.1 schema
      *
      * If using another (custom) schema, the `customTags` array needs to
      * fully define the schema's tags.
      *
      * Default: `'core'` for YAML 1.2, `'yaml-1.1'` for earlier versions
      */
    var schema: js.UndefOr[String | Schema] = js.undefined
    
    /**
      * When adding to or stringifying a map, sort the entries.
      * If `true`, sort by comparing key values with `<`.
      * Does not affect item order when parsing.
      *
      * Default: `false`
      */
    var sortMapEntries: js.UndefOr[Boolean | (js.Function2[/* a */ Pair[Any, Any], /* b */ Pair[Any, Any], Double])] = js.undefined
    
    /**
      * Override default values for `toString()` options.
      */
    var toStringDefaults: js.UndefOr[ToStringOptions] = js.undefined
  }
  object SchemaOptions {
    
    inline def apply(): SchemaOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SchemaOptions]
    }
    
    extension [Self <: SchemaOptions](x: Self) {
      
      inline def setCompat(value: String | Tags): Self = StObject.set(x, "compat", value.asInstanceOf[js.Any])
      
      inline def setCompatNull: Self = StObject.set(x, "compat", null)
      
      inline def setCompatUndefined: Self = StObject.set(x, "compat", js.undefined)
      
      inline def setCompatVarargs(value: (ScalarTag | CollectionTag | TagId)*): Self = StObject.set(x, "compat", js.Array(value*))
      
      inline def setCustomTags(value: Tags | (js.Function1[/* tags */ Tags, Tags])): Self = StObject.set(x, "customTags", value.asInstanceOf[js.Any])
      
      inline def setCustomTagsFunction1(value: /* tags */ Tags => Tags): Self = StObject.set(x, "customTags", js.Any.fromFunction1(value))
      
      inline def setCustomTagsNull: Self = StObject.set(x, "customTags", null)
      
      inline def setCustomTagsUndefined: Self = StObject.set(x, "customTags", js.undefined)
      
      inline def setCustomTagsVarargs(value: (ScalarTag | CollectionTag | TagId)*): Self = StObject.set(x, "customTags", js.Array(value*))
      
      inline def setMerge(value: Boolean): Self = StObject.set(x, "merge", value.asInstanceOf[js.Any])
      
      inline def setMergeUndefined: Self = StObject.set(x, "merge", js.undefined)
      
      inline def setResolveKnownTags(value: Boolean): Self = StObject.set(x, "resolveKnownTags", value.asInstanceOf[js.Any])
      
      inline def setResolveKnownTagsUndefined: Self = StObject.set(x, "resolveKnownTags", js.undefined)
      
      inline def setSchema(value: String | Schema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
      
      inline def setSortMapEntries(value: Boolean | (js.Function2[/* a */ Pair[Any, Any], /* b */ Pair[Any, Any], Double])): Self = StObject.set(x, "sortMapEntries", value.asInstanceOf[js.Any])
      
      inline def setSortMapEntriesFunction2(value: (/* a */ Pair[Any, Any], /* b */ Pair[Any, Any]) => Double): Self = StObject.set(x, "sortMapEntries", js.Any.fromFunction2(value))
      
      inline def setSortMapEntriesUndefined: Self = StObject.set(x, "sortMapEntries", js.undefined)
      
      inline def setToStringDefaults(value: ToStringOptions): Self = StObject.set(x, "toStringDefaults", value.asInstanceOf[js.Any])
      
      inline def setToStringDefaultsUndefined: Self = StObject.set(x, "toStringDefaults", js.undefined)
    }
  }
  
  trait ToJSOptions extends StObject {
    
    /**
      * Use Map rather than Object to represent mappings.
      *
      * Default: `false`
      */
    var mapAsMap: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Prevent exponential entity expansion attacks by limiting data aliasing count;
      * set to `-1` to disable checks; `0` disallows all alias nodes.
      *
      * Default: `100`
      */
    var maxAliasCount: js.UndefOr[Double] = js.undefined
    
    /**
      * If defined, called with the resolved `value` and reference `count` for
      * each anchor in the document.
      */
    var onAnchor: js.UndefOr[js.Function2[/* value */ Any, /* count */ Double, Unit]] = js.undefined
    
    /**
      * Optional function that may filter or modify the output JS value
      *
      * https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON/parse#using_the_reviver_parameter
      */
    var reviver: js.UndefOr[Reviver] = js.undefined
  }
  object ToJSOptions {
    
    inline def apply(): ToJSOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToJSOptions]
    }
    
    extension [Self <: ToJSOptions](x: Self) {
      
      inline def setMapAsMap(value: Boolean): Self = StObject.set(x, "mapAsMap", value.asInstanceOf[js.Any])
      
      inline def setMapAsMapUndefined: Self = StObject.set(x, "mapAsMap", js.undefined)
      
      inline def setMaxAliasCount(value: Double): Self = StObject.set(x, "maxAliasCount", value.asInstanceOf[js.Any])
      
      inline def setMaxAliasCountUndefined: Self = StObject.set(x, "maxAliasCount", js.undefined)
      
      inline def setOnAnchor(value: (/* value */ Any, /* count */ Double) => Unit): Self = StObject.set(x, "onAnchor", js.Any.fromFunction2(value))
      
      inline def setOnAnchorUndefined: Self = StObject.set(x, "onAnchor", js.undefined)
      
      inline def setReviver(value: (/* key */ Any, /* value */ Any) => Any): Self = StObject.set(x, "reviver", js.Any.fromFunction2(value))
      
      inline def setReviverUndefined: Self = StObject.set(x, "reviver", js.undefined)
    }
  }
  
  trait ToStringOptions extends StObject {
    
    /**
      * Use block quote styles for scalar values where applicable.
      * Set to `false` to disable block quotes completely.
      *
      * Default: `true`
      */
    var blockQuote: js.UndefOr[Boolean | folded | literal] = js.undefined
    
    /**
      * Enforce `'block'` or `'flow'` style on maps and sequences.
      * Empty collections will always be stringified as `{}` or `[]`.
      *
      * Default: `'any'`, allowing each node to set its style separately
      * with its `flow: boolean` (default `false`) property.
      */
    var collectionStyle: js.UndefOr[any | block | flow] = js.undefined
    
    /**
      * Comment stringifier.
      * Output should be valid for the current schema.
      *
      * By default, empty comment lines are left empty,
      * lines consisting of a single space are replaced by `#`,
      * and all other lines are prefixed with a `#`.
      */
    var commentString: js.UndefOr[js.Function1[/* comment */ String, String]] = js.undefined
    
    /**
      * The default type of string literal used to stringify implicit key values.
      * Output may use other types if required to fully represent the value.
      *
      * If `null`, the value of `defaultStringType` is used.
      *
      * Default: `null`
      */
    var defaultKeyType: js.UndefOr[Type | Null] = js.undefined
    
    /**
      * The default type of string literal used to stringify values in general.
      * Output may use other types if required to fully represent the value.
      *
      * Default: `'PLAIN'`
      */
    var defaultStringType: js.UndefOr[Type] = js.undefined
    
    /**
      * Include directives in the output.
      *
      * - If `true`, at least the document-start marker `---` is always included.
      *   This does not force the `%YAML` directive to be included. To do that,
      *   set `doc.directives.yaml.explicit = true`.
      * - If `false`, no directives or marker is ever included. If using the `%TAG`
      *   directive, you are expected to include it manually in the stream before
      *   its use.
      * - If `null`, directives and marker may be included if required.
      *
      * Default: `null`
      */
    var directives: js.UndefOr[Boolean | Null] = js.undefined
    
    /**
      * Restrict double-quoted strings to use JSON-compatible syntax.
      *
      * Default: `false`
      */
    var doubleQuotedAsJSON: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Minimum length for double-quoted strings to use multiple lines to
      * represent the value. Ignored if `doubleQuotedAsJSON` is set.
      *
      * Default: `40`
      */
    var doubleQuotedMinMultiLineLength: js.UndefOr[Double] = js.undefined
    
    /**
      * String representation for `false`.
      * With the core schema, use `'false'`, `'False'`, or `'FALSE'`.
      *
      * Default: `'false'`
      */
    var falseStr: js.UndefOr[String] = js.undefined
    
    /**
      * The number of spaces to use when indenting code.
      *
      * Default: `2`
      */
    var indent: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether block sequences should be indented.
      *
      * Default: `true`
      */
    var indentSeq: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Maximum line width (set to `0` to disable folding).
      *
      * This is a soft limit, as only double-quoted semantics allow for inserting
      * a line break in the middle of a word, as well as being influenced by the
      * `minContentWidth` option.
      *
      * Default: `80`
      */
    var lineWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * Minimum line width for highly-indented content (set to `0` to disable).
      *
      * Default: `20`
      */
    var minContentWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * String representation for `null`.
      * With the core schema, use `'null'`, `'Null'`, `'NULL'`, `'~'`, or an empty
      * string `''`.
      *
      * Default: `'null'`
      */
    var nullStr: js.UndefOr[String] = js.undefined
    
    /**
      * Require keys to be scalars and to use implicit rather than explicit notation.
      *
      * Default: `false`
      */
    var simpleKeys: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Use 'single quote' rather than "double quote" where applicable.
      * Set to `false` to disable single quotes completely.
      *
      * Default: `null`
      */
    var singleQuote: js.UndefOr[Boolean | Null] = js.undefined
    
    /**
      * String representation for `true`.
      * With the core schema, use `'true'`, `'True'`, or `'TRUE'`.
      *
      * Default: `'true'`
      */
    var trueStr: js.UndefOr[String] = js.undefined
    
    /**
      * The anchor used by an alias must be defined before the alias node. As it's
      * possible for the document to be modified manually, the order may be
      * verified during stringification.
      *
      * Default: `'true'`
      */
    var verifyAliasOrder: js.UndefOr[Boolean] = js.undefined
  }
  object ToStringOptions {
    
    inline def apply(): ToStringOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToStringOptions]
    }
    
    extension [Self <: ToStringOptions](x: Self) {
      
      inline def setBlockQuote(value: Boolean | folded | literal): Self = StObject.set(x, "blockQuote", value.asInstanceOf[js.Any])
      
      inline def setBlockQuoteUndefined: Self = StObject.set(x, "blockQuote", js.undefined)
      
      inline def setCollectionStyle(value: any | block | flow): Self = StObject.set(x, "collectionStyle", value.asInstanceOf[js.Any])
      
      inline def setCollectionStyleUndefined: Self = StObject.set(x, "collectionStyle", js.undefined)
      
      inline def setCommentString(value: /* comment */ String => String): Self = StObject.set(x, "commentString", js.Any.fromFunction1(value))
      
      inline def setCommentStringUndefined: Self = StObject.set(x, "commentString", js.undefined)
      
      inline def setDefaultKeyType(value: Type): Self = StObject.set(x, "defaultKeyType", value.asInstanceOf[js.Any])
      
      inline def setDefaultKeyTypeNull: Self = StObject.set(x, "defaultKeyType", null)
      
      inline def setDefaultKeyTypeUndefined: Self = StObject.set(x, "defaultKeyType", js.undefined)
      
      inline def setDefaultStringType(value: Type): Self = StObject.set(x, "defaultStringType", value.asInstanceOf[js.Any])
      
      inline def setDefaultStringTypeUndefined: Self = StObject.set(x, "defaultStringType", js.undefined)
      
      inline def setDirectives(value: Boolean): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
      
      inline def setDirectivesNull: Self = StObject.set(x, "directives", null)
      
      inline def setDirectivesUndefined: Self = StObject.set(x, "directives", js.undefined)
      
      inline def setDoubleQuotedAsJSON(value: Boolean): Self = StObject.set(x, "doubleQuotedAsJSON", value.asInstanceOf[js.Any])
      
      inline def setDoubleQuotedAsJSONUndefined: Self = StObject.set(x, "doubleQuotedAsJSON", js.undefined)
      
      inline def setDoubleQuotedMinMultiLineLength(value: Double): Self = StObject.set(x, "doubleQuotedMinMultiLineLength", value.asInstanceOf[js.Any])
      
      inline def setDoubleQuotedMinMultiLineLengthUndefined: Self = StObject.set(x, "doubleQuotedMinMultiLineLength", js.undefined)
      
      inline def setFalseStr(value: String): Self = StObject.set(x, "falseStr", value.asInstanceOf[js.Any])
      
      inline def setFalseStrUndefined: Self = StObject.set(x, "falseStr", js.undefined)
      
      inline def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setIndentSeq(value: Boolean): Self = StObject.set(x, "indentSeq", value.asInstanceOf[js.Any])
      
      inline def setIndentSeqUndefined: Self = StObject.set(x, "indentSeq", js.undefined)
      
      inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
      
      inline def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
      
      inline def setMinContentWidth(value: Double): Self = StObject.set(x, "minContentWidth", value.asInstanceOf[js.Any])
      
      inline def setMinContentWidthUndefined: Self = StObject.set(x, "minContentWidth", js.undefined)
      
      inline def setNullStr(value: String): Self = StObject.set(x, "nullStr", value.asInstanceOf[js.Any])
      
      inline def setNullStrUndefined: Self = StObject.set(x, "nullStr", js.undefined)
      
      inline def setSimpleKeys(value: Boolean): Self = StObject.set(x, "simpleKeys", value.asInstanceOf[js.Any])
      
      inline def setSimpleKeysUndefined: Self = StObject.set(x, "simpleKeys", js.undefined)
      
      inline def setSingleQuote(value: Boolean): Self = StObject.set(x, "singleQuote", value.asInstanceOf[js.Any])
      
      inline def setSingleQuoteNull: Self = StObject.set(x, "singleQuote", null)
      
      inline def setSingleQuoteUndefined: Self = StObject.set(x, "singleQuote", js.undefined)
      
      inline def setTrueStr(value: String): Self = StObject.set(x, "trueStr", value.asInstanceOf[js.Any])
      
      inline def setTrueStrUndefined: Self = StObject.set(x, "trueStr", js.undefined)
      
      inline def setVerifyAliasOrder(value: Boolean): Self = StObject.set(x, "verifyAliasOrder", value.asInstanceOf[js.Any])
      
      inline def setVerifyAliasOrderUndefined: Self = StObject.set(x, "verifyAliasOrder", js.undefined)
    }
  }
}
