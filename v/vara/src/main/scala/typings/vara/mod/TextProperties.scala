package typings.vara.mod

import typings.vara.varaStrings.center
import typings.vara.varaStrings.left
import typings.vara.varaStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextProperties extends js.Object {
  /**
    * Whether to animate the text automatically
    */
  var autoAnimation: js.UndefOr[Boolean] = js.native
  /**
    * Color of the text
    */
  var color: js.UndefOr[String] = js.native
  /**
    * Duration of the animation in milliseconds
    */
  var duration: js.UndefOr[Double] = js.native
  /**
    * Size of the text
    */
  var fontSize: js.UndefOr[Double] = js.native
  /**
    * Space between each character
    */
  var letterSpacing: js.UndefOr[Double] = js.native
  /**
    * Whether the animation should be in a queue
    */
  var queued: js.UndefOr[Boolean] = js.native
  /**
    * Width / Thickness of the stroke
    */
  var strokeWidth: js.UndefOr[Double] = js.native
  /**
    * Text align, accepted values are left,center,right
    */
  var textAlign: js.UndefOr[left | center | right] = js.native
}

object TextProperties {
  @scala.inline
  def apply(): TextProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextProperties]
  }
  @scala.inline
  implicit class TextPropertiesOps[Self <: TextProperties] (val x: Self) extends AnyVal {
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
    def setAutoAnimation(value: Boolean): Self = this.set("autoAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoAnimation: Self = this.set("autoAnimation", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    @scala.inline
    def setLetterSpacing(value: Double): Self = this.set("letterSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLetterSpacing: Self = this.set("letterSpacing", js.undefined)
    @scala.inline
    def setQueued(value: Boolean): Self = this.set("queued", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueued: Self = this.set("queued", js.undefined)
    @scala.inline
    def setStrokeWidth(value: Double): Self = this.set("strokeWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeWidth: Self = this.set("strokeWidth", js.undefined)
    @scala.inline
    def setTextAlign(value: left | center | right): Self = this.set("textAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextAlign: Self = this.set("textAlign", js.undefined)
  }
  
}

