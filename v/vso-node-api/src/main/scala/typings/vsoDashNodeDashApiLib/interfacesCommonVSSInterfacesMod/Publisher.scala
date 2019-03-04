package typings
package vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Publisher extends js.Object {
  /**
    * Name of the publishing service.
    */
  var name: java.lang.String
  /**
    * Service Owner Guid Eg. Tfs : 00025394-6065-48CA-87D9-7F5672854EF7
    */
  var serviceOwnerId: java.lang.String
}

object Publisher {
  @scala.inline
  def apply(name: java.lang.String, serviceOwnerId: java.lang.String): Publisher = {
    val __obj = js.Dynamic.literal(name = name, serviceOwnerId = serviceOwnerId)
  
    __obj.asInstanceOf[Publisher]
  }
}

