package typings.victory.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  style :{  max :react.react.CSSProperties | undefined,   maxLabels :react.react.CSSProperties | undefined,   median :react.react.CSSProperties | undefined,   medianLabels :react.react.CSSProperties | undefined,   min :react.react.CSSProperties | undefined,   minLabels :react.react.CSSProperties | undefined,   q1 :react.react.CSSProperties | undefined,   q1Labels :react.react.CSSProperties | undefined,   q3 :react.react.CSSProperties | undefined,   q3Labels :react.react.CSSProperties | undefined} | undefined,   boxWidth :number | undefined} & victory.victory.ThemeBaseProps */
@js.native
trait stylemaxCSSPropertiesunde extends js.Object {
  var boxWidth: js.UndefOr[Double] = js.native
  var colorScale: js.Array[String] = js.native
  var height: Double = js.native
  var padding: js.UndefOr[Double] = js.native
  var style: js.UndefOr[Max] = js.native
  var width: Double = js.native
}

object stylemaxCSSPropertiesunde {
  @scala.inline
  def apply(colorScale: js.Array[String], height: Double, width: Double): stylemaxCSSPropertiesunde = {
    val __obj = js.Dynamic.literal(colorScale = colorScale.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[stylemaxCSSPropertiesunde]
  }
  @scala.inline
  implicit class stylemaxCSSPropertiesundeOps[Self <: stylemaxCSSPropertiesunde] (val x: Self) extends AnyVal {
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
    def setBoxWidth(value: Double): Self = this.set("boxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoxWidth: Self = this.set("boxWidth", js.undefined)
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setStyle(value: Max): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

