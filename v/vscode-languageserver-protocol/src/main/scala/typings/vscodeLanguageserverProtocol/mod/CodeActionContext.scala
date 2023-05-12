package typings.vscodeLanguageserverProtocol.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CodeActionContext {
  
  @JSImport("vscode-languageserver-protocol", "CodeActionContext")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new CodeActionContext literal.
    */
  inline def create(diagnostics: js.Array[typings.vscodeLanguageserverTypes.mod.Diagnostic]): typings.vscodeLanguageserverTypes.mod.CodeActionContext = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(diagnostics.asInstanceOf[js.Any]).asInstanceOf[typings.vscodeLanguageserverTypes.mod.CodeActionContext]
  inline def create(
    diagnostics: js.Array[typings.vscodeLanguageserverTypes.mod.Diagnostic],
    only: js.Array[typings.vscodeLanguageserverTypes.mod.CodeActionKind]
  ): typings.vscodeLanguageserverTypes.mod.CodeActionContext = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(diagnostics.asInstanceOf[js.Any], only.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.CodeActionContext]
  inline def create(
    diagnostics: js.Array[typings.vscodeLanguageserverTypes.mod.Diagnostic],
    only: js.Array[typings.vscodeLanguageserverTypes.mod.CodeActionKind],
    triggerKind: typings.vscodeLanguageserverTypes.mod.CodeActionTriggerKind
  ): typings.vscodeLanguageserverTypes.mod.CodeActionContext = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(diagnostics.asInstanceOf[js.Any], only.asInstanceOf[js.Any], triggerKind.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.CodeActionContext]
  inline def create(
    diagnostics: js.Array[typings.vscodeLanguageserverTypes.mod.Diagnostic],
    only: Unit,
    triggerKind: typings.vscodeLanguageserverTypes.mod.CodeActionTriggerKind
  ): typings.vscodeLanguageserverTypes.mod.CodeActionContext = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(diagnostics.asInstanceOf[js.Any], only.asInstanceOf[js.Any], triggerKind.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.CodeActionContext]
  
  /**
    * Checks whether the given literal conforms to the {@link CodeActionContext} interface.
    */
  inline def is(value: Any): /* is vscode-languageserver-types.vscode-languageserver-types.CodeActionContext */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.CodeActionContext */ Boolean]
}
