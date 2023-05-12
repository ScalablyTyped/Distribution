package typings.vueRuntimeCore.anon

import typings.std.Record
import typings.vueRuntimeCore.mod.ComponentObjectPropsOptions
import typings.vueRuntimeCore.mod.EmitsOptions
import typings.vueRuntimeCore.mod.SlotsType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmitsPropsSlots[Props /* <: Record[String, Any] */, E /* <: EmitsOptions */, EE /* <: String */, S /* <: SlotsType[Record[String, Any]] */] extends StObject {
  
  var emits: js.UndefOr[E | js.Array[EE]] = js.undefined
  
  var props: js.UndefOr[ComponentObjectPropsOptions[Props]] = js.undefined
  
  var slots: js.UndefOr[S] = js.undefined
}
object EmitsPropsSlots {
  
  inline def apply[Props /* <: Record[String, Any] */, E /* <: EmitsOptions */, EE /* <: String */, S /* <: SlotsType[Record[String, Any]] */](): EmitsPropsSlots[Props, E, EE, S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmitsPropsSlots[Props, E, EE, S]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EmitsPropsSlots[?, ?, ?, ?], Props /* <: Record[String, Any] */, E /* <: EmitsOptions */, EE /* <: String */, S /* <: SlotsType[Record[String, Any]] */] (val x: Self & (EmitsPropsSlots[Props, E, EE, S])) extends AnyVal {
    
    inline def setEmits(value: E | js.Array[EE]): Self = StObject.set(x, "emits", value.asInstanceOf[js.Any])
    
    inline def setEmitsUndefined: Self = StObject.set(x, "emits", js.undefined)
    
    inline def setEmitsVarargs(value: EE*): Self = StObject.set(x, "emits", js.Array(value*))
    
    inline def setProps(value: ComponentObjectPropsOptions[Props]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
    
    inline def setSlots(value: S): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
    
    inline def setSlotsUndefined: Self = StObject.set(x, "slots", js.undefined)
  }
}
