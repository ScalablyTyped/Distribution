package typings
package tarDashFsLib.tarDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tar-fs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def extract(cwd: java.lang.String): nodeLib.streamMod.Writable = js.native
  def extract(cwd: java.lang.String, opts: tarDashFsLib.tarDashFsMod.ExtractOptions): nodeLib.streamMod.Writable = js.native
  def pack(cwd: java.lang.String): nodeLib.streamMod.Readable = js.native
  def pack(cwd: java.lang.String, opts: tarDashFsLib.tarDashFsMod.PackOptions): nodeLib.streamMod.Readable = js.native
}

