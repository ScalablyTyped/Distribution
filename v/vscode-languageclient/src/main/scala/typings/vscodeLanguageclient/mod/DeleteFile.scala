package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageserverTypes.mod.DeleteFileOptions
import typings.vscodeLanguageserverTypes.mod.DocumentUri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DeleteFile {
  
  @JSImport("vscode-languageclient", "DeleteFile")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(uri: DocumentUri): typings.vscodeLanguageserverTypes.mod.DeleteFile = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(uri.asInstanceOf[js.Any]).asInstanceOf[typings.vscodeLanguageserverTypes.mod.DeleteFile]
  @scala.inline
  def create(uri: DocumentUri, options: DeleteFileOptions): typings.vscodeLanguageserverTypes.mod.DeleteFile = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(uri.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.DeleteFile]
  
  @scala.inline
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.DeleteFile */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.DeleteFile */ Boolean]
}
