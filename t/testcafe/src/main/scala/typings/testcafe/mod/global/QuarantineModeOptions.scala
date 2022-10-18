package typings.testcafe.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuarantineModeOptions extends StObject {
  
  var attemptLimit: js.UndefOr[Double] = js.undefined
  
  var successThreshold: js.UndefOr[Double] = js.undefined
}
object QuarantineModeOptions {
  
  inline def apply(): QuarantineModeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuarantineModeOptions]
  }
  
  extension [Self <: QuarantineModeOptions](x: Self) {
    
    inline def setAttemptLimit(value: Double): Self = StObject.set(x, "attemptLimit", value.asInstanceOf[js.Any])
    
    inline def setAttemptLimitUndefined: Self = StObject.set(x, "attemptLimit", js.undefined)
    
    inline def setSuccessThreshold(value: Double): Self = StObject.set(x, "successThreshold", value.asInstanceOf[js.Any])
    
    inline def setSuccessThresholdUndefined: Self = StObject.set(x, "successThreshold", js.undefined)
  }
}
