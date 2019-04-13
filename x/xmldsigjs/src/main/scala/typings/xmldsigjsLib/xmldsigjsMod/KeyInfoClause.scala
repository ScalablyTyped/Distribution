package typings
package xmldsigjsLib.xmldsigjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs", "KeyInfoClause")
@js.native
abstract class KeyInfoClause () extends XmlSignatureObject {
  var Key: stdLib.CryptoKey | scala.Null = js.native
  def exportKey(alg: stdLib.Algorithm): js.Thenable[stdLib.CryptoKey] = js.native
  def importKey(key: stdLib.CryptoKey): js.Thenable[this.type] = js.native
}

