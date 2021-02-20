package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FileType extends StObject
@JSImport("vscode", "FileType")
@js.native
object FileType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileType with Double] = js.native
  
  /**
    * A directory.
    */
  @js.native
  sealed trait Directory extends FileType
  /* 2 */ val Directory: typings.vscode.mod.FileType.Directory with Double = js.native
  
  /**
    * A regular file.
    */
  @js.native
  sealed trait File extends FileType
  /* 1 */ val File: typings.vscode.mod.FileType.File with Double = js.native
  
  /**
    * A symbolic link to a file.
    */
  @js.native
  sealed trait SymbolicLink extends FileType
  /* 64 */ val SymbolicLink: typings.vscode.mod.FileType.SymbolicLink with Double = js.native
  
  /**
    * The file type is unknown.
    */
  @js.native
  sealed trait Unknown extends FileType
  /* 0 */ val Unknown: typings.vscode.mod.FileType.Unknown with Double = js.native
}
