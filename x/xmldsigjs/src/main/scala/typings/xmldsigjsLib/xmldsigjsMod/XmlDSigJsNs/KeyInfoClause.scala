package typings
package xmldsigjsLib.xmldsigjsMod.XmlDSigJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyInfoClause
  extends xmlDashCoreLib.xmlDashCoreMod.XmlObject {
  var Key: stdLib.CryptoKey | scala.Null = js.native
  def exportKey(alg: stdLib.Algorithm): stdLib.PromiseLike[stdLib.CryptoKey] = js.native
  def importKey(key: stdLib.CryptoKey): stdLib.PromiseLike[this.type] = js.native
}

