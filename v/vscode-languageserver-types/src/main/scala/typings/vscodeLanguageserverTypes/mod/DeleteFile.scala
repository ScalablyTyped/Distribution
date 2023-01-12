package typings.vscodeLanguageserverTypes.mod

import typings.vscodeLanguageserverTypes.vscodeLanguageserverTypesStrings.delete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFile
  extends StObject
     with ResourceOperation {
  
  /**
    * A delete
    */
  @JSName("kind")
  var kind_DeleteFile: delete
  
  /**
    * Delete options.
    */
  var options: js.UndefOr[DeleteFileOptions] = js.undefined
  
  /**
    * The file to delete.
    */
  var uri: DocumentUri
}
object DeleteFile {
  
  inline def apply(uri: DocumentUri): DeleteFile = {
    val __obj = js.Dynamic.literal(kind = "delete", uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFile]
  }
  
  @JSImport("vscode-languageserver-types", "DeleteFile")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(uri: DocumentUri): DeleteFile = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(uri.asInstanceOf[js.Any]).asInstanceOf[DeleteFile]
  inline def create(uri: DocumentUri, options: Unit, annotation: ChangeAnnotationIdentifier): DeleteFile = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(uri.asInstanceOf[js.Any], options.asInstanceOf[js.Any], annotation.asInstanceOf[js.Any])).asInstanceOf[DeleteFile]
  inline def create(uri: DocumentUri, options: DeleteFileOptions): DeleteFile = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(uri.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DeleteFile]
  inline def create(uri: DocumentUri, options: DeleteFileOptions, annotation: ChangeAnnotationIdentifier): DeleteFile = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(uri.asInstanceOf[js.Any], options.asInstanceOf[js.Any], annotation.asInstanceOf[js.Any])).asInstanceOf[DeleteFile]
  
  inline def is(value: Any): /* is vscode-languageserver-types.vscode-languageserver-types.DeleteFile */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.DeleteFile */ Boolean]
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteFile] (val x: Self) extends AnyVal {
    
    inline def setKind(value: delete): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: DeleteFileOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setUri(value: DocumentUri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
