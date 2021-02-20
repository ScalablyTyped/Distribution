package typings.vscodeLanguageclient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CodeActionContext {
  
  /**
    * Creates a new CodeActionContext literal.
    */
  @JSImport("vscode-languageclient", "CodeActionContext.create")
  @js.native
  def create(diagnostics: js.Array[typings.vscodeLanguageserverTypes.mod.Diagnostic]): typings.vscodeLanguageserverTypes.mod.CodeActionContext = js.native
  @JSImport("vscode-languageclient", "CodeActionContext.create")
  @js.native
  def create(
    diagnostics: js.Array[typings.vscodeLanguageserverTypes.mod.Diagnostic],
    only: js.Array[typings.vscodeLanguageserverTypes.mod.CodeActionKind]
  ): typings.vscodeLanguageserverTypes.mod.CodeActionContext = js.native
  
  /**
    * Checks whether the given literal conforms to the [CodeActionContext](#CodeActionContext) interface.
    */
  @JSImport("vscode-languageclient", "CodeActionContext.is")
  @js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.CodeActionContext */ Boolean = js.native
}
