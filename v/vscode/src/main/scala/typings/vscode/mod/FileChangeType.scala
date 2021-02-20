package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FileChangeType extends StObject
@JSImport("vscode", "FileChangeType")
@js.native
object FileChangeType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileChangeType with Double] = js.native
  
  /**
    * The contents or metadata of a file have changed.
    */
  @js.native
  sealed trait Changed extends FileChangeType
  /* 1 */ val Changed: typings.vscode.mod.FileChangeType.Changed with Double = js.native
  
  /**
    * A file has been created.
    */
  @js.native
  sealed trait Created extends FileChangeType
  /* 2 */ val Created: typings.vscode.mod.FileChangeType.Created with Double = js.native
  
  /**
    * A file has been deleted.
    */
  @js.native
  sealed trait Deleted extends FileChangeType
  /* 3 */ val Deleted: typings.vscode.mod.FileChangeType.Deleted with Double = js.native
}
