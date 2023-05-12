package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CommentThreadState extends StObject
@JSImport("vscode", "CommentThreadState")
@js.native
object CommentThreadState extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CommentThreadState & Double] = js.native
  
  @js.native
  sealed trait Resolved
    extends StObject
       with CommentThreadState
  /* 1 */ val Resolved: typings.vscode.mod.CommentThreadState.Resolved & Double = js.native
  
  @js.native
  sealed trait Unresolved
    extends StObject
       with CommentThreadState
  /* 0 */ val Unresolved: typings.vscode.mod.CommentThreadState.Unresolved & Double = js.native
}
