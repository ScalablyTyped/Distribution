package typings.wordpressComponents

import typings.react.mod.ComponentType
import typings.react.mod.ReactPortal
import typings.wordpressComponents.anon.Fill
import typings.wordpressComponents.anon.`1`
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
  
  inline def Fill(props: Props): ReactPortal = ^.asInstanceOf[js.Dynamic].applyDynamic("Fill")(props.asInstanceOf[js.Any]).asInstanceOf[ReactPortal]
  
  @JSImport("@wordpress/components/slot-fill", "Provider")
  @js.native
  val Provider: ComponentType[`1`] = js.native
  
  @JSImport("@wordpress/components/slot-fill", "Slot")
  @js.native
  val Slot: ComponentType[typings.wordpressComponents.slotMod.Slot.Props] = js.native
  
  inline def createSlotFill(name: String): Fill = ^.asInstanceOf[js.Dynamic].applyDynamic("createSlotFill")(name.asInstanceOf[js.Any]).asInstanceOf[Fill]
}
