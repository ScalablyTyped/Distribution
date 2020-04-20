package typings.teechart.Tee

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IArrow extends IFormat {
  var length: Double
  var underline: Boolean
}

object IArrow {
  @scala.inline
  def apply(
    drawText: (IRectangle, String) => js.Any,
    ellipse: (Double, Double, Double, Double) => js.Any,
    fill: String,
    font: IFont,
    gradient: IGradient,
    image: IImage,
    length: Double,
    poligon: js.Array[IPoint] => js.Any,
    rectangle: (Double, Double, Double, Double) => js.Any,
    round: IPoint,
    shadow: IShadow,
    stroke: IStroke,
    textHeight: String => Double,
    textWidth: String => Double,
    transparency: Double,
    underline: Boolean
  ): IArrow = {
    val __obj = js.Dynamic.literal(drawText = js.Any.fromFunction2(drawText), ellipse = js.Any.fromFunction4(ellipse), fill = fill.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], gradient = gradient.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], poligon = js.Any.fromFunction1(poligon), rectangle = js.Any.fromFunction4(rectangle), round = round.asInstanceOf[js.Any], shadow = shadow.asInstanceOf[js.Any], stroke = stroke.asInstanceOf[js.Any], textHeight = js.Any.fromFunction1(textHeight), textWidth = js.Any.fromFunction1(textWidth), transparency = transparency.asInstanceOf[js.Any], underline = underline.asInstanceOf[js.Any])
    __obj.asInstanceOf[IArrow]
  }
}

