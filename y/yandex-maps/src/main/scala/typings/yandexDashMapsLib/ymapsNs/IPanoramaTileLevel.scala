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
    getImageSize: js.Function0[js.Array[scala.Double]],
    getTileUrl: js.Function2[scala.Double, scala.Double, java.lang.String]
  ): IPanoramaTileLevel = {
    val __obj = js.Dynamic.literal(getImageSize = getImageSize, getTileUrl = getTileUrl)
  
    __obj.asInstanceOf[IPanoramaTileLevel]
  }
}

