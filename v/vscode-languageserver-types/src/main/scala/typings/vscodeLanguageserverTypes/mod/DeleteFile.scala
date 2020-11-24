package typings.vscodeLanguageserverTypes.mod

import typings.vscodeLanguageserverTypes.vscodeLanguageserverTypesStrings.delete
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
@JSImport("vscode-languageserver-types", "DeleteFile")
@js.native
object DeleteFile extends js.Object {
  
  def create(uri: DocumentUri): DeleteFile = js.native
  def create(uri: DocumentUri, options: DeleteFileOptions): DeleteFile = js.native
  
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.DeleteFile */ Boolean = js.native
}
