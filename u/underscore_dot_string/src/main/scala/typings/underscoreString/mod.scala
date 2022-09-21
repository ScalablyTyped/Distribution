package typings.underscoreString

import org.scalablytyped.runtime.Shortcut
import typings.underscoreString.mod.underscoreAugmentingMod.UnderscoreStringStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("underscore.string", JSImport.Namespace)
  @js.native
  val ^ : UnderscoreStringStatic = js.native
  
  type _To = UnderscoreStringStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: UnderscoreStringStatic = ^
  
  /* augmented module */
  object underscoreAugmentingMod {
    
    @js.native
    trait UnderscoreStatic
      extends StObject
         with UnderscoreStringStatic {
      
      var str: UnderscoreStringStatic = js.native
      
      var string: UnderscoreStringStatic = js.native
    }
    
    @js.native
    trait UnderscoreStringStatic
      extends StObject
         with UnderscoreStringStaticExports {
      
      /**
        * Tests if string contains a substring.
        * ('foobar', 'ob') => true
        * @param str
        * @param needle
        */
      def contains(str: String, needle: String): Boolean = js.native
      
      /**
        * Tests if string contains a substring.
        * ('foobar', 'ob') => true
        * @param str
        * @param needle
        */
      def include(str: String, needle: String): Boolean = js.native
      
      /**
        * Return reversed string.
        * ('foobar') => 'raboof'
        * @param str
        */
      def reverse(str: String): String = js.native
    }
    
    @js.native
    trait UnderscoreStringStaticExports extends StObject {
      
      /**
        * Converts underscored or dasherized string to a camelized one.
        * ('-moz-transform') => 'MozTransform'
        * @param str
        */
      def camelize(str: String): String = js.native
      def camelize(str: String, decapitalize: Boolean): String = js.native
      
      /**
        * Converts first letter of the string to uppercase.
        * ('foo Bar') => 'Foo Bar'
        * @param str
        */
      def capitalize(str: String): String = js.native
      
      /**
        * Left/right-pad a string.
        * Alias for pad(str, length, padStr, 'both')
        * ('1', 8, '0') => '00001000'
        * @param str
        * @param length
        * @param padStr
        */
      def center(str: String, length: Double): String = js.native
      def center(str: String, length: Double, padStr: String): String = js.native
      
      /**
        * Convert string to an array of characters.
        * ('Hello') => ['H','e','l','l','o']
        * @param str
        */
      def chars(str: String): js.Array[Any] = js.native
      
      /**
        * Chop a string into pieces.
        * ('whitespace', 3) => ['whi','tes','pac','e']
        * @param str String to chop
        * @param step Size of the pieces
        */
      def chop(str: String, step: Double): js.Array[Any] = js.native
      
      /**
        * Converts string to camelized class name.
        * ('some_class_name') => 'SomeClassName'
        * @param str
        */
      def classify(str: String): String = js.native
      
      /**
        * Compress some whitespaces to one.
        * (' foo    bar   ') => 'foo bar'
        * @param str
        */
      def clean(str: String): String = js.native
      
      /**
        * Replace diacritic characters with closest ASCII equivalents.
        * cleanDiacritics('ääkkönen') => 'aakkonen'
        * @param str
        */
      def cleanDiacritics(str: String): String = js.native
      
      /**
        * Count occurences of a sub string.
        * ('Hello world', 'l') => 3
        * @param str
        * @param substr
        */
      def count(str: String, substr: String): Double = js.native
      
      /**
        * Converts a underscored or camelized string into an dasherized one.
        * ('MozTransform') => '-moz-transform'
        * @param str
        */
      def dasherize(str: String): String = js.native
      
      /**
        * Converts first letter of the string to lowercase.
        * ('Foo Bar') => 'foo Bar'
        * @param str
        */
      def decapitalize(str: String): String = js.native
      
      /**
        * Checks if string ends with another string.
        * ('image.gif', 'gif') => true
        * @param value
        * @param starts
        */
      def endsWith(value: String, starts: String): Boolean = js.native
      
      /**
        * Converts HTML special characters to their entity equivalents.
        * ('<div>Blah blah blah</div>') => '&lt;div&gt;Blah blah blah&lt;/div&gt;'
        * @param str
        */
      def escapeHTML(str: String): String = js.native
      
      /**
        * Escape a string for use in a regular expression.
        * @param str
        */
      def escapeRegExp(str: String): String = js.native
      
      def exports(): UnderscoreStringStaticExports = js.native
      
      /**
        * Converts an underscored, camelized, or dasherized string into a humanized one.
        * Also removes beginning and ending whitespace, and removes the postfix '_id'.
        * ('  capitalize dash-CamelCase_underscore trim  ') => 'Capitalize dash camel case underscore trim'
        * @param str
        */
      def humanize(str: String): String = js.native
      
      /**
        * Insert a string at index.
        * @param str
        * @param i
        * @param substr
        */
      def insert(str: String, i: Double, substr: String): String = js.native
      
      /**
        * Determine if a string is 'blank.'
        * @param str
        */
      def isBlank(str: String): Boolean = js.native
      
      /**
        * Joins strings together with given separator.
        * (' ', 'foo', 'bar') => 'foo bar'
        * @param separator
        * @param args
        */
      def join(separator: String, args: String*): String = js.native
      
      /**
        * Calculates Levenshtein distance between two strings.
        * ('kitten', 'kittah') => 2
        * @param str1
        * @param str2
        */
      def levenshtein(str1: String, str2: String): Double = js.native
      
      /**
        * Split string by newlines character.
        * ('Hello\nWorld') => ['Hello', 'World']
        * @param str
        */
      def lines(str: String): js.Array[Any] = js.native
      
      /**
        * Right-pad a string.
        * Alias for pad(str, length, padStr, 'right')
        * ('1', 8, '0') => '10000000'
        * @param str
        * @param length
        * @param padStr
        */
      def ljust(str: String, length: Double): String = js.native
      def ljust(str: String, length: Double, padStr: String): String = js.native
      
      /**
        * Left-pad a string.
        * Alias for pad(str, length, padStr, 'left')
        * ('1', 8, '0') => '00000001'
        * @param str
        * @param length
        * @param padStr
        */
      def lpad(str: String, length: Double): String = js.native
      def lpad(str: String, length: Double, padStr: String): String = js.native
      
      /**
        * Left/right-pad a string.
        * Alias for pad(str, length, padStr, 'both')
        * ('1', 8, '0') => '00001000'
        * @param str
        * @param length
        * @param padStr
        */
      def lrpad(str: String, length: Double): String = js.native
      def lrpad(str: String, length: Double, padStr: String): String = js.native
      
      /**
        * Left trim. Similar to trim, but only for left side.
        * @param str
        * @param characters
        */
      def lstrip(str: String): String = js.native
      def lstrip(str: String, characters: String): String = js.native
      
      /**
        * Left trim. Similar to trim, but only for left side.
        * @param str
        * @param characters
        */
      def ltrim(str: String): String = js.native
      def ltrim(str: String, characters: String): String = js.native
      
      /**
        * Naturally sort strings like humans would do.
        * Caution: this function is charset dependent.
        * @param str1
        * @param str2
        */
      def naturalCmp(str1: String, str2: String): Double = js.native
      
      /**
        * Formats the numbers.
        * (1000, 2) => '1,000.00'
        * (123456789.123, 5, '.', ',') => '123,456,789.12300'
        * @param number
        * @param dec
        * @param dsep
        * @param tsep
        */
      def numberFormat(number: Double): String = js.native
      def numberFormat(number: Double, dec: Double): String = js.native
      def numberFormat(number: Double, dec: Double, dsep: String): String = js.native
      def numberFormat(number: Double, dec: Double, dsep: String, tsep: String): String = js.native
      def numberFormat(number: Double, dec: Double, dsep: Unit, tsep: String): String = js.native
      def numberFormat(number: Double, dec: Unit, dsep: String): String = js.native
      def numberFormat(number: Double, dec: Unit, dsep: String, tsep: String): String = js.native
      def numberFormat(number: Double, dec: Unit, dsep: Unit, tsep: String): String = js.native
      
      /**
        * Pads a string with characters until the total string length is equal to the passed length parameter.
        * By default, pads on the left with the space char (' ').
        * padStr is truncated to a single character if necessary.
        * ('1', 8) => '       1'
        * ('1', 8, '0') => '00000001'
        * ('1', 8, '0', 'right') => '10000000'
        * ('1', 8, '0', 'both') => '00001000'
        * ('1', 8, 'bleepblorp', 'both') => 'bbbb1bbb'
        * @param str
        * @param length
        * @param padStr
        * @param type
        */
      def pad(str: String, length: Double): String = js.native
      def pad(str: String, length: Double, padStr: String): String = js.native
      def pad(str: String, length: Double, padStr: String, `type`: String): String = js.native
      def pad(str: String, length: Double, padStr: Unit, `type`: String): String = js.native
      
      /**
        * Elegant version of truncate.
        * Makes sure the pruned string does not exceed the original length.
        * Avoid half-chopped words when truncating.
        * ('Hello, cruel world', 15) => 'Hello, cruel...'
        * @param str
        * @param length
        * @param pruneStr
        */
      def prune(str: String, length: Double): String = js.native
      def prune(str: String, length: Double, pruneStr: String): String = js.native
      
      /**
        * Quotes a string.
        * quoteChar defaults to "
        * ('foo') => '"foo"'
        * @param str
        */
      def q(str: String): String = js.native
      def q(str: String, quoteChar: String): String = js.native
      
      /**
        * Quotes a string.
        * quoteChar defaults to "
        * ('foo') => '"foo"'
        * @param str
        */
      def quote(str: String): String = js.native
      def quote(str: String, quoteChar: String): String = js.native
      
      /**
        * Repeat a string with an optional separator.
        * ('foo', 3) => 'foofoofoo'
        * ('foo', 3, 'bar') => 'foobarfoobarfoo'
        * @param value
        * @param count
        * @param separator
        */
      def repeat(value: String, count: Double): String = js.native
      def repeat(value: String, count: Double, separator: String): String = js.native
      
      /**
        * Left-pad a string.
        * Alias for pad(str, length, padStr, 'left')
        * ('1', 8, '0') => '00000001'
        * @param str
        * @param length
        * @param padStr
        */
      def rjust(str: String, length: Double): String = js.native
      def rjust(str: String, length: Double, padStr: String): String = js.native
      
      /**
        * Right-pad a string.
        * Alias for pad(str, length, padStr, 'right')
        * ('1', 8, '0') => '10000000'
        * @param str
        * @param length
        * @param padStr
        */
      def rpad(str: String, length: Double): String = js.native
      def rpad(str: String, length: Double, padStr: String): String = js.native
      
      /**
        * Right trim. Similar to trim, but only for right side.
        * @param str
        * @param characters
        */
      def rstrip(str: String): String = js.native
      def rstrip(str: String, characters: String): String = js.native
      
      /**
        * Right trim. Similar to trim, but only for right side.
        * @param str
        * @param characters
        */
      def rtrim(str: String): String = js.native
      def rtrim(str: String, characters: String): String = js.native
      
      /**
        * Transform text into a URL slug. Replaces whitespaces, accentuated, and special characters with a dash.
        * ('Un éléphant à l'orée du bois') => 'un-elephant-a-loree-du-bois'
        * @param str
        */
      def slugify(str: String): String = js.native
      
      /**
        * Splice a string like an array.
        * @param str
        * @param i
        * @param howmany
        * @param substr
        */
      def splice(str: String, i: Double, howmany: Double): String = js.native
      def splice(str: String, i: Double, howmany: Double, substr: String): String = js.native
      
      /**
        * C like string formatting.
        * _.sprintf('%.1f', 1.17) => '1.2'
        * @param format
        * @param args
        */
      def sprintf(format: String, args: Any*): String = js.native
      
      /**
        * Checks if string starts with another string.
        * ('image.gif', 'image') => true
        * @param str
        * @param starts
        */
      def startsWith(str: String, starts: String): Boolean = js.native
      
      /**
        * Searches a string from left to right for a pattern.
        * Returns a substring consisting of the characters in the string that are to the left of the pattern.
        * If no match found, returns entire string.
        * ('This_is_a_test_string').strLeft('_') => 'This'
        * @param str
        * @param sep
        */
      def strLeft(str: String, sep: String): String = js.native
      
      /**
        * Searches a string from right to left for a pattern.
        * Returns a substring consisting of the characters in the string that are to the left of the pattern.
        * If no match found, returns entire string.
        * ('This_is_a_test_string').strLeftBack('_') => 'This_is_a_test'
        * @param str
        * @param sep
        */
      def strLeftBack(str: String, sep: String): String = js.native
      
      /**
        * Searches a string from left to right for a pattern.
        * Returns a substring consisting of the characters in the string that are to the right of the pattern.
        * If no match found, returns entire string.
        * ('This_is_a_test_string').strRight('_') => 'is_a_test_string'
        * @param str
        * @param sep
        */
      def strRight(str: String, sep: String): String = js.native
      
      /**
        * Searches a string from right to left for a pattern.
        * Returns a substring consisting of the characters in the string that are to the right of the pattern.
        * If no match found, returns entire string.
        * ('This_is_a_test_string').strRightBack('_') => 'string'
        * @param str
        * @param sep
        */
      def strRightBack(str: String, sep: String): String = js.native
      
      /**
        * Trims defined characters from begining and ending of the string.
        * Defaults to whitespace characters.
        * ('  foobar   ') => 'foobar'
        * ('_-foobar-_', '_-') => 'foobar'
        * @param str
        * @param characters
        */
      def strip(str: String): String = js.native
      def strip(str: String, characters: String): String = js.native
      
      /**
        * Removes all html tags from string.
        * @param str
        */
      def stripTags(str: String): String = js.native
      
      /**
        * Returns the successor to passed string.
        * ('a') => 'b'
        * @param str
        */
      def succ(str: String): String = js.native
      
      /**
        * Surround a string with another string.
        * ('foo', 'ab') => 'abfooab'
        * @param str
        * @param wrapper
        */
      def surround(str: String, wrapper: String): String = js.native
      
      /**
        * Returns a copy of the string in which all the case-based characters have had their case swapped.
        * ('hELLO') => 'Hello'
        * @param str
        */
      def swapCase(str: String): String = js.native
      
      /**
        * Capitalize first letter of every word in the string.
        * ('my name is epeli') => 'My Name Is Epeli'
        * @param str
        */
      def titleize(str: String): String = js.native
      
      /**
        * Turn strings that can be commonly considered as booleans to real booleans.
        * Such as "true", "false", "1" and "0". This function is case insensitive.
        * ('true') => true
        * ('FALSE') => false
        * ('random') => undefined
        * ('truthy', ['truthy'], ['falsy']) => true
        * ('true only at start', [/^true/]) => true
        * @param str
        * @param trueValues
        * @param falseValues
        */
      def toBoolean(str: String): Boolean = js.native
      def toBoolean(str: String, trueValues: js.Array[Any]): Boolean = js.native
      def toBoolean(str: String, trueValues: js.Array[Any], falseValues: js.Array[Any]): Boolean = js.native
      def toBoolean(str: String, trueValues: Unit, falseValues: js.Array[Any]): Boolean = js.native
      
      /**
        * Parse string to number.
        * Returns NaN if string can't be parsed to number.
        * ('2.556').toNumber() => 3
        * ('2.556').toNumber(1) => 2.6
        * @param str
        * @param decimals
        */
      def toNumber(str: String): Double = js.native
      def toNumber(str: String, decimals: Double): Double = js.native
      
      /**
        * Join an array into a human readable sentence.
        * (['jQuery', 'Mootools', 'Prototype']) => 'jQuery, Mootools and Prototype'
        * (['jQuery', 'Mootools', 'Prototype'], ', ', ' unt ') => 'jQuery, Mootools unt Prototype'
        * @param array
        * @param separator
        * @param lastSeparator
        * @param serial
        */
      def toSentence(array: js.Array[Any]): String = js.native
      def toSentence(array: js.Array[Any], separator: String): String = js.native
      def toSentence(array: js.Array[Any], separator: String, lastSeparator: String): String = js.native
      def toSentence(array: js.Array[Any], separator: String, lastSeparator: String, serial: Boolean): String = js.native
      def toSentence(array: js.Array[Any], separator: String, lastSeparator: Unit, serial: Boolean): String = js.native
      def toSentence(array: js.Array[Any], separator: Unit, lastSeparator: String): String = js.native
      def toSentence(array: js.Array[Any], separator: Unit, lastSeparator: String, serial: Boolean): String = js.native
      def toSentence(array: js.Array[Any], separator: Unit, lastSeparator: Unit, serial: Boolean): String = js.native
      
      /**
        * The same as toSentence, but uses ', ' as default for lastSeparator.
        * @param array
        * @param separator
        * @param lastSeparator
        */
      def toSentenceSerial(array: js.Array[Any]): String = js.native
      def toSentenceSerial(array: js.Array[Any], separator: String): String = js.native
      def toSentenceSerial(array: js.Array[Any], separator: String, lastSeparator: String): String = js.native
      def toSentenceSerial(array: js.Array[Any], separator: Unit, lastSeparator: String): String = js.native
      
      /**
        * Trims defined characters from begining and ending of the string.
        * Defaults to whitespace characters.
        * ('  foobar   ') => 'foobar'
        * ('_-foobar-_', '_-') => 'foobar'
        * @param str
        * @param characters
        */
      def trim(str: String): String = js.native
      def trim(str: String, characters: String): String = js.native
      
      /**
        * Truncate string to specified length.
        * ('Hello world').truncate(5) => 'Hello...'
        * ('Hello').truncate(10) => 'Hello'
        * @param str
        * @param length
        * @param truncateStr
        */
      def truncate(str: String, length: Double): String = js.native
      def truncate(str: String, length: Double, truncateStr: String): String = js.native
      
      /**
        * Converts a camelized or dasherized string into an underscored one.
        * ('MozTransform') => 'moz_transform'
        * @param str
        */
      def underscored(str: String): String = js.native
      
      /**
        * Converts entity characters to HTML equivalents.
        * ('&lt;div&gt;Blah blah blah&lt;/div&gt;') => '<div>Blah blah blah</div>'
        * @param str
        */
      def unescapeHTML(str: String): String = js.native
      
      /**
        * Unquotes a string.
        * quoteChar defaults to "
        * ('"foo"') => 'foo'
        * ("'foo'", "'") => 'foo'
        * @param str
        */
      def unquote(str: String): String = js.native
      def unquote(str: String, quoteChar: String): String = js.native
      
      /**
        * Split string by delimiter (String or RegExp).
        * /\s+/ by default.
        * ('   I   love   you   ') => ['I','love','you']
        * ('I_love_you', '_') => ['I','love','you']
        * @param str
        * @param delimiter
        */
      def words(str: String): js.Array[String] = js.native
      /**
        * Split string by delimiter (String or RegExp).
        * /\s+/ by default.
        * ('   I   love   you   ') => ['I','love','you']
        * ('I_love_you', '_') => ['I','love','you']
        * @param str
        * @param delimiter
        */
      def words(str: String, delimiter: String): js.Array[String] = js.native
      /**
        * Split string by delimiter (String or RegExp).
        * /\s+/ by default.
        * ('   I   love   you   ') => ['I','love','you']
        * ('I_love_you', '_') => ['I','love','you']
        * @param str
        * @param delimiter
        */
      def words(str: String, delimiter: js.RegExp): js.Array[String] = js.native
    }
  }
}
