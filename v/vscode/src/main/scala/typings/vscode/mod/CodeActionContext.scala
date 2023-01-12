package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeActionContext extends StObject {
  
  /**
    * An array of diagnostics.
    */
  val diagnostics: js.Array[Diagnostic]
  
  /**
    * Requested kind of actions to return.
    *
    * Actions not of this kind are filtered out before being shown by the [lightbulb](https://code.visualstudio.com/docs/editor/editingevolved#_code-action).
    */
  val only: js.UndefOr[CodeActionKind] = js.undefined
  
  /**
    * The reason why code actions were requested.
    */
  val triggerKind: CodeActionTriggerKind
}
object CodeActionContext {
  
  inline def apply(diagnostics: js.Array[Diagnostic], triggerKind: CodeActionTriggerKind): CodeActionContext = {
    val __obj = js.Dynamic.literal(diagnostics = diagnostics.asInstanceOf[js.Any], triggerKind = triggerKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeActionContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CodeActionContext] (val x: Self) extends AnyVal {
    
    inline def setDiagnostics(value: js.Array[Diagnostic]): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticsVarargs(value: Diagnostic*): Self = StObject.set(x, "diagnostics", js.Array(value*))
    
    inline def setOnly(value: CodeActionKind): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
    
    inline def setOnlyUndefined: Self = StObject.set(x, "only", js.undefined)
    
    inline def setTriggerKind(value: CodeActionTriggerKind): Self = StObject.set(x, "triggerKind", value.asInstanceOf[js.Any])
  }
}
