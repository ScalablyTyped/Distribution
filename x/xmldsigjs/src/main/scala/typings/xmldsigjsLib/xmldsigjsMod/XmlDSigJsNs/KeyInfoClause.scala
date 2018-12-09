package typings
package xmldsigjsLib.xmldsigjsMod.XmlDSigJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyInfoClause
  extends xmlDashCoreLib.xmlDashCoreMod.XmlObject {
  var Key: stdLib.CryptoKey | scala.Null = js.native
  def exportKey(alg: stdLib.Algorithm): js.Thenable[stdLib.CryptoKey] = js.native
  def importKey(key: stdLib.CryptoKey): js.Thenable[this.type] = js.native
}

