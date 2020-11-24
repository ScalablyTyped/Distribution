package typings.vscode.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CommentMode extends js.Object
@JSImport("vscode", "CommentMode")
@js.native
object CommentMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CommentMode with Double] = js.native
  
  /**
    * Displays the comment editor
    */
  @js.native
  sealed trait Editing extends CommentMode
  /* 0 */ @js.native
  object Editing extends TopLevel[Editing with Double]
  
  /**
    * Displays the preview of the comment
    */
  @js.native
  sealed trait Preview extends CommentMode
  /* 1 */ @js.native
  object Preview extends TopLevel[Preview with Double]
}
