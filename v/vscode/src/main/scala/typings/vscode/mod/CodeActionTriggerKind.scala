package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CodeActionTriggerKind extends StObject
@JSImport("vscode", "CodeActionTriggerKind")
@js.native
object CodeActionTriggerKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CodeActionTriggerKind & Double] = js.native
  
  /**
    * Code actions were requested automatically.
    *
    * This typically happens when current selection in a file changes, but can
    * also be triggered when file content changes.
    */
  @js.native
  sealed trait Automatic
    extends StObject
       with CodeActionTriggerKind
  /* 2 */ val Automatic: typings.vscode.mod.CodeActionTriggerKind.Automatic & Double = js.native
  
  /**
    * Code actions were explicitly requested by the user or by an extension.
    */
  @js.native
  sealed trait Invoke
    extends StObject
       with CodeActionTriggerKind
  /* 1 */ val Invoke: typings.vscode.mod.CodeActionTriggerKind.Invoke & Double = js.native
}
