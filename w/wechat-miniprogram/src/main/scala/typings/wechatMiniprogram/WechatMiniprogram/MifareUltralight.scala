package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MifareUltralight extends js.Object {
  
  /** [MifareUltralight.close(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/MifareUltralight.close.html)
    *
    * 断开连接
    *
    * 最低基础库： `2.11.2` */
  def close(): Unit = js.native
  def close(option: NdefCloseOption): Unit = js.native
  
  /** [MifareUltralight.connect(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/MifareUltralight.connect.html)
    *
    * 连接 NFC 标签
    *
    * 最低基础库： `2.11.2` */
  def connect(): Unit = js.native
  def connect(option: ConnectOption): Unit = js.native
  
  /** [MifareUltralight.getMaxTransceiveLength(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/MifareUltralight.getMaxTransceiveLength.html)
    *
    * 获取最大传输长度
    *
    * 最低基础库： `2.11.2` */
  def getMaxTransceiveLength(): Unit = js.native
  def getMaxTransceiveLength(option: GetMaxTransceiveLengthOption): Unit = js.native
  
  /** [MifareUltralight.setTimeout(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/MifareUltralight.setTimeout.html)
    *
    * 设置超时时间
    *
    * 最低基础库： `2.11.2` */
  def setTimeout(option: SetTimeoutOption): Unit = js.native
  
  /** [MifareUltralight.transceive(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/MifareUltralight.transceive.html)
    *
    * 发送数据
    *
    * 最低基础库： `2.11.2` */
  def transceive(option: TransceiveOption): Unit = js.native
}
