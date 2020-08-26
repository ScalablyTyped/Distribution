package typings.vegaTypings.sceneMod

import typings.vegaTypings.anon.Role
import typings.vegaTypings.vegaTypingsStrings.ltr
import typings.vegaTypings.vegaTypingsStrings.rtl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined vega-typings.vega-typings/types/runtime/scene.SceneItem & {  align :vega-typings.vega-typings/types/runtime/scene.SceneTextAlign | undefined,   angle :number | undefined,   baseline :vega-typings.vega-typings/types/runtime/scene.SceneTextBaseline,   dir :'rtl' | 'ltr' | undefined,   dx :number | undefined,   dy :number,   ellipsis :string | undefined,   fill :string,   font :string,   fontSize :number,   fontStyle :string | undefined,   fontWeight :number | string | undefined,   limit :number | undefined,   lineBreak :string | undefined,   lineHeight :number | undefined,   radius :number | undefined,   text :string,   theta :number | undefined} */
@js.native
trait SceneText extends js.Object {
  var align: js.UndefOr[SceneTextAlign] = js.native
  var angle: js.UndefOr[Double] = js.native
  var baseline: SceneTextBaseline = js.native
  var bounds: Bounds = js.native
  var datum: js.UndefOr[js.Object] = js.native
  var dir: js.UndefOr[rtl | ltr] = js.native
  var dx: js.UndefOr[Double] = js.native
  var dy: Double = js.native
  var ellipsis: js.UndefOr[String] = js.native
  var fill: String = js.native
  var font: String = js.native
  var fontSize: Double = js.native
  var fontStyle: js.UndefOr[String] = js.native
  var fontWeight: js.UndefOr[Double | String] = js.native
  var limit: js.UndefOr[Double] = js.native
  var lineBreak: js.UndefOr[String] = js.native
  var lineHeight: js.UndefOr[Double] = js.native
  var mark: Role = js.native
  var radius: js.UndefOr[Double] = js.native
  var text: String = js.native
  var theta: js.UndefOr[Double] = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object SceneText {
  @scala.inline
  def apply(
    baseline: SceneTextBaseline,
    bounds: Bounds,
    dy: Double,
    fill: String,
    font: String,
    fontSize: Double,
    mark: Role,
    text: String,
    x: Double,
    y: Double
  ): SceneText = {
    val __obj = js.Dynamic.literal(baseline = baseline.asInstanceOf[js.Any], bounds = bounds.asInstanceOf[js.Any], dy = dy.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], mark = mark.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneText]
  }
  @scala.inline
  implicit class SceneTextOps[Self <: SceneText] (val x: Self) extends AnyVal {
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
    def setBaseline(value: SceneTextBaseline): Self = this.set("baseline", value.asInstanceOf[js.Any])
    @scala.inline
    def setBounds(value: Bounds): Self = this.set("bounds", value.asInstanceOf[js.Any])
    @scala.inline
    def setDy(value: Double): Self = this.set("dy", value.asInstanceOf[js.Any])
    @scala.inline
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def setFont(value: String): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setMark(value: Role): Self = this.set("mark", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlign(value: SceneTextAlign): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setAngle(value: Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAngle: Self = this.set("angle", js.undefined)
    @scala.inline
    def setDatum(value: js.Object): Self = this.set("datum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatum: Self = this.set("datum", js.undefined)
    @scala.inline
    def setDir(value: rtl | ltr): Self = this.set("dir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDir: Self = this.set("dir", js.undefined)
    @scala.inline
    def setDx(value: Double): Self = this.set("dx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDx: Self = this.set("dx", js.undefined)
    @scala.inline
    def setEllipsis(value: String): Self = this.set("ellipsis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEllipsis: Self = this.set("ellipsis", js.undefined)
    @scala.inline
    def setFontStyle(value: String): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontStyle: Self = this.set("fontStyle", js.undefined)
    @scala.inline
    def setFontWeight(value: Double | String): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setLineBreak(value: String): Self = this.set("lineBreak", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineBreak: Self = this.set("lineBreak", js.undefined)
    @scala.inline
    def setLineHeight(value: Double): Self = this.set("lineHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineHeight: Self = this.set("lineHeight", js.undefined)
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    @scala.inline
    def setTheta(value: Double): Self = this.set("theta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheta: Self = this.set("theta", js.undefined)
  }
  
}

