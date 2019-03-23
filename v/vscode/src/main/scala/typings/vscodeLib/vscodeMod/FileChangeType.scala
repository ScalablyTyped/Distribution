package typings
package vscodeLib.vscodeMod

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
  sealed trait Changed
    extends vscodeLib.vscodeMod.FileChangeType
  
  /**
  		 * A file has been created.
  		 */
  @js.native
  sealed trait Created
    extends vscodeLib.vscodeMod.FileChangeType
  
  /**
  		 * A file has been deleted.
  		 */
  @js.native
  sealed trait Deleted
    extends vscodeLib.vscodeMod.FileChangeType
  
  /* 1 */ val Changed: Changed with scala.Double = js.native
  /* 2 */ val Created: Created with scala.Double = js.native
  /* 3 */ val Deleted: Deleted with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vscodeLib.vscodeMod.FileChangeType with scala.Double] = js.native
}

