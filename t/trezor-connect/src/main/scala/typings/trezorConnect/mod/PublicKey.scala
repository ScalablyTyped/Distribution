package typings.trezorConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublicKey extends js.Object {
   // optional for segwit accounts: xpub in segwit format
  var chainCode: String
   // BIP32 serialization format
  var childNum: Double
   // BIP32 serialization format
  var depth: Double
   // BIP32 serialization format
  var fingerprint: Double
  var path: js.Array[Double]
   // BIP32 serialization format
  var publicKey: String
   // hardended path
  var serializedPath: String
   // serialized path
  var xpub: String
   // xpub in legacy format
  var xpubSegwit: js.UndefOr[String] = js.undefined
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
    xpub: String,
    xpubSegwit: String = null
  ): PublicKey = {
    val __obj = js.Dynamic.literal(chainCode = chainCode.asInstanceOf[js.Any], childNum = childNum.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any], serializedPath = serializedPath.asInstanceOf[js.Any], xpub = xpub.asInstanceOf[js.Any])
    if (xpubSegwit != null) __obj.updateDynamic("xpubSegwit")(xpubSegwit.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKey]
  }
}

