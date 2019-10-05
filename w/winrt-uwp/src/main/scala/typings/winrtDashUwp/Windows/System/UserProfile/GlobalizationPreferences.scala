package typings.winrtDashUwp.Windows.System.UserProfile

import typings.winrtDashUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtDashUwp.Windows.Globalization.DayOfWeek
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A static class for holding various user globalization preferences. */
@JSGlobal("Windows.System.UserProfile.GlobalizationPreferences")
@js.native
abstract class GlobalizationPreferences () extends js.Object

/* static members */
@JSGlobal("Windows.System.UserProfile.GlobalizationPreferences")
@js.native
object GlobalizationPreferences extends js.Object {
  /** Gets the set of calendars that are preferred by the user, in order of preference. */
  var calendars: IVectorView[String] = js.native
  /** Gets the set of clocks that are preferred by the user, in order of preference. */
  var clocks: IVectorView[String] = js.native
  /** Gets the set of currencies that are preferred by the user, in order of preference. */
  var currencies: IVectorView[String] = js.native
  /** Gets the user's home geographic region. */
  var homeGeographicRegion: String = js.native
  /** Gets the set of languages that are preferred by the user, in order of preference. */
  var languages: IVectorView[String] = js.native
  /** Gets the day of the week that is considered to be the first day of the week. */
  var weekStartsOn: DayOfWeek = js.native
}

