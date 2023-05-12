package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeActionContext extends StObject {
  
  /**
    * An array of diagnostics known on the client side overlapping the range provided to the
    * `textDocument/codeAction` request. They are provided so that the server knows which
    * errors are currently presented to the user for the given range. There is no guarantee
    * that these accurately reflect the error state of the resource. The primary parameter
    * to compute code actions is the provided range.
    */
  var diagnostics: js.Array[Diagnostic]
  
  /**
    * Requested kind of actions to return.
    *
    * Actions not of this kind are filtered out by the client before being shown. So servers
    * can omit computing them.
    */
  var only: js.UndefOr[js.Array[CodeActionKind]] = js.undefined
  
  /**
    * The reason why code actions were requested.
    *
    * @since 3.17.0
    */
  var triggerKind: js.UndefOr[CodeActionTriggerKind] = js.undefined
}
object CodeActionContext {
  
  inline def apply(diagnostics: js.Array[Diagnostic]): CodeActionContext = {
    val __obj = js.Dynamic.literal(diagnostics = diagnostics.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeActionContext]
  }
  
  @JSImport("vscode-languageserver-types", "CodeActionContext")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new CodeActionContext literal.
    */
  inline def create(diagnostics: js.Array[Diagnostic]): CodeActionContext = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(diagnostics.asInstanceOf[js.Any]).asInstanceOf[CodeActionContext]
  inline def create(diagnostics: js.Array[Diagnostic], only: js.Array[CodeActionKind]): CodeActionContext = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(diagnostics.asInstanceOf[js.Any], only.asInstanceOf[js.Any])).asInstanceOf[CodeActionContext]
  inline def create(
    diagnostics: js.Array[Diagnostic],
    only: js.Array[CodeActionKind],
    triggerKind: CodeActionTriggerKind
  ): CodeActionContext = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(diagnostics.asInstanceOf[js.Any], only.asInstanceOf[js.Any], triggerKind.asInstanceOf[js.Any])).asInstanceOf[CodeActionContext]
  inline def create(diagnostics: js.Array[Diagnostic], only: Unit, triggerKind: CodeActionTriggerKind): CodeActionContext = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(diagnostics.asInstanceOf[js.Any], only.asInstanceOf[js.Any], triggerKind.asInstanceOf[js.Any])).asInstanceOf[CodeActionContext]
  
  /**
    * Checks whether the given literal conforms to the {@link CodeActionContext} interface.
    */
  inline def is(value: Any): /* is vscode-languageserver-types.vscode-languageserver-types.CodeActionContext */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.CodeActionContext */ Boolean]
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CodeActionContext] (val x: Self) extends AnyVal {
    
    inline def setDiagnostics(value: js.Array[Diagnostic]): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticsVarargs(value: Diagnostic*): Self = StObject.set(x, "diagnostics", js.Array(value*))
    
    inline def setOnly(value: js.Array[CodeActionKind]): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
    
    inline def setOnlyUndefined: Self = StObject.set(x, "only", js.undefined)
    
    inline def setOnlyVarargs(value: CodeActionKind*): Self = StObject.set(x, "only", js.Array(value*))
    
    inline def setTriggerKind(value: CodeActionTriggerKind): Self = StObject.set(x, "triggerKind", value.asInstanceOf[js.Any])
    
    inline def setTriggerKindUndefined: Self = StObject.set(x, "triggerKind", js.undefined)
  }
}
