package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BLEPeripheralServer extends js.Object {
  /** [BLEPeripheralServer.addService(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/bluetooth-peripheral/BLEPeripheralServer.addService.html)
    *
    * 添加服务。
    *
    * 最低基础库： `2.10.3` */
  def addService(option: AddServiceOption): Unit = js.native
  /** [BLEPeripheralServer.close(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/bluetooth-peripheral/BLEPeripheralServer.close.html)
    *
    * 关闭当前服务端。
    *
    * 最低基础库： `2.10.3` */
  def close(): Unit = js.native
  def close(option: NdefCloseOption): Unit = js.native
  /** [BLEPeripheralServer.offCharacteristicReadRequest(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/device/bluetooth-peripheral/BLEPeripheralServer.offCharacteristicReadRequest.html)
    *
    * 取消监听已连接的设备请求读当前外围设备的特征值事件
    *
    * 最低基础库： `2.10.3` */
  def offCharacteristicReadRequest(/** 已连接的设备请求读当前外围设备的特征值事件的回调函数 */
  callback: OffCharacteristicReadRequestCallback): Unit = js.native
  /** [BLEPeripheralServer.offCharacteristicWriteRequest(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/device/bluetooth-peripheral/BLEPeripheralServer.offCharacteristicWriteRequest.html)
    *
    * 取消监听已连接的设备请求写当前外围设备的特征值事件
    *
    * 最低基础库： `2.10.3` */
  def offCharacteristicWriteRequest(/** 已连接的设备请求写当前外围设备的特征值事件的回调函数 */
  callback: OffCharacteristicWriteRequestCallback): Unit = js.native
  /** [BLEPeripheralServer.onCharacteristicReadRequest(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/device/bluetooth-peripheral/BLEPeripheralServer.onCharacteristicReadRequest.html)
    *
    * 监听已连接的设备请求读当前外围设备的特征值事件。收到该消息后需要立刻调用 `writeCharacteristicValue` 写回数据，否则主机不会收到响应。
    *
    * 最低基础库： `2.10.3` */
  def onCharacteristicReadRequest(/** 已连接的设备请求读当前外围设备的特征值事件的回调函数 */
  callback: OnCharacteristicReadRequestCallback): Unit = js.native
  /** [BLEPeripheralServer.onCharacteristicWriteRequest(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/device/bluetooth-peripheral/BLEPeripheralServer.onCharacteristicWriteRequest.html)
    *
    * 监听已连接的设备请求写当前外围设备的特征值事件。收到该消息后需要立刻调用 `writeCharacteristicValue` 写回数据，否则主机不会收到响应。
    *
    * 最低基础库： `2.10.3` */
  def onCharacteristicWriteRequest(/** 已连接的设备请求写当前外围设备的特征值事件的回调函数 */
  callback: OnCharacteristicWriteRequestCallback): Unit = js.native
  /** [BLEPeripheralServer.removeService(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/bluetooth-peripheral/BLEPeripheralServer.removeService.html)
    *
    * 移除服务。
    *
    * 最低基础库： `2.10.3` */
  def removeService(option: RemoveServiceOption): Unit = js.native
  /** [BLEPeripheralServer.startAdvertising(Object Object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/bluetooth-peripheral/BLEPeripheralServer.startAdvertising.html)
    *
    * 开始广播本地创建的外围设备。
    *
    * 最低基础库： `2.10.3` */
  def startAdvertising(Object: StartAdvertisingObject): Unit = js.native
  /** [BLEPeripheralServer.stopAdvertising(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/bluetooth-peripheral/BLEPeripheralServer.stopAdvertising.html)
    *
    * 停止广播。
    *
    * 最低基础库： `2.10.3` */
  def stopAdvertising(): Unit = js.native
  def stopAdvertising(option: StopAdvertisingOption): Unit = js.native
  /** [BLEPeripheralServer.writeCharacteristicValue(Object Object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/bluetooth-peripheral/BLEPeripheralServer.writeCharacteristicValue.html)
    *
    * 往指定特征值写入数据，并通知已连接的主机，从机的特征值已发生变化，该接口会处理是走回包还是走订阅。
    *
    * 最低基础库： `2.10.3` */
  def writeCharacteristicValue(Object: WriteCharacteristicValueObject): Unit = js.native
}

