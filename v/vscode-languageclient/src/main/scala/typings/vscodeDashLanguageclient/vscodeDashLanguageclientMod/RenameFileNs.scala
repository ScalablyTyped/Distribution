package typings.vscodeDashLanguageclient.vscodeDashLanguageclientMod

import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.RenameFile
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.RenameFileOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "RenameFile")
@js.native
object RenameFileNs extends js.Object {
  def create(oldUri: String, newUri: String): RenameFile = js.native
  def create(oldUri: String, newUri: String, options: RenameFileOptions): RenameFile = js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.RenameFile */ Boolean = js.native
}

