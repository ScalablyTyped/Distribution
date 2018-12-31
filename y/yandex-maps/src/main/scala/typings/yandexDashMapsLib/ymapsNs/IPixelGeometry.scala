package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPixelGeometry extends IBaseGeometry {
  def equals(geometry: IPixelGeometry): scala.Boolean
  def getMetaData(): js.Object
  def scale(factor: scala.Double): IPixelGeometry
  def shift(offset: js.Array[scala.Double]): IPixelGeometry
}

