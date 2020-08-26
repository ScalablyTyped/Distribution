package typings.victory.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  style :{  data :react.react.CSSProperties | undefined,   labels :react.react.CSSProperties | undefined,   flyout :react.react.CSSProperties | undefined} | undefined} & victory.victory.ThemeBaseProps */
@js.native
trait styledataCSSPropertiesundColorScale extends js.Object {
  var colorScale: js.Array[String] = js.native
  var height: Double = js.native
  var padding: js.UndefOr[Double] = js.native
  var style: js.UndefOr[Flyout] = js.native
  var width: Double = js.native
}

object styledataCSSPropertiesundColorScale {
  @scala.inline
  def apply(colorScale: js.Array[String], height: Double, width: Double): styledataCSSPropertiesundColorScale = {
    val __obj = js.Dynamic.literal(colorScale = colorScale.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[styledataCSSPropertiesundColorScale]
  }
  @scala.inline
  implicit class styledataCSSPropertiesundColorScaleOps[Self <: styledataCSSPropertiesundColorScale] (val x: Self) extends AnyVal {
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
    def setColorScaleVarargs(value: String*): Self = this.set("colorScale", js.Array(value :_*))
    @scala.inline
    def setColorScale(value: js.Array[String]): Self = this.set("colorScale", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setStyle(value: Flyout): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

