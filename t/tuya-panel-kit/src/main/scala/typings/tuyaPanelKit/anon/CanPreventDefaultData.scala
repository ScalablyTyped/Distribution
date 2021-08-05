package typings.tuyaPanelKit.anon

import typings.tuyaPanelKit.tuyaPanelKitBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanPreventDefaultData extends StObject {
  
  var canPreventDefault: `true`
  
  var data: Action
}
object CanPreventDefaultData {
  
  inline def apply(data: Action): CanPreventDefaultData = {
    val __obj = js.Dynamic.literal(canPreventDefault = true, data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanPreventDefaultData]
  }
  
  extension [Self <: CanPreventDefaultData](x: Self) {
    
    inline def setCanPreventDefault(value: `true`): Self = StObject.set(x, "canPreventDefault", value.asInstanceOf[js.Any])
    
    inline def setData(value: Action): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
