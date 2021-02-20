package typings.validator.mod

import typings.std.Date
import typings.std.RegExp
import typings.validator.mod.validator.AlphaLocale
import typings.validator.mod.validator.AlphanumericLocale
import typings.validator.mod.validator.FloatLocale
import typings.validator.mod.validator.HashAlgorithm
import typings.validator.mod.validator.IPVersion
import typings.validator.mod.validator.ISBNVersion
import typings.validator.mod.validator.IdentityCardLocale
import typings.validator.mod.validator.IsByteLengthOptions
import typings.validator.mod.validator.IsCurrencyOptions
import typings.validator.mod.validator.IsDecimalOptions
import typings.validator.mod.validator.IsEmailOptions
import typings.validator.mod.validator.IsEmptyOptions
import typings.validator.mod.validator.IsFQDNOptions
import typings.validator.mod.validator.IsFloatOptions
import typings.validator.mod.validator.IsISO8601Options
import typings.validator.mod.validator.IsISSNOptions
import typings.validator.mod.validator.IsIntOptions
import typings.validator.mod.validator.IsLengthOptions
import typings.validator.mod.validator.IsMACAddressOptions
import typings.validator.mod.validator.IsMobilePhoneOptions
import typings.validator.mod.validator.IsNumericOptions
import typings.validator.mod.validator.IsURLOptions
import typings.validator.mod.validator.MobilePhoneLocale
import typings.validator.mod.validator.NormalizeEmailOptions
import typings.validator.mod.validator.PostalCodeLocale
import typings.validator.mod.validator.UUIDVersion
import typings.validator.validatorBooleans.`false`
import typings.validator.validatorStrings.any
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object default {
  
  /******************
    *** Sanitizers ***
    ******************/
  /**
    * Remove characters that appear in the blacklist.
    *
    * @param chars - The characters are used in a `RegExp` and so you will need to escape some chars, e.g. `blacklist(input, '\\[\\]')`.
    */
  @JSImport("validator", "default.blacklist")
  @js.native
  def blacklist(input: String, chars: String): String = js.native
  
  /******************
    *** Validators ***
    ******************/
  /**
    * Check if the string contains the seed.
    *
    * @param seed - Seed
    */
  @JSImport("validator", "default.contains")
  @js.native
  def contains(str: String, seed: js.Any): Boolean = js.native
  
  /**
    * Check if the string matches the comparison.
    *
    * @param comparison - String to compare
    */
  @JSImport("validator", "default.equals")
  @js.native
  def equals_(str: String, comparison: String): Boolean = js.native
  
  /**
    * Replace `<`, `>`, `&`, `'`, `"` and `/` with HTML entities.
    */
  @JSImport("validator", "default.escape")
  @js.native
  def escape(input: String): String = js.native
  
  /**
    * Check if the string is a date that's after the specified date.
    *
    * @param [date] - Date string (defaults to now)
    */
  @JSImport("validator", "default.isAfter")
  @js.native
  def isAfter(str: String): Boolean = js.native
  @JSImport("validator", "default.isAfter")
  @js.native
  def isAfter(str: String, date: String): Boolean = js.native
  
  /**
    * Check if the string contains only letters (a-zA-Z).
    *
    * @param [locale] - AlphaLocale
    */
  @JSImport("validator", "default.isAlpha")
  @js.native
  def isAlpha(str: String): Boolean = js.native
  @JSImport("validator", "default.isAlpha")
  @js.native
  def isAlpha(str: String, locale: AlphaLocale): Boolean = js.native
  
  @JSImport("validator", "default.isAlphaLocales")
  @js.native
  val isAlphaLocales: js.Array[AlphaLocale] = js.native
  
  /**
    * Check if the string contains only letters and numbers.
    *
    * @param [locale] - AlphanumericLocale
    */
  @JSImport("validator", "default.isAlphanumeric")
  @js.native
  def isAlphanumeric(str: String): Boolean = js.native
  @JSImport("validator", "default.isAlphanumeric")
  @js.native
  def isAlphanumeric(str: String, locale: AlphanumericLocale): Boolean = js.native
  
  @JSImport("validator", "default.isAlphanumericLocales")
  @js.native
  val isAlphanumericLocales: js.Array[AlphanumericLocale] = js.native
  
  /**
    * Check if the string contains ASCII chars only.
    */
  @JSImport("validator", "default.isAscii")
  @js.native
  def isAscii(str: String): Boolean = js.native
  
  /**
    * Check if a string is a BIC (Bank Identification Code) or SWIFT code.
    */
  @JSImport("validator", "default.isBIC")
  @js.native
  def isBIC(str: String): Boolean = js.native
  
  /**
    * Check if a string is base32 encoded.
    */
  @JSImport("validator", "default.isBase32")
  @js.native
  def isBase32(str: String): Boolean = js.native
  
  /**
    * Check if a string is base64 encoded.
    */
  @JSImport("validator", "default.isBase64")
  @js.native
  def isBase64(str: String): Boolean = js.native
  
  /**
    * Check if the string is a date that's before the specified date.
    *
    * @param [date] - Date string (defaults to now)
    */
  @JSImport("validator", "default.isBefore")
  @js.native
  def isBefore(str: String): Boolean = js.native
  @JSImport("validator", "default.isBefore")
  @js.native
  def isBefore(str: String, date: String): Boolean = js.native
  
  /**
    * check if a string is a boolean.
    */
  @JSImport("validator", "default.isBoolean")
  @js.native
  def isBoolean(str: String): Boolean = js.native
  
  /**
    * Check if the string is a valid BTC address.
    */
  @JSImport("validator", "default.isBtcAddress")
  @js.native
  def isBtcAddress(str: String): Boolean = js.native
  
  /**
    * Check if the string's length (in UTF-8 bytes) falls in a range.
    *
    * @param [options] - Options
    */
  @JSImport("validator", "default.isByteLength")
  @js.native
  def isByteLength(str: String): Boolean = js.native
  @JSImport("validator", "default.isByteLength")
  @js.native
  def isByteLength(str: String, options: IsByteLengthOptions): Boolean = js.native
  
  /**
    * Check if the string is a credit card.
    */
  @JSImport("validator", "default.isCreditCard")
  @js.native
  def isCreditCard(str: String): Boolean = js.native
  
  /**
    * Check if the string is a valid currency amount.
    *
    * @param [options] - Options
    */
  @JSImport("validator", "default.isCurrency")
  @js.native
  def isCurrency(str: String): Boolean = js.native
  @JSImport("validator", "default.isCurrency")
  @js.native
  def isCurrency(str: String, options: IsCurrencyOptions): Boolean = js.native
  
  /**
    * Check if the string is a [data uri format](https://developer.mozilla.org/en-US/docs/Web/HTTP/data_URIs).
    */
  @JSImport("validator", "default.isDataURI")
  @js.native
  def isDataURI(str: String): Boolean = js.native
  
  /**
    * Check if the string represents a decimal number,
    * such as `0.1`, `.3`, `1.1`, `1.00003`, `4.0` etc.
    *
    * @param [options] - Options
    */
  @JSImport("validator", "default.isDecimal")
  @js.native
  def isDecimal(str: String): Boolean = js.native
  @JSImport("validator", "default.isDecimal")
  @js.native
  def isDecimal(str: String, options: IsDecimalOptions): Boolean = js.native
  
  /**
    * Check if the string is a number that's divisible by another.
    *
    * @param number - Divider number
    */
  @JSImport("validator", "default.isDivisibleBy")
  @js.native
  def isDivisibleBy(str: String, number: Double): Boolean = js.native
  
  /**
    * Check if the string is an EAN (European Article Number).
    */
  @JSImport("validator", "default.isEAN")
  @js.native
  def isEAN(str: String): Boolean = js.native
  
  /**
    * Check if the string is an email.
    *
    * @param [options] - Options
    */
  @JSImport("validator", "default.isEmail")
  @js.native
  def isEmail(str: String): Boolean = js.native
  @JSImport("validator", "default.isEmail")
  @js.native
  def isEmail(str: String, options: IsEmailOptions): Boolean = js.native
  
  /**
    * Check if the string has a length of zero.
    *
    * @param [options] - Options
    */
  @JSImport("validator", "default.isEmpty")
  @js.native
  def isEmpty(str: String): Boolean = js.native
  @JSImport("validator", "default.isEmpty")
  @js.native
  def isEmpty(str: String, options: IsEmptyOptions): Boolean = js.native
  
  /**
    * Check if the string is an [Ethereum](https://ethereum.org/) address using basic regex. Does not validate address checksums.
    */
  @JSImport("validator", "default.isEthereumAddress")
  @js.native
  def isEthereumAddress(str: String): Boolean = js.native
  
  /**
    * Check if the string is a fully qualified domain name (e.g. `domain.com`).
    *
    * @param [options] - Options
    */
  @JSImport("validator", "default.isFQDN")
  @js.native
  def isFQDN(str: String): Boolean = js.native
  @JSImport("validator", "default.isFQDN")
  @js.native
  def isFQDN(str: String, options: IsFQDNOptions): Boolean = js.native
  
  /**
    * Check if the string is a float.
    *
    * @param [options] - Options
    */
  @JSImport("validator", "default.isFloat")
  @js.native
  def isFloat(str: String): Boolean = js.native
  @JSImport("validator", "default.isFloat")
  @js.native
  def isFloat(str: String, options: IsFloatOptions): Boolean = js.native
  
  @JSImport("validator", "default.isFloatLocales")
  @js.native
  val isFloatLocales: js.Array[FloatLocale] = js.native
  
  /**
    * Check if the string contains any full-width chars.
    */
  @JSImport("validator", "default.isFullWidth")
  @js.native
  def isFullWidth(str: String): Boolean = js.native
  
  /**
    * Check if the string is an HSL (hue, saturation, lightness, optional alpha) color based on CSS Colors Level 4 specification.
    * Comma-separated format supported. Space-separated format supported with the exception of a few edge cases (ex: hsl(200grad+.1%62%/1)).
    */
  @JSImport("validator", "default.isHSL")
  @js.native
  def isHSL(str: String): Boolean = js.native
  
  /**
    * Check if the string contains any half-width chars.
    */
  @JSImport("validator", "default.isHalfWidth")
  @js.native
  def isHalfWidth(str: String): Boolean = js.native
  
  /**
    * Check if the string is a hash of type algorithm.
    *
    * @param algorithm - HashAlgorithm
    */
  @JSImport("validator", "default.isHash")
  @js.native
  def isHash(str: String, algorithm: HashAlgorithm): Boolean = js.native
  
  /**
    * Check if the string is a hexadecimal color.
    */
  @JSImport("validator", "default.isHexColor")
  @js.native
  def isHexColor(str: String): Boolean = js.native
  
  /**
    * Check if the string is a hexadecimal number.
    */
  @JSImport("validator", "default.isHexadecimal")
  @js.native
  def isHexadecimal(str: String): Boolean = js.native
  
  /**
    * Check if a string is a IBAN (International Bank Account Number).
    */
  @JSImport("validator", "default.isIBAN")
  @js.native
  def isIBAN(str: String): Boolean = js.native
  
  /**
    * Check if the string is an IP (version 4 or 6).
    *
    * @param [version] - IP Version
    */
  @JSImport("validator", "default.isIP")
  @js.native
  def isIP(str: String): Boolean = js.native
  @JSImport("validator", "default.isIP")
  @js.native
  def isIP(str: String, version: IPVersion): Boolean = js.native
  
  /**
    * Check if the string is an IP Range (version 4 only).
    */
  @JSImport("validator", "default.isIPRange")
  @js.native
  def isIPRange(str: String): Boolean = js.native
  
  /**
    * Check if the string is an ISBN (version 10 or 13).
    *
    * @param [version] - ISBN Version
    */
  @JSImport("validator", "default.isISBN")
  @js.native
  def isISBN(str: String): Boolean = js.native
  @JSImport("validator", "default.isISBN")
  @js.native
  def isISBN(str: String, version: ISBNVersion): Boolean = js.native
  
  /**
    * Check if the string is an [ISIN](https://en.wikipedia.org/wiki/International_Securities_Identification_Number) (stock/security identifier).
    */
  @JSImport("validator", "default.isISIN")
  @js.native
  def isISIN(str: String): Boolean = js.native
  
  /**
    * Check if the string is a valid [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) officially assigned country code.
    */
  @JSImport("validator", "default.isISO31661Alpha2")
  @js.native
  def isISO31661Alpha2(str: String): Boolean = js.native
  
  /**
    * Check if the string is a valid [ISO 3166-1 alpha-3](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3) officially assigned country code.
    */
  @JSImport("validator", "default.isISO31661Alpha3")
  @js.native
  def isISO31661Alpha3(str: String): Boolean = js.native
  
  /**
    * Check if the string is a valid [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date.
    *
    * @param [options] - Options
    */
  @JSImport("validator", "default.isISO8601")
  @js.native
  def isISO8601(str: String): Boolean = js.native
  @JSImport("validator", "default.isISO8601")
  @js.native
  def isISO8601(str: String, options: IsISO8601Options): Boolean = js.native
  
  /**
    * Check if the string is a [ISRC](https://en.wikipedia.org/wiki/International_Standard_Recording_Code).
    */
  @JSImport("validator", "default.isISRC")
  @js.native
  def isISRC(str: String): Boolean = js.native
  
  /**
    * Check if the string is an [ISSN](https://en.wikipedia.org/wiki/International_Standard_Serial_Number).
    *
    * @param [options] - Options
    */
  @JSImport("validator", "default.isISSN")
  @js.native
  def isISSN(str: String): Boolean = js.native
  @JSImport("validator", "default.isISSN")
  @js.native
  def isISSN(str: String, options: IsISSNOptions): Boolean = js.native
  
  /**
    * Check if the string is a valid identity card code.
    *
    * @param [locale="any"] - IdentityCardLocale
    */
  @JSImport("validator", "default.isIdentityCard")
  @js.native
  def isIdentityCard(str: String): Boolean = js.native
  @JSImport("validator", "default.isIdentityCard")
  @js.native
  def isIdentityCard(str: String, locale: IdentityCardLocale): Boolean = js.native
  @JSImport("validator", "default.isIdentityCard")
  @js.native
  def isIdentityCard_any(str: String, locale: any): Boolean = js.native
  
  /**
    * Check if the string is in a array of allowed values.
    *
    * @param values - Allowed values.
    */
  @JSImport("validator", "default.isIn")
  @js.native
  def isIn(str: String, values: js.Array[_]): Boolean = js.native
  
  /**
    * Check if the string is an integer.
    *
    * @param [options] - Options
    */
  @JSImport("validator", "default.isInt")
  @js.native
  def isInt(str: String): Boolean = js.native
  @JSImport("validator", "default.isInt")
  @js.native
  def isInt(str: String, options: IsIntOptions): Boolean = js.native
  
  /**
    * Check if the string is valid JSON (note: uses `JSON.parse`).
    */
  @JSImport("validator", "default.isJSON")
  @js.native
  def isJSON(str: String): Boolean = js.native
  
  /**
    * Check if the string is valid JWT token.
    */
  @JSImport("validator", "default.isJWT")
  @js.native
  def isJWT(str: String): Boolean = js.native
  
  /**
    * Check if the string is a valid latitude-longitude coordinate in the format:
    *
    * `lat,long` or `lat, long`.
    */
  @JSImport("validator", "default.isLatLong")
  @js.native
  def isLatLong(str: String): Boolean = js.native
  
  /**
    * Check if the string's length falls in a range.
    *
    * Note: this function takes into account surrogate pairs.
    *
    * @param [options] - Options
    */
  @JSImport("validator", "default.isLength")
  @js.native
  def isLength(str: String): Boolean = js.native
  @JSImport("validator", "default.isLength")
  @js.native
  def isLength(str: String, options: IsLengthOptions): Boolean = js.native
  
  /**
    * Check if the string is a locale.
    */
  @JSImport("validator", "default.isLocale")
  @js.native
  def isLocale(str: String): Boolean = js.native
  
  /**
    * Check if the string is lowercase.
    */
  @JSImport("validator", "default.isLowercase")
  @js.native
  def isLowercase(str: String): Boolean = js.native
  
  /**
    * Check if the string is a MAC address.
    *
    * @param [options] - Options
    */
  @JSImport("validator", "default.isMACAddress")
  @js.native
  def isMACAddress(str: String): Boolean = js.native
  @JSImport("validator", "default.isMACAddress")
  @js.native
  def isMACAddress(str: String, options: IsMACAddressOptions): Boolean = js.native
  
  /**
    * Check if the string is a MD5 hash.
    */
  @JSImport("validator", "default.isMD5")
  @js.native
  def isMD5(str: String): Boolean = js.native
  
  /**
    * Check if the string is a [magnet uri format](https://en.wikipedia.org/wiki/Magnet_URI_scheme).
    */
  @JSImport("validator", "default.isMagnetURI")
  @js.native
  def isMagnetURI(str: String): Boolean = js.native
  
  /**
    * Check if the string matches to a valid [MIME type](https://en.wikipedia.org/wiki/Media_type) format.
    */
  @JSImport("validator", "default.isMimeType")
  @js.native
  def isMimeType(str: String): Boolean = js.native
  
  /**
    * Check if the string is a mobile phone number.
    *
    * @param [locale] - MobilePhoneLocale(s)
    * @param [options] - Options
    */
  @JSImport("validator", "default.isMobilePhone")
  @js.native
  def isMobilePhone(str: String): Boolean = js.native
  @JSImport("validator", "default.isMobilePhone")
  @js.native
  def isMobilePhone(str: String, locale: js.UndefOr[scala.Nothing], options: IsMobilePhoneOptions): Boolean = js.native
  @JSImport("validator", "default.isMobilePhone")
  @js.native
  def isMobilePhone(str: String, locale: js.Array[MobilePhoneLocale]): Boolean = js.native
  @JSImport("validator", "default.isMobilePhone")
  @js.native
  def isMobilePhone(str: String, locale: js.Array[MobilePhoneLocale], options: IsMobilePhoneOptions): Boolean = js.native
  @JSImport("validator", "default.isMobilePhone")
  @js.native
  def isMobilePhone(str: String, locale: MobilePhoneLocale): Boolean = js.native
  @JSImport("validator", "default.isMobilePhone")
  @js.native
  def isMobilePhone(str: String, locale: MobilePhoneLocale, options: IsMobilePhoneOptions): Boolean = js.native
  
  @JSImport("validator", "default.isMobilePhoneLocales")
  @js.native
  val isMobilePhoneLocales: js.Array[MobilePhoneLocale] = js.native
  
  @JSImport("validator", "default.isMobilePhone")
  @js.native
  def isMobilePhone_any(str: String, locale: any): Boolean = js.native
  @JSImport("validator", "default.isMobilePhone")
  @js.native
  def isMobilePhone_any(str: String, locale: any, options: IsMobilePhoneOptions): Boolean = js.native
  
  /**
    * Check if the string is a valid hex-encoded representation of a [MongoDB ObjectId](http://docs.mongodb.org/manual/reference/object-id/).
    */
  @JSImport("validator", "default.isMongoId")
  @js.native
  def isMongoId(str: String): Boolean = js.native
  
  /**
    * Check if the string contains one or more multibyte chars.
    */
  @JSImport("validator", "default.isMultibyte")
  @js.native
  def isMultibyte(str: String): Boolean = js.native
  
  /**
    * Check if the string contains only numbers.
    *
    * @param [options] - Options
    */
  @JSImport("validator", "default.isNumeric")
  @js.native
  def isNumeric(str: String): Boolean = js.native
  @JSImport("validator", "default.isNumeric")
  @js.native
  def isNumeric(str: String, options: IsNumericOptions): Boolean = js.native
  
  /**
    * Check if the string is a valid octal number.
    */
  @JSImport("validator", "default.isOctal")
  @js.native
  def isOctal(str: String): Boolean = js.native
  
  /**
    * Check if the string is a valid passport number relative to a specific country code.
    *
    * @param [countryCode] - Country code
    */
  @JSImport("validator", "default.isPassportNumber")
  @js.native
  def isPassportNumber(str: String): Boolean = js.native
  @JSImport("validator", "default.isPassportNumber")
  @js.native
  def isPassportNumber(str: String, countryCode: String): Boolean = js.native
  
  /**
    * Check if the string is a valid port number.
    */
  @JSImport("validator", "default.isPort")
  @js.native
  def isPort(str: String): Boolean = js.native
  
  @JSImport("validator", "default.isPostalCode")
  @js.native
  def isPostalCode(str: String, locale: PostalCodeLocale): Boolean = js.native
  
  @JSImport("validator", "default.isPostalCodeLocales")
  @js.native
  val isPostalCodeLocales: js.Array[PostalCodeLocale] = js.native
  
  /**
    * Check if the string is a postal code
    *
    * @param locale - PostalCodeLocale
    */
  @JSImport("validator", "default.isPostalCode")
  @js.native
  def isPostalCode_any(str: String, locale: any): Boolean = js.native
  
  /**
    * Check if the string is a valid [RFC 3339](https://tools.ietf.org/html/rfc3339) date.
    */
  @JSImport("validator", "default.isRFC3339")
  @js.native
  def isRFC3339(str: String): Boolean = js.native
  
  /**
    * Check if the string is a rgb or rgba color.
    *
    * @param [includePercentValues=true] - If you don't want to allow to set rgb or rgba values with percents, like rgb(5%,5%,5%), or rgba(90%,90%,90%,.3), then set it to false. (defaults to true)
    */
  @JSImport("validator", "default.isRgbColor")
  @js.native
  def isRgbColor(str: String): Boolean = js.native
  @JSImport("validator", "default.isRgbColor")
  @js.native
  def isRgbColor(str: String, includePercentValues: Boolean): Boolean = js.native
  
  /**
    * Check if the string is a Semantic Versioning Specification (SemVer).
    */
  @JSImport("validator", "default.isSemVer")
  @js.native
  def isSemVer(str: String): Boolean = js.native
  
  /**
    * Check if the string is of type slug.
    */
  @JSImport("validator", "default.isSlug")
  @js.native
  def isSlug(str: String): Boolean = js.native
  
  /**
    * Check if the string contains any surrogate pairs chars.
    */
  @JSImport("validator", "default.isSurrogatePair")
  @js.native
  def isSurrogatePair(str: String): Boolean = js.native
  
  /**
    * Check if the string is an URL.
    *
    * @param [options] - Options
    */
  @JSImport("validator", "default.isURL")
  @js.native
  def isURL(str: String): Boolean = js.native
  @JSImport("validator", "default.isURL")
  @js.native
  def isURL(str: String, options: IsURLOptions): Boolean = js.native
  
  /**
    * Check if the string is a UUID (version 3, 4 or 5).
    *
    * @param [version="all"] - UUID version
    */
  @JSImport("validator", "default.isUUID")
  @js.native
  def isUUID(str: String): Boolean = js.native
  @JSImport("validator", "default.isUUID")
  @js.native
  def isUUID(str: String, version: UUIDVersion): Boolean = js.native
  
  /**
    * Check if the string is uppercase.
    */
  @JSImport("validator", "default.isUppercase")
  @js.native
  def isUppercase(str: String): Boolean = js.native
  
  /**
    * Check if the string contains a mixture of full and half-width chars.
    */
  @JSImport("validator", "default.isVariableWidth")
  @js.native
  def isVariableWidth(str: String): Boolean = js.native
  
  /**
    * Checks characters if they appear in the whitelist.
    *
    * @param chars - whitelist
    */
  @JSImport("validator", "default.isWhitelisted")
  @js.native
  def isWhitelisted(str: String, chars: String): Boolean = js.native
  @JSImport("validator", "default.isWhitelisted")
  @js.native
  def isWhitelisted(str: String, chars: js.Array[String]): Boolean = js.native
  
  /**
    * Trim characters from the left-side of the input.
    *
    * @param [chars] - characters (defaults to whitespace)
    */
  @JSImport("validator", "default.ltrim")
  @js.native
  def ltrim(input: String): String = js.native
  @JSImport("validator", "default.ltrim")
  @js.native
  def ltrim(input: String, chars: String): String = js.native
  
  /**
    * Check if string matches the pattern.
    *
    * @param pattern - `'foo'`
    * @param [modifiers] - `'i'`
    */
  @JSImport("validator", "default.matches")
  @js.native
  def matches(str: String, pattern: String): Boolean = js.native
  @JSImport("validator", "default.matches")
  @js.native
  def matches(str: String, pattern: String, modifiers: String): Boolean = js.native
  /**
    * Check if string matches the pattern.
    *
    * @param pattern - `/foo/i`
    */
  @JSImport("validator", "default.matches")
  @js.native
  def matches(str: String, pattern: RegExp): Boolean = js.native
  
  /**
    * Canonicalizes an email address. (This doesn't validate that the input is an email, if you want to validate the email use `isEmail` beforehand)
    *
    * @param [options] - Options
    */
  @JSImport("validator", "default.normalizeEmail")
  @js.native
  def normalizeEmail(email: String): String | `false` = js.native
  @JSImport("validator", "default.normalizeEmail")
  @js.native
  def normalizeEmail(email: String, options: NormalizeEmailOptions): String | `false` = js.native
  
  /**
    * Trim characters from the right-side of the input.
    *
    * @param [chars] - characters (defaults to whitespace)
    */
  @JSImport("validator", "default.rtrim")
  @js.native
  def rtrim(input: String): String = js.native
  @JSImport("validator", "default.rtrim")
  @js.native
  def rtrim(input: String, chars: String): String = js.native
  
  /**
    * Remove characters with a numerical value < `32` and `127`, mostly control characters.
    * Unicode-safe in JavaScript.
    *
    * @param [keep_new_lines=false] - if `true`, newline characters are preserved (`\n` and `\r`, hex `0xA` and `0xD`).
    */
  @JSImport("validator", "default.stripLow")
  @js.native
  def stripLow(input: String): String = js.native
  @JSImport("validator", "default.stripLow")
  @js.native
  def stripLow(input: String, keep_new_lines: Boolean): String = js.native
  
  /**
    * Convert the input string to a boolean.
    * Everything except for `'0'`, `'false'` and `''` returns `true`.
    *
    * @param [strict=false] - in `strict` mode, only `'1'` and `'true'` return `true`.
    */
  @JSImport("validator", "default.toBoolean")
  @js.native
  def toBoolean(input: String): Boolean = js.native
  @JSImport("validator", "default.toBoolean")
  @js.native
  def toBoolean(input: String, strict: Boolean): Boolean = js.native
  
  /**
    * Convert the input string to a `Date`, or `null` if the input is not a date.
    */
  @JSImport("validator", "default.toDate")
  @js.native
  def toDate(input: String): Date | Null = js.native
  
  /**
    * Convert the input string to a float, or `NaN` if the input is not a float.
    */
  @JSImport("validator", "default.toFloat")
  @js.native
  def toFloat(input: String): Double = js.native
  
  /**
    * Convert the input string to an integer, or `NaN` if the input is not an integer.
    *
    * @param [radix=10] - radix or base (defaults to 10)
    */
  @JSImport("validator", "default.toInt")
  @js.native
  def toInt(input: String): Double = js.native
  @JSImport("validator", "default.toInt")
  @js.native
  def toInt(input: String, radix: Double): Double = js.native
  
  /**
    * Converts to string.
    */
  @JSImport("validator", "default.toString")
  @js.native
  def toString_(input: js.Any): String = js.native
  
  /**
    * Trim characters from both sides of the input.
    *
    * @param [chars] - characters (defaults to whitespace)
    */
  @JSImport("validator", "default.trim")
  @js.native
  def trim(input: String): String = js.native
  @JSImport("validator", "default.trim")
  @js.native
  def trim(input: String, chars: String): String = js.native
  
  /**
    * Replaces HTML encoded entities with `<`, `>`, `&`, `'`, `"` and `/`.
    */
  @JSImport("validator", "default.unescape")
  @js.native
  def unescape(input: String): String = js.native
  
  @JSImport("validator", "default.version")
  @js.native
  val version: String = js.native
  
  /**
    * Remove characters that do not appear in the whitelist.
    *
    * @param chars - The characters are used in a `RegExp` and so you will need to escape some chars, e.g. `whitelist(input, '\\[\\]')`.
    */
  @JSImport("validator", "default.whitelist")
  @js.native
  def whitelist(input: String, chars: String): String = js.native
}
