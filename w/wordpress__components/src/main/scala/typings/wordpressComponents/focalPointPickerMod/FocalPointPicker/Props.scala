package typings.wordpressComponents.focalPointPickerMod.FocalPointPicker

import typings.wordpressComponents.baseControlMod.BaseControl.ControlProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends ControlProps {
  /**
    * URL of the image to be displayed.
    */
  var url: String = js.native
  /**
    * The focal point.
    */
  var value: FocalPoint = js.native
  /**
    * Callback which is called when the focal point changes.
    */
  def onChange(value: FocalPoint): Unit = js.native
}

object Props {
  @scala.inline
  def apply(onChange: FocalPoint => Unit, url: String, value: FocalPoint): Props = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange), url = url.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
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
    def setOnChange(value: FocalPoint => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: FocalPoint): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

