package typings.vscodeDashLanguageclient.libClientMod

import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.DocumentUri
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.RenameFileOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "RenameFile")
@js.native
object RenameFile extends js.Object {
  def create(oldUri: DocumentUri, newUri: DocumentUri): typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.RenameFile = js.native
  def create(oldUri: DocumentUri, newUri: DocumentUri, options: RenameFileOptions): typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.RenameFile = js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.RenameFile */ Boolean = js.native
}

