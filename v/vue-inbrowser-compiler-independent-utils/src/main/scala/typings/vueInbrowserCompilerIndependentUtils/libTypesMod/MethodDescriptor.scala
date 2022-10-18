package typings.vueInbrowserCompilerIndependentUtils.libTypesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MethodDescriptor
  extends StObject
     with Descriptor
     with /* key */ StringDictionary[Any] {
  
  var description: js.UndefOr[String] = js.undefined
  
  var modifiers: js.UndefOr[js.Array[String]] = js.undefined
  
  var name: String
  
  var params: js.UndefOr[js.Array[Param]] = js.undefined
  
  var returns: js.UndefOr[UnnamedParam] = js.undefined
  
  var tags: js.UndefOr[StringDictionary[js.Array[BlockTag]]] = js.undefined
  
  var throws: js.UndefOr[UnnamedParam] = js.undefined
}
object MethodDescriptor {
  
  inline def apply(name: String): MethodDescriptor = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodDescriptor]
  }
  
  extension [Self <: MethodDescriptor](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setModifiers(value: js.Array[String]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
    
    inline def setModifiersVarargs(value: String*): Self = StObject.set(x, "modifiers", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParams(value: js.Array[Param]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setParamsVarargs(value: Param*): Self = StObject.set(x, "params", js.Array(value*))
    
    inline def setReturns(value: UnnamedParam): Self = StObject.set(x, "returns", value.asInstanceOf[js.Any])
    
    inline def setReturnsUndefined: Self = StObject.set(x, "returns", js.undefined)
    
    inline def setTags(value: StringDictionary[js.Array[BlockTag]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setThrows(value: UnnamedParam): Self = StObject.set(x, "throws", value.asInstanceOf[js.Any])
    
    inline def setThrowsUndefined: Self = StObject.set(x, "throws", js.undefined)
  }
}
