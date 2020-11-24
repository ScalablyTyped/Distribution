package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsoDep extends js.Object {
  
  /** [IsoDep.close(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/IsoDep.close.html)
    *
    * 断开连接
    *
    * 最低基础库： `2.11.2` */
  def close(): Unit = js.native
  def close(option: NdefCloseOption): Unit = js.native
  
  /** [IsoDep.connect(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/IsoDep.connect.html)
    *
    * 连接 NFC 标签
    *
    * 最低基础库： `2.11.2` */
  def connect(): Unit = js.native
  def connect(option: ConnectOption): Unit = js.native
  
  /** [IsoDep.getHistoricalBytes(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/IsoDep.getHistoricalBytes.html)
    *
    * 获取复位信息
    *
    * 最低基础库： `2.11.2` */
  def getHistoricalBytes(): Unit = js.native
  def getHistoricalBytes(option: GetHistoricalBytesOption): Unit = js.native
  
  /** [IsoDep.getMaxTransceiveLength(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/IsoDep.getMaxTransceiveLength.html)
    *
    * 获取最大传输长度
    *
    * 最低基础库： `2.11.2` */
  def getMaxTransceiveLength(): Unit = js.native
  def getMaxTransceiveLength(option: GetMaxTransceiveLengthOption): Unit = js.native
  
  /** [IsoDep.setTimeout(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/IsoDep.setTimeout.html)
    *
    * 设置超时时间
    *
    * 最低基础库： `2.11.2` */
  def setTimeout(option: SetTimeoutOption): Unit = js.native
  
  /** [IsoDep.transceive(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/IsoDep.transceive.html)
    *
    * 发送数据
    *
    * 最低基础库： `2.11.2` */
  def transceive(option: TransceiveOption): Unit = js.native
}
