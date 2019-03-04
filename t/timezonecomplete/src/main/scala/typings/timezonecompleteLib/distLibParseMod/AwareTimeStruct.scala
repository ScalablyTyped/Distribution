package typings
package timezonecompleteLib.distLibParseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AwareTimeStruct extends js.Object {
  /**
    * The time struct
    */
  var time: timezonecompleteLib.distLibBasicsMod.TimeStruct
  /**
    * The time zone (can be undefined)
    */
  var zone: js.UndefOr[timezonecompleteLib.distLibTimezoneMod.TimeZone]
}

object AwareTimeStruct {
  @scala.inline
  def apply(
    time: timezonecompleteLib.distLibBasicsMod.TimeStruct,
    zone: timezonecompleteLib.distLibTimezoneMod.TimeZone = null
  ): AwareTimeStruct = {
    val __obj = js.Dynamic.literal(time = time)
    if (zone != null) __obj.updateDynamic("zone")(zone)
    __obj.asInstanceOf[AwareTimeStruct]
  }
}

