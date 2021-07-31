package typings.vscodeLanguageserverTypes.mod

import typings.vscodeLanguageserverTypes.vscodeLanguageserverTypesStrings.create
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFile
  extends StObject
     with ResourceOperation {
  
  /**
    * A create
    */
  @JSName("kind")
  var kind_CreateFile: create
  
  /**
    * Additional options
    */
  var options: js.UndefOr[CreateFileOptions] = js.undefined
  
  /**
    * The resource to create.
    */
  var uri: DocumentUri
}
object CreateFile {
  
  @scala.inline
  def apply(uri: DocumentUri): CreateFile = {
    val __obj = js.Dynamic.literal(kind = "create", uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFile]
  }
  
  @JSImport("vscode-languageserver-types", "CreateFile")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(uri: DocumentUri): CreateFile = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(uri.asInstanceOf[js.Any]).asInstanceOf[CreateFile]
  @scala.inline
  def create(uri: DocumentUri, options: CreateFileOptions): CreateFile = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(uri.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CreateFile]
  
  @scala.inline
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.CreateFile */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.CreateFile */ Boolean]
  
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
