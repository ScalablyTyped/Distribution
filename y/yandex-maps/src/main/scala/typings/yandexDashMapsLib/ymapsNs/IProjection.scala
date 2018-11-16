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

