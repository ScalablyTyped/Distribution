package typings.webdriverio.buildTypesMod

import typings.webdriverio.anon.PointerType
import typings.webdriverio.webdriverioStrings.key
import typings.webdriverio.webdriverioStrings.pointer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Action extends StObject {
  
  var actions: js.Array[NoneActionEntity & PointerActionEntity & KeyActionEntity]
  
  var id: String
  
  var parameters: js.UndefOr[PointerType] = js.undefined
  
  var `type`: js.UndefOr[pointer | key] = js.undefined
}
object Action {
  
  inline def apply(actions: js.Array[NoneActionEntity & PointerActionEntity & KeyActionEntity], id: String): Action = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  
  extension [Self <: Action](x: Self) {
    
    inline def setActions(value: js.Array[NoneActionEntity & PointerActionEntity & KeyActionEntity]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsVarargs(value: (NoneActionEntity & PointerActionEntity & KeyActionEntity)*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: PointerType): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setType(value: pointer | key): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
