package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProjection extends js.Object {
  def fromGlobalPixels(globalPixelPoint: js.Array[scala.Double], zoom: scala.Double): js.Array[scala.Double]
  def getCoordSystem(): ICoordSystem
  def isCycled(): js.Array[scala.Boolean]
  def toGlobalPixels(coordPoint: js.Array[scala.Double], zoom: scala.Double): js.Array[scala.Double]
}

object IProjection {
  @scala.inline
  def apply(
    fromGlobalPixels: (js.Array[scala.Double], scala.Double) => js.Array[scala.Double],
    getCoordSystem: () => ICoordSystem,
    isCycled: () => js.Array[scala.Boolean],
    toGlobalPixels: (js.Array[scala.Double], scala.Double) => js.Array[scala.Double]
  ): IProjection = {
    val __obj = js.Dynamic.literal(fromGlobalPixels = js.Any.fromFunction2(fromGlobalPixels), getCoordSystem = js.Any.fromFunction0(getCoordSystem), isCycled = js.Any.fromFunction0(isCycled), toGlobalPixels = js.Any.fromFunction2(toGlobalPixels))
  
    __obj.asInstanceOf[IProjection]
  }
}

