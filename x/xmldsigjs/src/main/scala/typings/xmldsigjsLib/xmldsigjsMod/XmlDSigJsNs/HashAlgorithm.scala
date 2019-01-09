package typings
package xmldsigjsLib.xmldsigjsMod.XmlDSigJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- xmldsigjsLib.xmldsigjsMod.XmlDSigJsNs.IHashAlgorithm because var conflicts: algorithm, namespaceURI. Inlined Digest, Digest, Digest */ @js.native
trait HashAlgorithm extends XmlAlgorithm {
  def Digest(xml: java.lang.String): js.Thenable[stdLib.Uint8Array] = js.native
  def Digest(xml: stdLib.BufferSource): js.Thenable[stdLib.Uint8Array] = js.native
  def Digest(xml: stdLib.Node): js.Thenable[stdLib.Uint8Array] = js.native
}

