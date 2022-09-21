package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageserverTypes.mod.DeleteFileOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DeleteFile {
  
  @JSImport("vscode-languageclient", "DeleteFile")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(uri: typings.vscodeLanguageserverTypes.mod.DocumentUri): typings.vscodeLanguageserverTypes.mod.DeleteFile = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(uri.asInstanceOf[js.Any]).asInstanceOf[typings.vscodeLanguageserverTypes.mod.DeleteFile]
  inline def create(
    uri: typings.vscodeLanguageserverTypes.mod.DocumentUri,
    options: Unit,
    annotation: typings.vscodeLanguageserverTypes.mod.ChangeAnnotationIdentifier
  ): typings.vscodeLanguageserverTypes.mod.DeleteFile = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(uri.asInstanceOf[js.Any], options.asInstanceOf[js.Any], annotation.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.DeleteFile]
  inline def create(uri: typings.vscodeLanguageserverTypes.mod.DocumentUri, options: DeleteFileOptions): typings.vscodeLanguageserverTypes.mod.DeleteFile = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(uri.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.DeleteFile]
  inline def create(
    uri: typings.vscodeLanguageserverTypes.mod.DocumentUri,
    options: DeleteFileOptions,
    annotation: typings.vscodeLanguageserverTypes.mod.ChangeAnnotationIdentifier
  ): typings.vscodeLanguageserverTypes.mod.DeleteFile = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(uri.asInstanceOf[js.Any], options.asInstanceOf[js.Any], annotation.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.DeleteFile]
  
  inline def is(value: Any): /* is vscode-languageserver-types.vscode-languageserver-types.DeleteFile */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.DeleteFile */ Boolean]
}
