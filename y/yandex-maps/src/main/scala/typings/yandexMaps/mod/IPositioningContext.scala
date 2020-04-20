package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPositioningContext extends js.Object {
  def fromClientPixels(clientPixelPoint: js.Array[Double]): js.Array[Double]
  def getZoom(): Double
  def toClientPixels(globalPixelPoint: js.Array[Double]): js.Array[Double]
}

object IPositioningContext {
  @scala.inline
  def apply(
    fromClientPixels: js.Array[Double] => js.Array[Double],
    getZoom: () => Double,
    toClientPixels: js.Array[Double] => js.Array[Double]
  ): IPositioningContext = {
    val __obj = js.Dynamic.literal(fromClientPixels = js.Any.fromFunction1(fromClientPixels), getZoom = js.Any.fromFunction0(getZoom), toClientPixels = js.Any.fromFunction1(toClientPixels))
    __obj.asInstanceOf[IPositioningContext]
  }
}

