package typings.xmlDashCrypto.xmlDashCryptoMod

import typings.node.Buffer
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xml-crypto", "FileKeyInfo")
@js.native
class FileKeyInfo () extends js.Object {
  def this(file: String) = this()
  var file: String = js.native
  def getKey(): Buffer = js.native
  def getKey(keyInfo: Node): Buffer = js.native
  def getKeyInfo(): String = js.native
  def getKeyInfo(key: String): String = js.native
  def getKeyInfo(key: String, prefix: String): String = js.native
}

