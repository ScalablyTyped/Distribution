package typings.wechatMiniprogram.WechatMiniprogram

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 广播的制造商信息, 仅安卓支持 */
@js.native
trait ManufacturerData extends js.Object {
  /** 制造商ID，0x 开头的十六进制 */
  var manufacturerId: String = js.native
  /** 制造商信息 */
  var manufacturerSpecificData: js.UndefOr[ArrayBuffer] = js.native
}

object ManufacturerData {
  @scala.inline
  def apply(manufacturerId: String): ManufacturerData = {
    val __obj = js.Dynamic.literal(manufacturerId = manufacturerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManufacturerData]
  }
  @scala.inline
  implicit class ManufacturerDataOps[Self <: ManufacturerData] (val x: Self) extends AnyVal {
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
    def setManufacturerId(value: String): Self = this.set("manufacturerId", value.asInstanceOf[js.Any])
    @scala.inline
    def setManufacturerSpecificData(value: ArrayBuffer): Self = this.set("manufacturerSpecificData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManufacturerSpecificData: Self = this.set("manufacturerSpecificData", js.undefined)
  }
  
}

