package typings.xstate.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvokeMeta extends StObject {
  
  var data: Any
  
  var meta: js.UndefOr[MetaObject] = js.undefined
  
  var src: InvokeSourceDefinition
}
object InvokeMeta {
  
  inline def apply(data: Any, src: InvokeSourceDefinition): InvokeMeta = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvokeMeta]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InvokeMeta] (val x: Self) extends AnyVal {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: MetaObject): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setSrc(value: InvokeSourceDefinition): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
  }
}
