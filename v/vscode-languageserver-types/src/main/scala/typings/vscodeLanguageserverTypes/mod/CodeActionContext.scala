package typings.vscodeLanguageserverTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeActionContext extends js.Object {
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

@JSImport("vscode-languageserver-types", "CodeActionContext")
@js.native
object CodeActionContext extends js.Object {
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

