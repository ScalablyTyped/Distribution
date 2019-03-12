package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanoramaTileLevel extends js.Object {
  def getImageSize(): js.Array[scala.Double]
  def getTileUrl(x: scala.Double, y: scala.Double): java.lang.String
}

object IPanoramaTileLevel {
  @scala.inline
  def apply(
    getImageSize: () => js.Array[scala.Double],
    getTileUrl: (scala.Double, scala.Double) => java.lang.String
  ): IPanoramaTileLevel = {
    val __obj = js.Dynamic.literal(getImageSize = js.Any.fromFunction0(getImageSize), getTileUrl = js.Any.fromFunction2(getTileUrl))
  
    __obj.asInstanceOf[IPanoramaTileLevel]
  }
}

