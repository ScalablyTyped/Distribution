package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineReference extends js.Object {
  /**
    * The change ID.
    */
  var changeId: scala.Double
  /**
    * The ID of the timeline.
    */
  var id: java.lang.String
  /**
    * The REST URL of the timeline.
    */
  var url: java.lang.String
}

object TimelineReference {
  @scala.inline
  def apply(changeId: scala.Double, id: java.lang.String, url: java.lang.String): TimelineReference = {
    val __obj = js.Dynamic.literal(changeId = changeId, id = id, url = url)
  
    __obj.asInstanceOf[TimelineReference]
  }
}

