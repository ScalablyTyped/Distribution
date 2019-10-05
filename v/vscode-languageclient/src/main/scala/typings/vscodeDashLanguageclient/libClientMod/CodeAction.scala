package typings.vscodeDashLanguageclient.libClientMod

import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.CodeActionKind
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Command
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.WorkspaceEdit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "CodeAction")
@js.native
object CodeAction extends js.Object {
  /**
    * Creates a new code action.
    *
    * @param title The title of the code action.
    * @param command The command to execute.
    * @param kind The kind of the code action.
    */
  def create(title: String, command: Command): typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.CodeAction = js.native
  def create(title: String, command: Command, kind: CodeActionKind): typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.CodeAction = js.native
  /**
    * Creates a new code action.
    *
    * @param title The title of the code action.
    * @param command The command to execute.
    * @param kind The kind of the code action.
    */
  def create(title: String, edit: WorkspaceEdit): typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.CodeAction = js.native
  def create(title: String, edit: WorkspaceEdit, kind: CodeActionKind): typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.CodeAction = js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.CodeAction */ Boolean = js.native
}

