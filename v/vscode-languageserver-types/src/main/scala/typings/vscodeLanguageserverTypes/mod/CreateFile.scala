package typings.vscodeLanguageserverTypes.mod

import typings.vscodeLanguageserverTypes.vscodeLanguageserverTypesStrings.create
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateFile extends ResourceOperation {
  
  /**
    * A create
    */
  @JSName("kind")
  var kind_CreateFile: create = js.native
  
  /**
    * Additional options
    */
  var options: js.UndefOr[CreateFileOptions] = js.native
  
  /**
    * The resource to create.
    */
  var uri: DocumentUri = js.native
}
object CreateFile {
  
  @scala.inline
  def apply(kind: create, uri: DocumentUri): CreateFile = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFile]
  }
  
  @JSImport("vscode-languageserver-types", "CreateFile.create")
  @js.native
  def create(uri: DocumentUri): CreateFile = js.native
  @JSImport("vscode-languageserver-types", "CreateFile.create")
  @js.native
  def create(uri: DocumentUri, options: CreateFileOptions): CreateFile = js.native
  
  @JSImport("vscode-languageserver-types", "CreateFile.is")
  @js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.CreateFile */ Boolean = js.native
  
  @scala.inline
  implicit class CreateFileMutableBuilder[Self <: CreateFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: create): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: CreateFileOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setUri(value: DocumentUri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
