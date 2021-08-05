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
}
object CodeActionContext {
  
  inline def apply(diagnostics: js.Array[Diagnostic]): CodeActionContext = {
    val __obj = js.Dynamic.literal(diagnostics = diagnostics.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeActionContext]
  }
  
  extension [Self <: CodeActionContext](x: Self) {
    
    inline def setDiagnostics(value: js.Array[Diagnostic]): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticsVarargs(value: Diagnostic*): Self = StObject.set(x, "diagnostics", js.Array(value :_*))
    
    inline def setOnly(value: CodeActionKind): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
    
    inline def setOnlyUndefined: Self = StObject.set(x, "only", js.undefined)
  }
}
