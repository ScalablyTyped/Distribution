package typings.wixStyleReact.mod

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.SFC
import typings.wixStyleReact.notificationMod.ActionButtonProps
import typings.wixStyleReact.notificationMod.TextLabelProps
import typings.wixStyleReact.notificationMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wix-style-react", "Notification")
@js.native
class Notification () extends default
/* static members */
object Notification {
  
  @JSImport("wix-style-react", "Notification")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-style-react", "Notification.ActionButton")
  @js.native
  def ActionButton: SFC[ActionButtonProps] = js.native
  @scala.inline
  def ActionButton_=(x: SFC[ActionButtonProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ActionButton")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "Notification.CloseButton")
  @js.native
  def CloseButton: Instantiable0[typings.wixStyleReact.closeButtonMod.default] = js.native
  @scala.inline
  def CloseButton_=(x: Instantiable0[typings.wixStyleReact.closeButtonMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CloseButton")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "Notification.TextLabel")
  @js.native
  def TextLabel: SFC[TextLabelProps] = js.native
  @scala.inline
  def TextLabel_=(x: SFC[TextLabelProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TextLabel")(x.asInstanceOf[js.Any])
}
