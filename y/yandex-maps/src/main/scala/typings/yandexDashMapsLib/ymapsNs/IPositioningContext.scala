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

object IPositioningContext {
  @scala.inline
  def apply(
    fromClientPixels: js.Function1[js.Array[scala.Double], js.Array[scala.Double]],
    getZoom: js.Function0[scala.Double],
    toClientPixels: js.Function1[js.Array[scala.Double], js.Array[scala.Double]]
  ): IPositioningContext = {
    val __obj = js.Dynamic.literal(fromClientPixels = fromClientPixels, getZoom = getZoom, toClientPixels = toClientPixels)
  
    __obj.asInstanceOf[IPositioningContext]
  }
}

