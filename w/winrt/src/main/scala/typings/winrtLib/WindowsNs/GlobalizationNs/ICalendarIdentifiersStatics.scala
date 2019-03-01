package typings
package winrtLib.WindowsNs.GlobalizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICalendarIdentifiersStatics extends js.Object {
  var gregorian: java.lang.String
  var hebrew: java.lang.String
  var hijri: java.lang.String
  var japanese: java.lang.String
  var julian: java.lang.String
  var korean: java.lang.String
  var taiwan: java.lang.String
  var thai: java.lang.String
  var umAlQura: java.lang.String
}

object ICalendarIdentifiersStatics {
  @scala.inline
  def apply(
    gregorian: java.lang.String,
    hebrew: java.lang.String,
    hijri: java.lang.String,
    japanese: java.lang.String,
    julian: java.lang.String,
    korean: java.lang.String,
    taiwan: java.lang.String,
    thai: java.lang.String,
    umAlQura: java.lang.String
  ): ICalendarIdentifiersStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("gregorian")(gregorian)
    __obj.updateDynamic("hebrew")(hebrew)
    __obj.updateDynamic("hijri")(hijri)
    __obj.updateDynamic("japanese")(japanese)
    __obj.updateDynamic("julian")(julian)
    __obj.updateDynamic("korean")(korean)
    __obj.updateDynamic("taiwan")(taiwan)
    __obj.updateDynamic("thai")(thai)
    __obj.updateDynamic("umAlQura")(umAlQura)
    __obj.asInstanceOf[ICalendarIdentifiersStatics]
  }
}

