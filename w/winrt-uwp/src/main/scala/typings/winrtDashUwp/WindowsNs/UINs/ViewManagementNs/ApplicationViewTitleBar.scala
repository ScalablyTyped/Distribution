package typings.winrtDashUwp.WindowsNs.UINs.ViewManagementNs

import typings.winrtDashUwp.WindowsNs.UINs.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the title bar of an app. */
@JSGlobal("Windows.UI.ViewManagement.ApplicationViewTitleBar")
@js.native
abstract class ApplicationViewTitleBar () extends js.Object {
  /** Gets or sets the color of the title bar background. */
  var backgroundColor: Color = js.native
  /** Gets or sets the background color of the title bar buttons. */
  var buttonBackgroundColor: Color = js.native
  /** Gets or sets the foreground color of the title bar buttons. */
  var buttonForegroundColor: Color = js.native
  /** Gets or sets the background color of a title bar button when the pointer is over it. */
  var buttonHoverBackgroundColor: Color = js.native
  /** Gets or sets the foreground color of a title bar button when the pointer is over it. */
  var buttonHoverForegroundColor: Color = js.native
  /** Gets or sets the background color of a title bar button when it's inactive. */
  var buttonInactiveBackgroundColor: Color = js.native
  /** Gets or sets the foreground color of a title bar button when it's inactive. */
  var buttonInactiveForegroundColor: Color = js.native
  /** Gets or sets the background color of a title bar button when it's pressed. */
  var buttonPressedBackgroundColor: Color = js.native
  /** Gets or sets the foreground color of a title bar button when it's pressed. */
  var buttonPressedForegroundColor: Color = js.native
  /** Gets or sets the color of the title bar foreground. */
  var foregroundColor: Color = js.native
  /** Gets or sets the color of the title bar background when it's inactive. */
  var inactiveBackgroundColor: Color = js.native
  /** Gets or sets the color of the title bar foreground when it's inactive. */
  var inactiveForegroundColor: Color = js.native
}

