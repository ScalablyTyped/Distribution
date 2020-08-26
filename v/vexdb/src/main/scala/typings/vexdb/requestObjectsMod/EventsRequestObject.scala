package typings.vexdb.requestObjectsMod

import typings.vexdb.responseObjectsMod.EventsResponseObject
import typings.vexdb.vexdbStrings.end
import typings.vexdb.vexdbStrings.key
import typings.vexdb.vexdbStrings.loc_address1
import typings.vexdb.vexdbStrings.loc_address2
import typings.vexdb.vexdbStrings.loc_city
import typings.vexdb.vexdbStrings.loc_country
import typings.vexdb.vexdbStrings.loc_postcode
import typings.vexdb.vexdbStrings.loc_region
import typings.vexdb.vexdbStrings.loc_venue
import typings.vexdb.vexdbStrings.name
import typings.vexdb.vexdbStrings.program
import typings.vexdb.vexdbStrings.season
import typings.vexdb.vexdbStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventsRequestObject extends RequestObject {
  var city: js.UndefOr[String] = js.native
  var country: js.UndefOr[String] = js.native
  var date: js.UndefOr[String] = js.native
  var end: js.UndefOr[Filter[EventsResponseObject, typings.vexdb.vexdbStrings.end, String]] = js.native
  var key: js.UndefOr[Filter[EventsResponseObject, typings.vexdb.vexdbStrings.key, String]] = js.native
  var limit_number: js.UndefOr[Double] = js.native
  var limit_start: js.UndefOr[Double] = js.native
  var loc_address1: js.UndefOr[Filter[EventsResponseObject, typings.vexdb.vexdbStrings.loc_address1, String]] = js.native
  var loc_address2: js.UndefOr[Filter[EventsResponseObject, typings.vexdb.vexdbStrings.loc_address2, String]] = js.native
  var loc_city: js.UndefOr[Filter[EventsResponseObject, typings.vexdb.vexdbStrings.loc_city, String]] = js.native
  var loc_country: js.UndefOr[Filter[EventsResponseObject, typings.vexdb.vexdbStrings.loc_country, String]] = js.native
  var loc_postcode: js.UndefOr[Filter[EventsResponseObject, typings.vexdb.vexdbStrings.loc_postcode, String]] = js.native
  var loc_region: js.UndefOr[Filter[EventsResponseObject, typings.vexdb.vexdbStrings.loc_region, String]] = js.native
  var loc_venue: js.UndefOr[Filter[EventsResponseObject, typings.vexdb.vexdbStrings.loc_venue, String]] = js.native
  var name: js.UndefOr[Filter[EventsResponseObject, typings.vexdb.vexdbStrings.name, String]] = js.native
  var program: js.UndefOr[Filter[EventsResponseObject, typings.vexdb.vexdbStrings.program, Programs]] = js.native
  var region: js.UndefOr[String] = js.native
  var season: js.UndefOr[Filter[EventsResponseObject, typings.vexdb.vexdbStrings.season, Seasons]] = js.native
  var sku: js.UndefOr[String] = js.native
  var start: js.UndefOr[Filter[EventsResponseObject, typings.vexdb.vexdbStrings.start, String]] = js.native
  var status: js.UndefOr[String] = js.native
  var team: js.UndefOr[String] = js.native
}

object EventsRequestObject {
  @scala.inline
  def apply(): EventsRequestObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventsRequestObject]
  }
  @scala.inline
  implicit class EventsRequestObjectOps[Self <: EventsRequestObject] (val x: Self) extends AnyVal {
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
    def setCity(value: String): Self = this.set("city", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCity: Self = this.set("city", js.undefined)
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    @scala.inline
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setEndFunction2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, EventsResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("end", js.Any.fromFunction2(value))
    @scala.inline
    def setEnd(value: Filter[EventsResponseObject, end, String]): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setKeyFunction2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, EventsResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("key", js.Any.fromFunction2(value))
    @scala.inline
    def setKey(value: Filter[EventsResponseObject, key, String]): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setLimit_number(value: Double): Self = this.set("limit_number", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit_number: Self = this.set("limit_number", js.undefined)
    @scala.inline
    def setLimit_start(value: Double): Self = this.set("limit_start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit_start: Self = this.set("limit_start", js.undefined)
    @scala.inline
    def setLoc_address1Function2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, EventsResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("loc_address1", js.Any.fromFunction2(value))
    @scala.inline
    def setLoc_address1(value: Filter[EventsResponseObject, loc_address1, String]): Self = this.set("loc_address1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoc_address1: Self = this.set("loc_address1", js.undefined)
    @scala.inline
    def setLoc_address2Function2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, EventsResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("loc_address2", js.Any.fromFunction2(value))
    @scala.inline
    def setLoc_address2(value: Filter[EventsResponseObject, loc_address2, String]): Self = this.set("loc_address2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoc_address2: Self = this.set("loc_address2", js.undefined)
    @scala.inline
    def setLoc_cityFunction2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, EventsResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("loc_city", js.Any.fromFunction2(value))
    @scala.inline
    def setLoc_city(value: Filter[EventsResponseObject, loc_city, String]): Self = this.set("loc_city", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoc_city: Self = this.set("loc_city", js.undefined)
    @scala.inline
    def setLoc_countryFunction2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, EventsResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("loc_country", js.Any.fromFunction2(value))
    @scala.inline
    def setLoc_country(value: Filter[EventsResponseObject, loc_country, String]): Self = this.set("loc_country", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoc_country: Self = this.set("loc_country", js.undefined)
    @scala.inline
    def setLoc_postcodeFunction2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, EventsResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("loc_postcode", js.Any.fromFunction2(value))
    @scala.inline
    def setLoc_postcode(value: Filter[EventsResponseObject, loc_postcode, String]): Self = this.set("loc_postcode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoc_postcode: Self = this.set("loc_postcode", js.undefined)
    @scala.inline
    def setLoc_regionFunction2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, EventsResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("loc_region", js.Any.fromFunction2(value))
    @scala.inline
    def setLoc_region(value: Filter[EventsResponseObject, loc_region, String]): Self = this.set("loc_region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoc_region: Self = this.set("loc_region", js.undefined)
    @scala.inline
    def setLoc_venueFunction2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, EventsResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("loc_venue", js.Any.fromFunction2(value))
    @scala.inline
    def setLoc_venue(value: Filter[EventsResponseObject, loc_venue, String]): Self = this.set("loc_venue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoc_venue: Self = this.set("loc_venue", js.undefined)
    @scala.inline
    def setNameFunction2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, EventsResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("name", js.Any.fromFunction2(value))
    @scala.inline
    def setName(value: Filter[EventsResponseObject, name, String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setProgramFunction2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, EventsResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("program", js.Any.fromFunction2(value))
    @scala.inline
    def setProgram(value: Filter[EventsResponseObject, program, Programs]): Self = this.set("program", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgram: Self = this.set("program", js.undefined)
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    @scala.inline
    def setSeasonFunction2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, EventsResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("season", js.Any.fromFunction2(value))
    @scala.inline
    def setSeason(value: Filter[EventsResponseObject, season, Seasons]): Self = this.set("season", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeason: Self = this.set("season", js.undefined)
    @scala.inline
    def setSku(value: String): Self = this.set("sku", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSku: Self = this.set("sku", js.undefined)
    @scala.inline
    def setStartFunction2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, EventsResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("start", js.Any.fromFunction2(value))
    @scala.inline
    def setStart(value: Filter[EventsResponseObject, start, String]): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setTeam(value: String): Self = this.set("team", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTeam: Self = this.set("team", js.undefined)
  }
  
}

