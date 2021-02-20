package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Required extends StObject {
  
  var required: scala.Double = js.native
  
  var supported: scala.Double = js.native
  
  var unsupported: scala.Double = js.native
}
object Required {
  
  @scala.inline
  def apply(required: scala.Double, supported: scala.Double, unsupported: scala.Double): Required = {
    val __obj = js.Dynamic.literal(required = required.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any], unsupported = unsupported.asInstanceOf[js.Any])
    __obj.asInstanceOf[Required]
  }
  
  @scala.inline
  implicit class RequiredMutableBuilder[Self <: Required] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequired(value: scala.Double): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupported(value: scala.Double): Self = StObject.set(x, "supported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnsupported(value: scala.Double): Self = StObject.set(x, "unsupported", value.asInstanceOf[js.Any])
  }
}
