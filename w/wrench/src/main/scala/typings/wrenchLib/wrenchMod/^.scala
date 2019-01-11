package typings
package wrenchLib.wrenchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wrench", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def chmodSyncRecursive(sourceDir: java.lang.String, filemode: scala.Double): scala.Unit = js.native
  def chownSyncRecursive(sourceDir: java.lang.String, uid: scala.Double, gid: scala.Double): scala.Unit = js.native
  def copyDirRecursive(
    srcDir: java.lang.String,
    newDir: java.lang.String,
    fn: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def copyDirSyncRecursive(sourceDir: java.lang.String, newDirLocation: java.lang.String): scala.Unit = js.native
  def copyDirSyncRecursive(sourceDir: java.lang.String, newDirLocation: java.lang.String, opts: wrenchLib.Anon_Preserve): scala.Unit = js.native
  def mkdirSyncRecursive(path: java.lang.String, mode: scala.Double): scala.Unit = js.native
  def readdirRecursive(
    baseDir: java.lang.String,
    fn: js.Function2[/* err */ stdLib.Error, /* files */ js.Array[java.lang.String], scala.Unit]
  ): scala.Unit = js.native
  def readdirSyncRecursive(baseDir: java.lang.String): js.Array[java.lang.String] = js.native
  def rmdirRecursive(path: java.lang.String, fn: js.Function1[/* err */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  def rmdirSyncRecursive(path: java.lang.String): scala.Unit = js.native
  def rmdirSyncRecursive(path: java.lang.String, failSilent: scala.Boolean): scala.Unit = js.native
}

