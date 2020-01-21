package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProjection extends js.Object {
  def fromGlobalPixels(globalPixelPoint: js.Array[Double], zoom: Double): js.Array[Double]
  def getCoordSystem(): ICoordSystem
  def isCycled(): js.Array[Boolean]
  def toGlobalPixels(coordPoint: js.Array[Double], zoom: Double): js.Array[Double]
}

object IProjection {
  @scala.inline
  def apply(
    fromGlobalPixels: (js.Array[Double], Double) => js.Array[Double],
    getCoordSystem: () => ICoordSystem,
    isCycled: () => js.Array[Boolean],
    toGlobalPixels: (js.Array[Double], Double) => js.Array[Double]
  ): IProjection = {
    val __obj = js.Dynamic.literal(fromGlobalPixels = js.Any.fromFunction2(fromGlobalPixels), getCoordSystem = js.Any.fromFunction0(getCoordSystem), isCycled = js.Any.fromFunction0(isCycled), toGlobalPixels = js.Any.fromFunction2(toGlobalPixels))
  
    __obj.asInstanceOf[IProjection]
  }
}

