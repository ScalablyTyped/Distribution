package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPanoramaTileLevel extends js.Object {
  def getImageSize(): js.Array[Double] = js.native
  def getTileUrl(x: Double, y: Double): String = js.native
}

object IPanoramaTileLevel {
  @scala.inline
  def apply(getImageSize: () => js.Array[Double], getTileUrl: (Double, Double) => String): IPanoramaTileLevel = {
    val __obj = js.Dynamic.literal(getImageSize = js.Any.fromFunction0(getImageSize), getTileUrl = js.Any.fromFunction2(getTileUrl))
    __obj.asInstanceOf[IPanoramaTileLevel]
  }
  @scala.inline
  implicit class IPanoramaTileLevelOps[Self <: IPanoramaTileLevel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetImageSize(value: () => js.Array[Double]): Self = this.set("getImageSize", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTileUrl(value: (Double, Double) => String): Self = this.set("getTileUrl", js.Any.fromFunction2(value))
  }
  
}

