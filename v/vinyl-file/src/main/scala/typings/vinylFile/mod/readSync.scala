package typings.vinylFile.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vinyl-file", "readSync")
@js.native
object readSync extends js.Object {
  def apply(pth: String): VinylFile = js.native
  def apply(pth: String, opts: VinylFileOptions): VinylFile = js.native
}

