package typings.vscodeLanguageserverTypes.mod

import typings.vscodeLanguageserverTypes.vscodeLanguageserverTypesStrings.rename
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenameFile extends ResourceOperation {
  
  /**
    * A rename
    */
  @JSName("kind")
  var kind_RenameFile: rename = js.native
  
  /**
    * The new location.
    */
  var newUri: DocumentUri = js.native
  
  /**
    * The old (existing) location.
    */
  var oldUri: DocumentUri = js.native
  
  /**
    * Rename options.
    */
  var options: js.UndefOr[RenameFileOptions] = js.native
}
object RenameFile {
  
  @scala.inline
  def apply(kind: rename, newUri: DocumentUri, oldUri: DocumentUri): RenameFile = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], newUri = newUri.asInstanceOf[js.Any], oldUri = oldUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenameFile]
  }
  
  @JSImport("vscode-languageserver-types", "RenameFile.create")
  @js.native
  def create(oldUri: DocumentUri, newUri: DocumentUri): RenameFile = js.native
  @JSImport("vscode-languageserver-types", "RenameFile.create")
  @js.native
  def create(oldUri: DocumentUri, newUri: DocumentUri, options: RenameFileOptions): RenameFile = js.native
  
  @JSImport("vscode-languageserver-types", "RenameFile.is")
  @js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.RenameFile */ Boolean = js.native
  
  @scala.inline
  implicit class RenameFileMutableBuilder[Self <: RenameFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: rename): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewUri(value: DocumentUri): Self = StObject.set(x, "newUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldUri(value: DocumentUri): Self = StObject.set(x, "oldUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: RenameFileOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
