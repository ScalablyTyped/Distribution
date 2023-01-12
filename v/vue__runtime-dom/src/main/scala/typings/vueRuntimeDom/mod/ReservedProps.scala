package typings.vueRuntimeDom.mod

import typings.std.Element
import typings.std.Record
import typings.vueRuntimeCore.mod.ComponentOptionsBase
import typings.vueRuntimeCore.mod.ComponentPublicInstance
import typings.vueRuntimeCore.mod.VNodeRef
import typings.vueRuntimeCore.vueRuntimeCoreBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReservedProps extends StObject {
  
  var key: js.UndefOr[String | Double | js.Symbol] = js.undefined
  
  var ref: js.UndefOr[VNodeRef] = js.undefined
  
  var ref_for: js.UndefOr[Boolean] = js.undefined
  
  var ref_key: js.UndefOr[String] = js.undefined
}
object ReservedProps {
  
  inline def apply(): ReservedProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservedProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReservedProps] (val x: Self) extends AnyVal {
    
    inline def setKey(value: String | Double | js.Symbol): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setRef(value: VNodeRef): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction2(
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
          ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String], 
          js.Object
        ]) | Null, /* refs */ Record[String, Any]) => Unit
    ): Self = StObject.set(x, "ref", js.Any.fromFunction2(value))
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setRef_for(value: Boolean): Self = StObject.set(x, "ref_for", value.asInstanceOf[js.Any])
    
    inline def setRef_forUndefined: Self = StObject.set(x, "ref_for", js.undefined)
    
    inline def setRef_key(value: String): Self = StObject.set(x, "ref_key", value.asInstanceOf[js.Any])
    
    inline def setRef_keyUndefined: Self = StObject.set(x, "ref_key", js.undefined)
  }
}
