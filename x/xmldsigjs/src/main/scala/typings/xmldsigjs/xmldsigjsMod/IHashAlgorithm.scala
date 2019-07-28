package typings.xmldsigjs.xmldsigjsMod

import typings.std.BufferSource
import typings.std.Node
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHashAlgorithm extends IAlgorithm {
  def Digest(xml: String): js.Thenable[Uint8Array] = js.native
  def Digest(xml: BufferSource): js.Thenable[Uint8Array] = js.native
  def Digest(xml: Node): js.Thenable[Uint8Array] = js.native
}

