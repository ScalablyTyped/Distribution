package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 该特征值支持的操作类型 */
@js.native
trait BLECharacteristicProperties extends js.Object {
  
  /** 该特征值是否支持 indicate 操作 */
  var indicate: Boolean = js.native
  
  /** 该特征值是否支持 notify 操作 */
  @JSName("notify")
  var notify_FBLECharacteristicProperties: Boolean = js.native
  
  /** 该特征值是否支持 read 操作 */
  var read: Boolean = js.native
  
  /** 该特征值是否支持 write 操作 */
  var write: Boolean = js.native
}
object BLECharacteristicProperties {
  
  @scala.inline
  def apply(indicate: Boolean, notify: Boolean, read: Boolean, write: Boolean): BLECharacteristicProperties = {
    val __obj = js.Dynamic.literal(indicate = indicate.asInstanceOf[js.Any], notify = notify.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], write = write.asInstanceOf[js.Any])
    __obj.asInstanceOf[BLECharacteristicProperties]
  }
  
  @scala.inline
  implicit class BLECharacteristicPropertiesOps[Self <: BLECharacteristicProperties] (val x: Self) extends AnyVal {
    
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
    def setIndicate(value: Boolean): Self = this.set("indicate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotify(value: Boolean): Self = this.set("notify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRead(value: Boolean): Self = this.set("read", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrite(value: Boolean): Self = this.set("write", value.asInstanceOf[js.Any])
  }
}
