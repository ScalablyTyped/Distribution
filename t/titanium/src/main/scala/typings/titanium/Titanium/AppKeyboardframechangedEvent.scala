package typings.titanium.Titanium

import typings.titanium.Dimension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Fired when the soft keyboard is presented, on and off the screen.
	 */
trait AppKeyboardframechangedEvent extends AppBaseEvent {
  /**
  		 * The duration of the keyboard animation. This parameter is only available on Titanium SDK 4.0.0 and later.
  		 */
  var animationDuration: Double
  /**
  		 * A dictionary with keys x, y, width and height representing the frame of keyboard on screen.
  		 */
  var keyboardFrame: Dimension
}

object AppKeyboardframechangedEvent {
  @scala.inline
  def apply(animationDuration: Double, keyboardFrame: Dimension, source: App): AppKeyboardframechangedEvent = {
    val __obj = js.Dynamic.literal(animationDuration = animationDuration.asInstanceOf[js.Any], keyboardFrame = keyboardFrame.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppKeyboardframechangedEvent]
  }
}

