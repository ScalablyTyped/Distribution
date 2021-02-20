package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Object containing gateways array. */
@js.native
trait GatewayList extends StObject {
  
  /** Array of configured gateway connections. */
  var gateways: js.UndefOr[js.Array[Gateway]] = js.native
}
object GatewayList {
  
  @scala.inline
  def apply(): GatewayList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GatewayList]
  }
  
  @scala.inline
  implicit class GatewayListMutableBuilder[Self <: GatewayList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGateways(value: js.Array[Gateway]): Self = StObject.set(x, "gateways", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewaysUndefined: Self = StObject.set(x, "gateways", js.undefined)
    
    @scala.inline
    def setGatewaysVarargs(value: Gateway*): Self = StObject.set(x, "gateways", js.Array(value :_*))
  }
}
