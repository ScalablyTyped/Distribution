package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 设备特征值列表 */
@js.native
trait BLECharacteristic extends js.Object {
  
  /** 该特征值支持的操作类型 */
  var properties: BLECharacteristicProperties = js.native
  
  /** 蓝牙设备特征值的 uuid */
  var uuid: String = js.native
}
object BLECharacteristic {
  
  @scala.inline
  def apply(properties: BLECharacteristicProperties, uuid: String): BLECharacteristic = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[BLECharacteristic]
  }
  
  @scala.inline
  implicit class BLECharacteristicOps[Self <: BLECharacteristic] (val x: Self) extends AnyVal {
    
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
    def setProperties(value: BLECharacteristicProperties): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuid(value: String): Self = this.set("uuid", value.asInstanceOf[js.Any])
  }
}
