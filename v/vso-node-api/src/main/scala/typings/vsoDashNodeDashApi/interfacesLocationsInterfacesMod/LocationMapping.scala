package typings.vsoDashNodeDashApi.interfacesLocationsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationMapping extends js.Object {
  var accessMappingMoniker: String
  var location: String
}

object LocationMapping {
  @scala.inline
  def apply(accessMappingMoniker: String, location: String): LocationMapping = {
    val __obj = js.Dynamic.literal(accessMappingMoniker = accessMappingMoniker.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LocationMapping]
  }
}

