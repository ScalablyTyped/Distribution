package typings
package vsoDashNodeDashApiLib.interfacesLocationsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceAreaInfo extends js.Object {
  var id: java.lang.String
  var locationUrl: java.lang.String
  var name: java.lang.String
}

object ResourceAreaInfo {
  @scala.inline
  def apply(id: java.lang.String, locationUrl: java.lang.String, name: java.lang.String): ResourceAreaInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("locationUrl")(locationUrl)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ResourceAreaInfo]
  }
}

