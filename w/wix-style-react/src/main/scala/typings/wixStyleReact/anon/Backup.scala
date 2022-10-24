package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Backup extends StObject {
  
  var backup: Null
  
  var isDragging: Boolean
  
  var isInternalStateUpdate: Boolean
  
  var items: Any
  
  var movedItem: Null
}
object Backup {
  
  inline def apply(backup: Null, isDragging: Boolean, isInternalStateUpdate: Boolean, items: Any, movedItem: Null): Backup = {
    val __obj = js.Dynamic.literal(backup = backup.asInstanceOf[js.Any], isDragging = isDragging.asInstanceOf[js.Any], isInternalStateUpdate = isInternalStateUpdate.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], movedItem = movedItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[Backup]
  }
  
  extension [Self <: Backup](x: Self) {
    
    inline def setBackup(value: Null): Self = StObject.set(x, "backup", value.asInstanceOf[js.Any])
    
    inline def setIsDragging(value: Boolean): Self = StObject.set(x, "isDragging", value.asInstanceOf[js.Any])
    
    inline def setIsInternalStateUpdate(value: Boolean): Self = StObject.set(x, "isInternalStateUpdate", value.asInstanceOf[js.Any])
    
    inline def setItems(value: Any): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setMovedItem(value: Null): Self = StObject.set(x, "movedItem", value.asInstanceOf[js.Any])
  }
}
