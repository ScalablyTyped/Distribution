package typings.winrt.Windows.System.UserProfile

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Globalization.DayOfWeek
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGlobalizationPreferencesStatics extends js.Object {
  var calendars: IVectorView[String]
  var clocks: IVectorView[String]
  var currencies: IVectorView[String]
  var homeGeographicRegion: String
  var languages: IVectorView[String]
  var weekStartsOn: DayOfWeek
}

object IGlobalizationPreferencesStatics {
  @scala.inline
  def apply(
    calendars: IVectorView[String],
    clocks: IVectorView[String],
    currencies: IVectorView[String],
    homeGeographicRegion: String,
    languages: IVectorView[String],
    weekStartsOn: DayOfWeek
  ): IGlobalizationPreferencesStatics = {
    val __obj = js.Dynamic.literal(calendars = calendars, clocks = clocks, currencies = currencies, homeGeographicRegion = homeGeographicRegion, languages = languages, weekStartsOn = weekStartsOn)
  
    __obj.asInstanceOf[IGlobalizationPreferencesStatics]
  }
}

