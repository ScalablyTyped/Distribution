package typings
package symlinkDashOrDashCopyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("symlink-or-copy", JSImport.Namespace)
@js.native
object symlinkDashOrDashCopyMod extends js.Object {
  val canSymlink: scala.Boolean = js.native
  val canSymlinkDirectory: scala.Boolean = js.native
  val canSymlinkFile: scala.Boolean = js.native
  def sync(srcPath: java.lang.String, destPath: java.lang.String): scala.Unit = js.native
}

