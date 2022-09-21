package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NfcA extends StObject {
  
  /** [NfcA.close(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/NfcA.close.html)
    *
    * 断开连接
    *
    * 最低基础库： `2.11.2` */
  def close(): Unit = js.native
  def close(option: NdefCloseOption): Unit = js.native
  
  /** [NfcA.connect(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/NfcA.connect.html)
    *
    * 连接 NFC 标签
    *
    * 最低基础库： `2.11.2` */
  def connect(): Unit = js.native
  def connect(option: NdefConnectOption): Unit = js.native
  
  /** [NfcA.getAtqa(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/NfcA.getAtqa.html)
    *
    * 获取ATQA信息
    *
    * 最低基础库： `2.11.2` */
  def getAtqa(): Unit = js.native
  def getAtqa(option: GetAtqaOption): Unit = js.native
  
  /** [NfcA.getMaxTransceiveLength(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/NfcA.getMaxTransceiveLength.html)
    *
    * 获取最大传输长度
    *
    * 最低基础库： `2.11.2` */
  def getMaxTransceiveLength(): Unit = js.native
  def getMaxTransceiveLength(option: GetMaxTransceiveLengthOption): Unit = js.native
  
  /** [NfcA.getSak(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/NfcA.getSak.html)
    *
    * 获取SAK信息
    *
    * 最低基础库： `2.11.2` */
  def getSak(): Unit = js.native
  def getSak(option: GetSakOption): Unit = js.native
  
  /** [NfcA.isConnected(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/NfcA.isConnected.html)
    *
    * 检查是否已连接
    *
    * 最低基础库： `2.11.2` */
  def isConnected(): Unit = js.native
  def isConnected(option: IsConnectedOption): Unit = js.native
  
  /** [NfcA.setTimeout(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/NfcA.setTimeout.html)
    *
    * 设置超时时间
    *
    * 最低基础库： `2.11.2` */
  def setTimeout(option: SetTimeoutOption): Unit = js.native
  
  /** [NfcA.transceive(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/NfcA.transceive.html)
    *
    * 发送数据
    *
    * 最低基础库： `2.11.2` */
  def transceive(option: TransceiveOption): Unit = js.native
}
