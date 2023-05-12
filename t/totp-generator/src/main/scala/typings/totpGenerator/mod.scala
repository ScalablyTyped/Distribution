package typings.totpGenerator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Generates a `TOTP token` from a TOTP key
    *
    * Keys provided must be **base32 strings**, ie. only containing characters matching `(A-Z, 2-7, =)`.
    *
    * The **default** settings are:
    * - SHA-1
    * - 30 second period
    * - 6 digits
    * - Current time
    *
    * Settings can be provided as an optional second parameter inside an object.
    * ```ts
    * import totp = require("totp-generator");
    *
    * const token = totp("JBSWY3DPEHPK3PXP", {
    *  digits: 8,
    *  algorithm: "SHA-512",
    *  period: 60,
    *  timestamp: 1465324707000,
    * });
    * ```
    */
  inline def apply(key: String): String = ^.asInstanceOf[js.Dynamic].apply(key.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(key: String, options: TotpOptions): String = (^.asInstanceOf[js.Dynamic].apply(key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("totp-generator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.totpGenerator.totpGeneratorStrings.`SHA-1`
    - typings.totpGenerator.totpGeneratorStrings.`SHA-224`
    - typings.totpGenerator.totpGeneratorStrings.`SHA-256`
    - typings.totpGenerator.totpGeneratorStrings.`SHA-384`
    - typings.totpGenerator.totpGeneratorStrings.`SHA-512`
    - typings.totpGenerator.totpGeneratorStrings.`SHA3-224`
    - typings.totpGenerator.totpGeneratorStrings.`SHA3-256`
    - typings.totpGenerator.totpGeneratorStrings.`SHA3-384`
    - typings.totpGenerator.totpGeneratorStrings.`SHA3-512`
  */
  trait TotpAlgorithm extends StObject
  object TotpAlgorithm {
    
    inline def `SHA-1`: typings.totpGenerator.totpGeneratorStrings.`SHA-1` = "SHA-1".asInstanceOf[typings.totpGenerator.totpGeneratorStrings.`SHA-1`]
    
    inline def `SHA-224`: typings.totpGenerator.totpGeneratorStrings.`SHA-224` = "SHA-224".asInstanceOf[typings.totpGenerator.totpGeneratorStrings.`SHA-224`]
    
    inline def `SHA-256`: typings.totpGenerator.totpGeneratorStrings.`SHA-256` = "SHA-256".asInstanceOf[typings.totpGenerator.totpGeneratorStrings.`SHA-256`]
    
    inline def `SHA-384`: typings.totpGenerator.totpGeneratorStrings.`SHA-384` = "SHA-384".asInstanceOf[typings.totpGenerator.totpGeneratorStrings.`SHA-384`]
    
    inline def `SHA-512`: typings.totpGenerator.totpGeneratorStrings.`SHA-512` = "SHA-512".asInstanceOf[typings.totpGenerator.totpGeneratorStrings.`SHA-512`]
    
    inline def `SHA3-224`: typings.totpGenerator.totpGeneratorStrings.`SHA3-224` = "SHA3-224".asInstanceOf[typings.totpGenerator.totpGeneratorStrings.`SHA3-224`]
    
    inline def `SHA3-256`: typings.totpGenerator.totpGeneratorStrings.`SHA3-256` = "SHA3-256".asInstanceOf[typings.totpGenerator.totpGeneratorStrings.`SHA3-256`]
    
    inline def `SHA3-384`: typings.totpGenerator.totpGeneratorStrings.`SHA3-384` = "SHA3-384".asInstanceOf[typings.totpGenerator.totpGeneratorStrings.`SHA3-384`]
    
    inline def `SHA3-512`: typings.totpGenerator.totpGeneratorStrings.`SHA3-512` = "SHA3-512".asInstanceOf[typings.totpGenerator.totpGeneratorStrings.`SHA3-512`]
  }
  
  trait TotpOptions extends StObject {
    
    /**
      * The desired SHA variant (SHA-1, SHA-224, SHA-256, SHA-384, SHA-512,
      * SHA3-224, SHA3-256, SHA3-384, SHA3-512).
      */
    var algorithm: js.UndefOr[TotpAlgorithm] = js.undefined
    
    var digits: js.UndefOr[Double] = js.undefined
    
    var period: js.UndefOr[Double] = js.undefined
    
    var timestamp: js.UndefOr[Double] = js.undefined
  }
  object TotpOptions {
    
    inline def apply(): TotpOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TotpOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TotpOptions] (val x: Self) extends AnyVal {
      
      inline def setAlgorithm(value: TotpAlgorithm): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
      
      inline def setDigits(value: Double): Self = StObject.set(x, "digits", value.asInstanceOf[js.Any])
      
      inline def setDigitsUndefined: Self = StObject.set(x, "digits", js.undefined)
      
      inline def setPeriod(value: Double): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
      
      inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    }
  }
}
