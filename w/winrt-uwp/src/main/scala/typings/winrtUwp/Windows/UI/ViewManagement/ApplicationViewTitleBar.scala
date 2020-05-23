package typings.winrtUwp.Windows.UI.ViewManagement

import typings.winrtUwp.Windows.UI.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the title bar of an app. */
trait ApplicationViewTitleBar extends js.Object {
  /** Gets or sets the color of the title bar background. */
  var backgroundColor: Color
  /** Gets or sets the background color of the title bar buttons. */
  var buttonBackgroundColor: Color
  /** Gets or sets the foreground color of the title bar buttons. */
  var buttonForegroundColor: Color
  /** Gets or sets the background color of a title bar button when the pointer is over it. */
  var buttonHoverBackgroundColor: Color
  /** Gets or sets the foreground color of a title bar button when the pointer is over it. */
  var buttonHoverForegroundColor: Color
  /** Gets or sets the background color of a title bar button when it's inactive. */
  var buttonInactiveBackgroundColor: Color
  /** Gets or sets the foreground color of a title bar button when it's inactive. */
  var buttonInactiveForegroundColor: Color
  /** Gets or sets the background color of a title bar button when it's pressed. */
  var buttonPressedBackgroundColor: Color
  /** Gets or sets the foreground color of a title bar button when it's pressed. */
  var buttonPressedForegroundColor: Color
  /** Gets or sets the color of the title bar foreground. */
  var foregroundColor: Color
  /** Gets or sets the color of the title bar background when it's inactive. */
  var inactiveBackgroundColor: Color
  /** Gets or sets the color of the title bar foreground when it's inactive. */
  var inactiveForegroundColor: Color
}

object ApplicationViewTitleBar {
  @scala.inline
  def apply(
    backgroundColor: Color,
    buttonBackgroundColor: Color,
    buttonForegroundColor: Color,
    buttonHoverBackgroundColor: Color,
    buttonHoverForegroundColor: Color,
    buttonInactiveBackgroundColor: Color,
    buttonInactiveForegroundColor: Color,
    buttonPressedBackgroundColor: Color,
    buttonPressedForegroundColor: Color,
    foregroundColor: Color,
    inactiveBackgroundColor: Color,
    inactiveForegroundColor: Color
  ): ApplicationViewTitleBar = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], buttonBackgroundColor = buttonBackgroundColor.asInstanceOf[js.Any], buttonForegroundColor = buttonForegroundColor.asInstanceOf[js.Any], buttonHoverBackgroundColor = buttonHoverBackgroundColor.asInstanceOf[js.Any], buttonHoverForegroundColor = buttonHoverForegroundColor.asInstanceOf[js.Any], buttonInactiveBackgroundColor = buttonInactiveBackgroundColor.asInstanceOf[js.Any], buttonInactiveForegroundColor = buttonInactiveForegroundColor.asInstanceOf[js.Any], buttonPressedBackgroundColor = buttonPressedBackgroundColor.asInstanceOf[js.Any], buttonPressedForegroundColor = buttonPressedForegroundColor.asInstanceOf[js.Any], foregroundColor = foregroundColor.asInstanceOf[js.Any], inactiveBackgroundColor = inactiveBackgroundColor.asInstanceOf[js.Any], inactiveForegroundColor = inactiveForegroundColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationViewTitleBar]
  }
}

