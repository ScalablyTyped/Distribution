package typings.vscodeLanguageserverTypes.mod

import typings.vscodeLanguageserverTypes.vscodeLanguageserverTypesStrings.delete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteFile extends ResourceOperation {
  
  /**
    * A delete
    */
  @JSName("kind")
  var kind_DeleteFile: delete = js.native
  
  /**
    * Delete options.
    */
  var options: js.UndefOr[DeleteFileOptions] = js.native
  
  /**
    * The file to delete.
    */
  var uri: DocumentUri = js.native
}
object DeleteFile {
  
  @scala.inline
  def apply(kind: delete, uri: DocumentUri): DeleteFile = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFile]
  }
  
  @JSImport("vscode-languageserver-types", "DeleteFile.create")
  @js.native
  def create(uri: DocumentUri): DeleteFile = js.native
  @JSImport("vscode-languageserver-types", "DeleteFile.create")
  @js.native
  def create(uri: DocumentUri, options: DeleteFileOptions): DeleteFile = js.native
  
  @JSImport("vscode-languageserver-types", "DeleteFile.is")
  @js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.DeleteFile */ Boolean = js.native
  
  @scala.inline
  implicit class DeleteFileMutableBuilder[Self <: DeleteFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: delete): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: DeleteFileOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setUri(value: DocumentUri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
