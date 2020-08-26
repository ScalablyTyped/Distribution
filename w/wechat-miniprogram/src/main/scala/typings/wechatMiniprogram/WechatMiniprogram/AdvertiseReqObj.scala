package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 广播自定义参数 */
@js.native
trait AdvertiseReqObj extends js.Object {
  /** 当前Service是否可连接 */
  var connectable: js.UndefOr[Boolean] = js.native
  /** 广播中deviceName字段，默认为空 */
  var deviceName: js.UndefOr[String] = js.native
  /** 广播的制造商信息, 仅安卓支持 */
  var manufacturerData: js.UndefOr[js.Array[ManufacturerData]] = js.native
  /** 要广播的serviceUuid列表 */
  var serviceUuids: js.UndefOr[js.Array[String]] = js.native
}

object AdvertiseReqObj {
  @scala.inline
  def apply(): AdvertiseReqObj = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdvertiseReqObj]
  }
  @scala.inline
  implicit class AdvertiseReqObjOps[Self <: AdvertiseReqObj] (val x: Self) extends AnyVal {
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
    def setConnectable(value: Boolean): Self = this.set("connectable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectable: Self = this.set("connectable", js.undefined)
    @scala.inline
    def setDeviceName(value: String): Self = this.set("deviceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceName: Self = this.set("deviceName", js.undefined)
    @scala.inline
    def setManufacturerDataVarargs(value: ManufacturerData*): Self = this.set("manufacturerData", js.Array(value :_*))
    @scala.inline
    def setManufacturerData(value: js.Array[ManufacturerData]): Self = this.set("manufacturerData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManufacturerData: Self = this.set("manufacturerData", js.undefined)
    @scala.inline
    def setServiceUuidsVarargs(value: String*): Self = this.set("serviceUuids", js.Array(value :_*))
    @scala.inline
    def setServiceUuids(value: js.Array[String]): Self = this.set("serviceUuids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceUuids: Self = this.set("serviceUuids", js.undefined)
  }
  
}

