package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeZoneList extends js.Object {
  var utcTimeZone: TimeZone
  var validTimeZones: js.Array[TimeZone]
}

object TimeZoneList {
  @scala.inline
  def apply(utcTimeZone: TimeZone, validTimeZones: js.Array[TimeZone]): TimeZoneList = {
    val __obj = js.Dynamic.literal(utcTimeZone = utcTimeZone.asInstanceOf[js.Any], validTimeZones = validTimeZones.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeZoneList]
  }
}

