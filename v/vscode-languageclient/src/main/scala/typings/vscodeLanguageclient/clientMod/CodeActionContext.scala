package typings.vscodeLanguageclient.clientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CodeActionContext {
  
  @JSImport("vscode-languageclient/lib/client", "CodeActionContext")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new CodeActionContext literal.
    */
  @scala.inline
  def create(diagnostics: js.Array[typings.vscodeLanguageserverTypes.mod.Diagnostic]): typings.vscodeLanguageserverTypes.mod.CodeActionContext = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(diagnostics.asInstanceOf[js.Any]).asInstanceOf[typings.vscodeLanguageserverTypes.mod.CodeActionContext]
  @scala.inline
  def create(
    diagnostics: js.Array[typings.vscodeLanguageserverTypes.mod.Diagnostic],
    only: js.Array[typings.vscodeLanguageserverTypes.mod.CodeActionKind]
  ): typings.vscodeLanguageserverTypes.mod.CodeActionContext = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(diagnostics.asInstanceOf[js.Any], only.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.CodeActionContext]
  
  /**
    * Checks whether the given literal conforms to the [CodeActionContext](#CodeActionContext) interface.
    */
  @scala.inline
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.CodeActionContext */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.CodeActionContext */ Boolean]
}
