package typings.timezonecomplete.distLibParseMod

import typings.timezonecomplete.distLibBasicsMod.TimeStruct
import typings.timezonecomplete.distLibTimezoneMod.TimeZone
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
    val __obj = js.Dynamic.literal(time = time)
    if (zone != null) __obj.updateDynamic("zone")(zone)
    __obj.asInstanceOf[AwareTimeStruct]
  }
}

