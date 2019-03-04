package typings
package winrtLib.WindowsNs.SystemNs.UserProfileNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGlobalizationPreferencesStatics extends js.Object {
  var calendars: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String]
  var clocks: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String]
  var currencies: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String]
  var homeGeographicRegion: java.lang.String
  var languages: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String]
  var weekStartsOn: winrtLib.WindowsNs.GlobalizationNs.DayOfWeek
}

object IGlobalizationPreferencesStatics {
  @scala.inline
  def apply(
    calendars: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String],
    clocks: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String],
    currencies: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String],
    homeGeographicRegion: java.lang.String,
    languages: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String],
    weekStartsOn: winrtLib.WindowsNs.GlobalizationNs.DayOfWeek
  ): IGlobalizationPreferencesStatics = {
    val __obj = js.Dynamic.literal(calendars = calendars, clocks = clocks, currencies = currencies, homeGeographicRegion = homeGeographicRegion, languages = languages, weekStartsOn = weekStartsOn)
  
    __obj.asInstanceOf[IGlobalizationPreferencesStatics]
  }
}

