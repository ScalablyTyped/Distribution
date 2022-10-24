package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionIndex extends StObject {
  
  var actionIndex: Double
  
  var parentDataHook: js.UndefOr[String] = js.undefined
}
object ActionIndex {
  
  inline def apply(actionIndex: Double): ActionIndex = {
    val __obj = js.Dynamic.literal(actionIndex = actionIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionIndex]
  }
  
  extension [Self <: ActionIndex](x: Self) {
    
    inline def setActionIndex(value: Double): Self = StObject.set(x, "actionIndex", value.asInstanceOf[js.Any])
    
    inline def setParentDataHook(value: String): Self = StObject.set(x, "parentDataHook", value.asInstanceOf[js.Any])
    
    inline def setParentDataHookUndefined: Self = StObject.set(x, "parentDataHook", js.undefined)
  }
}
