package typings.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceEndpointReference extends ResourceReference {
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
}

