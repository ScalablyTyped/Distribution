package typings.timezonecomplete.parseMod

import typings.timezonecomplete.basicsMod.TimeStruct
import typings.timezonecomplete.timezoneMod.TimeZone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AwareTimeStruct extends js.Object {
  /**
    * The time struct
    */
  var time: TimeStruct
  /**
    * The time zone (can be undefined)
    */
  var zone: js.UndefOr[TimeZone] = js.undefined
}

object AwareTimeStruct {
  @scala.inline
  def apply(time: TimeStruct, zone: TimeZone = null): AwareTimeStruct = {
    val __obj = js.Dynamic.literal(time = time.asInstanceOf[js.Any])
    if (zone != null) __obj.updateDynamic("zone")(zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwareTimeStruct]
  }
}

