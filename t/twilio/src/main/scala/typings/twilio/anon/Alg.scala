package typings.twilio.anon

import typings.twilio.factorMod.FactorTotpAlgorithms
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alg extends StObject {
  
  var alg: js.UndefOr[FactorTotpAlgorithms] = js.undefined
  
  var codeLength: js.UndefOr[Double] = js.undefined
  
  var notificationPlatform: js.UndefOr[String] = js.undefined
  
  var notificationToken: js.UndefOr[String] = js.undefined
  
  var sdkVersion: js.UndefOr[String] = js.undefined
  
  var skew: js.UndefOr[Double] = js.undefined
  
  var timeStep: js.UndefOr[Double] = js.undefined
}
object Alg {
  
  inline def apply(): Alg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alg]
  }
  
  extension [Self <: Alg](x: Self) {
    
    inline def setAlg(value: FactorTotpAlgorithms): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
    
    inline def setAlgUndefined: Self = StObject.set(x, "alg", js.undefined)
    
    inline def setCodeLength(value: Double): Self = StObject.set(x, "codeLength", value.asInstanceOf[js.Any])
    
    inline def setCodeLengthUndefined: Self = StObject.set(x, "codeLength", js.undefined)
    
    inline def setNotificationPlatform(value: String): Self = StObject.set(x, "notificationPlatform", value.asInstanceOf[js.Any])
    
    inline def setNotificationPlatformUndefined: Self = StObject.set(x, "notificationPlatform", js.undefined)
    
    inline def setNotificationToken(value: String): Self = StObject.set(x, "notificationToken", value.asInstanceOf[js.Any])
    
    inline def setNotificationTokenUndefined: Self = StObject.set(x, "notificationToken", js.undefined)
    
    inline def setSdkVersion(value: String): Self = StObject.set(x, "sdkVersion", value.asInstanceOf[js.Any])
    
    inline def setSdkVersionUndefined: Self = StObject.set(x, "sdkVersion", js.undefined)
    
    inline def setSkew(value: Double): Self = StObject.set(x, "skew", value.asInstanceOf[js.Any])
    
    inline def setSkewUndefined: Self = StObject.set(x, "skew", js.undefined)
    
    inline def setTimeStep(value: Double): Self = StObject.set(x, "timeStep", value.asInstanceOf[js.Any])
    
    inline def setTimeStepUndefined: Self = StObject.set(x, "timeStep", js.undefined)
  }
}
