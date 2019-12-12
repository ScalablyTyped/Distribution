package typings.vscode.vscodeMod

import org.scalablytyped.runtime.TopLevel
import typings.vscode.vscodeMod.FileType.Directory
import typings.vscode.vscodeMod.FileType.File
import typings.vscode.vscodeMod.FileType.SymbolicLink
import typings.vscode.vscodeMod.FileType.Unknown
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileType with Double] = js.native
  /* 2 */ @js.native
  object Directory extends TopLevel[Directory with Double]
  
  /* 1 */ @js.native
  object File extends TopLevel[File with Double]
  
  /* 64 */ @js.native
  object SymbolicLink extends TopLevel[SymbolicLink with Double]
  
  /* 0 */ @js.native
  object Unknown extends TopLevel[Unknown with Double]
  
}

