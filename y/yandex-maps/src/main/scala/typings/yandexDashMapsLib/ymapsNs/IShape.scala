package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShape extends js.Object {
  def contains(position: js.Array[scala.Double]): scala.Boolean
  def equals(shape: IShape): scala.Boolean
  def getBounds(): js.Array[js.Array[scala.Double]] | scala.Null
  def getGeometry(): IPixelGeometry
  def getType(): java.lang.String
  def scale(factor: scala.Double): IShape
  def shift(offset: js.Array[scala.Double]): IShape
}

