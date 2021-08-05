package typings.tuyaPanelKit.mod

import typings.react.mod.Component
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tuya-panel-kit", "Picker")
@js.native
class Picker protected ()
  extends Component[PickerViewProps, js.Object, js.Any] {
  def this(props: PickerViewProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: PickerViewProps, context: js.Any) = this()
}
/* static members */
object Picker {
  
  @JSImport("tuya-panel-kit", "Picker")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("tuya-panel-kit", "Picker.Item")
  @js.native
  def Item: ElementType[js.Any] = js.native
  inline def Item_=(x: ElementType[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
}
