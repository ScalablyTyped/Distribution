package typings
package tempDashFileLib.tempDashFileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("temp-file", "TmpDir")
@js.native
class TmpDir () extends js.Object {
  def this(debugName: java.lang.String) = this()
  val debugName: js.Any = js.native
  var registered: js.Any = js.native
  val rootTempDir: stdLib.Promise[java.lang.String] = js.native
  var tempFiles: js.Any = js.native
  def cleanup(): stdLib.Promise[_] = js.native
  def cleanupSync(): scala.Unit = js.native
  def createTempDir(): stdLib.Promise[java.lang.String] = js.native
  def createTempDir(options: GetTempFileOptions): stdLib.Promise[java.lang.String] = js.native
  def getTempDir(): stdLib.Promise[java.lang.String] = js.native
  def getTempDir(options: GetTempFileOptions): stdLib.Promise[java.lang.String] = js.native
  def getTempFile(): stdLib.Promise[java.lang.String] = js.native
  def getTempFile(options: GetTempFileOptions): stdLib.Promise[java.lang.String] = js.native
  def getTempFile(options: GetTempFileOptions, isDir: scala.Boolean): stdLib.Promise[java.lang.String] = js.native
}

