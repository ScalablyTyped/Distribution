package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * 最低基础库： `2.11.2` */
@js.native
trait NFCAdapter extends js.Object {
  /** 标签类型枚举 */
  var tech: TechType = js.native
  /** [[IsoDep](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/IsoDep.html) NFCAdapter.getIsoDep()](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/NFCAdapter.getIsoDep.html)
    *
    *
    *
    * 最低基础库： `2.11.2` */
  def getIsoDep(): IsoDep = js.native
  /** [[MifareClassic](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/MifareClassic.html) NFCAdapter.getMifareClassic()](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/NFCAdapter.getMifareClassic.html)
    *
    *
    *
    * 最低基础库： `2.11.2` */
  def getMifareClassic(): MifareClassic = js.native
  /** [[MifareUltralight](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/MifareUltralight.html) NFCAdapter.getMifareUltralight()](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/NFCAdapter.getMifareUltralight.html)
    *
    *
    *
    * 最低基础库： `2.11.2` */
  def getMifareUltralight(): MifareUltralight = js.native
  /** [[Ndef](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/Ndef.html) NFCAdapter.getNdef()](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/NFCAdapter.getNdef.html)
    *
    *
    *
    * 最低基础库： `2.11.2` */
  def getNdef(): Ndef = js.native
  /** [[NfcA](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/NfcA.html) NFCAdapter.getNfcA()](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/NFCAdapter.getNfcA.html)
    *
    *
    *
    * 最低基础库： `2.11.2` */
  def getNfcA(): NfcA = js.native
  /** [[NfcB](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/NfcB.html) NFCAdapter.getNfcB()](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/NFCAdapter.getNfcB.html)
    *
    *
    *
    * 最低基础库： `2.11.2` */
  def getNfcB(): NfcB = js.native
  /** [[NfcF](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/NfcF.html) NFCAdapter.getNfcF()](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/NFCAdapter.getNfcF.html)
    *
    *
    *
    * 最低基础库： `2.11.2` */
  def getNfcF(): NfcF = js.native
  /** [[NfcV](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/NfcV.html) NFCAdapter.getNfcV()](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/NFCAdapter.getNfcV.html)
    *
    *
    *
    * 最低基础库： `2.11.2` */
  def getNfcV(): NfcV = js.native
  /** [NFCAdapter.offDiscovered(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/NFCAdapter.offDiscovered.html)
    *
    *
    *
    * 最低基础库： `2.11.2` */
  def offDiscovered(callback: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  /** [NFCAdapter.onDiscovered(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/device/nfc/NFCAdapter.onDiscovered.html)
    *
    *
    *
    * 最低基础库： `2.11.2` */
  def onDiscovered(callback: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
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
}

