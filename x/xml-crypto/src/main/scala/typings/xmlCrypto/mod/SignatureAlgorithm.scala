package typings.xmlCrypto.mod

import typings.node.Buffer
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xml-crypto", "SignatureAlgorithm")
@js.native
class SignatureAlgorithm () extends js.Object {
  
  def getAlgorithmName(): String = js.native
  
  def getSignature(signedInfo: Node, signingKey: Buffer): String = js.native
}
