package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Object describing a specific gateway. */
trait Gateway extends StObject {
  
  /** The gateway ID of the gateway. */
  var gateway_id: js.UndefOr[String] = js.undefined
  
  /** The user defined name of the gateway. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The current status of the gateway. `connected` means the gateway is connected to the remotly installed gateway. `idle` means this gateway is not currently in use. */
  var status: js.UndefOr[String] = js.undefined
  
  /** The generated **token** for this gateway. The value of this field is used when configuring the remotly installed gateway. */
  var token: js.UndefOr[String] = js.undefined
  
  /** The generated **token_id** for this gateway. The value of this field is used when configuring the remotly installed gateway. */
  var token_id: js.UndefOr[String] = js.undefined
}
object Gateway {
  
  @scala.inline
  def apply(): Gateway = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Gateway]
  }
  
  @scala.inline
  implicit class GatewayMutableBuilder[Self <: Gateway] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGateway_id(value: String): Self = StObject.set(x, "gateway_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGateway_idUndefined: Self = StObject.set(x, "gateway_id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    
    @scala.inline
    def setToken_id(value: String): Self = StObject.set(x, "token_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken_idUndefined: Self = StObject.set(x, "token_id", js.undefined)
  }
}
