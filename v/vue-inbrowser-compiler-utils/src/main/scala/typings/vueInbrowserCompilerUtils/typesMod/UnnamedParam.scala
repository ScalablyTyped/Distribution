package typings.vueInbrowserCompilerUtils.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnnamedParam extends StObject {
  
  var description: js.UndefOr[String | Boolean] = js.native
  
  var `type`: js.UndefOr[ParamType] = js.native
}
object UnnamedParam {
  
  @scala.inline
  def apply(): UnnamedParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnnamedParam]
  }
  
  @scala.inline
  implicit class UnnamedParamMutableBuilder[Self <: UnnamedParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String | Boolean): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setType(value: ParamType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
