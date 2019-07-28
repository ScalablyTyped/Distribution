package typings.wrench.wrenchMod

import typings.std.Error
import typings.wrench.Anon_Preserve
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wrench", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def chmodSyncRecursive(sourceDir: String, filemode: Double): Unit = js.native
  def chownSyncRecursive(sourceDir: String, uid: Double, gid: Double): Unit = js.native
  def copyDirRecursive(srcDir: String, newDir: String, fn: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def copyDirSyncRecursive(sourceDir: String, newDirLocation: String): Unit = js.native
  def copyDirSyncRecursive(sourceDir: String, newDirLocation: String, opts: Anon_Preserve): Unit = js.native
  def mkdirSyncRecursive(path: String, mode: Double): Unit = js.native
  def readdirRecursive(baseDir: String, fn: js.Function2[/* err */ Error, /* files */ js.Array[String], Unit]): Unit = js.native
  def readdirSyncRecursive(baseDir: String): js.Array[String] = js.native
  def rmdirRecursive(path: String, fn: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def rmdirSyncRecursive(path: String): Unit = js.native
  def rmdirSyncRecursive(path: String, failSilent: Boolean): Unit = js.native
}

