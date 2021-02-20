package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeActionContext extends StObject {
  
  /**
    * An array of diagnostics known on the client side overlapping the range provided to the
    * `textDocument/codeAction` request. They are provied so that the server knows which
    * errors are currently presented to the user for the given range. There is no guarantee
    * that these accurately reflect the error state of the resource. The primary parameter
    * to compute code actions is the provided range.
    */
  var diagnostics: js.Array[Diagnostic] = js.native
  
  /**
    * Requested kind of actions to return.
    *
    * Actions not of this kind are filtered out by the client before being shown. So servers
    * can omit computing them.
    */
  var only: js.UndefOr[js.Array[CodeActionKind]] = js.native
}
object CodeActionContext {
  
  @scala.inline
  def apply(diagnostics: js.Array[Diagnostic]): CodeActionContext = {
    val __obj = js.Dynamic.literal(diagnostics = diagnostics.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeActionContext]
  }
  
  /**
    * Creates a new CodeActionContext literal.
    */
  @JSImport("vscode-languageserver-types", "CodeActionContext.create")
  @js.native
  def create(diagnostics: js.Array[Diagnostic]): CodeActionContext = js.native
  @JSImport("vscode-languageserver-types", "CodeActionContext.create")
  @js.native
  def create(diagnostics: js.Array[Diagnostic], only: js.Array[CodeActionKind]): CodeActionContext = js.native
  
  /**
    * Checks whether the given literal conforms to the [CodeActionContext](#CodeActionContext) interface.
    */
  @JSImport("vscode-languageserver-types", "CodeActionContext.is")
  @js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.CodeActionContext */ Boolean = js.native
  
  @scala.inline
  implicit class CodeActionContextMutableBuilder[Self <: CodeActionContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDiagnostics(value: js.Array[Diagnostic]): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiagnosticsVarargs(value: Diagnostic*): Self = StObject.set(x, "diagnostics", js.Array(value :_*))
    
    @scala.inline
    def setOnly(value: js.Array[CodeActionKind]): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlyUndefined: Self = StObject.set(x, "only", js.undefined)
    
    @scala.inline
    def setOnlyVarargs(value: CodeActionKind*): Self = StObject.set(x, "only", js.Array(value :_*))
  }
}
