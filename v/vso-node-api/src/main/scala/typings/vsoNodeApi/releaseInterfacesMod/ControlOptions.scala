package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ControlOptions extends StObject {
  
  var alwaysRun: Boolean
  
  var continueOnError: Boolean
  
  var enabled: Boolean
}
object ControlOptions {
  
  inline def apply(alwaysRun: Boolean, continueOnError: Boolean, enabled: Boolean): ControlOptions = {
    val __obj = js.Dynamic.literal(alwaysRun = alwaysRun.asInstanceOf[js.Any], continueOnError = continueOnError.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlOptions]
  }
  
  extension [Self <: ControlOptions](x: Self) {
    
    inline def setAlwaysRun(value: Boolean): Self = StObject.set(x, "alwaysRun", value.asInstanceOf[js.Any])
    
    inline def setContinueOnError(value: Boolean): Self = StObject.set(x, "continueOnError", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
