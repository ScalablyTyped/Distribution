package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timeline extends TimelineReference {
  /**
    * The process or person that last changed the timeline.
    */
  var lastChangedBy: java.lang.String
  /**
    * The time the timeline was last changed.
    */
  var lastChangedOn: stdLib.Date
  var records: js.Array[TimelineRecord]
}

