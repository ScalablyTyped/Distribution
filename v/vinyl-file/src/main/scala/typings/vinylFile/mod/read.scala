package typings.vinylFile.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vinyl-file", "read")
@js.native
object read extends js.Object {
  def apply(pth: String): js.Promise[VinylFile] = js.native
  def apply(pth: String, opts: VinylFileOptions): js.Promise[VinylFile] = js.native
}

