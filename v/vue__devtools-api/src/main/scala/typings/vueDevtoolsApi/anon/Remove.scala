package typings.vueDevtoolsApi.anon

import typings.vueDevtoolsApi.hooksMod.EditStatePayload
import typings.vueDevtoolsApi.vueDevtoolsApiBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Remove
  extends StObject
     with EditStatePayload {
  
  var newKey: Unit
  
  var remove: `true`
  
  var value: Unit
}
object Remove {
  
  inline def apply(newKey: Unit, value: Unit): Remove = {
    val __obj = js.Dynamic.literal(newKey = newKey.asInstanceOf[js.Any], remove = true, value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Remove]
  }
  
  extension [Self <: Remove](x: Self) {
    
    inline def setNewKey(value: Unit): Self = StObject.set(x, "newKey", value.asInstanceOf[js.Any])
    
    inline def setRemove(value: `true`): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Unit): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
