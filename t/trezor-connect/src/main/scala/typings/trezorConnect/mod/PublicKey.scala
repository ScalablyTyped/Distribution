package typings.trezorConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublicKey extends js.Object {
   // optional for segwit accounts: xpub in segwit format
  var chainCode: String = js.native
   // BIP32 serialization format
  var childNum: Double = js.native
   // BIP32 serialization format
  var depth: Double = js.native
   // BIP32 serialization format
  var fingerprint: Double = js.native
  var path: js.Array[Double] = js.native
   // BIP32 serialization format
  var publicKey: String = js.native
   // hardended path
  var serializedPath: String = js.native
   // serialized path
  var xpub: String = js.native
   // xpub in legacy format
  var xpubSegwit: js.UndefOr[String] = js.native
}

object PublicKey {
  @scala.inline
  def apply(
    chainCode: String,
    childNum: Double,
    depth: Double,
    fingerprint: Double,
    path: js.Array[Double],
    publicKey: String,
    serializedPath: String,
    xpub: String
  ): PublicKey = {
    val __obj = js.Dynamic.literal(chainCode = chainCode.asInstanceOf[js.Any], childNum = childNum.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any], serializedPath = serializedPath.asInstanceOf[js.Any], xpub = xpub.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKey]
  }
  @scala.inline
  implicit class PublicKeyOps[Self <: PublicKey] (val x: Self) extends AnyVal {
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
    def setChainCode(value: String): Self = this.set("chainCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildNum(value: Double): Self = this.set("childNum", value.asInstanceOf[js.Any])
    @scala.inline
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    @scala.inline
    def setFingerprint(value: Double): Self = this.set("fingerprint", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathVarargs(value: Double*): Self = this.set("path", js.Array(value :_*))
    @scala.inline
    def setPath(value: js.Array[Double]): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublicKey(value: String): Self = this.set("publicKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setSerializedPath(value: String): Self = this.set("serializedPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setXpub(value: String): Self = this.set("xpub", value.asInstanceOf[js.Any])
    @scala.inline
    def setXpubSegwit(value: String): Self = this.set("xpubSegwit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXpubSegwit: Self = this.set("xpubSegwit", js.undefined)
  }
  
}

