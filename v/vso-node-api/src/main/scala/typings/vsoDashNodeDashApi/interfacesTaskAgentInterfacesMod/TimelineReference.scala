package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineReference extends js.Object {
  var changeId: Double
  var id: String
  var location: String
}

object TimelineReference {
  @scala.inline
  def apply(changeId: Double, id: String, location: String): TimelineReference = {
    val __obj = js.Dynamic.literal(changeId = changeId, id = id, location = location)
  
    __obj.asInstanceOf[TimelineReference]
  }
}

