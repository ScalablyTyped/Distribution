package typings.xmlCrypto.mod

import typings.node.Buffer
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xml-crypto", "FileKeyInfo")
@js.native
class FileKeyInfo () extends js.Object {
  def this(file: String) = this()
  
  var file: String = js.native
  
  def getKey(): Buffer = js.native
  def getKey(keyInfo: Node): Buffer = js.native
  
  def getKeyInfo(): String = js.native
  def getKeyInfo(key: js.UndefOr[scala.Nothing], prefix: String): String = js.native
  def getKeyInfo(key: String): String = js.native
  def getKeyInfo(key: String, prefix: String): String = js.native
}
