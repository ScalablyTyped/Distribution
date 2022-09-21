package typings.tuyaPanelKit.mod

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tuya-panel-kit", "Notification")
@js.native
open class Notification protected ()
  extends Component[NotificationProps, js.Object, Any] {
  def this(props: NotificationProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: NotificationProps, context: Any) = this()
}
/* static members */
object Notification {
  
  @JSImport("tuya-panel-kit", "Notification")
  @js.native
  val ^ : js.Any = js.native
  
  inline def hide(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hide")().asInstanceOf[Unit]
  
  inline def show(option: NotificationProps): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("show")(option.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
