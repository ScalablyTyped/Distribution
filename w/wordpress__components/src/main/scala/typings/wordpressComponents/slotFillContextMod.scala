package typings.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.wordpressComponents.anon.Componentanyoccurrencenum
import typings.wordpressComponents.anon.`1`
import typings.wordpressElement.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object slotFillContextMod extends Shortcut {
  
  @JSImport("@wordpress/components/slot-fill/context", JSImport.Default)
  @js.native
  val default: ComponentType[`1`] = js.native
  
  @JSImport("@wordpress/components/slot-fill/context", "Consumer")
  @js.native
  val Consumer: typings.react.mod.Consumer[SlotFillContext] = js.native
  
  trait SlotFillContext extends StObject {
    
    def getFills(name: String, instance: Component[js.Object, js.Object, Any]): js.Array[Componentanyoccurrencenum]
    
    def getSlot(name: String): Component[js.Object, js.Object, Any]
    
    // FIXME: instance is not correctly typed. but there's a bug in the code that assumes this type.
    def registerFill(name: String, instance: Component[js.Object, js.Object, Any]): Unit
    
    def registerSlot(name: String, instance: Component[js.Object, js.Object, Any]): Unit
    
    // FIXME: instance is not correctly typed. but there's a bug in the code that assumes this type.
    def unregisterFill(name: String, instance: Component[js.Object, js.Object, Any]): Unit
    
    def unregisterSlot(name: String, instance: Component[js.Object, js.Object, Any]): Unit
  }
  object SlotFillContext {
    
    inline def apply(
      getFills: (String, Component[js.Object, js.Object, Any]) => js.Array[Componentanyoccurrencenum],
      getSlot: String => Component[js.Object, js.Object, Any],
      registerFill: (String, Component[js.Object, js.Object, Any]) => Unit,
      registerSlot: (String, Component[js.Object, js.Object, Any]) => Unit,
      unregisterFill: (String, Component[js.Object, js.Object, Any]) => Unit,
      unregisterSlot: (String, Component[js.Object, js.Object, Any]) => Unit
    ): SlotFillContext = {
      val __obj = js.Dynamic.literal(getFills = js.Any.fromFunction2(getFills), getSlot = js.Any.fromFunction1(getSlot), registerFill = js.Any.fromFunction2(registerFill), registerSlot = js.Any.fromFunction2(registerSlot), unregisterFill = js.Any.fromFunction2(unregisterFill), unregisterSlot = js.Any.fromFunction2(unregisterSlot))
      __obj.asInstanceOf[SlotFillContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SlotFillContext] (val x: Self) extends AnyVal {
      
      inline def setGetFills(value: (String, Component[js.Object, js.Object, Any]) => js.Array[Componentanyoccurrencenum]): Self = StObject.set(x, "getFills", js.Any.fromFunction2(value))
      
      inline def setGetSlot(value: String => Component[js.Object, js.Object, Any]): Self = StObject.set(x, "getSlot", js.Any.fromFunction1(value))
      
      inline def setRegisterFill(value: (String, Component[js.Object, js.Object, Any]) => Unit): Self = StObject.set(x, "registerFill", js.Any.fromFunction2(value))
      
      inline def setRegisterSlot(value: (String, Component[js.Object, js.Object, Any]) => Unit): Self = StObject.set(x, "registerSlot", js.Any.fromFunction2(value))
      
      inline def setUnregisterFill(value: (String, Component[js.Object, js.Object, Any]) => Unit): Self = StObject.set(x, "unregisterFill", js.Any.fromFunction2(value))
      
      inline def setUnregisterSlot(value: (String, Component[js.Object, js.Object, Any]) => Unit): Self = StObject.set(x, "unregisterSlot", js.Any.fromFunction2(value))
    }
  }
  
  type _To = ComponentType[`1`]
  
  /* This means you don't have to write `default`, but can instead just say `slotFillContextMod.foo` */
  override def _to: ComponentType[`1`] = default
}
