package typings.wordpressComponents.clipboardButtonMod.ClipboardButton

import typings.wordpressComponents.buttonMod.Button.ButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends ButtonProps {
  /**
    * Function to be called when copy starts.
    */
  @JSName("onCopy")
  var onCopy_Props: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Function to be called when copy finishes.
    */
  var onFinishCopy: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Text to be copied to the clipboard on click.
    */
  var text: String = js.native
}

object Props {
  @scala.inline
  def apply(text: String): Props = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnCopy(value: () => Unit): Self = this.set("onCopy", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnCopy: Self = this.set("onCopy", js.undefined)
    @scala.inline
    def setOnFinishCopy(value: () => Unit): Self = this.set("onFinishCopy", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnFinishCopy: Self = this.set("onFinishCopy", js.undefined)
  }
  
}

