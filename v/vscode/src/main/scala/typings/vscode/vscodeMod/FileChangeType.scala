package typings.vscode.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FileChangeType extends js.Object

@JSImport("vscode", "FileChangeType")
@js.native
object FileChangeType extends js.Object {
  /**
  		 * The contents or metadata of a file have changed.
  		 */
  @js.native
  sealed trait Changed extends FileChangeType
  
  /**
  		 * A file has been created.
  		 */
  @js.native
  sealed trait Created extends FileChangeType
  
  /**
  		 * A file has been deleted.
  		 */
  @js.native
  sealed trait Deleted extends FileChangeType
  
  /* 1 */ val Changed: typings.vscode.vscodeMod.FileChangeType.Changed with Double = js.native
  /* 2 */ val Created: typings.vscode.vscodeMod.FileChangeType.Created with Double = js.native
  /* 3 */ val Deleted: typings.vscode.vscodeMod.FileChangeType.Deleted with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileChangeType with Double] = js.native
}

