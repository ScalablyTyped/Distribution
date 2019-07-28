package typings.yandexDashMaps.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanoramaTileLevel extends js.Object {
  def getImageSize(): js.Array[Double]
  def getTileUrl(x: Double, y: Double): String
}

object IPanoramaTileLevel {
  @scala.inline
  def apply(getImageSize: () => js.Array[Double], getTileUrl: (Double, Double) => String): IPanoramaTileLevel = {
    val __obj = js.Dynamic.literal(getImageSize = js.Any.fromFunction0(getImageSize), getTileUrl = js.Any.fromFunction2(getTileUrl))
  
    __obj.asInstanceOf[IPanoramaTileLevel]
  }
}

