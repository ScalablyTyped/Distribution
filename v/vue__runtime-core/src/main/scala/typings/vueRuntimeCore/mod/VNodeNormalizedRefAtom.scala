package typings.vueRuntimeCore.mod

import typings.std.Element
import typings.std.Record
import typings.vueRuntimeCore.vueRuntimeCoreBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VNodeNormalizedRefAtom extends StObject {
  
  var f: js.UndefOr[Boolean] = js.undefined
  
  var i: ComponentInternalInstance
  
  var k: js.UndefOr[String] = js.undefined
  
  var r: VNodeRef
}
object VNodeNormalizedRefAtom {
  
  inline def apply(i: ComponentInternalInstance, r: VNodeRef): VNodeNormalizedRefAtom = {
    val __obj = js.Dynamic.literal(i = i.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[VNodeNormalizedRefAtom]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VNodeNormalizedRefAtom] (val x: Self) extends AnyVal {
    
    inline def setF(value: Boolean): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
    
    inline def setFUndefined: Self = StObject.set(x, "f", js.undefined)
    
    inline def setI(value: ComponentInternalInstance): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
    
    inline def setK(value: String): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
    
    inline def setKUndefined: Self = StObject.set(x, "k", js.undefined)
    
    inline def setR(value: VNodeRef): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    inline def setRFunction2(
      value: (/* ref */ Element | (ComponentPublicInstance[
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          `false`, 
          ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
          js.Object, 
          js.Object
        ]) | Null, /* refs */ Record[String, Any]) => Unit
    ): Self = StObject.set(x, "r", js.Any.fromFunction2(value))
  }
}
