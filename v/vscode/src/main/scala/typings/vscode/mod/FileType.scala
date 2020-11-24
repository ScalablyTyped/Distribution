package typings.vscode.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FileType extends js.Object
@JSImport("vscode", "FileType")
@js.native
object FileType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileType with Double] = js.native
  
  /**
    * A directory.
    */
  @js.native
  sealed trait Directory extends FileType
  /* 2 */ @js.native
  object Directory extends TopLevel[Directory with Double]
  
  /**
    * A regular file.
    */
  @js.native
  sealed trait File extends FileType
  /* 1 */ @js.native
  object File extends TopLevel[File with Double]
  
  /**
    * A symbolic link to a file.
    */
  @js.native
  sealed trait SymbolicLink extends FileType
  /* 64 */ @js.native
  object SymbolicLink extends TopLevel[SymbolicLink with Double]
  
  /**
    * The file type is unknown.
    */
  @js.native
  sealed trait Unknown extends FileType
  /* 0 */ @js.native
  object Unknown extends TopLevel[Unknown with Double]
}
