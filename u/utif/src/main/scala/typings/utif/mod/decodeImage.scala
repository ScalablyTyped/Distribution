package typings.utif.mod

import typings.node.Buffer
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("utif", "decodeImage")
@js.native
object decodeImage extends js.Object {
  def apply(buffer: Buffer, ifd: IFD): Unit = js.native
  def apply(buffer: ArrayBuffer, ifd: IFD): Unit = js.native
}

