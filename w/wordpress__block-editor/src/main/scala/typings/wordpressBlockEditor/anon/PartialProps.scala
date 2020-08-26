package typings.wordpressBlockEditor.anon

import typings.wordpressBlockEditor.mod.EditorColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@wordpress/block-editor.@wordpress/block-editor/components/color-palette/with-color-context.withColorContext.Props> */
@js.native
trait PartialProps extends js.Object {
  var colors: js.UndefOr[js.Array[EditorColor]] = js.native
  var disableCustomColors: js.UndefOr[Boolean] = js.native
  var hasColorsToChoose: js.UndefOr[Boolean] = js.native
}

object PartialProps {
  @scala.inline
  def apply(): PartialProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialProps]
  }
  @scala.inline
  implicit class PartialPropsOps[Self <: PartialProps] (val x: Self) extends AnyVal {
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
    def deleteColors: Self = this.set("colors", js.undefined)
    @scala.inline
    def setDisableCustomColors(value: Boolean): Self = this.set("disableCustomColors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableCustomColors: Self = this.set("disableCustomColors", js.undefined)
    @scala.inline
    def setHasColorsToChoose(value: Boolean): Self = this.set("hasColorsToChoose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasColorsToChoose: Self = this.set("hasColorsToChoose", js.undefined)
  }
  
}

