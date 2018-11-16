package typings
package winrtLib.WindowsNs.GlobalizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ICalendarFactory extends js.Object {
  def createCalendar(
    languages: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String],
    calendar: java.lang.String,
    clock: java.lang.String
  ): Calendar
  def createCalendarDefaultCalendarAndClock(languages: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String]): Calendar
}

