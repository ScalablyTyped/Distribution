package typings.vegaTypings

import typings.vegaTypings.exprMod.Expr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object onTriggerMod {
  
  trait OnMarkTrigger extends StObject {
    
    var modify: js.UndefOr[Expr] = js.undefined
    
    var trigger: Expr
    
    var values: js.UndefOr[Expr] = js.undefined
  }
  object OnMarkTrigger {
    
    inline def apply(trigger: Expr): OnMarkTrigger = {
      val __obj = js.Dynamic.literal(trigger = trigger.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnMarkTrigger]
    }
    
    extension [Self <: OnMarkTrigger](x: Self) {
      
      inline def setModify(value: Expr): Self = StObject.set(x, "modify", value.asInstanceOf[js.Any])
      
      inline def setModifyUndefined: Self = StObject.set(x, "modify", js.undefined)
      
      inline def setTrigger(value: Expr): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      inline def setValues(value: Expr): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    }
  }
  
  trait OnTrigger extends StObject {
    
    var insert: js.UndefOr[Expr] = js.undefined
    
    var modify: js.UndefOr[Expr] = js.undefined
    
    var remove: js.UndefOr[Boolean | Expr] = js.undefined
    
    var toggle: js.UndefOr[Expr] = js.undefined
    
    var trigger: Expr
    
    var values: js.UndefOr[Expr] = js.undefined
  }
  object OnTrigger {
    
    inline def apply(trigger: Expr): OnTrigger = {
      val __obj = js.Dynamic.literal(trigger = trigger.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnTrigger]
    }
    
    extension [Self <: OnTrigger](x: Self) {
      
      inline def setInsert(value: Expr): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
      
      inline def setInsertUndefined: Self = StObject.set(x, "insert", js.undefined)
      
      inline def setModify(value: Expr): Self = StObject.set(x, "modify", value.asInstanceOf[js.Any])
      
      inline def setModifyUndefined: Self = StObject.set(x, "modify", js.undefined)
      
      inline def setRemove(value: Boolean | Expr): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
      
      inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      inline def setToggle(value: Expr): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
      
      inline def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
      
      inline def setTrigger(value: Expr): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      inline def setValues(value: Expr): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    }
  }
}
