package typings.vscodeLanguageserver.anon

import typings.vscodeLanguageserverProtocol.libCommonProtocolDotnotebookMod.NotebookCell
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Added extends StObject {
  
  /**
    * The cells that got added.
    */
  var added: js.Array[NotebookCell]
  
  /**
    * The cells that changed.
    */
  var changed: Data
  
  /**
    * The cells that got removed.
    */
  var removed: js.Array[NotebookCell]
}
object Added {
  
  inline def apply(added: js.Array[NotebookCell], changed: Data, removed: js.Array[NotebookCell]): Added = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], changed = changed.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Added]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Added] (val x: Self) extends AnyVal {
    
    inline def setAdded(value: js.Array[NotebookCell]): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
    
    inline def setAddedVarargs(value: NotebookCell*): Self = StObject.set(x, "added", js.Array(value*))
    
    inline def setChanged(value: Data): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
    
    inline def setRemoved(value: js.Array[NotebookCell]): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
    
    inline def setRemovedVarargs(value: NotebookCell*): Self = StObject.set(x, "removed", js.Array(value*))
  }
}
