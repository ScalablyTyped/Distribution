package typings.xmldsigjs.xmldsigjsMod

import typings.std.BufferSource
import typings.std.Node
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.xmldsigjs.xmldsigjsMod.IAlgorithm because Already inherited
- typings.xmldsigjs.xmldsigjsMod.IHashAlgorithm because var conflicts: algorithm, namespaceURI. Inlined Digest, Digest, Digest */ @JSImport("xmldsigjs", "HashAlgorithm")
@js.native
abstract class HashAlgorithm () extends XmlAlgorithm {
  def Digest(xml: String): js.Thenable[Uint8Array] = js.native
  def Digest(xml: BufferSource): js.Thenable[Uint8Array] = js.native
  def Digest(xml: Node): js.Thenable[Uint8Array] = js.native
}

