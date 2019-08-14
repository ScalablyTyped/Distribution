package typings.xmlDashCrypto.xmlDashCryptoMod

import typings.node.Buffer
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xml-crypto", "SignatureAlgorithm")
@js.native
class SignatureAlgorithm () extends js.Object {
  def getAlgorithmName(): String = js.native
  def getSignature(signedInfo: Node, signingKey: Buffer): String = js.native
}

