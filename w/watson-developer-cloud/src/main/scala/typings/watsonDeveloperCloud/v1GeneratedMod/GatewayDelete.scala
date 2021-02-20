package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Gatway deletion confirmation. */
@js.native
trait GatewayDelete extends StObject {
  
  /** The gateway ID of the deleted gateway. */
  var gateway_id: js.UndefOr[String] = js.native
  
  /** The status of the request. */
  var status: js.UndefOr[String] = js.native
}
object GatewayDelete {
  
  @scala.inline
  def apply(): GatewayDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GatewayDelete]
  }
  
  @scala.inline
  implicit class GatewayDeleteMutableBuilder[Self <: GatewayDelete] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGateway_id(value: String): Self = StObject.set(x, "gateway_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGateway_idUndefined: Self = StObject.set(x, "gateway_id", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
