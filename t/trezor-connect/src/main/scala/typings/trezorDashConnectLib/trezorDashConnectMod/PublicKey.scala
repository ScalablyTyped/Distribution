package typings
package trezorDashConnectLib.trezorDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublicKey extends js.Object {
   // optional for segwit accounts: xpub in segwit format
  var chainCode: java.lang.String
   // BIP32 serialization format
  var childNum: scala.Double
   // BIP32 serialization format
  var depth: scala.Double
   // BIP32 serialization format
  var fingerprint: scala.Double
  var path: js.Array[scala.Double]
   // BIP32 serialization format
  var publicKey: java.lang.String
   // hardended path
  var serializedPath: java.lang.String
   // serialized path
  var xpub: java.lang.String
   // xpub in legacy format
  var xpubSegwit: js.UndefOr[java.lang.String] = js.undefined
}

object PublicKey {
  @scala.inline
  def apply(
    chainCode: java.lang.String,
    childNum: scala.Double,
    depth: scala.Double,
    fingerprint: scala.Double,
    path: js.Array[scala.Double],
    publicKey: java.lang.String,
    serializedPath: java.lang.String,
    xpub: java.lang.String,
    xpubSegwit: java.lang.String = null
  ): PublicKey = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("chainCode")(chainCode)
    __obj.updateDynamic("childNum")(childNum)
    __obj.updateDynamic("depth")(depth)
    __obj.updateDynamic("fingerprint")(fingerprint)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("publicKey")(publicKey)
    __obj.updateDynamic("serializedPath")(serializedPath)
    __obj.updateDynamic("xpub")(xpub)
    if (xpubSegwit != null) __obj.updateDynamic("xpubSegwit")(xpubSegwit)
    __obj.asInstanceOf[PublicKey]
  }
}

