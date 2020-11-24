package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NfcF extends js.Object {
  
  /** [NfcF.close(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/NfcF.close.html)
    *
    * 断开连接
    *
    * 最低基础库： `2.11.2` */
  def close(): Unit = js.native
  def close(option: NdefCloseOption): Unit = js.native
  
  /** [NfcF.connect(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/NfcF.connect.html)
    *
    * 连接 NFC 标签
    *
    * 最低基础库： `2.11.2` */
  def connect(): Unit = js.native
  def connect(option: ConnectOption): Unit = js.native
  
  /** [NfcF.getMaxTransceiveLength(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/NfcF.getMaxTransceiveLength.html)
    *
    * 获取最大传输长度
    *
    * 最低基础库： `2.11.2` */
  def getMaxTransceiveLength(): Unit = js.native
  def getMaxTransceiveLength(option: GetMaxTransceiveLengthOption): Unit = js.native
  
  /** [NfcF.setTimeout(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/NfcF.setTimeout.html)
    *
    * 设置超时时间
    *
    * 最低基础库： `2.11.2` */
  def setTimeout(option: SetTimeoutOption): Unit = js.native
  
  /** [NfcF.transceive(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/NfcF.transceive.html)
    *
    * 发送数据
    *
    * 最低基础库： `2.11.2` */
  def transceive(option: TransceiveOption): Unit = js.native
}
