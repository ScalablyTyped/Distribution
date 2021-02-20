package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NfcV extends StObject {
  
  /** [NfcV.close(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/NfcV.close.html)
    *
    * 断开连接
    *
    * 最低基础库： `2.11.2` */
  def close(): Unit = js.native
  def close(option: NdefCloseOption): Unit = js.native
  
  /** [NfcV.connect(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/NfcV.connect.html)
    *
    * 连接 NFC 标签
    *
    * 最低基础库： `2.11.2` */
  def connect(): Unit = js.native
  def connect(option: ConnectOption): Unit = js.native
  
  /** [NfcV.getMaxTransceiveLength(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/NfcV.getMaxTransceiveLength.html)
    *
    * 获取最大传输长度
    *
    * 最低基础库： `2.11.2` */
  def getMaxTransceiveLength(): Unit = js.native
  def getMaxTransceiveLength(option: GetMaxTransceiveLengthOption): Unit = js.native
  
  /** [NfcV.setTimeout(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/NfcV.setTimeout.html)
    *
    * 设置超时时间
    *
    * 最低基础库： `2.11.2` */
  def setTimeout(option: SetTimeoutOption): Unit = js.native
  
  /** [NfcV.transceive(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/NfcV.transceive.html)
    *
    * 发送数据
    *
    * 最低基础库： `2.11.2` */
  def transceive(option: TransceiveOption): Unit = js.native
}
