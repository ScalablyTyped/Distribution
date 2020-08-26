package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapContextGetScaleResult extends js.Object {
  /**
    * 地图缩放级别
    */
  var scale: js.UndefOr[Double] = js.native
}

object MapContextGetScaleResult {
  @scala.inline
  def apply(): MapContextGetScaleResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapContextGetScaleResult]
  }
  @scala.inline
  implicit class MapContextGetScaleResultOps[Self <: MapContextGetScaleResult] (val x: Self) extends AnyVal {
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
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
  }
  
}

