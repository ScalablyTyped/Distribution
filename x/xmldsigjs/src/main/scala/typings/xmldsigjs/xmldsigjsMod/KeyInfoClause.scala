package typings.xmldsigjs.xmldsigjsMod

import typings.std.Algorithm
import typings.std.CryptoKey
import typings.xmlDashCore.xmlDashCoreMod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs", "KeyInfoClause")
@js.native
abstract class KeyInfoClause () extends XmlObject {
  var Key: CryptoKey | Null = js.native
  def exportKey(alg: Algorithm): js.Thenable[CryptoKey] = js.native
  def importKey(key: CryptoKey): js.Thenable[this.type] = js.native
}

