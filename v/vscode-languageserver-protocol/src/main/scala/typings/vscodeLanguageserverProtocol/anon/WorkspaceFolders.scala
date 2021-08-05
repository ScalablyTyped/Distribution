package typings.vscodeLanguageserverProtocol.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkspaceFolders extends StObject {
  
  /**
    * The client has support for workspace folders
    */
  var workspaceFolders: js.UndefOr[Boolean] = js.undefined
}
object WorkspaceFolders {
  
  inline def apply(): WorkspaceFolders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceFolders]
  }
  
  extension [Self <: WorkspaceFolders](x: Self) {
    
    inline def setWorkspaceFolders(value: Boolean): Self = StObject.set(x, "workspaceFolders", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceFoldersUndefined: Self = StObject.set(x, "workspaceFolders", js.undefined)
  }
}
