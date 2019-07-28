package typings.symlinkDashOrDashCopy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("symlink-or-copy", JSImport.Namespace)
@js.native
object symlinkDashOrDashCopyMod extends js.Object {
  val canSymlink: Boolean = js.native
  val canSymlinkDirectory: Boolean = js.native
  val canSymlinkFile: Boolean = js.native
  def sync(srcPath: String, destPath: String): Unit = js.native
}

