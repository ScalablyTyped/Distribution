package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IPositioningContext extends js.Object {
  def fromClientPixels(clientPixelPoint: js.Array[scala.Double]): js.Array[scala.Double]
  def getZoom(): scala.Double
  def toClientPixels(globalPixelPoint: js.Array[scala.Double]): js.Array[scala.Double]
}

