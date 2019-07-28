package typings.vinylDashFs.vinylDashFsMod

import typings.node.NodeJSNs.ReadWriteStream
import typings.vinyl.vinylMod.File
import typings.vinylDashFs.Anon_Cwd
import typings.vinylDashFs.Anon_CwdDirMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vinyl-fs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def dest(folder: String): ReadWriteStream = js.native
  def dest(folder: String, opt: DestOptions): ReadWriteStream = js.native
  def dest(getFolderPath: js.Function1[/* file */ File, String]): ReadWriteStream = js.native
  def src(globs: String): ReadWriteStream = js.native
  def src(globs: String, opt: SrcOptions): ReadWriteStream = js.native
  def src(globs: js.Array[String]): ReadWriteStream = js.native
  def src(globs: js.Array[String], opt: SrcOptions): ReadWriteStream = js.native
  def symlink(folder: String): ReadWriteStream = js.native
  def symlink(folder: String, opts: Anon_Cwd): ReadWriteStream = js.native
  def symlink(getFolderPath: js.Function1[/* File */ File, String]): ReadWriteStream = js.native
  def symlink(getFolderPath: js.Function1[/* File */ File, String], opts: Anon_CwdDirMode): ReadWriteStream = js.native
}

