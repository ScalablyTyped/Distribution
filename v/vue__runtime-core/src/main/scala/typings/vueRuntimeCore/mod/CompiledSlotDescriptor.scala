package typings.vueRuntimeCore.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompiledSlotDescriptor extends StObject {
  
  def fn(args: Any*): js.Array[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
  @JSName("fn")
  var fn_Original: Slot
  
  var key: js.UndefOr[String] = js.undefined
  
  var name: String
}
object CompiledSlotDescriptor {
  
  inline def apply(fn: Slot, name: String): CompiledSlotDescriptor = {
    val __obj = js.Dynamic.literal(fn = fn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompiledSlotDescriptor]
  }
  
  extension [Self <: CompiledSlotDescriptor](x: Self) {
    
    inline def setFn(value: Slot): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
