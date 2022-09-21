package typings.tableauJsApi

import typings.tableauJsApi.sheetMod.SheetSize
import typings.tableauJsApi.sheetMod.SheetSizeOptions
import typings.tableauJsApi.tableauJsApiStrings.ATLEAST
import typings.tableauJsApi.tableauJsApiStrings.ATMOST
import typings.tableauJsApi.tableauJsApiStrings.AUTOMATIC
import typings.tableauJsApi.tableauJsApiStrings.EXACTLY
import typings.tableauJsApi.tableauJsApiStrings.RANGE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Behavior
    extends StObject
       with SheetSizeOptions {
    
    var behavior: AUTOMATIC
  }
  object Behavior {
    
    inline def apply(): Behavior = {
      val __obj = js.Dynamic.literal(behavior = "AUTOMATIC")
      __obj.asInstanceOf[Behavior]
    }
    
    extension [Self <: Behavior](x: Self) {
      
      inline def setBehavior(value: AUTOMATIC): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
    }
  }
  
  trait BehaviorMaxSize
    extends StObject
       with SheetSizeOptions {
    
    var behavior: ATMOST
    
    var maxSize: SheetSize
  }
  object BehaviorMaxSize {
    
    inline def apply(maxSize: SheetSize): BehaviorMaxSize = {
      val __obj = js.Dynamic.literal(behavior = "ATMOST", maxSize = maxSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[BehaviorMaxSize]
    }
    
    extension [Self <: BehaviorMaxSize](x: Self) {
      
      inline def setBehavior(value: ATMOST): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
      
      inline def setMaxSize(value: SheetSize): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    }
  }
  
  trait MaxSize
    extends StObject
       with SheetSizeOptions {
    
    var behavior: EXACTLY | RANGE
    
    var maxSize: SheetSize
    
    var minSize: SheetSize
  }
  object MaxSize {
    
    inline def apply(behavior: EXACTLY | RANGE, maxSize: SheetSize, minSize: SheetSize): MaxSize = {
      val __obj = js.Dynamic.literal(behavior = behavior.asInstanceOf[js.Any], maxSize = maxSize.asInstanceOf[js.Any], minSize = minSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaxSize]
    }
    
    extension [Self <: MaxSize](x: Self) {
      
      inline def setBehavior(value: EXACTLY | RANGE): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
      
      inline def setMaxSize(value: SheetSize): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      inline def setMinSize(value: SheetSize): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
    }
  }
  
  trait MinSize
    extends StObject
       with SheetSizeOptions {
    
    var behavior: ATLEAST
    
    var minSize: SheetSize
  }
  object MinSize {
    
    inline def apply(minSize: SheetSize): MinSize = {
      val __obj = js.Dynamic.literal(behavior = "ATLEAST", minSize = minSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[MinSize]
    }
    
    extension [Self <: MinSize](x: Self) {
      
      inline def setBehavior(value: ATLEAST): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
      
      inline def setMinSize(value: SheetSize): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
    }
  }
}
