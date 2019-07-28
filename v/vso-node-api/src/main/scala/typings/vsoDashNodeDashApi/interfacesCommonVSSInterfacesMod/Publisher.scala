package typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Publisher extends js.Object {
  /**
    * Name of the publishing service.
    */
  var name: String
  /**
    * Service Owner Guid Eg. Tfs : 00025394-6065-48CA-87D9-7F5672854EF7
    */
  var serviceOwnerId: String
}

object Publisher {
  @scala.inline
  def apply(name: String, serviceOwnerId: String): Publisher = {
    val __obj = js.Dynamic.literal(name = name, serviceOwnerId = serviceOwnerId)
  
    __obj.asInstanceOf[Publisher]
  }
}

