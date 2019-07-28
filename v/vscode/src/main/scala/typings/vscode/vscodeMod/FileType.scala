package typings.vscode.vscodeMod

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
  sealed trait Directory extends FileType
  
  /**
  		 * A regular file.
  		 */
  @js.native
  sealed trait File extends FileType
  
  /**
  		 * A symbolic link to a file.
  		 */
  @js.native
  sealed trait SymbolicLink extends FileType
  
  /**
  		 * The file type is unknown.
  		 */
  @js.native
  sealed trait Unknown extends FileType
  
  /* 2 */ val Directory: typings.vscode.vscodeMod.FileType.Directory with Double = js.native
  /* 1 */ val File: typings.vscode.vscodeMod.FileType.File with Double = js.native
  /* 64 */ val SymbolicLink: typings.vscode.vscodeMod.FileType.SymbolicLink with Double = js.native
  /* 0 */ val Unknown: typings.vscode.vscodeMod.FileType.Unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileType with Double] = js.native
}

