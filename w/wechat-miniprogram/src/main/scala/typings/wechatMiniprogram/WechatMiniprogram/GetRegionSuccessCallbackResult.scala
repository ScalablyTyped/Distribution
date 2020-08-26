package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRegionSuccessCallbackResult extends js.Object {
  var errMsg: String = js.native
  /** 东北角经纬度 */
  var northeast: MapPostion = js.native
  /** 西南角经纬度 */
  var southwest: MapPostion = js.native
}

object GetRegionSuccessCallbackResult {
  @scala.inline
  def apply(errMsg: String, northeast: MapPostion, southwest: MapPostion): GetRegionSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], northeast = northeast.asInstanceOf[js.Any], southwest = southwest.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRegionSuccessCallbackResult]
  }
  @scala.inline
  implicit class GetRegionSuccessCallbackResultOps[Self <: GetRegionSuccessCallbackResult] (val x: Self) extends AnyVal {
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
    def setErrMsg(value: String): Self = this.set("errMsg", value.asInstanceOf[js.Any])
    @scala.inline
    def setNortheast(value: MapPostion): Self = this.set("northeast", value.asInstanceOf[js.Any])
    @scala.inline
    def setSouthwest(value: MapPostion): Self = this.set("southwest", value.asInstanceOf[js.Any])
  }
  
}

