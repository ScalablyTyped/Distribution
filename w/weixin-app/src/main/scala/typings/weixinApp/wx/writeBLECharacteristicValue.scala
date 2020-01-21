package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.writeBLECharacteristicValue")
@js.native
object writeBLECharacteristicValue extends js.Object {
  /**
  	 * 向低功耗蓝牙设备特征值中写入二进制数据。
  	 * 注意：必须设备的特征值支持write才可以成功调用，具体参照 characteristic 的 properties 属性
  	 * tips: 并行调用多次读写接口存在读写失败的可能性
  	 */
  def apply(options: WriteBLECharacteristicValue_): Unit = js.native
}

