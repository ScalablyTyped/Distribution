package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkspaceFolder
  extends StObject
     with ConfigurationScope {
  
  /**
    * The ordinal number of this workspace folder.
    */
  val index: Double
  
  /**
    * The name of this workspace folder. Defaults to
    * the basename of its [uri-path](#Uri.path)
    */
  val name: String
  
  /**
    * The associated uri for this workspace folder.
    *
    * *Note:* The [Uri](#Uri)-type was intentionally chosen such that future releases of the editor can support
    * workspace folders that are not stored on the local disk, e.g. `ftp://server/workspaces/foo`.
    */
  val uri: Uri
}
object WorkspaceFolder {
  
  inline def apply(index: Double, name: String, uri: Uri): WorkspaceFolder = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceFolder]
  }
  
  extension [Self <: WorkspaceFolder](x: Self) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setUri(value: Uri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
