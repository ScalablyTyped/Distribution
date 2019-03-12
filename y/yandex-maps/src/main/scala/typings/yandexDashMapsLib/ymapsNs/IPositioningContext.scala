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
    fromClientPixels: js.Array[scala.Double] => js.Array[scala.Double],
    getZoom: () => scala.Double,
    toClientPixels: js.Array[scala.Double] => js.Array[scala.Double]
  ): IPositioningContext = {
    val __obj = js.Dynamic.literal(fromClientPixels = js.Any.fromFunction1(fromClientPixels), getZoom = js.Any.fromFunction0(getZoom), toClientPixels = js.Any.fromFunction1(toClientPixels))
  
    __obj.asInstanceOf[IPositioningContext]
  }
}

