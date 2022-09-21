package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserverTypes.mod.RenameFileOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RenameFile {
  
  @JSImport("vscode-languageserver", "RenameFile")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(
    oldUri: typings.vscodeLanguageserverTypes.mod.DocumentUri,
    newUri: typings.vscodeLanguageserverTypes.mod.DocumentUri
  ): typings.vscodeLanguageserverTypes.mod.RenameFile = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(oldUri.asInstanceOf[js.Any], newUri.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.RenameFile]
  inline def create(
    oldUri: typings.vscodeLanguageserverTypes.mod.DocumentUri,
    newUri: typings.vscodeLanguageserverTypes.mod.DocumentUri,
    options: Unit,
    annotation: typings.vscodeLanguageserverTypes.mod.ChangeAnnotationIdentifier
  ): typings.vscodeLanguageserverTypes.mod.RenameFile = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(oldUri.asInstanceOf[js.Any], newUri.asInstanceOf[js.Any], options.asInstanceOf[js.Any], annotation.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.RenameFile]
  inline def create(
    oldUri: typings.vscodeLanguageserverTypes.mod.DocumentUri,
    newUri: typings.vscodeLanguageserverTypes.mod.DocumentUri,
    options: RenameFileOptions
  ): typings.vscodeLanguageserverTypes.mod.RenameFile = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(oldUri.asInstanceOf[js.Any], newUri.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.RenameFile]
  inline def create(
    oldUri: typings.vscodeLanguageserverTypes.mod.DocumentUri,
    newUri: typings.vscodeLanguageserverTypes.mod.DocumentUri,
    options: RenameFileOptions,
    annotation: typings.vscodeLanguageserverTypes.mod.ChangeAnnotationIdentifier
  ): typings.vscodeLanguageserverTypes.mod.RenameFile = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(oldUri.asInstanceOf[js.Any], newUri.asInstanceOf[js.Any], options.asInstanceOf[js.Any], annotation.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.RenameFile]
  
  inline def is(value: Any): /* is vscode-languageserver-types.vscode-languageserver-types.RenameFile */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.RenameFile */ Boolean]
}
