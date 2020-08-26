package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBeaconError extends js.Object {
  /** 错误码
    *
    * | 错误码 | 错误信息 | 说明 |
    * | - | - | - |
    * | 0 | ok | 正常 |
    * | 11000 | unsupport | 系统或设备不支持 |
    * | 11001 | bluetooth service unavailable | 蓝牙服务不可用 |
    * | 11002 | location service unavailable | 位置服务不可用 |
    * | 11003 | already start | 已经开始搜索 |
    * | 11004 | not startBeaconDiscovery | 还未开始搜索 |
    * | 11005 | system error | 系统错误 |
    * | 11006 | invalid data | 参数不正确 | */ var errCode: Double = js.native
  /** 错误信息
    *
    * | 错误码 | 错误信息 | 说明 |
    * | - | - | - |
    * | 0 | ok | 正常 |
    * | 11000 | unsupport | 系统或设备不支持 |
    * | 11001 | bluetooth service unavailable | 蓝牙服务不可用 |
    * | 11002 | location service unavailable | 位置服务不可用 |
    * | 11003 | already start | 已经开始搜索 |
    * | 11004 | not startBeaconDiscovery | 还未开始搜索 |
    * | 11005 | system error | 系统错误 |
    * | 11006 | invalid data | 参数不正确 | */ var errMsg: String = js.native
}

object IBeaconError {
  @scala.inline
  def apply(errCode: Double, errMsg: String): IBeaconError = {
    val __obj = js.Dynamic.literal(errCode = errCode.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBeaconError]
  }
  @scala.inline
  implicit class IBeaconErrorOps[Self <: IBeaconError] (val x: Self) extends AnyVal {
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
    def setErrCode(value: Double): Self = this.set("errCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrMsg(value: String): Self = this.set("errMsg", value.asInstanceOf[js.Any])
  }
  
}

