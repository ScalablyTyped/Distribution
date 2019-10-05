package typings.tarDashFs.tarDashFsMod

import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tar-fs", "pack")
@js.native
object pack extends js.Object {
  def apply(cwd: String): Readable = js.native
  def apply(cwd: String, opts: PackOptions): Readable = js.native
}

