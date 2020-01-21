package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.readBLECharacteristicValue")
@js.native
object readBLECharacteristicValue extends js.Object {
  /**
  	 * 读取低功耗蓝牙设备的特征值的二进制数据值。
  	 * 注意：必须设备的特征值支持read才可以成功调用，具体参照 characteristic 的 properties 属性
  	 */
  def apply(options: ReadBLECharacteristicValue_): Unit = js.native
}

