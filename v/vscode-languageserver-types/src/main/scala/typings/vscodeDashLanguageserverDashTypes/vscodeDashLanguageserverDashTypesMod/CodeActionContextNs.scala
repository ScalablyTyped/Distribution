package typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-types", "CodeActionContext")
@js.native
object CodeActionContextNs extends js.Object {
  /**
    * Creates a new CodeActionContext literal.
    */
  def create(diagnostics: js.Array[Diagnostic]): CodeActionContext = js.native
  def create(diagnostics: js.Array[Diagnostic], only: js.Array[CodeActionKind]): CodeActionContext = js.native
  /**
    * Checks whether the given literal conforms to the [CodeActionContext](#CodeActionContext) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.CodeActionContext */ Boolean = js.native
}

