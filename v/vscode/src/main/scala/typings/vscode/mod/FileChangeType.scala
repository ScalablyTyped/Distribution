package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FileChangeType extends StObject
@JSImport("vscode", "FileChangeType")
@js.native
object FileChangeType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileChangeType & Double] = js.native
  
  /**
    * The contents or metadata of a file have changed.
    */
  @js.native
  sealed trait Changed
    extends StObject
       with FileChangeType
  /* 1 */ val Changed: typings.vscode.mod.FileChangeType.Changed & Double = js.native
  
  /**
    * A file has been created.
    */
  @js.native
  sealed trait Created
    extends StObject
       with FileChangeType
  /* 2 */ val Created: typings.vscode.mod.FileChangeType.Created & Double = js.native
  
  /**
    * A file has been deleted.
    */
  @js.native
  sealed trait Deleted
    extends StObject
       with FileChangeType
  /* 3 */ val Deleted: typings.vscode.mod.FileChangeType.Deleted & Double = js.native
}
