package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FileType extends js.Object

@JSImport("vscode", "FileType")
@js.native
object FileType extends js.Object {
  /**
  		 * A directory.
  		 */
  @js.native
  sealed trait Directory
    extends vscodeLib.vscodeMod.FileType
  
  /**
  		 * A regular file.
  		 */
  @js.native
  sealed trait File
    extends vscodeLib.vscodeMod.FileType
  
  /**
  		 * A symbolic link to a file.
  		 */
  @js.native
  sealed trait SymbolicLink
    extends vscodeLib.vscodeMod.FileType
  
  /**
  		 * The file type is unknown.
  		 */
  @js.native
  sealed trait Unknown
    extends vscodeLib.vscodeMod.FileType
  
  /* 2 */ val Directory: Directory with scala.Double = js.native
  /* 1 */ val File: File with scala.Double = js.native
  /* 64 */ val SymbolicLink: SymbolicLink with scala.Double = js.native
  /* 0 */ val Unknown: Unknown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vscodeLib.vscodeMod.FileType with scala.Double] = js.native
}

