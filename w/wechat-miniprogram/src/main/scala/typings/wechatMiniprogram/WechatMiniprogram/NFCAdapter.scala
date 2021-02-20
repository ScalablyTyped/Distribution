package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * 最低基础库： `2.11.2` */
@js.native
trait NFCAdapter extends StObject {
  
  /** [[IsoDep](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/IsoDep.html) NFCAdapter.getIsoDep()](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/NFCAdapter.getIsoDep.html)
    *
    * 获取IsoDep实例，实例支持ISO-DEP (ISO 14443-4)标准的读写
    *
    * 最低基础库： `2.11.2` */
  def getIsoDep(): IsoDep = js.native
  
  /** [[MifareClassic](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/MifareClassic.html) NFCAdapter.getMifareClassic()](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/NFCAdapter.getMifareClassic.html)
    *
    * 获取MifareClassic实例，实例支持MIFARE Classic标签的读写
    *
    * 最低基础库： `2.11.2` */
  def getMifareClassic(): MifareClassic = js.native
  
  /** [[MifareUltralight](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/MifareUltralight.html) NFCAdapter.getMifareUltralight()](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/NFCAdapter.getMifareUltralight.html)
    *
    * 获取MifareUltralight实例，实例支持MIFARE Ultralight标签的读写
    *
    * 最低基础库： `2.11.2` */
  def getMifareUltralight(): MifareUltralight = js.native
  
  /** [[Ndef](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/Ndef.html) NFCAdapter.getNdef()](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/NFCAdapter.getNdef.html)
    *
    * 获取Ndef实例，实例支持对NDEF格式的NFC标签上的NDEF数据的读写
    *
    * 最低基础库： `2.11.2` */
  def getNdef(): Ndef = js.native
  
  /** [[NfcA](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/NfcA.html) NFCAdapter.getNfcA()](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/NFCAdapter.getNfcA.html)
    *
    * 获取NfcA实例，实例支持NFC-A (ISO 14443-3A)标准的读写
    *
    * 最低基础库： `2.11.2` */
  def getNfcA(): NfcA = js.native
  
  /** [[NfcB](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/NfcB.html) NFCAdapter.getNfcB()](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/NFCAdapter.getNfcB.html)
    *
    * 获取NfcB实例，实例支持NFC-B (ISO 14443-3B)标准的读写
    *
    * 最低基础库： `2.11.2` */
  def getNfcB(): NfcB = js.native
  
  /** [[NfcF](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/NfcF.html) NFCAdapter.getNfcF()](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/NFCAdapter.getNfcF.html)
    *
    * 获取NfcF实例，实例支持NFC-F (JIS 6319-4)标准的读写
    *
    * 最低基础库： `2.11.2` */
  def getNfcF(): NfcF = js.native
  
  /** [[NfcV](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/NfcV.html) NFCAdapter.getNfcV()](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/NFCAdapter.getNfcV.html)
    *
    * 获取NfcV实例，实例支持NFC-V (ISO 15693)标准的读写
    *
    * 最低基础库： `2.11.2` */
  def getNfcV(): NfcV = js.native
  
  /** [NFCAdapter.offDiscovered(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/NFCAdapter.offDiscovered.html)
    *
    * 取消监听 NFC Tag
    *
    * 最低基础库： `2.11.2` */
  def offDiscovered(): Unit = js.native
  def offDiscovered(/** 的回调函数 */
  callback: OffDiscoveredCallback): Unit = js.native
  
  /** [NFCAdapter.onDiscovered(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/NFCAdapter.onDiscovered.html)
    *
    * 监听 NFC Tag
    *
    * 最低基础库： `2.11.2` */
  def onDiscovered(/** 的回调函数 */
  callback: OnDiscoveredCallback): Unit = js.native
  
  /** [NFCAdapter.startDiscovery(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/NFCAdapter.startDiscovery.html)
    *
    *
    *
    * 最低基础库： `2.11.2` */
  def startDiscovery(): Unit = js.native
  def startDiscovery(option: StartDiscoveryOption): Unit = js.native
  
  /** [NFCAdapter.stopDiscovery(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/NFCAdapter.stopDiscovery.html)
    *
    *
    *
    * 最低基础库： `2.11.2` */
  def stopDiscovery(): Unit = js.native
  def stopDiscovery(option: StopDiscoveryOption): Unit = js.native
  
  /** 标签类型枚举 */
  var tech: TechType = js.native
}
