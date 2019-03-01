package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineReference extends js.Object {
  var changeId: scala.Double
  var id: java.lang.String
  var location: java.lang.String
}

object TimelineReference {
  @scala.inline
  def apply(changeId: scala.Double, id: java.lang.String, location: java.lang.String): TimelineReference = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("changeId")(changeId)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("location")(location)
    __obj.asInstanceOf[TimelineReference]
  }
}

