package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkspaceFoldersChangeEvent extends StObject {
  
  /**
    * Added workspace folders.
    */
  val added: js.Array[WorkspaceFolder]
  
  /**
    * Removed workspace folders.
    */
  val removed: js.Array[WorkspaceFolder]
}
object WorkspaceFoldersChangeEvent {
  
  inline def apply(added: js.Array[WorkspaceFolder], removed: js.Array[WorkspaceFolder]): WorkspaceFoldersChangeEvent = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceFoldersChangeEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkspaceFoldersChangeEvent] (val x: Self) extends AnyVal {
    
    inline def setAdded(value: js.Array[WorkspaceFolder]): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
    
    inline def setAddedVarargs(value: WorkspaceFolder*): Self = StObject.set(x, "added", js.Array(value*))
    
    inline def setRemoved(value: js.Array[WorkspaceFolder]): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
    
    inline def setRemovedVarargs(value: WorkspaceFolder*): Self = StObject.set(x, "removed", js.Array(value*))
  }
}
