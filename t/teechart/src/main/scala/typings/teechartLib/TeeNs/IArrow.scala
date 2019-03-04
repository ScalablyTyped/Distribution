package typings
package teechartLib.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IArrow extends IFormat {
  var length: scala.Double
  var underline: scala.Boolean
}

object IArrow {
  @scala.inline
  def apply(
    drawText: js.Function2[IRectangle, java.lang.String, js.Any],
    ellipse: js.Function4[scala.Double, scala.Double, scala.Double, scala.Double, js.Any],
    fill: java.lang.String,
    font: IFont,
    gradient: IGradient,
    image: IImage,
    length: scala.Double,
    poligon: js.Function1[js.Array[IPoint], js.Any],
    rectangle: js.Function4[scala.Double, scala.Double, scala.Double, scala.Double, js.Any],
    round: IPoint,
    shadow: IShadow,
    stroke: IStroke,
    textHeight: js.Function1[java.lang.String, scala.Double],
    textWidth: js.Function1[java.lang.String, scala.Double],
    transparency: scala.Double,
    underline: scala.Boolean
  ): IArrow = {
    val __obj = js.Dynamic.literal(drawText = drawText, ellipse = ellipse, fill = fill, font = font, gradient = gradient, image = image, length = length, poligon = poligon, rectangle = rectangle, round = round, shadow = shadow, stroke = stroke, textHeight = textHeight, textWidth = textWidth, transparency = transparency, underline = underline)
  
    __obj.asInstanceOf[IArrow]
  }
}

