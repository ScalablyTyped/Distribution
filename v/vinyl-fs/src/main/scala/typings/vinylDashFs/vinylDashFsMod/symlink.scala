package typings.vinylDashFs.vinylDashFsMod

import typings.node.NodeJS.ReadWriteStream
import typings.vinyl.vinylMod.File
import typings.vinylDashFs.Anon_Cwd
import typings.vinylDashFs.Anon_CwdDirMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vinyl-fs", "symlink")
@js.native
object symlink extends js.Object {
  def apply(folder: String): ReadWriteStream = js.native
  def apply(folder: String, opts: Anon_Cwd): ReadWriteStream = js.native
  def apply(getFolderPath: js.Function1[/* File */ File, String]): ReadWriteStream = js.native
  def apply(getFolderPath: js.Function1[/* File */ File, String], opts: Anon_CwdDirMode): ReadWriteStream = js.native
}

