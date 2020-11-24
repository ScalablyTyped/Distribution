package typings.wordpressComponents

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ComponentType
import typings.react.mod.ReactPortal
import typings.wordpressComponents.anon.Fill
import typings.wordpressComponents.contextMod.SlotFillContext
import typings.wordpressComponents.fillMod.Fill.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/components/slot-fill", JSImport.Namespace)
@js.native
object slotFillMod extends js.Object {
  
  val Consumer: typings.react.mod.Consumer[SlotFillContext] = js.native
  
  val Provider: ComponentType[js.Object] = js.native
  
  def createSlotFill(name: String): Fill = js.native
  
  @js.native
  object Fill extends js.Object {
    
    def apply(props: Props): ReactPortal = js.native
  }
  
  @js.native
  object Slot
    extends TopLevel[ComponentType[typings.wordpressComponents.slotMod.Slot.Props]]
}
