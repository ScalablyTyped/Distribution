package typings.tuyaPanelKit.mod

import typings.react.mod.Component
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tuya-panel-kit", "ControllerBar")
@js.native
class ControllerBar protected ()
  extends Component[ControllerBarProps, js.Object, js.Any] {
  def this(props: ControllerBarProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: ControllerBarProps, context: js.Any) = this()
}
/* static members */
object ControllerBar {
  
  @JSImport("tuya-panel-kit", "ControllerBar")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("tuya-panel-kit", "ControllerBar.Group")
  @js.native
  def Group: ElementType[BarGroupProps] = js.native
  @scala.inline
  def Group_=(x: ElementType[BarGroupProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Group")(x.asInstanceOf[js.Any])
}
