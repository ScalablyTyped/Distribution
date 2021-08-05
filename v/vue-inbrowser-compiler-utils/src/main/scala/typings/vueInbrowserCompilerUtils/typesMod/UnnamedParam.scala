package typings.vueInbrowserCompilerUtils.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnnamedParam extends StObject {
  
  var description: js.UndefOr[String | Boolean] = js.undefined
  
  var `type`: js.UndefOr[ParamType] = js.undefined
}
object UnnamedParam {
  
  inline def apply(): UnnamedParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnnamedParam]
  }
  
  extension [Self <: UnnamedParam](x: Self) {
    
    inline def setDescription(value: String | Boolean): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setType(value: ParamType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
