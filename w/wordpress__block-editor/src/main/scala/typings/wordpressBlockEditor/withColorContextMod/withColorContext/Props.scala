package typings.wordpressBlockEditor.withColorContextMod.withColorContext

import typings.wordpressBlockEditor.mod.EditorColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  var colors: js.Array[EditorColor] = js.native
  var disableCustomColors: Boolean = js.native
  var hasColorsToChoose: Boolean = js.native
}

object Props {
  @scala.inline
  def apply(colors: js.Array[EditorColor], disableCustomColors: Boolean, hasColorsToChoose: Boolean): Props = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], disableCustomColors = disableCustomColors.asInstanceOf[js.Any], hasColorsToChoose = hasColorsToChoose.asInstanceOf[js.Any])
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
    def setColorsVarargs(value: EditorColor*): Self = this.set("colors", js.Array(value :_*))
    @scala.inline
    def setColors(value: js.Array[EditorColor]): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisableCustomColors(value: Boolean): Self = this.set("disableCustomColors", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasColorsToChoose(value: Boolean): Self = this.set("hasColorsToChoose", value.asInstanceOf[js.Any])
  }
  
}

