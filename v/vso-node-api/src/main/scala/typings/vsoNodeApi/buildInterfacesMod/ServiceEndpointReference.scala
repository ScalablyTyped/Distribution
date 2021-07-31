package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceEndpointReference
  extends StObject
     with ResourceReference {
  
  /**
    * The ID of the service endpoint.
    */
  var id: String
}
object ServiceEndpointReference {
  
  @scala.inline
  def apply(alias: String, id: String): ServiceEndpointReference = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceEndpointReference]
  }
  
  @scala.inline
  implicit class ServiceEndpointReferenceMutableBuilder[Self <: ServiceEndpointReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
