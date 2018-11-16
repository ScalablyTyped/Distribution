package typings
package winrtDashUwpLib.WindowsNs.SystemNs.UserProfileNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A static class for holding various user globalization preferences. */
@JSGlobal("Windows.System.UserProfile.GlobalizationPreferences")
@js.native
abstract class GlobalizationPreferences () extends js.Object

/** A static class for holding various user globalization preferences. */
@JSGlobal("Windows.System.UserProfile.GlobalizationPreferences")
@js.native
object GlobalizationPreferences extends js.Object {
  /** Gets the set of calendars that are preferred by the user, in order of preference. */
  var calendars: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String] = js.native
  /** Gets the set of clocks that are preferred by the user, in order of preference. */
  var clocks: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String] = js.native
  /** Gets the set of currencies that are preferred by the user, in order of preference. */
  var currencies: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String] = js.native
  /** Gets the user's home geographic region. */
  var homeGeographicRegion: java.lang.String = js.native
  /** Gets the set of languages that are preferred by the user, in order of preference. */
  var languages: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String] = js.native
  /** Gets the day of the week that is considered to be the first day of the week. */
  var weekStartsOn: winrtDashUwpLib.WindowsNs.GlobalizationNs.DayOfWeek = js.native
}

