package typings.vscodeDashLanguageserver.vscodeDashLanguageserverMod

import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.CodeActionKind
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Diagnostic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "CodeActionContext")
@js.native
object CodeActionContext extends js.Object {
  /**
    * Creates a new CodeActionContext literal.
    */
  def create(diagnostics: js.Array[Diagnostic]): typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.CodeActionContext = js.native
  def create(diagnostics: js.Array[Diagnostic], only: js.Array[CodeActionKind]): typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.CodeActionContext = js.native
  /**
    * Checks whether the given literal conforms to the [CodeActionContext](#CodeActionContext) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.CodeActionContext */ Boolean = js.native
}

