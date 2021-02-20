package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserverTypes.mod.CreateFileOptions
import typings.vscodeLanguageserverTypes.mod.DocumentUri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CreateFile {
  
  @JSImport("vscode-languageserver", "CreateFile.create")
  @js.native
  def create(uri: DocumentUri): typings.vscodeLanguageserverTypes.mod.CreateFile = js.native
  @JSImport("vscode-languageserver", "CreateFile.create")
  @js.native
  def create(uri: DocumentUri, options: CreateFileOptions): typings.vscodeLanguageserverTypes.mod.CreateFile = js.native
  
  @JSImport("vscode-languageserver", "CreateFile.is")
  @js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.CreateFile */ Boolean = js.native
}
