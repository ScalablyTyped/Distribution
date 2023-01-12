package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BeaconService extends StObject {
  
  /**
    * 服务目前是否可用
    */
  var available: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 目前是否处于搜索状态
    */
  var discovering: js.UndefOr[Boolean] = js.undefined
}
object BeaconService {
  
  inline def apply(): BeaconService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeaconService]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BeaconService] (val x: Self) extends AnyVal {
    
    inline def setAvailable(value: Boolean): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
    
    inline def setAvailableUndefined: Self = StObject.set(x, "available", js.undefined)
    
    inline def setDiscovering(value: Boolean): Self = StObject.set(x, "discovering", value.asInstanceOf[js.Any])
    
    inline def setDiscoveringUndefined: Self = StObject.set(x, "discovering", js.undefined)
  }
}
