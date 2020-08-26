package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 标签类型枚举 */
@js.native
trait TechType extends js.Object {
  /** IsoDep 标签 */
  var isoDep: String = js.native
  /** MifareClassic 标签 */
  var mifareClassic: String = js.native
  /** MifareUltralight 标签 */
  var mifareUltralight: String = js.native
  /** Ndef 标签 */
  var ndef: String = js.native
  /** NfcA 标签 */
  var nfcA: String = js.native
  /** NfcB 标签 */
  var nfcB: String = js.native
  /** NfcF 标签 */
  var nfcF: String = js.native
  /** NfcV 标签 */
  var nfcV: String = js.native
}

object TechType {
  @scala.inline
  def apply(
    isoDep: String,
    mifareClassic: String,
    mifareUltralight: String,
    ndef: String,
    nfcA: String,
    nfcB: String,
    nfcF: String,
    nfcV: String
  ): TechType = {
    val __obj = js.Dynamic.literal(isoDep = isoDep.asInstanceOf[js.Any], mifareClassic = mifareClassic.asInstanceOf[js.Any], mifareUltralight = mifareUltralight.asInstanceOf[js.Any], ndef = ndef.asInstanceOf[js.Any], nfcA = nfcA.asInstanceOf[js.Any], nfcB = nfcB.asInstanceOf[js.Any], nfcF = nfcF.asInstanceOf[js.Any], nfcV = nfcV.asInstanceOf[js.Any])
    __obj.asInstanceOf[TechType]
  }
  @scala.inline
  implicit class TechTypeOps[Self <: TechType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIsoDep(value: String): Self = this.set("isoDep", value.asInstanceOf[js.Any])
    @scala.inline
    def setMifareClassic(value: String): Self = this.set("mifareClassic", value.asInstanceOf[js.Any])
    @scala.inline
    def setMifareUltralight(value: String): Self = this.set("mifareUltralight", value.asInstanceOf[js.Any])
    @scala.inline
    def setNdef(value: String): Self = this.set("ndef", value.asInstanceOf[js.Any])
    @scala.inline
    def setNfcA(value: String): Self = this.set("nfcA", value.asInstanceOf[js.Any])
    @scala.inline
    def setNfcB(value: String): Self = this.set("nfcB", value.asInstanceOf[js.Any])
    @scala.inline
    def setNfcF(value: String): Self = this.set("nfcF", value.asInstanceOf[js.Any])
    @scala.inline
    def setNfcV(value: String): Self = this.set("nfcV", value.asInstanceOf[js.Any])
  }
  
}

