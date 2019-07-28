package typings.tmp.tmpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tmp", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def dir(cb: DirCallback): Unit = js.native
  def dir(options: DirOptions, cb: DirCallback): Unit = js.native
  def dirSync(): DirResult = js.native
  def dirSync(options: DirOptions): DirResult = js.native
  def file(cb: FileCallback): Unit = js.native
  def file(options: FileOptions, cb: FileCallback): Unit = js.native
  def fileSync(): FileResult = js.native
  def fileSync(options: FileOptions): FileResult = js.native
  def setGracefulCleanup(): Unit = js.native
  def tmpName(cb: TmpNameCallback): Unit = js.native
  def tmpName(options: TmpNameOptions, cb: TmpNameCallback): Unit = js.native
  def tmpNameSync(): String = js.native
  def tmpNameSync(options: TmpNameOptions): String = js.native
}

