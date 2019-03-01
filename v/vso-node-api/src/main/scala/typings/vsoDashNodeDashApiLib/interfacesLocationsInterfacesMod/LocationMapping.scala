package typings
package vsoDashNodeDashApiLib.interfacesLocationsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationMapping extends js.Object {
  var accessMappingMoniker: java.lang.String
  var location: java.lang.String
}

object LocationMapping {
  @scala.inline
  def apply(accessMappingMoniker: java.lang.String, location: java.lang.String): LocationMapping = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accessMappingMoniker")(accessMappingMoniker)
    __obj.updateDynamic("location")(location)
    __obj.asInstanceOf[LocationMapping]
  }
}

