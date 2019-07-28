package typings.teechart.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFormat extends js.Object {
  var fill: String
  var font: IFont
  var gradient: IGradient
  var image: IImage
  var round: IPoint
  var shadow: IShadow
  var stroke: IStroke
  var transparency: Double
  def drawText(bounds: IRectangle, text: String): js.Any
  def ellipse(x: Double, y: Double, width: Double, height: Double): js.Any
  def poligon(points: js.Array[IPoint]): js.Any
  def rectangle(x: Double, y: Double, width: Double, height: Double): js.Any
  def textHeight(text: String): Double
  def textWidth(text: String): Double
}

object IFormat {
  @scala.inline
  def apply(
    drawText: (IRectangle, String) => js.Any,
    ellipse: (Double, Double, Double, Double) => js.Any,
    fill: String,
    font: IFont,
    gradient: IGradient,
    image: IImage,
    poligon: js.Array[IPoint] => js.Any,
    rectangle: (Double, Double, Double, Double) => js.Any,
    round: IPoint,
    shadow: IShadow,
    stroke: IStroke,
    textHeight: String => Double,
    textWidth: String => Double,
    transparency: Double
  ): IFormat = {
    val __obj = js.Dynamic.literal(drawText = js.Any.fromFunction2(drawText), ellipse = js.Any.fromFunction4(ellipse), fill = fill, font = font, gradient = gradient, image = image, poligon = js.Any.fromFunction1(poligon), rectangle = js.Any.fromFunction4(rectangle), round = round, shadow = shadow, stroke = stroke, textHeight = js.Any.fromFunction1(textHeight), textWidth = js.Any.fromFunction1(textWidth), transparency = transparency)
  
    __obj.asInstanceOf[IFormat]
  }
}

