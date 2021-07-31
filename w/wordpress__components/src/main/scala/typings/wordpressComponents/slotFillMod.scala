package typings.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.react.mod.ReactPortal
import typings.wordpressComponents.anon.Fill
import typings.wordpressComponents.contextMod.SlotFillContext
import typings.wordpressComponents.fillMod.Fill.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object slotFillMod {
  
  @JSImport("@wordpress/components/slot-fill", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@wordpress/components/slot-fill", "Consumer")
  @js.native
  val Consumer: typings.react.mod.Consumer[SlotFillContext] = js.native
  
  object Fill {
    
    @scala.inline
    def apply(props: Props): ReactPortal = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactPortal]
    
    @JSImport("@wordpress/components/slot-fill", "Fill")
    @js.native
    val ^ : js.Any = js.native
  }
  
  @JSImport("@wordpress/components/slot-fill", "Provider")
  @js.native
  val Provider: ComponentType[js.Object] = js.native
  
  object Slot extends Shortcut {
    
    @JSImport("@wordpress/components/slot-fill", "Slot")
    @js.native
    val ^ : ComponentType[typings.wordpressComponents.slotMod.Slot.Props] = js.native
    
    type _To = ComponentType[typings.wordpressComponents.slotMod.Slot.Props]
    
    /* This means you don't have to write `^`, but can instead just say `Slot.foo` */
    override def _to: ComponentType[typings.wordpressComponents.slotMod.Slot.Props] = ^
  }
  
  @scala.inline
  def createSlotFill(name: String): Fill = ^.asInstanceOf[js.Dynamic].applyDynamic("createSlotFill")(name.asInstanceOf[js.Any]).asInstanceOf[Fill]
}
