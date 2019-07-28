package typings.tarDashFs.tarDashFsMod

import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tar-fs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def extract(cwd: String): Writable = js.native
  def extract(cwd: String, opts: ExtractOptions): Writable = js.native
  def pack(cwd: String): Readable = js.native
  def pack(cwd: String, opts: PackOptions): Readable = js.native
}

