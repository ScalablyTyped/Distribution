package typings
package underscoreDotStringLib.underscoreDotStringMod.underscoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnderscoreStringStaticExports extends js.Object {
  /**
           * Converts underscored or dasherized string to a camelized one.
           * ('-moz-transform') => 'MozTransform'
           * @param str
           */
  def camelize(str: java.lang.String): java.lang.String = js.native
  /**
           * Converts underscored or dasherized string to a camelized one.
           * ('-moz-transform') => 'MozTransform'
           * @param str
           */
  def camelize(str: java.lang.String, decapitalize: scala.Boolean): java.lang.String = js.native
  /**
           * Converts first letter of the string to uppercase.
           * ('foo Bar') => 'Foo Bar'
           * @param str
           */
  def capitalize(str: java.lang.String): java.lang.String = js.native
  /**
           * Left/right-pad a string.
           * Alias for pad(str, length, padStr, 'both')
           * ('1', 8, '0') => '00001000'
           * @param str
           * @param length
           * @param padStr
           */
  def center(str: java.lang.String, length: scala.Double): java.lang.String = js.native
  /**
           * Left/right-pad a string.
           * Alias for pad(str, length, padStr, 'both')
           * ('1', 8, '0') => '00001000'
           * @param str
           * @param length
           * @param padStr
           */
  def center(str: java.lang.String, length: scala.Double, padStr: java.lang.String): java.lang.String = js.native
  /**
           * Convert string to an array of characters.
           * ('Hello') => ['H','e','l','l','o']
           * @param str
           */
  def chars(str: java.lang.String): js.Array[_] = js.native
  /**
           * Chop a string into pieces.
           * ('whitespace', 3) => ['whi','tes','pac','e']
           * @param str String to chop
           * @param step Size of the pieces
           */
  def chop(str: java.lang.String, step: scala.Double): js.Array[_] = js.native
  /**
           * Converts string to camelized class name.
           * ('some_class_name') => 'SomeClassName'
           * @param str
           */
  def classify(str: java.lang.String): java.lang.String = js.native
  /**
           * Compress some whitespaces to one.
           * (' foo    bar   ') => 'foo bar'
           * @param str
           */
  def clean(str: java.lang.String): java.lang.String = js.native
  /**
           * Replace diacritic characters with closest ASCII equivalents.
           * cleanDiacritics('ääkkönen') => 'aakkonen'
           * @param str
           */
  def cleanDiacritics(str: java.lang.String): java.lang.String = js.native
  /**
           * Count occurences of a sub string.
           * ('Hello world', 'l') => 3
           * @param str
           * @param substr
           */
  def count(str: java.lang.String, substr: java.lang.String): scala.Double = js.native
  /**
           * Converts a underscored or camelized string into an dasherized one.
           * ('MozTransform') => '-moz-transform'
           * @param str
           */
  def dasherize(str: java.lang.String): java.lang.String = js.native
  /**
           * Converts first letter of the string to lowercase.
           * ('Foo Bar') => 'foo Bar'
           * @param str
           */
  def decapitalize(str: java.lang.String): java.lang.String = js.native
  /**
           * Checks if string ends with another string.
           * ('image.gif', 'gif') => true
           * @param value
           * @param starts
           */
  def endsWith(value: java.lang.String, starts: java.lang.String): scala.Boolean = js.native
  /**
           * Converts HTML special characters to their entity equivalents.
           * ('<div>Blah blah blah</div>') => '&lt;div&gt;Blah blah blah&lt;/div&gt;'
           * @param str
           */
  def escapeHTML(str: java.lang.String): java.lang.String = js.native
  /**
           * Escape a string for use in a regular expression.
           * @param str
           */
  def escapeRegExp(str: java.lang.String): java.lang.String = js.native
  def exports(): UnderscoreStringStaticExports = js.native
  /**
           * Converts an underscored, camelized, or dasherized string into a humanized one.
           * Also removes beginning and ending whitespace, and removes the postfix '_id'.
           * ('  capitalize dash-CamelCase_underscore trim  ') => 'Capitalize dash camel case underscore trim'
           * @param str
           */
  def humanize(str: java.lang.String): java.lang.String = js.native
  /**
           * Insert a string at index.
           * @param str
           * @param i
           * @param substr
           */
  def insert(str: java.lang.String, i: scala.Double, substr: java.lang.String): java.lang.String = js.native
  /**
           * Determine if a string is 'blank.'
           * @param str
           */
  def isBlank(str: java.lang.String): scala.Boolean = js.native
  /**
           * Joins strings together with given separator.
           * (' ', 'foo', 'bar') => 'foo bar'
           * @param separator
           * @param args
           */
  def join(separator: java.lang.String, args: java.lang.String*): java.lang.String = js.native
  /**
           * Calculates Levenshtein distance between two strings.
           * ('kitten', 'kittah') => 2
           * @param str1
           * @param str2
           */
  def levenshtein(str1: java.lang.String, str2: java.lang.String): scala.Double = js.native
  /**
           * Split string by newlines character.
           * ('Hello\nWorld') => ['Hello', 'World']
           * @param str
           */
  def lines(str: java.lang.String): js.Array[_] = js.native
  /**
           * Right-pad a string.
           * Alias for pad(str, length, padStr, 'right')
           * ('1', 8, '0') => '10000000'
           * @param str
           * @param length
           * @param padStr
           */
  def ljust(str: java.lang.String, length: scala.Double): java.lang.String = js.native
  /**
           * Right-pad a string.
           * Alias for pad(str, length, padStr, 'right')
           * ('1', 8, '0') => '10000000'
           * @param str
           * @param length
           * @param padStr
           */
  def ljust(str: java.lang.String, length: scala.Double, padStr: java.lang.String): java.lang.String = js.native
  /**
           * Left-pad a string.
           * Alias for pad(str, length, padStr, 'left')
           * ('1', 8, '0') => '00000001'
           * @param str
           * @param length
           * @param padStr
           */
  def lpad(str: java.lang.String, length: scala.Double): java.lang.String = js.native
  /**
           * Left-pad a string.
           * Alias for pad(str, length, padStr, 'left')
           * ('1', 8, '0') => '00000001'
           * @param str
           * @param length
           * @param padStr
           */
  def lpad(str: java.lang.String, length: scala.Double, padStr: java.lang.String): java.lang.String = js.native
  /**
           * Left/right-pad a string.
           * Alias for pad(str, length, padStr, 'both')
           * ('1', 8, '0') => '00001000'
           * @param str
           * @param length
           * @param padStr
           */
  def lrpad(str: java.lang.String, length: scala.Double): java.lang.String = js.native
  /**
           * Left/right-pad a string.
           * Alias for pad(str, length, padStr, 'both')
           * ('1', 8, '0') => '00001000'
           * @param str
           * @param length
           * @param padStr
           */
  def lrpad(str: java.lang.String, length: scala.Double, padStr: java.lang.String): java.lang.String = js.native
  /**
           * Left trim. Similar to trim, but only for left side.
           * @param str
           * @param characters
           */
  def lstrip(str: java.lang.String): java.lang.String = js.native
  /**
           * Left trim. Similar to trim, but only for left side.
           * @param str
           * @param characters
           */
  def lstrip(str: java.lang.String, characters: java.lang.String): java.lang.String = js.native
  /**
           * Left trim. Similar to trim, but only for left side.
           * @param str
           * @param characters
           */
  def ltrim(str: java.lang.String): java.lang.String = js.native
  /**
           * Left trim. Similar to trim, but only for left side.
           * @param str
           * @param characters
           */
  def ltrim(str: java.lang.String, characters: java.lang.String): java.lang.String = js.native
  /**
           * Naturally sort strings like humans would do.
           * Caution: this function is charset dependent.
           * @param str1
           * @param str2
           */
  def naturalCmp(str1: java.lang.String, str2: java.lang.String): scala.Double = js.native
  /**
           * Formats the numbers.
           * (1000, 2) => '1,000.00'
           * (123456789.123, 5, '.', ',') => '123,456,789.12300'
           * @param number
           * @param dec
           * @param dsep
           * @param tsep
           */
  def numberFormat(number: scala.Double): java.lang.String = js.native
  /**
           * Formats the numbers.
           * (1000, 2) => '1,000.00'
           * (123456789.123, 5, '.', ',') => '123,456,789.12300'
           * @param number
           * @param dec
           * @param dsep
           * @param tsep
           */
  def numberFormat(number: scala.Double, dec: scala.Double): java.lang.String = js.native
  /**
           * Formats the numbers.
           * (1000, 2) => '1,000.00'
           * (123456789.123, 5, '.', ',') => '123,456,789.12300'
           * @param number
           * @param dec
           * @param dsep
           * @param tsep
           */
  def numberFormat(number: scala.Double, dec: scala.Double, dsep: java.lang.String): java.lang.String = js.native
  /**
           * Formats the numbers.
           * (1000, 2) => '1,000.00'
           * (123456789.123, 5, '.', ',') => '123,456,789.12300'
           * @param number
           * @param dec
           * @param dsep
           * @param tsep
           */
  def numberFormat(number: scala.Double, dec: scala.Double, dsep: java.lang.String, tsep: java.lang.String): java.lang.String = js.native
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
  def pad(str: java.lang.String, length: scala.Double): java.lang.String = js.native
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
  def pad(str: java.lang.String, length: scala.Double, padStr: java.lang.String): java.lang.String = js.native
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
  def pad(str: java.lang.String, length: scala.Double, padStr: java.lang.String, `type`: java.lang.String): java.lang.String = js.native
  /**
           * Elegant version of truncate.
           * Makes sure the pruned string does not exceed the original length.
           * Avoid half-chopped words when truncating.
           * ('Hello, cruel world', 15) => 'Hello, cruel...'
           * @param str
           * @param length
           * @param pruneStr
           */
  def prune(str: java.lang.String, length: scala.Double): java.lang.String = js.native
  /**
           * Elegant version of truncate.
           * Makes sure the pruned string does not exceed the original length.
           * Avoid half-chopped words when truncating.
           * ('Hello, cruel world', 15) => 'Hello, cruel...'
           * @param str
           * @param length
           * @param pruneStr
           */
  def prune(str: java.lang.String, length: scala.Double, pruneStr: java.lang.String): java.lang.String = js.native
  /**
           * Quotes a string.
           * quoteChar defaults to "
           * ('foo') => '"foo"'
           * @param str
           */
  def q(str: java.lang.String): java.lang.String = js.native
  /**
           * Quotes a string.
           * quoteChar defaults to "
           * ('foo') => '"foo"'
           * @param str
           */
  def q(str: java.lang.String, quoteChar: java.lang.String): java.lang.String = js.native
  /**
           * Quotes a string.
           * quoteChar defaults to "
           * ('foo') => '"foo"'
           * @param str
           */
  def quote(str: java.lang.String): java.lang.String = js.native
  /**
           * Quotes a string.
           * quoteChar defaults to "
           * ('foo') => '"foo"'
           * @param str
           */
  def quote(str: java.lang.String, quoteChar: java.lang.String): java.lang.String = js.native
  /**
           * Repeat a string with an optional separator.
           * ('foo', 3) => 'foofoofoo'
           * ('foo', 3, 'bar') => 'foobarfoobarfoo'
           * @param value
           * @param count
           * @param separator
           */
  def repeat(value: java.lang.String, count: scala.Double): java.lang.String = js.native
  /**
           * Repeat a string with an optional separator.
           * ('foo', 3) => 'foofoofoo'
           * ('foo', 3, 'bar') => 'foobarfoobarfoo'
           * @param value
           * @param count
           * @param separator
           */
  def repeat(value: java.lang.String, count: scala.Double, separator: java.lang.String): java.lang.String = js.native
  /**
           * Left-pad a string.
           * Alias for pad(str, length, padStr, 'left')
           * ('1', 8, '0') => '00000001'
           * @param str
           * @param length
           * @param padStr
           */
  def rjust(str: java.lang.String, length: scala.Double): java.lang.String = js.native
  /**
           * Left-pad a string.
           * Alias for pad(str, length, padStr, 'left')
           * ('1', 8, '0') => '00000001'
           * @param str
           * @param length
           * @param padStr
           */
  def rjust(str: java.lang.String, length: scala.Double, padStr: java.lang.String): java.lang.String = js.native
  /**
           * Right-pad a string.
           * Alias for pad(str, length, padStr, 'right')
           * ('1', 8, '0') => '10000000'
           * @param str
           * @param length
           * @param padStr
           */
  def rpad(str: java.lang.String, length: scala.Double): java.lang.String = js.native
  /**
           * Right-pad a string.
           * Alias for pad(str, length, padStr, 'right')
           * ('1', 8, '0') => '10000000'
           * @param str
           * @param length
           * @param padStr
           */
  def rpad(str: java.lang.String, length: scala.Double, padStr: java.lang.String): java.lang.String = js.native
  /**
           * Right trim. Similar to trim, but only for right side.
           * @param str
           * @param characters
           */
  def rstrip(str: java.lang.String): java.lang.String = js.native
  /**
           * Right trim. Similar to trim, but only for right side.
           * @param str
           * @param characters
           */
  def rstrip(str: java.lang.String, characters: java.lang.String): java.lang.String = js.native
  /**
           * Right trim. Similar to trim, but only for right side.
           * @param str
           * @param characters
           */
  def rtrim(str: java.lang.String): java.lang.String = js.native
  /**
           * Right trim. Similar to trim, but only for right side.
           * @param str
           * @param characters
           */
  def rtrim(str: java.lang.String, characters: java.lang.String): java.lang.String = js.native
  /**
           * Transform text into a URL slug. Replaces whitespaces, accentuated, and special characters with a dash.
           * ('Un éléphant à l'orée du bois') => 'un-elephant-a-loree-du-bois'
           * @param str
           */
  def slugify(str: java.lang.String): java.lang.String = js.native
  /**
           * Splice a string like an array.
           * @param str
           * @param i
           * @param howmany
           * @param substr
           */
  def splice(str: java.lang.String, i: scala.Double, howmany: scala.Double): java.lang.String = js.native
  /**
           * Splice a string like an array.
           * @param str
           * @param i
           * @param howmany
           * @param substr
           */
  def splice(str: java.lang.String, i: scala.Double, howmany: scala.Double, substr: java.lang.String): java.lang.String = js.native
  /**
           * C like string formatting.
           * _.sprintf('%.1f', 1.17) => '1.2'
           * @param format
           * @param args
           */
  def sprintf(format: java.lang.String, args: js.Any*): java.lang.String = js.native
  /**
           * Checks if string starts with another string.
           * ('image.gif', 'image') => true
           * @param str
           * @param starts
           */
  def startsWith(str: java.lang.String, starts: java.lang.String): scala.Boolean = js.native
  /**
           * Searches a string from left to right for a pattern.
           * Returns a substring consisting of the characters in the string that are to the left of the pattern.
           * If no match found, returns entire string.
           * ('This_is_a_test_string').strLeft('_') => 'This'
           * @param str
           * @param sep
           */
  def strLeft(str: java.lang.String, sep: java.lang.String): java.lang.String = js.native
  /**
           * Searches a string from right to left for a pattern.
           * Returns a substring consisting of the characters in the string that are to the left of the pattern.
           * If no match found, returns entire string.
           * ('This_is_a_test_string').strLeftBack('_') => 'This_is_a_test'
           * @param str
           * @param sep
           */
  def strLeftBack(str: java.lang.String, sep: java.lang.String): java.lang.String = js.native
  /**
           * Searches a string from left to right for a pattern.
           * Returns a substring consisting of the characters in the string that are to the right of the pattern.
           * If no match found, returns entire string.
           * ('This_is_a_test_string').strRight('_') => 'is_a_test_string'
           * @param str
           * @param sep
           */
  def strRight(str: java.lang.String, sep: java.lang.String): java.lang.String = js.native
  /**
           * Searches a string from right to left for a pattern.
           * Returns a substring consisting of the characters in the string that are to the right of the pattern.
           * If no match found, returns entire string.
           * ('This_is_a_test_string').strRightBack('_') => 'string'
           * @param str
           * @param sep
           */
  def strRightBack(str: java.lang.String, sep: java.lang.String): java.lang.String = js.native
  /**
           * Trims defined characters from begining and ending of the string.
           * Defaults to whitespace characters.
           * ('  foobar   ') => 'foobar'
           * ('_-foobar-_', '_-') => 'foobar'
           * @param str
           * @param characters
           */
  def strip(str: java.lang.String): java.lang.String = js.native
  /**
           * Trims defined characters from begining and ending of the string.
           * Defaults to whitespace characters.
           * ('  foobar   ') => 'foobar'
           * ('_-foobar-_', '_-') => 'foobar'
           * @param str
           * @param characters
           */
  def strip(str: java.lang.String, characters: java.lang.String): java.lang.String = js.native
  /**
           * Removes all html tags from string.
           * @param str
           */
  def stripTags(str: java.lang.String): java.lang.String = js.native
  /**
           * Returns the successor to passed string.
           * ('a') => 'b'
           * @param str
           */
  def succ(str: java.lang.String): java.lang.String = js.native
  /**
           * Surround a string with another string.
           * ('foo', 'ab') => 'abfooab'
           * @param str
           * @param wrapper
           */
  def surround(str: java.lang.String, wrapper: java.lang.String): java.lang.String = js.native
  /**
           * Returns a copy of the string in which all the case-based characters have had their case swapped.
           * ('hELLO') => 'Hello'
           * @param str
           */
  def swapCase(str: java.lang.String): java.lang.String = js.native
  /**
           * Capitalize first letter of every word in the string.
           * ('my name is epeli') => 'My Name Is Epeli'
           * @param str
           */
  def titleize(str: java.lang.String): java.lang.String = js.native
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
  def toBoolean(str: java.lang.String): scala.Boolean = js.native
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
  def toBoolean(str: java.lang.String, trueValues: js.Array[_]): scala.Boolean = js.native
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
  def toBoolean(str: java.lang.String, trueValues: js.Array[_], falseValues: js.Array[_]): scala.Boolean = js.native
  /**
           * Parse string to number.
           * Returns NaN if string can't be parsed to number.
           * ('2.556').toNumber() => 3
           * ('2.556').toNumber(1) => 2.6
           * @param str
           * @param decimals
           */
  def toNumber(str: java.lang.String): scala.Double = js.native
  /**
           * Parse string to number.
           * Returns NaN if string can't be parsed to number.
           * ('2.556').toNumber() => 3
           * ('2.556').toNumber(1) => 2.6
           * @param str
           * @param decimals
           */
  def toNumber(str: java.lang.String, decimals: scala.Double): scala.Double = js.native
  /**
           * Join an array into a human readable sentence.
           * (['jQuery', 'Mootools', 'Prototype']) => 'jQuery, Mootools and Prototype'
           * (['jQuery', 'Mootools', 'Prototype'], ', ', ' unt ') => 'jQuery, Mootools unt Prototype'
           * @param array
           * @param separator
           * @param lastSeparator
           * @param serial
           */
  def toSentence(array: js.Array[_]): java.lang.String = js.native
  /**
           * Join an array into a human readable sentence.
           * (['jQuery', 'Mootools', 'Prototype']) => 'jQuery, Mootools and Prototype'
           * (['jQuery', 'Mootools', 'Prototype'], ', ', ' unt ') => 'jQuery, Mootools unt Prototype'
           * @param array
           * @param separator
           * @param lastSeparator
           * @param serial
           */
  def toSentence(array: js.Array[_], separator: java.lang.String): java.lang.String = js.native
  /**
           * Join an array into a human readable sentence.
           * (['jQuery', 'Mootools', 'Prototype']) => 'jQuery, Mootools and Prototype'
           * (['jQuery', 'Mootools', 'Prototype'], ', ', ' unt ') => 'jQuery, Mootools unt Prototype'
           * @param array
           * @param separator
           * @param lastSeparator
           * @param serial
           */
  def toSentence(array: js.Array[_], separator: java.lang.String, lastSeparator: java.lang.String): java.lang.String = js.native
  /**
           * Join an array into a human readable sentence.
           * (['jQuery', 'Mootools', 'Prototype']) => 'jQuery, Mootools and Prototype'
           * (['jQuery', 'Mootools', 'Prototype'], ', ', ' unt ') => 'jQuery, Mootools unt Prototype'
           * @param array
           * @param separator
           * @param lastSeparator
           * @param serial
           */
  def toSentence(
    array: js.Array[_],
    separator: java.lang.String,
    lastSeparator: java.lang.String,
    serial: scala.Boolean
  ): java.lang.String = js.native
  /**
           * The same as toSentence, but uses ', ' as default for lastSeparator.
           * @param array
           * @param separator
           * @param lastSeparator
           */
  def toSentenceSerial(array: js.Array[_]): java.lang.String = js.native
  /**
           * The same as toSentence, but uses ', ' as default for lastSeparator.
           * @param array
           * @param separator
           * @param lastSeparator
           */
  def toSentenceSerial(array: js.Array[_], separator: java.lang.String): java.lang.String = js.native
  /**
           * The same as toSentence, but uses ', ' as default for lastSeparator.
           * @param array
           * @param separator
           * @param lastSeparator
           */
  def toSentenceSerial(array: js.Array[_], separator: java.lang.String, lastSeparator: java.lang.String): java.lang.String = js.native
  /**
           * Trims defined characters from begining and ending of the string.
           * Defaults to whitespace characters.
           * ('  foobar   ') => 'foobar'
           * ('_-foobar-_', '_-') => 'foobar'
           * @param str
           * @param characters
           */
  def trim(str: java.lang.String): java.lang.String = js.native
  /**
           * Trims defined characters from begining and ending of the string.
           * Defaults to whitespace characters.
           * ('  foobar   ') => 'foobar'
           * ('_-foobar-_', '_-') => 'foobar'
           * @param str
           * @param characters
           */
  def trim(str: java.lang.String, characters: java.lang.String): java.lang.String = js.native
  /**
           * Truncate string to specified length.
           * ('Hello world').truncate(5) => 'Hello...'
           * ('Hello').truncate(10) => 'Hello'
           * @param str
           * @param length
           * @param truncateStr
           */
  def truncate(str: java.lang.String, length: scala.Double): java.lang.String = js.native
  /**
           * Truncate string to specified length.
           * ('Hello world').truncate(5) => 'Hello...'
           * ('Hello').truncate(10) => 'Hello'
           * @param str
           * @param length
           * @param truncateStr
           */
  def truncate(str: java.lang.String, length: scala.Double, truncateStr: java.lang.String): java.lang.String = js.native
  /**
           * Converts a camelized or dasherized string into an underscored one.
           * ('MozTransform') => 'moz_transform'
           * @param str
           */
  def underscored(str: java.lang.String): java.lang.String = js.native
  /**
           * Converts entity characters to HTML equivalents.
           * ('&lt;div&gt;Blah blah blah&lt;/div&gt;') => '<div>Blah blah blah</div>'
           * @param str
           */
  def unescapeHTML(str: java.lang.String): java.lang.String = js.native
  /**
           * Unquotes a string.
           * quoteChar defaults to "
           * ('"foo"') => 'foo'
           * ("'foo'", "'") => 'foo'
           * @param str
           */
  def unquote(str: java.lang.String): java.lang.String = js.native
  /**
           * Unquotes a string.
           * quoteChar defaults to "
           * ('"foo"') => 'foo'
           * ("'foo'", "'") => 'foo'
           * @param str
           */
  def unquote(str: java.lang.String, quoteChar: java.lang.String): java.lang.String = js.native
  /**
           * Split string by delimiter (String or RegExp).
           * /\s+/ by default.
           * ('   I   love   you   ') => ['I','love','you']
           * ('I_love_you', '_') => ['I','love','you']
           * @param str
           * @param delimiter
           */
  def words(str: java.lang.String): js.Array[java.lang.String] = js.native
  /**
           * Split string by delimiter (String or RegExp).
           * /\s+/ by default.
           * ('   I   love   you   ') => ['I','love','you']
           * ('I_love_you', '_') => ['I','love','you']
           * @param str
           * @param delimiter
           */
  def words(str: java.lang.String, delimiter: java.lang.String): js.Array[java.lang.String] = js.native
  /**
           * Split string by delimiter (String or RegExp).
           * /\s+/ by default.
           * ('   I   love   you   ') => ['I','love','you']
           * ('I_love_you', '_') => ['I','love','you']
           * @param str
           * @param delimiter
           */
  def words(str: java.lang.String, delimiter: stdLib.RegExp): js.Array[java.lang.String] = js.native
}

