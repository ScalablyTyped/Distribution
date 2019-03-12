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
    drawText: (IRectangle, java.lang.String) => js.Any,
    ellipse: (scala.Double, scala.Double, scala.Double, scala.Double) => js.Any,
    fill: java.lang.String,
    font: IFont,
    gradient: IGradient,
    image: IImage,
    length: scala.Double,
    poligon: js.Array[IPoint] => js.Any,
    rectangle: (scala.Double, scala.Double, scala.Double, scala.Double) => js.Any,
    round: IPoint,
    shadow: IShadow,
    stroke: IStroke,
    textHeight: java.lang.String => scala.Double,
    textWidth: java.lang.String => scala.Double,
    transparency: scala.Double,
    underline: scala.Boolean
  ): IArrow = {
    val __obj = js.Dynamic.literal(drawText = js.Any.fromFunction2(drawText), ellipse = js.Any.fromFunction4(ellipse), fill = fill, font = font, gradient = gradient, image = image, length = length, poligon = js.Any.fromFunction1(poligon), rectangle = js.Any.fromFunction4(rectangle), round = round, shadow = shadow, stroke = stroke, textHeight = js.Any.fromFunction1(textHeight), textWidth = js.Any.fromFunction1(textWidth), transparency = transparency, underline = underline)
  
    __obj.asInstanceOf[IArrow]
  }
}

