package typings.webLocksApi

import typings.webLocksApi.webLocksApiStrings.exclusive
import typings.webLocksApi.webLocksApiStrings.shared
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LockInfo extends StObject {
  
  var clientId: js.UndefOr[String] = js.undefined
  
  var mode: js.UndefOr[exclusive | shared] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object LockInfo {
  
  inline def apply(): LockInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LockInfo]
  }
  
  extension [Self <: LockInfo](x: Self) {
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    inline def setMode(value: exclusive | shared): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
