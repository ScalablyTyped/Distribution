package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserverTypes.mod.DeleteFileOptions
import typings.vscodeLanguageserverTypes.mod.DocumentUri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DeleteFile {
  
  @JSImport("vscode-languageserver", "DeleteFile.create")
  @js.native
  def create(uri: DocumentUri): typings.vscodeLanguageserverTypes.mod.DeleteFile = js.native
  @JSImport("vscode-languageserver", "DeleteFile.create")
  @js.native
  def create(uri: DocumentUri, options: DeleteFileOptions): typings.vscodeLanguageserverTypes.mod.DeleteFile = js.native
  
  @JSImport("vscode-languageserver", "DeleteFile.is")
  @js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.DeleteFile */ Boolean = js.native
}
