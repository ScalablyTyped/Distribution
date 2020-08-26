package typings.wordpressBlockEditor.fontSizesMod.FontSizePicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Omit<@wordpress/components.@wordpress/components.FontSizePicker.Props, 'disableCustomFontSizes' | 'fontSizes'> */
@js.native
trait Props extends js.Object {
  var fallbackFontSize: js.UndefOr[Double] = js.native
  var onChange: js.Function0[Unit] = js.native
  var value: js.UndefOr[Double] = js.native
  var withSlider: js.UndefOr[Boolean] = js.native
}

object Props {
  @scala.inline
  def apply(onChange: () => Unit): Props = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction0(onChange))
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
    def setOnChange(value: () => Unit): Self = this.set("onChange", js.Any.fromFunction0(value))
    @scala.inline
    def setFallbackFontSize(value: Double): Self = this.set("fallbackFontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFallbackFontSize: Self = this.set("fallbackFontSize", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setWithSlider(value: Boolean): Self = this.set("withSlider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWithSlider: Self = this.set("withSlider", js.undefined)
  }
  
}

