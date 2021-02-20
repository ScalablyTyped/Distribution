package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OK extends StObject {
  
  var error: scala.Double = js.native
  
  var oK: scala.Double = js.native
  
  var warning: scala.Double = js.native
}
object OK {
  
  @scala.inline
  def apply(error: scala.Double, oK: scala.Double, warning: scala.Double): OK = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], oK = oK.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[OK]
  }
  
  @scala.inline
  implicit class OKMutableBuilder[Self <: OK] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: scala.Double): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOK(value: scala.Double): Self = StObject.set(x, "oK", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarning(value: scala.Double): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
  }
}
