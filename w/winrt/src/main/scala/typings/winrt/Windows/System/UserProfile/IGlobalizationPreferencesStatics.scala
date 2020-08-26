package typings.winrt.Windows.System.UserProfile

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Globalization.DayOfWeek
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGlobalizationPreferencesStatics extends js.Object {
  var calendars: IVectorView[String] = js.native
  var clocks: IVectorView[String] = js.native
  var currencies: IVectorView[String] = js.native
  var homeGeographicRegion: String = js.native
  var languages: IVectorView[String] = js.native
  var weekStartsOn: DayOfWeek = js.native
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
    val __obj = js.Dynamic.literal(calendars = calendars.asInstanceOf[js.Any], clocks = clocks.asInstanceOf[js.Any], currencies = currencies.asInstanceOf[js.Any], homeGeographicRegion = homeGeographicRegion.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], weekStartsOn = weekStartsOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGlobalizationPreferencesStatics]
  }
  @scala.inline
  implicit class IGlobalizationPreferencesStaticsOps[Self <: IGlobalizationPreferencesStatics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCalendars(value: IVectorView[String]): Self = this.set("calendars", value.asInstanceOf[js.Any])
    @scala.inline
    def setClocks(value: IVectorView[String]): Self = this.set("clocks", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrencies(value: IVectorView[String]): Self = this.set("currencies", value.asInstanceOf[js.Any])
    @scala.inline
    def setHomeGeographicRegion(value: String): Self = this.set("homeGeographicRegion", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguages(value: IVectorView[String]): Self = this.set("languages", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeekStartsOn(value: DayOfWeek): Self = this.set("weekStartsOn", value.asInstanceOf[js.Any])
  }
  
}

