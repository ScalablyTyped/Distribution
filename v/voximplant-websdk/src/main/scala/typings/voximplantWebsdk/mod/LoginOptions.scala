package typings.voximplantWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    VoxImplant login options
  */
trait LoginOptions extends StObject {
  
  /**
    *    If set to false Web SDK can be used only for ACD status management
    */
  var receiveCalls: js.UndefOr[Boolean] = js.undefined
  
  /**
    *    If set to true user presence will be changed automatically while a call
    */
  var serverPresenceControl: js.UndefOr[Boolean] = js.undefined
}
object LoginOptions {
  
  inline def apply(): LoginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoginOptions]
  }
  
  extension [Self <: LoginOptions](x: Self) {
    
    inline def setReceiveCalls(value: Boolean): Self = StObject.set(x, "receiveCalls", value.asInstanceOf[js.Any])
    
    inline def setReceiveCallsUndefined: Self = StObject.set(x, "receiveCalls", js.undefined)
    
    inline def setServerPresenceControl(value: Boolean): Self = StObject.set(x, "serverPresenceControl", value.asInstanceOf[js.Any])
    
    inline def setServerPresenceControlUndefined: Self = StObject.set(x, "serverPresenceControl", js.undefined)
  }
}
