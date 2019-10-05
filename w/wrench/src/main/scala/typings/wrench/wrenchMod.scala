package typings.wrench

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wrench", JSImport.Namespace)
@js.native
object wrenchMod extends js.Object {
  @js.native
  class LineReader protected () extends js.Object {
    def this(filename: String) = this()
    def this(filename: String, bufferSize: Double) = this()
    def getBufferAndSetCurrentPosition(position: Double): Double = js.native
    def getNextLine(): String = js.native
    def hasNextLine(): Boolean = js.native
  }
  
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

