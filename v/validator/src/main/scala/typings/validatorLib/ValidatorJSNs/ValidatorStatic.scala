package typings
package validatorLib.ValidatorJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidatorStatic extends js.Object {
  var version: java.lang.String = js.native
  // **************
  // * Sanitizers *
  // **************
  // remove characters that appear in the blacklist. The characters are used in a RegExp and so you will need
  // to escape some chars, e.g. blacklist(input, '\\[\\]').
  def blacklist(input: java.lang.String, chars: java.lang.String): java.lang.String = js.native
  // **************
  // * Validators *
  // **************
  // check if the string contains the seed.
  def contains(str: java.lang.String, elem: js.Any): scala.Boolean = js.native
  // check if the string matches the comparison.
  def equals(str: java.lang.String, comparison: java.lang.String): scala.Boolean = js.native
  // replace <, >, &, ', " and / with HTML entities.
  def escape(input: java.lang.String): java.lang.String = js.native
  // **************
  // * Extensions *
  // **************
  // add your own validators.
  // Note: that the first argument will be automatically coerced to a string.
  def extend[T /* <: js.Function */](name: java.lang.String, fn: T): scala.Unit = js.native
  // check if the string is a date that's after the specified date (defaults to now).
  def isAfter(str: java.lang.String): scala.Boolean = js.native
  def isAfter(str: java.lang.String, date: java.lang.String): scala.Boolean = js.native
  // check if the string contains only letters (a-zA-Z). Locale is one of ['ar', 'ar-AE', 'ar-BH', 'ar-DZ', 'ar-EG',
  // 'ar-IQ', 'ar-JO', 'ar-KW', 'ar-LB', 'ar-LY', 'ar-MA', 'ar-QA', 'ar-QM', 'ar-SA', 'ar-SD', 'ar-SY', 'ar-TN', 'ar-YE',
  // 'bg-BG', 'cs-CZ', 'da-DK', 'de-DE', 'el-GR', 'en-AU', 'en-GB', 'en-HK', 'en-IN', 'en-NZ', 'en-US', 'en-ZA', 'en-ZM',
  // 'es-ES', 'fr-FR', 'hu-HU', 'it-IT', 'nb-NO', 'nl-NL', 'nn-NO', 'pl-PL', 'pt-BR', 'pt-PT', 'ru-RU', 'sk-SK', 'sr-RS',
  // 'sr-RS@latin', 'sv-SE', 'tr-TR', 'uk-UA']) and defaults to en-US
  def isAlpha(str: java.lang.String): scala.Boolean = js.native
  def isAlpha(str: java.lang.String, locale: AlphaLocale): scala.Boolean = js.native
  // check if the string contains only letters and numbers. Locale is one of ['ar', 'ar-AE', 'ar-BH', 'ar-DZ', 'ar-EG',
  // 'ar-IQ', 'ar-JO', 'ar-KW', 'ar-LB', 'ar-LY', 'ar-MA', 'ar-QA', 'ar-QM', 'ar-SA', 'ar-SD', 'ar-SY', 'ar-TN', 'ar-YE',
  // 'bg-BG', 'cs-CZ', 'da-DK', 'de-DE', 'el-GR', 'en-AU', 'en-GB', 'en-HK', 'en-IN', 'en-NZ', 'en-US', 'en-ZA', 'en-ZM',
  // 'es-ES', 'fr-FR', 'hu-HU', 'it-IT', 'nb-NO', 'nl-NL', 'nn-NO', 'pl-PL', 'pt-BR', 'pt-PT', 'ru-RU', 'sk-SK', 'sr-RS',
  // 'sr-RS@latin', 'sv-SE', 'tr-TR', 'uk-UA']) and defaults to en-US
  def isAlphanumeric(str: java.lang.String): scala.Boolean = js.native
  def isAlphanumeric(str: java.lang.String, locale: AlphanumericLocale): scala.Boolean = js.native
  // check if the string contains ASCII chars only.
  def isAscii(str: java.lang.String): scala.Boolean = js.native
  // check if a string is base64 encoded.
  def isBase64(str: java.lang.String): scala.Boolean = js.native
  // check if the string is a date that's before the specified date.
  def isBefore(str: java.lang.String): scala.Boolean = js.native
  def isBefore(str: java.lang.String, date: java.lang.String): scala.Boolean = js.native
  // check if a string is a boolean.
  def isBoolean(str: java.lang.String): scala.Boolean = js.native
  def isByteLength(str: java.lang.String, min: scala.Double): scala.Boolean = js.native
  def isByteLength(str: java.lang.String, min: scala.Double, max: scala.Double): scala.Boolean = js.native
  // check if the string's length (in bytes) falls in a range.
  def isByteLength(str: java.lang.String, options: IsByteLengthOptions): scala.Boolean = js.native
  // check if the string is a credit card.
  def isCreditCard(str: java.lang.String): scala.Boolean = js.native
  // check if the string is a valid currency amount.
  def isCurrency(str: java.lang.String): scala.Boolean = js.native
  def isCurrency(str: java.lang.String, options: IsCurrencyOptions): scala.Boolean = js.native
  // check if the string is a data uri format (https://developer.mozilla.org/en-US/docs/Web/HTTP/data_URIs)
  def isDataURI(str: java.lang.String): scala.Boolean = js.native
  // check if the string represents a decimal number, such as 0.1, .3, 1.1, 1.00003, 4.0, etc.
  def isDecimal(str: java.lang.String): scala.Boolean = js.native
  def isDecimal(str: java.lang.String, options: IsDecimalOptions): scala.Boolean = js.native
  // check if the string is a number that's divisible by another.
  def isDivisibleBy(str: java.lang.String, number: scala.Double): scala.Boolean = js.native
  // check if the string is an email.
  def isEmail(str: java.lang.String): scala.Boolean = js.native
  def isEmail(str: java.lang.String, options: IsEmailOptions): scala.Boolean = js.native
  // check if the string has a length of zero.
  def isEmpty(str: java.lang.String): scala.Boolean = js.native
  def isEmpty(str: java.lang.String, options: IsEmptyOptions): scala.Boolean = js.native
  // check if the string is a fully qualified domain name (e.g. domain.com).
  def isFQDN(str: java.lang.String): scala.Boolean = js.native
  def isFQDN(str: java.lang.String, options: IsFQDNOptions): scala.Boolean = js.native
  // check if the string is a float.
  def isFloat(str: java.lang.String): scala.Boolean = js.native
  def isFloat(str: java.lang.String, options: IsFloatOptions): scala.Boolean = js.native
  // check if the string contains any full-width chars.
  def isFullWidth(str: java.lang.String): scala.Boolean = js.native
  // check if the string contains any half-width chars.
  def isHalfWidth(str: java.lang.String): scala.Boolean = js.native
  // check if the string is a hash of type algorithm.
  // Algorithm is one of ['md4', 'md5', 'sha1', 'sha256', 'sha384', 'sha512', 'ripemd128', 'ripemd160', 'tiger128',
  // 'tiger160', 'tiger192', 'crc32', 'crc32b']
  def isHash(str: java.lang.String, algorithm: HashAlgorithm): scala.Boolean = js.native
  // check if the string is a hexadecimal color.
  def isHexColor(str: java.lang.String): scala.Boolean = js.native
  // check if the string is a hexadecimal number.
  def isHexadecimal(str: java.lang.String): scala.Boolean = js.native
  // check if the string is an IP (version 4 or 6).
  def isIP(str: java.lang.String): scala.Boolean = js.native
  def isIP(str: java.lang.String, version: scala.Double): scala.Boolean = js.native
  // check if the string is an ISBN (version 10 or 13).
  def isISBN(str: java.lang.String): scala.Boolean = js.native
  def isISBN(str: java.lang.String, version: scala.Double): scala.Boolean = js.native
  // check if the string is an ISIN (https://en.wikipedia.org/wiki/International_Securities_Identification_Number)
  // (stock/security identifier).
  def isISIN(str: java.lang.String): scala.Boolean = js.native
  // check if the string is a valid ISO 3166-1 alpha-2 (https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) officially assigned
  // country code.
  def isISO31661Alpha2(str: java.lang.String): scala.Boolean = js.native
  // check if the string is a valid ISO 3166-1 alpha-3 (https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3) officially assigned
  // country code.
  def isISO31661Alpha3(str: java.lang.String): scala.Boolean = js.native
  // check if the string is a valid ISO 8601 (https://en.wikipedia.org/wiki/ISO_8601) date.
  def isISO8601(str: java.lang.String): scala.Boolean = js.native
  def isISO8601(str: java.lang.String, options: IsISO8601Options): scala.Boolean = js.native
  // check if the string is a ISRC (https://en.wikipedia.org/wiki/International_Standard_Recording_Code).
  def isISRC(str: java.lang.String): scala.Boolean = js.native
  // check if the string is an ISSN (https://en.wikipedia.org/wiki/International_Standard_Serial_Number).
  def isISSN(str: java.lang.String): scala.Boolean = js.native
  def isISSN(str: java.lang.String, options: IsISSNOptions): scala.Boolean = js.native
  // check if the string is in a array of allowed values.
  def isIn(str: java.lang.String, values: js.Array[_]): scala.Boolean = js.native
  // check if the string is an integer.
  def isInt(str: java.lang.String): scala.Boolean = js.native
  def isInt(str: java.lang.String, options: IsIntOptions): scala.Boolean = js.native
  // check if the string is valid JSON (note: uses JSON.parse).
  def isJSON(str: java.lang.String): scala.Boolean = js.native
  // check if the string is valid JWT token.
  def isJWT(str: java.lang.String): scala.Boolean = js.native
  // check if the string is a valid latitude-longitude coordinate in the format lat,long or lat, long.
  def isLatLong(str: java.lang.String): scala.Boolean = js.native
  def isLength(str: java.lang.String, min: scala.Double): scala.Boolean = js.native
  def isLength(str: java.lang.String, min: scala.Double, max: scala.Double): scala.Boolean = js.native
  // check if the string's length falls in a range.
  // Note: this function takes into account surrogate pairs.
  def isLength(str: java.lang.String, options: IsLengthOptions): scala.Boolean = js.native
  // check if the string is lowercase.
  def isLowercase(str: java.lang.String): scala.Boolean = js.native
  // check if the string is a MAC address.
  def isMACAddress(str: java.lang.String): scala.Boolean = js.native
  // check if the string is a MD5 hash.
  def isMD5(str: java.lang.String): scala.Boolean = js.native
  // check if the string matches to a valid MIME type (https://en.wikipedia.org/wiki/Media_type) format
  def isMimeType(str: java.lang.String): scala.Boolean = js.native
  // check if the string is a mobile phone number, (locale is one of
  // ['ar-AE', ar-DZ', 'ar-EG', 'ar-JO', 'ar-SA', 'ar-SY', 'be-BY', 'bg-BG', 'cs-CZ', 'de-DE',
  // 'da-DK', 'el-GR', 'en-AU', 'en-GB', 'en-HK', 'en-IN', 'en-KE', 'en-NG', 'en-NZ', 'en-UG',
  // 'en-RW', 'en-SG', 'en-TZ', 'en-PK', 'en-US', 'en-CA', 'en-ZA', 'en-ZM', 'es-ES', 'fa-IR',
  // 'fi-FI', 'fo-FO', 'fr-FR', 'he-IL', 'hu-HU', 'id-ID', 'it-IT', 'ja-JP', 'kk-KZ', 'kl-GL',
  // 'ko-KR', 'lt-LT', 'ms-MY', 'nb-NO', 'nn-NO', 'pl-PL', 'pt-PT', 'ro-RO', 'ru-RU', 'sk-SK',
  // 'sr-RS', 'th-TH', 'tr-TR', 'uk-UA', 'vi-VN', 'zh-CN', 'zh-HK', 'zh-TW']).
  def isMobilePhone(str: java.lang.String, locale: MobilePhoneLocale): scala.Boolean = js.native
  def isMobilePhone(str: java.lang.String, locale: MobilePhoneLocale, options: IsMobilePhoneOptions): scala.Boolean = js.native
  // check if the string is a valid hex-encoded representation of a MongoDB ObjectId
  // (http://docs.mongodb.org/manual/reference/object-id/).
  def isMongoId(str: java.lang.String): scala.Boolean = js.native
  // check if the string contains one or more multibyte chars.
  def isMultibyte(str: java.lang.String): scala.Boolean = js.native
  // check if the string contains only numbers.
  def isNumeric(str: java.lang.String): scala.Boolean = js.native
  def isNumeric(str: java.lang.String, options: IsNumericOptions): scala.Boolean = js.native
  // check if the string is a valid port number.
  def isPort(str: java.lang.String): scala.Boolean = js.native
  // check if the string is a postal code, (locale is one of
  // [ 'AT', 'AU', 'BE', 'BG', 'CA', 'CH', 'CZ', 'DE', 'DK', 'DZ', 'ES', 'FI', 'FR', 'GB', 'GR',
  // 'IL', 'IN', 'IS', 'IT', 'JP', 'KE', 'LI', 'MX', 'NL', 'NO', 'PL', 'PT', 'RO', 'RU', 'SA',
  // 'SE', 'TW', 'US', 'ZA', 'ZM' ]) OR 'any'. If 'any' is used, function will check if any of the
  // locales match).
  def isPostalCode(str: java.lang.String, locale: PostalCodeLocale): scala.Boolean = js.native
  // check if the string contains any surrogate pairs chars.
  def isSurrogatePair(str: java.lang.String): scala.Boolean = js.native
  // check if the string is an URL.
  def isURL(str: java.lang.String): scala.Boolean = js.native
  def isURL(str: java.lang.String, options: IsURLOptions): scala.Boolean = js.native
  // check if the string is a UUID. Must be one of ['3', '4', '5', 'all'], default is all.
  def isUUID(str: java.lang.String): scala.Boolean = js.native
  @JSName("isUUID")
  def isUUID_3(str: java.lang.String, version: validatorLib.validatorLibNumbers.`3`): scala.Boolean = js.native
  @JSName("isUUID")
  def isUUID_3(str: java.lang.String, version: validatorLib.validatorLibStrings.`3`): scala.Boolean = js.native
  @JSName("isUUID")
  def isUUID_4(str: java.lang.String, version: validatorLib.validatorLibNumbers.`4`): scala.Boolean = js.native
  @JSName("isUUID")
  def isUUID_4(str: java.lang.String, version: validatorLib.validatorLibStrings.`4`): scala.Boolean = js.native
  @JSName("isUUID")
  def isUUID_5(str: java.lang.String, version: validatorLib.validatorLibNumbers.`5`): scala.Boolean = js.native
  @JSName("isUUID")
  def isUUID_5(str: java.lang.String, version: validatorLib.validatorLibStrings.`5`): scala.Boolean = js.native
  @JSName("isUUID")
  def isUUID_all(str: java.lang.String, version: validatorLib.validatorLibStrings.all): scala.Boolean = js.native
  // check if the string is uppercase.
  def isUppercase(str: java.lang.String): scala.Boolean = js.native
  // check if the string contains a mixture of full and half-width chars.
  def isVariableWidth(str: java.lang.String): scala.Boolean = js.native
  // checks characters if they appear in the whitelist.
  def isWhitelisted(str: java.lang.String, chars: java.lang.String): scala.Boolean = js.native
  def isWhitelisted(str: java.lang.String, chars: js.Array[java.lang.String]): scala.Boolean = js.native
  // trim characters from the left-side of the input.
  def ltrim(input: java.lang.String): java.lang.String = js.native
  def ltrim(input: java.lang.String, chars: java.lang.String): java.lang.String = js.native
  def matches(str: java.lang.String, pattern: java.lang.String): scala.Boolean = js.native
  def matches(str: java.lang.String, pattern: java.lang.String, modifiers: java.lang.String): scala.Boolean = js.native
  // check if string matches the pattern.
  def matches(str: java.lang.String, pattern: stdLib.RegExp): scala.Boolean = js.native
  def matches(str: java.lang.String, pattern: stdLib.RegExp, modifiers: java.lang.String): scala.Boolean = js.native
  // canonicalize an email address.
  def normalizeEmail(email: java.lang.String): java.lang.String | validatorLib.validatorLibNumbers.`false` = js.native
  def normalizeEmail(email: java.lang.String, options: NormalizeEmailOptions): java.lang.String | validatorLib.validatorLibNumbers.`false` = js.native
  // trim characters from the right-side of the input.
  def rtrim(input: java.lang.String): java.lang.String = js.native
  def rtrim(input: java.lang.String, chars: java.lang.String): java.lang.String = js.native
  // remove characters with a numerical value < 32 and 127, mostly control characters. If keep_new_lines is true,
  // newline characters are preserved (\n and \r, hex 0xA and 0xD). Unicode-safe in JavaScript.
  def stripLow(input: java.lang.String): java.lang.String = js.native
  def stripLow(input: java.lang.String, keep_new_lines: scala.Boolean): java.lang.String = js.native
  // convert the input to a boolean. Everything except for '0', 'false' and '' returns true. In strict mode only '1'
  // and 'true' return true.
  def toBoolean(input: java.lang.String): scala.Boolean = js.native
  def toBoolean(input: java.lang.String, strict: scala.Boolean): scala.Boolean = js.native
  // convert the input to a date, or null if the input is not a date.
  def toDate(input: java.lang.String): stdLib.Date = js.native
   // Date or null
  // convert the input to a float, or NaN if the input is not a float.
  def toFloat(input: java.lang.String): scala.Double = js.native
   // number or NaN
  // convert the input to an integer, or NaN if the input is not an integer.
  def toInt(input: java.lang.String): scala.Double = js.native
  def toInt(input: java.lang.String, radix: scala.Double): scala.Double = js.native
  def toString(input: js.Any): java.lang.String = js.native
  def toString(input: js.Array[_]): java.lang.String = js.native
   // number or NaN
  // trim characters (whitespace by default) from both sides of the input.
  def trim(input: java.lang.String): java.lang.String = js.native
  def trim(input: java.lang.String, chars: java.lang.String): java.lang.String = js.native
  // replaces HTML encoded entities with <, >, &, ', " and /.
  def unescape(input: java.lang.String): java.lang.String = js.native
  // remove characters that do not appear in the whitelist. The characters are used in a RegExp and so you will
  // need to escape some chars, e.g. whitelist(input, '\\[\\]').
  def whitelist(input: java.lang.String, chars: java.lang.String): java.lang.String = js.native
}

