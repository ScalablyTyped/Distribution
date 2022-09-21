package typings.vueInbrowserCompilerIndependentUtils.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamType extends StObject {
  
  var elements: js.UndefOr[js.Array[ParamType]] = js.undefined
  
  var name: String
}
object ParamType {
  
  inline def apply(name: String): ParamType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamType]
  }
  
  extension [Self <: ParamType](x: Self) {
    
    inline def setElements(value: js.Array[ParamType]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    inline def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
    
    inline def setElementsVarargs(value: ParamType*): Self = StObject.set(x, "elements", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
