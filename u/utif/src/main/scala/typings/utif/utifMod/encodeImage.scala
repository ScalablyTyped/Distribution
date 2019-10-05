package typings.utif.utifMod

import typings.std.ArrayBuffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("utif", "encodeImage")
@js.native
object encodeImage extends js.Object {
  def apply(rgba: Uint8Array, w: Double, h: Double): ArrayBuffer = js.native
  def apply(rgba: Uint8Array, w: Double, h: Double, metadata: IFD): ArrayBuffer = js.native
}

