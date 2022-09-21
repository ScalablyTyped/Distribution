package typings.vscodeLanguageserverTypes.mod

import typings.vscodeLanguageserverTypes.vscodeLanguageserverTypesStrings.rename
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenameFile
  extends StObject
     with ResourceOperation {
  
  /**
    * A rename
    */
  @JSName("kind")
  var kind_RenameFile: rename
  
  /**
    * The new location.
    */
  var newUri: DocumentUri
  
  /**
    * The old (existing) location.
    */
  var oldUri: DocumentUri
  
  /**
    * Rename options.
    */
  var options: js.UndefOr[RenameFileOptions] = js.undefined
}
object RenameFile {
  
  inline def apply(newUri: DocumentUri, oldUri: DocumentUri): RenameFile = {
    val __obj = js.Dynamic.literal(kind = "rename", newUri = newUri.asInstanceOf[js.Any], oldUri = oldUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenameFile]
  }
  
  @JSImport("vscode-languageserver-types", "RenameFile")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(oldUri: DocumentUri, newUri: DocumentUri): RenameFile = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(oldUri.asInstanceOf[js.Any], newUri.asInstanceOf[js.Any])).asInstanceOf[RenameFile]
  inline def create(oldUri: DocumentUri, newUri: DocumentUri, options: Unit, annotation: ChangeAnnotationIdentifier): RenameFile = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(oldUri.asInstanceOf[js.Any], newUri.asInstanceOf[js.Any], options.asInstanceOf[js.Any], annotation.asInstanceOf[js.Any])).asInstanceOf[RenameFile]
  inline def create(oldUri: DocumentUri, newUri: DocumentUri, options: RenameFileOptions): RenameFile = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(oldUri.asInstanceOf[js.Any], newUri.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RenameFile]
  inline def create(
    oldUri: DocumentUri,
    newUri: DocumentUri,
    options: RenameFileOptions,
    annotation: ChangeAnnotationIdentifier
  ): RenameFile = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(oldUri.asInstanceOf[js.Any], newUri.asInstanceOf[js.Any], options.asInstanceOf[js.Any], annotation.asInstanceOf[js.Any])).asInstanceOf[RenameFile]
  
  inline def is(value: Any): /* is vscode-languageserver-types.vscode-languageserver-types.RenameFile */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.RenameFile */ Boolean]
  
  extension [Self <: RenameFile](x: Self) {
    
    inline def setKind(value: rename): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setNewUri(value: DocumentUri): Self = StObject.set(x, "newUri", value.asInstanceOf[js.Any])
    
    inline def setOldUri(value: DocumentUri): Self = StObject.set(x, "oldUri", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: RenameFileOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
