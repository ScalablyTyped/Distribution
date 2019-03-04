package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceEndpointReference extends ResourceReference {
  /**
    * The ID of the service endpoint.
    */
  var id: java.lang.String
}

object ServiceEndpointReference {
  @scala.inline
  def apply(alias: java.lang.String, id: java.lang.String): ServiceEndpointReference = {
    val __obj = js.Dynamic.literal(alias = alias, id = id)
  
    __obj.asInstanceOf[ServiceEndpointReference]
  }
}

