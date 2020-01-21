package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.notifyBLECharacteristicValueChanged")
@js.native
object notifyBLECharacteristicValueChanged extends js.Object {
  /**
  	 * 启用低功耗蓝牙设备特征值变化时的 notify 功能。
  	 * 注意：必须设备的特征值支持notify才可以成功调用，具体参照 characteristic 的 properties 属性
  	 * 另外，必须先启用notify才能监听到设备 characteristicValueChange 事件
  	 */
  def apply(options: NotifyBLECharacteristicValueChanged_): Unit = js.native
}

