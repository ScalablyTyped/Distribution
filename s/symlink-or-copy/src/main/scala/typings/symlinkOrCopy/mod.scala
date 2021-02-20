package typings.symlinkOrCopy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("symlink-or-copy", "canSymlink")
  @js.native
  val canSymlink: Boolean = js.native
  
  @JSImport("symlink-or-copy", "canSymlinkDirectory")
  @js.native
  val canSymlinkDirectory: Boolean = js.native
  
  @JSImport("symlink-or-copy", "canSymlinkFile")
  @js.native
  val canSymlinkFile: Boolean = js.native
  
  @JSImport("symlink-or-copy", "sync")
  @js.native
  def sync(srcPath: String, destPath: String): Unit = js.native
}
