package typings.vis.mod

import typings.vis.anon.Align
import typings.vis.anon.ForceDirection
import typings.vis.anon.From
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EdgeOptions extends js.Object {
  var arrowStrikethrough: js.UndefOr[Boolean] = js.native
  var arrows: js.UndefOr[String | From] = js.native
  var color: js.UndefOr[String | typings.vis.anon.Color] = js.native
  var dashes: js.UndefOr[Boolean | js.Array[Double]] = js.native
  var font: js.UndefOr[String | Align] = js.native
  var hidden: js.UndefOr[Boolean] = js.native
  var hoverWidth: js.UndefOr[Double] = js.native
   // please note, hoverWidth could be also a function. This case is not represented here
  var label: js.UndefOr[String] = js.native
  var labelHighlightBold: js.UndefOr[Boolean] = js.native
  var length: js.UndefOr[Double] = js.native
  var physics: js.UndefOr[Boolean] = js.native
  var scaling: js.UndefOr[OptionsScaling] = js.native
  var selectionWidth: js.UndefOr[Double] = js.native
   // please note, selectionWidth could be also a function. This case is not represented here
  var selfReferenceSize: js.UndefOr[Double] = js.native
  var shadow: js.UndefOr[Boolean | OptionsShadow] = js.native
  var smooth: js.UndefOr[Boolean | ForceDirection] = js.native
  var title: js.UndefOr[String] = js.native
  var value: js.UndefOr[Double] = js.native
  var width: js.UndefOr[Double] = js.native
}

object EdgeOptions {
  @scala.inline
  def apply(): EdgeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EdgeOptions]
  }
  @scala.inline
  implicit class EdgeOptionsOps[Self <: EdgeOptions] (val x: Self) extends AnyVal {
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
    def setArrowStrikethrough(value: Boolean): Self = this.set("arrowStrikethrough", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrowStrikethrough: Self = this.set("arrowStrikethrough", js.undefined)
    @scala.inline
    def setArrows(value: String | From): Self = this.set("arrows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrows: Self = this.set("arrows", js.undefined)
    @scala.inline
    def setColor(value: String | typings.vis.anon.Color): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setDashesVarargs(value: Double*): Self = this.set("dashes", js.Array(value :_*))
    @scala.inline
    def setDashes(value: Boolean | js.Array[Double]): Self = this.set("dashes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDashes: Self = this.set("dashes", js.undefined)
    @scala.inline
    def setFont(value: String | Align): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    @scala.inline
    def setHoverWidth(value: Double): Self = this.set("hoverWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverWidth: Self = this.set("hoverWidth", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLabelHighlightBold(value: Boolean): Self = this.set("labelHighlightBold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelHighlightBold: Self = this.set("labelHighlightBold", js.undefined)
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    @scala.inline
    def setPhysics(value: Boolean): Self = this.set("physics", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhysics: Self = this.set("physics", js.undefined)
    @scala.inline
    def setScaling(value: OptionsScaling): Self = this.set("scaling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaling: Self = this.set("scaling", js.undefined)
    @scala.inline
    def setSelectionWidth(value: Double): Self = this.set("selectionWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionWidth: Self = this.set("selectionWidth", js.undefined)
    @scala.inline
    def setSelfReferenceSize(value: Double): Self = this.set("selfReferenceSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfReferenceSize: Self = this.set("selfReferenceSize", js.undefined)
    @scala.inline
    def setShadow(value: Boolean | OptionsShadow): Self = this.set("shadow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadow: Self = this.set("shadow", js.undefined)
    @scala.inline
    def setSmooth(value: Boolean | ForceDirection): Self = this.set("smooth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmooth: Self = this.set("smooth", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

