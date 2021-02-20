package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeLanguageserverTypes.mod.DocumentUri
import typings.vscodeLanguageserverTypes.mod.RenameFileOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RenameFile {
  
  @JSImport("vscode-languageserver-protocol", "RenameFile.create")
  @js.native
  def create(oldUri: DocumentUri, newUri: DocumentUri): typings.vscodeLanguageserverTypes.mod.RenameFile = js.native
  @JSImport("vscode-languageserver-protocol", "RenameFile.create")
  @js.native
  def create(oldUri: DocumentUri, newUri: DocumentUri, options: RenameFileOptions): typings.vscodeLanguageserverTypes.mod.RenameFile = js.native
  
  @JSImport("vscode-languageserver-protocol", "RenameFile.is")
  @js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.RenameFile */ Boolean = js.native
}
