package typings.vinylFs.mod

import typings.node.NodeJS.ReadWriteStream
import typings.vinyl.mod.File
import typings.vinylFs.AnonCwd
import typings.vinylFs.AnonCwdDirMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vinyl-fs", "symlink")
@js.native
object symlink extends js.Object {
  def apply(folder: String): ReadWriteStream = js.native
  def apply(folder: String, opts: AnonCwd): ReadWriteStream = js.native
  def apply(getFolderPath: js.Function1[/* File */ File, String]): ReadWriteStream = js.native
  def apply(getFolderPath: js.Function1[/* File */ File, String], opts: AnonCwdDirMode): ReadWriteStream = js.native
}

