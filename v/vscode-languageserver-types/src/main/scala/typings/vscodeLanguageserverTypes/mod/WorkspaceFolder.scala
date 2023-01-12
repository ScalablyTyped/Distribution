package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkspaceFolder extends StObject {
  
  /**
    * The name of the workspace folder. Used to refer to this
    * workspace folder in the user interface.
    */
  var name: String
  
  /**
    * The associated URI for this workspace folder.
    */
  var uri: URI
}
object WorkspaceFolder {
  
  inline def apply(name: String, uri: URI): WorkspaceFolder = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceFolder]
  }
  
  @JSImport("vscode-languageserver-types", "WorkspaceFolder")
  @js.native
  val ^ : js.Any = js.native
  
  inline def is(value: Any): /* is vscode-languageserver-types.vscode-languageserver-types.WorkspaceFolder */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.WorkspaceFolder */ Boolean]
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkspaceFolder] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setUri(value: URI): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
