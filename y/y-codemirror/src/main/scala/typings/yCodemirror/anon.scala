package typings.yCodemirror

import typings.yjs.mod.RelativePosition
import typings.yjs.mod.UndoManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Anchor extends StObject {
    
    var anchor: RelativePosition
    
    var head: RelativePosition
  }
  object Anchor {
    
    inline def apply(anchor: RelativePosition, head: RelativePosition): Anchor = {
      val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any])
      __obj.asInstanceOf[Anchor]
    }
    
    extension [Self <: Anchor](x: Self) {
      
      inline def setAnchor(value: RelativePosition): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      inline def setHead(value: RelativePosition): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
    }
  }
  
  trait ChangedParentTypes extends StObject {
    
    var changedParentTypes: Any
    
    var stackItem: Any
  }
  object ChangedParentTypes {
    
    inline def apply(changedParentTypes: Any, stackItem: Any): ChangedParentTypes = {
      val __obj = js.Dynamic.literal(changedParentTypes = changedParentTypes.asInstanceOf[js.Any], stackItem = stackItem.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChangedParentTypes]
    }
    
    extension [Self <: ChangedParentTypes](x: Self) {
      
      inline def setChangedParentTypes(value: Any): Self = StObject.set(x, "changedParentTypes", value.asInstanceOf[js.Any])
      
      inline def setStackItem(value: Any): Self = StObject.set(x, "stackItem", value.asInstanceOf[js.Any])
    }
  }
  
  trait StackItem extends StObject {
    
    var stackItem: Any
  }
  object StackItem {
    
    inline def apply(stackItem: Any): StackItem = {
      val __obj = js.Dynamic.literal(stackItem = stackItem.asInstanceOf[js.Any])
      __obj.asInstanceOf[StackItem]
    }
    
    extension [Self <: StackItem](x: Self) {
      
      inline def setStackItem(value: Any): Self = StObject.set(x, "stackItem", value.asInstanceOf[js.Any])
    }
  }
  
  trait YUndoManager extends StObject {
    
    var yUndoManager: js.UndefOr[UndoManager] = js.undefined
  }
  object YUndoManager {
    
    inline def apply(): YUndoManager = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[YUndoManager]
    }
    
    extension [Self <: YUndoManager](x: Self) {
      
      inline def setYUndoManager(value: UndoManager): Self = StObject.set(x, "yUndoManager", value.asInstanceOf[js.Any])
      
      inline def setYUndoManagerUndefined: Self = StObject.set(x, "yUndoManager", js.undefined)
    }
  }
}
