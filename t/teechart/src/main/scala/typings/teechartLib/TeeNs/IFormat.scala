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

