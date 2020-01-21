package typings.xmldsigjs.algorithmMod

import typings.std.BufferSource
import typings.std.Node
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHashAlgorithm extends IAlgorithm {
  def Digest(xml: String): js.Promise[Uint8Array] = js.native
  def Digest(xml: BufferSource): js.Promise[Uint8Array] = js.native
  def Digest(xml: Node): js.Promise[Uint8Array] = js.native
}

