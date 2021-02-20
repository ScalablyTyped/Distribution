package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Warning extends StObject {
  
  var error: scala.Double = js.native
  
  var warning: scala.Double = js.native
}
object Warning {
  
  @scala.inline
  def apply(error: scala.Double, warning: scala.Double): Warning = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Warning]
  }
  
  @scala.inline
  implicit class WarningMutableBuilder[Self <: Warning] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: scala.Double): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarning(value: scala.Double): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
  }
}
