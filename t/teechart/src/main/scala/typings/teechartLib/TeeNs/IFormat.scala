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
    drawText: (IRectangle, java.lang.String) => js.Any,
    ellipse: (scala.Double, scala.Double, scala.Double, scala.Double) => js.Any,
    fill: java.lang.String,
    font: IFont,
    gradient: IGradient,
    image: IImage,
    poligon: js.Array[IPoint] => js.Any,
    rectangle: (scala.Double, scala.Double, scala.Double, scala.Double) => js.Any,
    round: IPoint,
    shadow: IShadow,
    stroke: IStroke,
    textHeight: java.lang.String => scala.Double,
    textWidth: java.lang.String => scala.Double,
    transparency: scala.Double
  ): IFormat = {
    val __obj = js.Dynamic.literal(drawText = js.Any.fromFunction2(drawText), ellipse = js.Any.fromFunction4(ellipse), fill = fill, font = font, gradient = gradient, image = image, poligon = js.Any.fromFunction1(poligon), rectangle = js.Any.fromFunction4(rectangle), round = round, shadow = shadow, stroke = stroke, textHeight = js.Any.fromFunction1(textHeight), textWidth = js.Any.fromFunction1(textWidth), transparency = transparency)
  
    __obj.asInstanceOf[IFormat]
  }
}

