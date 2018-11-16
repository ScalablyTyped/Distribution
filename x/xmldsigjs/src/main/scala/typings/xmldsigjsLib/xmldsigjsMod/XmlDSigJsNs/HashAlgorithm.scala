package typings
package xmldsigjsLib.xmldsigjsMod.XmlDSigJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(xmldsigjsLib.xmldsigjsMod.XmlDSigJsNs.IHashAlgorithm because Would inherit conflicting mutable fields List(algorithm, namespaceURI))*/
@js.native
trait HashAlgorithm extends XmlAlgorithm {
  def Digest(xml: java.lang.String): stdLib.PromiseLike[stdLib.Uint8Array] = js.native
  def Digest(xml: stdLib.BufferSource): stdLib.PromiseLike[stdLib.Uint8Array] = js.native
  def Digest(xml: stdLib.Node): stdLib.PromiseLike[stdLib.Uint8Array] = js.native
}

