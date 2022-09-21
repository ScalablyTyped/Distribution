package typings.totpGenerator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(key: String): String = ^.asInstanceOf[js.Dynamic].apply(key.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(key: String, options: TotpOptions): String = (^.asInstanceOf[js.Dynamic].apply(key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("totp-generator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait TotpOptions extends StObject {
    
    /**
      * The desired SHA variant (SHA-1, SHA-224, SHA-256, SHA-384, SHA-512,
      * SHA3-224, SHA3-256, SHA3-384, SHA3-512, SHAKE128, or SHAKE256).
      */
    var algorithm: js.UndefOr[String] = js.undefined
    
    var digits: js.UndefOr[Double] = js.undefined
    
    var period: js.UndefOr[Double] = js.undefined
    
    var timestamp: js.UndefOr[Double] = js.undefined
  }
  object TotpOptions {
    
    inline def apply(): TotpOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TotpOptions]
    }
    
    extension [Self <: TotpOptions](x: Self) {
      
      inline def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
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
