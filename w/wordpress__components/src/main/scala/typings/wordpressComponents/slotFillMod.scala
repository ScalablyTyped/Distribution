package typings.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.react.mod.ReactPortal
import typings.wordpressComponents.anon.Fill
import typings.wordpressComponents.contextMod.SlotFillContext
import typings.wordpressComponents.fillMod.Fill.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object slotFillMod {
  
  @JSImport("@wordpress/components/slot-fill", "Consumer")
  @js.native
  val Consumer: typings.react.mod.Consumer[SlotFillContext] = js.native
  
  object Fill {
    
    @JSImport("@wordpress/components/slot-fill", "Fill")
    @js.native
    def apply(props: Props): ReactPortal = js.native
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
  
  @JSImport("@wordpress/components/slot-fill", "createSlotFill")
  @js.native
  def createSlotFill(name: String): Fill = js.native
}
