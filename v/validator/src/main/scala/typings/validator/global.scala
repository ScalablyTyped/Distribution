package typings.validator

import typings.validator.anon.StrongPasswordOptionsretu
import typings.validator.anon.StrongPasswordOptionsretuMinLength
import typings.validator.libIsBooleanMod.Options
import typings.validator.libIsEmailMod.IsEmailOptions
import typings.validator.libIsFQDNMod.IsFQDNOptions
import typings.validator.libIsURLMod.IsURLOptions
import typings.validator.mod.validator.AlphaLocale
import typings.validator.mod.validator.AlphanumericLocale
import typings.validator.mod.validator.ContainsOptions
import typings.validator.mod.validator.FloatLocale
import typings.validator.mod.validator.HashAlgorithm
import typings.validator.mod.validator.IPVersion
import typings.validator.mod.validator.ISBNVersion
import typings.validator.mod.validator.IdentityCardLocale
import typings.validator.mod.validator.IsAlphaOptions
import typings.validator.mod.validator.IsAlphanumericOptions
import typings.validator.mod.validator.IsBase64Options
import typings.validator.mod.validator.IsByteLengthOptions
import typings.validator.mod.validator.IsCurrencyOptions
import typings.validator.mod.validator.IsDateOptions
import typings.validator.mod.validator.IsDecimalOptions
import typings.validator.mod.validator.IsEmptyOptions
import typings.validator.mod.validator.IsFloatOptions
import typings.validator.mod.validator.IsISO8601Options
import typings.validator.mod.validator.IsISSNOptions
import typings.validator.mod.validator.IsIntOptions
import typings.validator.mod.validator.IsLengthOptions
import typings.validator.mod.validator.IsMACAddressOptions
import typings.validator.mod.validator.IsMobilePhoneOptions
import typings.validator.mod.validator.IsNumericOptions
import typings.validator.mod.validator.MobilePhoneLocale
import typings.validator.mod.validator.NormalizeEmailOptions
import typings.validator.mod.validator.PostalCodeLocale
import typings.validator.mod.validator.UUIDVersion
import typings.validator.validatorBooleans.`false`
import typings.validator.validatorStrings.any
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object validator {
    
    @JSGlobal("validator")
    @js.native
    val ^ : js.Any = js.native
    
    /******************
      *** Sanitizers ***
      ******************/
    /**
      * Remove characters that appear in the blacklist.
      *
      * @param chars - The characters are used in a `RegExp` and so you will need to escape some chars, e.g. `blacklist(input, '\\[\\]')`.
      */
    inline def blacklist(input: String, chars: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("blacklist")(input.asInstanceOf[js.Any], chars.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * Check if the string contains the seed.
      *
      * @param seed - Seed
      */
    inline def contains(str: String, seed: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(str.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def contains(str: String, seed: Any, options: ContainsOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(str.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Check if the string matches the comparison.
      *
      * @param comparison - String to compare
      */
    inline def equals_(str: String, comparison: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(str.asInstanceOf[js.Any], comparison.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Replace `<`, `>`, `&`, `'`, `"` and `/` with HTML entities.
      */
    inline def escape(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escape")(input.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /* was `typeof _isIBAN.locales` */
    @JSGlobal("validator.ibanLocales")
    @js.native
    val ibanLocales: js.Array[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 78, starting with typings.validator.validatorStrings.AD, typings.validator.validatorStrings.AE, typings.validator.validatorStrings.AL */ Any
      ] = js.native
    
    /**
      * Check if the string is a date that's after the specified date.
      *
      * @param [date] - Date string (defaults to now)
      */
    inline def isAfter(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAfter")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isAfter(str: String, date: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAfter")(str.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Check if the string contains only letters (a-zA-Z).
      *
      * @param [locale] - AlphaLocale
      * @param [options] - IsAlphaOptions
      */
    inline def isAlpha(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAlpha")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isAlpha(str: String, locale: Unit, options: IsAlphaOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAlpha")(str.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isAlpha(str: String, locale: AlphaLocale): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAlpha")(str.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isAlpha(str: String, locale: AlphaLocale, options: IsAlphaOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAlpha")(str.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSGlobal("validator.isAlphaLocales")
    @js.native
    val isAlphaLocales: js.Array[AlphaLocale] = js.native
    
    /**
      * Check if the string contains only letters and numbers.
      *
      * @param [locale] - AlphanumericLocale
      * @param [options] - IsAlphanumericOptions
      */
    inline def isAlphanumeric(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAlphanumeric")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isAlphanumeric(str: String, locale: Unit, options: IsAlphanumericOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAlphanumeric")(str.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isAlphanumeric(str: String, locale: AlphanumericLocale): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAlphanumeric")(str.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isAlphanumeric(str: String, locale: AlphanumericLocale, options: IsAlphanumericOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAlphanumeric")(str.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSGlobal("validator.isAlphanumericLocales")
    @js.native
    val isAlphanumericLocales: js.Array[AlphanumericLocale] = js.native
    
    /**
      * Check if the string contains ASCII chars only.
      */
    inline def isAscii(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAscii")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Check if a string is a BIC (Bank Identification Code) or SWIFT code.
      */
    inline def isBIC(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBIC")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Check if a string is base32 encoded.
      */
    inline def isBase32(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBase32")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * check if a string is base58 encoded
      */
    inline def isBase58(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBase58")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Check if a string is base64 encoded.
      *
      * @param [options] - Options
      */
    inline def isBase64(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBase64")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isBase64(str: String, options: IsBase64Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBase64")(str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Check if the string is a date that's before the specified date.
      *
      * @param [date] - Date string (defaults to now)
      */
    inline def isBefore(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBefore")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isBefore(str: String, date: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBefore")(str.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /* was `typeof _isBoolean.default` */
    inline def isBoolean(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBoolean")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isBoolean(str: String, options: Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBoolean")(str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Check if the string is a valid BTC address.
      */
    inline def isBtcAddress(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBtcAddress")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Check if the string's length (in UTF-8 bytes) falls in a range.
      *
      * @param [options] - Options
      */
    inline def isByteLength(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isByteLength")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isByteLength(str: String, options: IsByteLengthOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isByteLength")(str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Check if the string is a credit card.
      */
    inline def isCreditCard(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCreditCard")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Check if the string is a valid currency amount.
      *
      * @param [options] - Options
      */
    inline def isCurrency(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCurrency")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isCurrency(str: String, options: IsCurrencyOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isCurrency")(str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Check if the string is a [data uri format](https://developer.mozilla.org/en-US/docs/Web/HTTP/data_URIs).
      */
    inline def isDataURI(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDataURI")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Check if the string is a valid date.
      */
    inline def isDate(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDate")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isDate(str: String, options: IsDateOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDate")(str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Check if the string represents a decimal number,
      * such as `0.1`, `.3`, `1.1`, `1.00003`, `4.0` etc.
      *
      * @param [options] - Options
      */
    inline def isDecimal(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDecimal")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isDecimal(str: String, options: IsDecimalOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDecimal")(str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Check if the string is a number that's divisible by another.
      *
      * @param number - Divider number
      */
    inline def isDivisibleBy(str: String, number: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDivisibleBy")(str.asInstanceOf[js.Any], number.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Check if the string is an EAN (European Article Number).
      */
    inline def isEAN(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEAN")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* was `typeof _isEmail.default` */
    inline def isEmail(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmail")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isEmail(str: String, options: IsEmailOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEmail")(str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Check if the string has a length of zero.
      *
      * @param [options] - Options
      */
    inline def isEmpty(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isEmpty(str: String, options: IsEmptyOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Check if the string is an [Ethereum](https://ethereum.org/) address using basic regex. Does not validate address checksums.
      */
    inline def isEthereumAddress(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEthereumAddress")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* was `typeof _isFQDN.default` */
    inline def isFQDN(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFQDN")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isFQDN(str: String, options: IsFQDNOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFQDN")(str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Check if the string is a float.
      *
      * @param [options] - Options
      */
    inline def isFloat(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFloat")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isFloat(str: String, options: IsFloatOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFloat")(str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSGlobal("validator.isFloatLocales")
    @js.native
    val isFloatLocales: js.Array[FloatLocale] = js.native
    
    /**
      * Check if the string contains any full-width chars.
      */
    inline def isFullWidth(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFullWidth")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Check if the string is an HSL (hue, saturation, lightness, optional alpha) color based on CSS Colors Level 4 specification.
      * Comma-separated format supported. Space-separated format supported with the exception of a few edge cases (ex: hsl(200grad+.1%62%/1)).
      */
    inline def isHSL(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHSL")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Check if the string contains any half-width chars.
      */
    inline def isHalfWidth(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHalfWidth")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Check if the string is a hash of type algorithm.
      *
      * @param algorithm - HashAlgorithm
      */
    inline def isHash(str: String, algorithm: HashAlgorithm): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isHash")(str.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Check if the string is a hexadecimal color.
      */
    inline def isHexColor(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHexColor")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Check if the string is a hexadecimal number.
      */
    inline def isHexadecimal(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHexadecimal")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* was `typeof _isIBAN.default` */
    inline def isIBAN(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIBAN")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Check if the string is an IP (version 4 or 6).
      *
      * @param [version] - IP Version
      */
    inline def isIP(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIP")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isIP(str: String, version: IPVersion): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isIP")(str.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Check if the string is an IP Range (version 4 or 6).
      */
    inline def isIPRange(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIPRange")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isIPRange(str: String, version: IPVersion): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isIPRange")(str.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Check if the string is an ISBN (version 10 or 13).
      *
      * @param [version] - ISBN Version
      */
    inline def isISBN(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isISBN")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isISBN(str: String, version: ISBNVersion): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isISBN")(str.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Check if the string is an [ISIN](https://en.wikipedia.org/wiki/International_Securities_Identification_Number) (stock/security identifier).
      */
    inline def isISIN(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isISIN")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* was `typeof _isISO31661Alpha2.default` */
    inline def isISO31661Alpha2(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isISO31661Alpha2")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Check if the string is a valid [ISO 3166-1 alpha-3](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3) officially assigned country code.
      */
    inline def isISO31661Alpha3(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isISO31661Alpha3")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* was `typeof _isISO4217.default` */
    inline def isISO4217(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isISO4217")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Check if the string is a valid [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date.
      *
      * @param [options] - Options
      */
    inline def isISO8601(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isISO8601")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isISO8601(str: String, options: IsISO8601Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isISO8601")(str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Check if the string is a [ISRC](https://en.wikipedia.org/wiki/International_Standard_Recording_Code).
      */
    inline def isISRC(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isISRC")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Check if the string is an [ISSN](https://en.wikipedia.org/wiki/International_Standard_Serial_Number).
      *
      * @param [options] - Options
      */
    inline def isISSN(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isISSN")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isISSN(str: String, options: IsISSNOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isISSN")(str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Check if the string is a valid identity card code.
      *
      * @param [locale="any"] - IdentityCardLocale
      */
    inline def isIdentityCard(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIdentityCard")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isIdentityCard(str: String, locale: IdentityCardLocale): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isIdentityCard")(str.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def isIdentityCard_any(str: String, locale: any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isIdentityCard")(str.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Check if the string is in a array of allowed values.
      *
      * @param values - Allowed values.
      */
    inline def isIn(str: String, values: js.Array[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isIn")(str.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Check if the string is an integer.
      *
      * @param [options] - Options
      */
    inline def isInt(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInt")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isInt(str: String, options: IsIntOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInt")(str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Check if the string is valid JSON (note: uses `JSON.parse`).
      */
    inline def isJSON(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSON")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Check if the string is valid JWT token.
      */
    inline def isJWT(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJWT")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Check if the string is a valid latitude-longitude coordinate in the format:
      *
      * `lat,long` or `lat, long`.
      */
    inline def isLatLong(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLatLong")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Check if the string's length falls in a range.
      *
      * Note: this function takes into account surrogate pairs.
      *
      * @param [options] - Options
      */
    inline def isLength(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLength")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isLength(str: String, options: IsLengthOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isLength")(str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Check if the string is a locale.
      */
    inline def isLocale(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLocale")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Check if the string is lowercase.
      */
    inline def isLowercase(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLowercase")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Check if the string is a MAC address.
      *
      * @param [options] - Options
      */
    inline def isMACAddress(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMACAddress")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isMACAddress(str: String, options: IsMACAddressOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMACAddress")(str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Check if the string is a MD5 hash.
      */
    inline def isMD5(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMD5")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Check if the string is a [magnet uri format](https://en.wikipedia.org/wiki/Magnet_URI_scheme).
      */
    inline def isMagnetURI(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMagnetURI")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Check if the string matches to a valid [MIME type](https://en.wikipedia.org/wiki/Media_type) format.
      */
    inline def isMimeType(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMimeType")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Check if the string is a mobile phone number.
      *
      * @param [locale] - MobilePhoneLocale(s)
      * @param [options] - Options
      */
    inline def isMobilePhone(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMobilePhone")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isMobilePhone(str: String, locale: js.Array[MobilePhoneLocale]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMobilePhone")(str.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isMobilePhone(str: String, locale: js.Array[MobilePhoneLocale], options: IsMobilePhoneOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMobilePhone")(str.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isMobilePhone(str: String, locale: Unit, options: IsMobilePhoneOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMobilePhone")(str.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isMobilePhone(str: String, locale: MobilePhoneLocale): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMobilePhone")(str.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isMobilePhone(str: String, locale: MobilePhoneLocale, options: IsMobilePhoneOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMobilePhone")(str.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSGlobal("validator.isMobilePhoneLocales")
    @js.native
    val isMobilePhoneLocales: js.Array[MobilePhoneLocale] = js.native
    
    inline def isMobilePhone_any(str: String, locale: any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMobilePhone")(str.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isMobilePhone_any(str: String, locale: any, options: IsMobilePhoneOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMobilePhone")(str.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Check if the string is a valid hex-encoded representation of a [MongoDB ObjectId](http://docs.mongodb.org/manual/reference/object-id/).
      */
    inline def isMongoId(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMongoId")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Check if the string contains one or more multibyte chars.
      */
    inline def isMultibyte(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMultibyte")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Check if the string contains only numbers.
      *
      * @param [options] - Options
      */
    inline def isNumeric(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumeric")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isNumeric(str: String, options: IsNumericOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNumeric")(str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Check if the string is a valid octal number.
      */
    inline def isOctal(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOctal")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Check if the string is a valid passport number relative to a specific country code.
      *
      * @param [countryCode] - Country code
      */
    inline def isPassportNumber(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPassportNumber")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isPassportNumber(str: String, countryCode: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPassportNumber")(str.asInstanceOf[js.Any], countryCode.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Check if the string is a valid port number.
      */
    inline def isPort(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPort")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Check if the string is a postal code
      *
      * @param locale - PostalCodeLocale
      */
    inline def isPostalCode(str: String, locale: PostalCodeLocale): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPostalCode")(str.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSGlobal("validator.isPostalCodeLocales")
    @js.native
    val isPostalCodeLocales: js.Array[PostalCodeLocale] = js.native
    
    inline def isPostalCode_any(str: String, locale: any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPostalCode")(str.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Check if the string is a valid [RFC 3339](https://tools.ietf.org/html/rfc3339) date.
      */
    inline def isRFC3339(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRFC3339")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Check if the string is a rgb or rgba color.
      *
      * @param [includePercentValues=true] - If you don't want to allow to set rgb or rgba values with percents, like rgb(5%,5%,5%), or rgba(90%,90%,90%,.3), then set it to false. (defaults to true)
      */
    inline def isRgbColor(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRgbColor")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isRgbColor(str: String, includePercentValues: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isRgbColor")(str.asInstanceOf[js.Any], includePercentValues.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Check if the string is a Semantic Versioning Specification (SemVer).
      */
    inline def isSemVer(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSemVer")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Check if the string is of type slug.
      */
    inline def isSlug(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSlug")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isStrongPassword(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStrongPassword")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isStrongPassword(str: String, options: StrongPasswordOptionsretu): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isStrongPassword")(str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isStrongPassword(str: String, options: StrongPasswordOptionsretuMinLength): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("isStrongPassword")(str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Check if the string contains any surrogate pairs chars.
      */
    inline def isSurrogatePair(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSurrogatePair")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* was `typeof _isTaxID.default` */
    inline def isTaxID(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTaxID")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isTaxID(str: String, locale: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTaxID")(str.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /* was `typeof _isURL.default` */
    inline def isURL(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isURL")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isURL(str: String, options: IsURLOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isURL")(str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Check if the string is a UUID (version 3, 4 or 5).
      *
      * @param [version="all"] - UUID version
      */
    inline def isUUID(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUUID")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isUUID(str: String, version: UUIDVersion): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isUUID")(str.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Check if the string is uppercase.
      */
    inline def isUppercase(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUppercase")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Checks that the string is a [valid VAT number
      */
    inline def isVAT(str: String, countryCode: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isVAT")(str.asInstanceOf[js.Any], countryCode.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Check if the string contains a mixture of full and half-width chars.
      */
    inline def isVariableWidth(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVariableWidth")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Checks characters if they appear in the whitelist.
      *
      * @param chars - whitelist
      */
    inline def isWhitelisted(str: String, chars: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isWhitelisted")(str.asInstanceOf[js.Any], chars.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isWhitelisted(str: String, chars: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isWhitelisted")(str.asInstanceOf[js.Any], chars.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Trim characters from the left-side of the input.
      *
      * @param [chars] - characters (defaults to whitespace)
      */
    inline def ltrim(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ltrim")(input.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def ltrim(input: String, chars: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("ltrim")(input.asInstanceOf[js.Any], chars.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * Check if string matches the pattern.
      *
      * @param pattern - `'foo'`
      * @param [modifiers] - `'i'`
      */
    inline def matches(str: String, pattern: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matches")(str.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def matches(str: String, pattern: String, modifiers: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matches")(str.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], modifiers.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    /**
      * Check if string matches the pattern.
      *
      * @param pattern - `/foo/i`
      */
    inline def matches(str: String, pattern: js.RegExp): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matches")(str.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Canonicalizes an email address. (This doesn't validate that the input is an email, if you want to validate the email use `isEmail` beforehand)
      *
      * @param [options] - Options
      */
    inline def normalizeEmail(email: String): String | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeEmail")(email.asInstanceOf[js.Any]).asInstanceOf[String | `false`]
    inline def normalizeEmail(email: String, options: NormalizeEmailOptions): String | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeEmail")(email.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | `false`]
    
    /**
      * Trim characters from the right-side of the input.
      *
      * @param [chars] - characters (defaults to whitespace)
      */
    inline def rtrim(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("rtrim")(input.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def rtrim(input: String, chars: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("rtrim")(input.asInstanceOf[js.Any], chars.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * Remove characters with a numerical value < `32` and `127`, mostly control characters.
      * Unicode-safe in JavaScript.
      *
      * @param [keep_new_lines=false] - if `true`, newline characters are preserved (`\n` and `\r`, hex `0xA` and `0xD`).
      */
    inline def stripLow(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripLow")(input.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def stripLow(input: String, keep_new_lines: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stripLow")(input.asInstanceOf[js.Any], keep_new_lines.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * Convert the input string to a boolean.
      * Everything except for `'0'`, `'false'` and `''` returns `true`.
      *
      * @param [strict=false] - in `strict` mode, only `'1'` and `'true'` return `true`.
      */
    inline def toBoolean(input: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("toBoolean")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def toBoolean(input: String, strict: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("toBoolean")(input.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Convert the input string to a `Date`, or `null` if the input is not a date.
      */
    inline def toDate(input: String): js.Date | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("toDate")(input.asInstanceOf[js.Any]).asInstanceOf[js.Date | Null]
    
    /**
      * Convert the input string to a float, or `NaN` if the input is not a float.
      */
    inline def toFloat(input: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toFloat")(input.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Convert the input string to an integer, or `NaN` if the input is not an integer.
      *
      * @param [radix=10] - radix or base (defaults to 10)
      */
    inline def toInt(input: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toInt")(input.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def toInt(input: String, radix: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("toInt")(input.asInstanceOf[js.Any], radix.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Converts to string.
      */
    inline def toString_(input: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(input.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Trim characters from both sides of the input.
      *
      * @param [chars] - characters (defaults to whitespace)
      */
    inline def trim(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("trim")(input.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def trim(input: String, chars: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("trim")(input.asInstanceOf[js.Any], chars.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * Replaces HTML encoded entities with `<`, `>`, `&`, `'`, `"` and `/`.
      */
    inline def unescape(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unescape")(input.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSGlobal("validator.version")
    @js.native
    val version: String = js.native
    
    /**
      * Remove characters that do not appear in the whitelist.
      *
      * @param chars - The characters are used in a `RegExp` and so you will need to escape some chars, e.g. `whitelist(input, '\\[\\]')`.
      */
    inline def whitelist(input: String, chars: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("whitelist")(input.asInstanceOf[js.Any], chars.asInstanceOf[js.Any])).asInstanceOf[String]
  }
}
