package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserverTypes.mod.DocumentUri
import typings.vscodeLanguageserverTypes.mod.RenameFileOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RenameFile {
  
  @JSImport("vscode-languageserver", "RenameFile")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(oldUri: DocumentUri, newUri: DocumentUri): typings.vscodeLanguageserverTypes.mod.RenameFile = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(oldUri.asInstanceOf[js.Any], newUri.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.RenameFile]
  @scala.inline
  def create(oldUri: DocumentUri, newUri: DocumentUri, options: RenameFileOptions): typings.vscodeLanguageserverTypes.mod.RenameFile = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(oldUri.asInstanceOf[js.Any], newUri.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.RenameFile]
  
  @scala.inline
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.RenameFile */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.RenameFile */ Boolean]
}
