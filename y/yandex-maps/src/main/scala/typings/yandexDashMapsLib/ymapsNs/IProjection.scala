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
    fromGlobalPixels: js.Function2[js.Array[scala.Double], scala.Double, js.Array[scala.Double]],
    getCoordSystem: js.Function0[ICoordSystem],
    isCycled: js.Function0[js.Array[scala.Boolean]],
    toGlobalPixels: js.Function2[js.Array[scala.Double], scala.Double, js.Array[scala.Double]]
  ): IProjection = {
    val __obj = js.Dynamic.literal(fromGlobalPixels = fromGlobalPixels, getCoordSystem = getCoordSystem, isCycled = isCycled, toGlobalPixels = toGlobalPixels)
  
    __obj.asInstanceOf[IProjection]
  }
}

