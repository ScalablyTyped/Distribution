package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserverTypes.mod.CreateFileOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CreateFile {
  
  @JSImport("vscode-languageserver", "CreateFile")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(uri: typings.vscodeLanguageserverTypes.mod.DocumentUri): typings.vscodeLanguageserverTypes.mod.CreateFile = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(uri.asInstanceOf[js.Any]).asInstanceOf[typings.vscodeLanguageserverTypes.mod.CreateFile]
  inline def create(
    uri: typings.vscodeLanguageserverTypes.mod.DocumentUri,
    options: Unit,
    annotation: typings.vscodeLanguageserverTypes.mod.ChangeAnnotationIdentifier
  ): typings.vscodeLanguageserverTypes.mod.CreateFile = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(uri.asInstanceOf[js.Any], options.asInstanceOf[js.Any], annotation.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.CreateFile]
  inline def create(uri: typings.vscodeLanguageserverTypes.mod.DocumentUri, options: CreateFileOptions): typings.vscodeLanguageserverTypes.mod.CreateFile = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(uri.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.CreateFile]
  inline def create(
    uri: typings.vscodeLanguageserverTypes.mod.DocumentUri,
    options: CreateFileOptions,
    annotation: typings.vscodeLanguageserverTypes.mod.ChangeAnnotationIdentifier
  ): typings.vscodeLanguageserverTypes.mod.CreateFile = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(uri.asInstanceOf[js.Any], options.asInstanceOf[js.Any], annotation.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.CreateFile]
  
  inline def is(value: Any): /* is vscode-languageserver-types.vscode-languageserver-types.CreateFile */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.CreateFile */ Boolean]
}
