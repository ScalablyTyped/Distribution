package typings
package vscodeDashLanguageserverLib.libMainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver/lib/main", "CodeAction")
@js.native
object CodeActionNs extends js.Object {
  /**
    * Creates a new code action.
    *
    * @param title The title of the code action.
    * @param command The command to execute.
    * @param kind The kind of the code action.
    */
  def create(
    title: java.lang.String,
    command: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Command
  ): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CodeAction = js.native
  def create(
    title: java.lang.String,
    command: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Command,
    kind: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CodeActionKind
  ): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CodeAction = js.native
  /**
    * Creates a new code action.
    *
    * @param title The title of the code action.
    * @param command The command to execute.
    * @param kind The kind of the code action.
    */
  def create(
    title: java.lang.String,
    edit: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.WorkspaceEdit
  ): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CodeAction = js.native
  def create(
    title: java.lang.String,
    edit: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.WorkspaceEdit,
    kind: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CodeActionKind
  ): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CodeAction = js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.CodeAction */ scala.Boolean = js.native
}

