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
  
  inline def apply(uri: DocumentUri): CreateFile = {
    val __obj = js.Dynamic.literal(kind = "create", uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFile]
  }
  
  @JSImport("vscode-languageserver-types", "CreateFile")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(uri: DocumentUri): CreateFile = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(uri.asInstanceOf[js.Any]).asInstanceOf[CreateFile]
  inline def create(uri: DocumentUri, options: Unit, annotation: ChangeAnnotationIdentifier): CreateFile = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(uri.asInstanceOf[js.Any], options.asInstanceOf[js.Any], annotation.asInstanceOf[js.Any])).asInstanceOf[CreateFile]
  inline def create(uri: DocumentUri, options: CreateFileOptions): CreateFile = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(uri.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CreateFile]
  inline def create(uri: DocumentUri, options: CreateFileOptions, annotation: ChangeAnnotationIdentifier): CreateFile = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(uri.asInstanceOf[js.Any], options.asInstanceOf[js.Any], annotation.asInstanceOf[js.Any])).asInstanceOf[CreateFile]
  
  inline def is(value: Any): /* is vscode-languageserver-types.vscode-languageserver-types.CreateFile */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.CreateFile */ Boolean]
  
  extension [Self <: CreateFile](x: Self) {
    
    inline def setKind(value: create): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: CreateFileOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setUri(value: DocumentUri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
