package typings
package teechartLib.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFormat extends js.Object {
  var fill: java.lang.String
  var font: IFont
  var gradient: IGradient
  var image: IImage
  var round: IPoint
  var shadow: IShadow
  var stroke: IStroke
  var transparency: scala.Double
  def drawText(bounds: IRectangle, text: java.lang.String): js.Any
  def ellipse(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): js.Any
  def poligon(points: js.Array[IPoint]): js.Any
  def rectangle(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): js.Any
  def textHeight(text: java.lang.String): scala.Double
  def textWidth(text: java.lang.String): scala.Double
}

object IFormat {
  @scala.inline
  def apply(
    drawText: js.Function2[IRectangle, java.lang.String, js.Any],
    ellipse: js.Function4[scala.Double, scala.Double, scala.Double, scala.Double, js.Any],
    fill: java.lang.String,
    font: IFont,
    gradient: IGradient,
    image: IImage,
    poligon: js.Function1[js.Array[IPoint], js.Any],
    rectangle: js.Function4[scala.Double, scala.Double, scala.Double, scala.Double, js.Any],
    round: IPoint,
    shadow: IShadow,
    stroke: IStroke,
    textHeight: js.Function1[java.lang.String, scala.Double],
    textWidth: js.Function1[java.lang.String, scala.Double],
    transparency: scala.Double
  ): IFormat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("drawText")(drawText)
    __obj.updateDynamic("ellipse")(ellipse)
    __obj.updateDynamic("fill")(fill)
    __obj.updateDynamic("font")(font)
    __obj.updateDynamic("gradient")(gradient)
    __obj.updateDynamic("image")(image)
    __obj.updateDynamic("poligon")(poligon)
    __obj.updateDynamic("rectangle")(rectangle)
    __obj.updateDynamic("round")(round)
    __obj.updateDynamic("shadow")(shadow)
    __obj.updateDynamic("stroke")(stroke)
    __obj.updateDynamic("textHeight")(textHeight)
    __obj.updateDynamic("textWidth")(textWidth)
    __obj.updateDynamic("transparency")(transparency)
    __obj.asInstanceOf[IFormat]
  }
}

