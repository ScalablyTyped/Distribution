package typings.vscodeLanguageserver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "CodeActionContext")
@js.native
object CodeActionContext extends js.Object {
  /**
    * Creates a new CodeActionContext literal.
    */
  def create(diagnostics: js.Array[typings.vscodeLanguageserverTypes.mod.Diagnostic]): typings.vscodeLanguageserverTypes.mod.CodeActionContext = js.native
  def create(
    diagnostics: js.Array[typings.vscodeLanguageserverTypes.mod.Diagnostic],
    only: js.Array[typings.vscodeLanguageserverTypes.mod.CodeActionKind]
  ): typings.vscodeLanguageserverTypes.mod.CodeActionContext = js.native
  /**
    * Checks whether the given literal conforms to the [CodeActionContext](#CodeActionContext) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.CodeActionContext */ Boolean = js.native
}

