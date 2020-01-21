package typings.utif.mod

import typings.node.Buffer
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("utif", "decode")
@js.native
object decode extends js.Object {
  def apply(buffer: Buffer): js.Array[IFD] = js.native
  def apply(buffer: ArrayBuffer): js.Array[IFD] = js.native
}

