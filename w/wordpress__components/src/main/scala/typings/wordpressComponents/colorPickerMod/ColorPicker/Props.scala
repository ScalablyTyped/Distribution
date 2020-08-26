package typings.wordpressComponents.colorPickerMod.ColorPicker

import typings.wordpressComponents.anon.Hex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  /**
    * Machine-readable color value.
    */
  var color: String = js.native
  /**
    * Should alpha be disabled?
    */
  var disableAlpha: js.UndefOr[Boolean] = js.native
  /**
    * Function to be called when color value changes.
    */
  def onChangeComplete(value: Hex): Unit = js.native
}

object Props {
  @scala.inline
  def apply(color: String, onChangeComplete: Hex => Unit): Props = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], onChangeComplete = js.Any.fromFunction1(onChangeComplete))
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnChangeComplete(value: Hex => Unit): Self = this.set("onChangeComplete", js.Any.fromFunction1(value))
    @scala.inline
    def setDisableAlpha(value: Boolean): Self = this.set("disableAlpha", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableAlpha: Self = this.set("disableAlpha", js.undefined)
  }
  
}

