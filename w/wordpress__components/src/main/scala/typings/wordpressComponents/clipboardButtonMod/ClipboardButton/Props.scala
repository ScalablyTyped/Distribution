package typings.wordpressComponents.clipboardButtonMod.ClipboardButton

import typings.wordpressComponents.buttonMod.Button.ButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends ButtonProps {
  /**
    * Function to be called when copy starts.
    */
  @JSName("onCopy")
  var onCopy_Props: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Function to be called when copy finishes.
    */
  var onFinishCopy: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Text to be copied to the clipboard on click.
    */
  var text: String
}

object Props {
  @scala.inline
  def apply(
    text: String,
    ButtonProps: ButtonProps = null,
    onCopy: () => Unit = null,
    onFinishCopy: () => Unit = null
  ): Props = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (ButtonProps != null) js.Dynamic.global.Object.assign(__obj, ButtonProps)
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction0(onCopy))
    if (onFinishCopy != null) __obj.updateDynamic("onFinishCopy")(js.Any.fromFunction0(onFinishCopy))
    __obj.asInstanceOf[Props]
  }
}

