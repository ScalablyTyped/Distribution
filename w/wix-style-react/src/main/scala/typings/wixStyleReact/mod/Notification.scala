package typings.wixStyleReact.mod

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.FC
import typings.wixStyleReact.distTypesNotificationMod.ActionButtonProps
import typings.wixStyleReact.distTypesNotificationMod.TextLabelProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wix-style-react", "Notification")
@js.native
open class Notification ()
  extends typings.wixStyleReact.distTypesNotificationMod.default
/* static members */
object Notification {
  
  @JSImport("wix-style-react", "Notification")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-style-react", "Notification.ActionButton")
  @js.native
  def ActionButton: FC[ActionButtonProps] = js.native
  inline def ActionButton_=(x: FC[ActionButtonProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ActionButton")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "Notification.CloseButton")
  @js.native
  def CloseButton: Instantiable0[typings.wixStyleReact.distTypesCloseButtonMod.default] = js.native
  inline def CloseButton_=(x: Instantiable0[typings.wixStyleReact.distTypesCloseButtonMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CloseButton")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "Notification.TextLabel")
  @js.native
  def TextLabel: FC[TextLabelProps] = js.native
  inline def TextLabel_=(x: FC[TextLabelProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TextLabel")(x.asInstanceOf[js.Any])
}
