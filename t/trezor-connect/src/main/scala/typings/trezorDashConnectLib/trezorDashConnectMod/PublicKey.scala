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

