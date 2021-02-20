package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CommentMode extends StObject
@JSImport("vscode", "CommentMode")
@js.native
object CommentMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CommentMode with Double] = js.native
  
  /**
    * Displays the comment editor
    */
  @js.native
  sealed trait Editing extends CommentMode
  /* 0 */ val Editing: typings.vscode.mod.CommentMode.Editing with Double = js.native
  
  /**
    * Displays the preview of the comment
    */
  @js.native
  sealed trait Preview extends CommentMode
  /* 1 */ val Preview: typings.vscode.mod.CommentMode.Preview with Double = js.native
}
