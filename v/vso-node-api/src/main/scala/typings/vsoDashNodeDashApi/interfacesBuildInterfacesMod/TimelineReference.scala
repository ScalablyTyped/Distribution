package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineReference extends js.Object {
  /**
    * The change ID.
    */
  var changeId: Double
  /**
    * The ID of the timeline.
    */
  var id: String
  /**
    * The REST URL of the timeline.
    */
  var url: String
}

object TimelineReference {
  @scala.inline
  def apply(changeId: Double, id: String, url: String): TimelineReference = {
    val __obj = js.Dynamic.literal(changeId = changeId, id = id, url = url)
  
    __obj.asInstanceOf[TimelineReference]
  }
}

