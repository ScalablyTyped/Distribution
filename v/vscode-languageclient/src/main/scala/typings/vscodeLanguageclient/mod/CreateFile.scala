package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageserverTypes.mod.CreateFileOptions
import typings.vscodeLanguageserverTypes.mod.DocumentUri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CreateFile {
  
  @JSImport("vscode-languageclient", "CreateFile")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(uri: DocumentUri): typings.vscodeLanguageserverTypes.mod.CreateFile = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(uri.asInstanceOf[js.Any]).asInstanceOf[typings.vscodeLanguageserverTypes.mod.CreateFile]
  @scala.inline
  def create(uri: DocumentUri, options: CreateFileOptions): typings.vscodeLanguageserverTypes.mod.CreateFile = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(uri.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.CreateFile]
  
  @scala.inline
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.CreateFile */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.CreateFile */ Boolean]
}
