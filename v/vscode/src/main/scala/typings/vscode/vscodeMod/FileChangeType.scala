package typings.vscode.vscodeMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileChangeType with Double] = js.native
  /* 1 */ @js.native
  object Changed extends TopLevel[Changed with Double]
  
  /* 2 */ @js.native
  object Created extends TopLevel[Created with Double]
  
  /* 3 */ @js.native
  object Deleted extends TopLevel[Deleted with Double]
  
}

