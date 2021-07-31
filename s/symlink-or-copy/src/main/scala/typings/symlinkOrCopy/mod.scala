package typings.symlinkOrCopy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("symlink-or-copy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("symlink-or-copy", "canSymlink")
  @js.native
  val canSymlink: Boolean = js.native
  
  @JSImport("symlink-or-copy", "canSymlinkDirectory")
  @js.native
  val canSymlinkDirectory: Boolean = js.native
  
  @JSImport("symlink-or-copy", "canSymlinkFile")
  @js.native
  val canSymlinkFile: Boolean = js.native
  
  @scala.inline
  def sync(srcPath: String, destPath: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(srcPath.asInstanceOf[js.Any], destPath.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
