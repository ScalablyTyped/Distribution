package typings.vscode.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FileChangeType extends js.Object
@JSImport("vscode", "FileChangeType")
@js.native
object FileChangeType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileChangeType with Double] = js.native
  
  /**
    * The contents or metadata of a file have changed.
    */
  @js.native
  sealed trait Changed extends FileChangeType
  /* 1 */ @js.native
  object Changed extends TopLevel[Changed with Double]
  
  /**
    * A file has been created.
    */
  @js.native
  sealed trait Created extends FileChangeType
  /* 2 */ @js.native
  object Created extends TopLevel[Created with Double]
  
  /**
    * A file has been deleted.
    */
  @js.native
  sealed trait Deleted extends FileChangeType
  /* 3 */ @js.native
  object Deleted extends TopLevel[Deleted with Double]
}
