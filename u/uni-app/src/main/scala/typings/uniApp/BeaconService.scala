package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BeaconService extends StObject {
  
  /**
    * 服务目前是否可用
    */
  var available: js.UndefOr[Boolean] = js.native
  
  /**
    * 目前是否处于搜索状态
    */
  var discovering: js.UndefOr[Boolean] = js.native
}
object BeaconService {
  
  @scala.inline
  def apply(): BeaconService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeaconService]
  }
  
  @scala.inline
  implicit class BeaconServiceMutableBuilder[Self <: BeaconService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailable(value: Boolean): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailableUndefined: Self = StObject.set(x, "available", js.undefined)
    
    @scala.inline
    def setDiscovering(value: Boolean): Self = StObject.set(x, "discovering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscoveringUndefined: Self = StObject.set(x, "discovering", js.undefined)
  }
}
