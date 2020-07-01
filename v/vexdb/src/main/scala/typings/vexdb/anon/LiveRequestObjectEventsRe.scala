package typings.vexdb.anon

import typings.vexdb.requestObjectsMod.Seasons
import typings.vexdb.requestObjectsMod.StringRequest
import typings.vexdb.responseObjectsMod.EventsResponseObject
import typings.vexdb.vexdbStrings.VEXU
import typings.vexdb.vexdbStrings.VRC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined vexdb.vexdb/out/methods/live.LiveRequestObject<vexdb.vexdb/out/constants/RequestObjects.EventsRequestObject> */
trait LiveRequestObjectEventsRe extends js.Object {
  var city: js.UndefOr[StringRequest[EventsResponseObject, String]] = js.undefined
  var country: js.UndefOr[StringRequest[EventsResponseObject, String]] = js.undefined
  var date: js.UndefOr[StringRequest[EventsResponseObject, String]] = js.undefined
  var end: js.UndefOr[StringRequest[EventsResponseObject, String]] = js.undefined
  var key: js.UndefOr[StringRequest[EventsResponseObject, String]] = js.undefined
  var limit_number: js.UndefOr[Double] = js.undefined
  var limit_start: js.UndefOr[Double] = js.undefined
  var loc_address1: js.UndefOr[StringRequest[EventsResponseObject, String]] = js.undefined
  var loc_address2: js.UndefOr[StringRequest[EventsResponseObject, String]] = js.undefined
  var loc_city: js.UndefOr[StringRequest[EventsResponseObject, String]] = js.undefined
  var loc_country: js.UndefOr[StringRequest[EventsResponseObject, String]] = js.undefined
  var loc_postcode: js.UndefOr[StringRequest[EventsResponseObject, String]] = js.undefined
  var loc_region: js.UndefOr[StringRequest[EventsResponseObject, String]] = js.undefined
  var loc_venue: js.UndefOr[StringRequest[EventsResponseObject, String]] = js.undefined
  var name: js.UndefOr[StringRequest[EventsResponseObject, String]] = js.undefined
  var prefetch: js.UndefOr[Boolean] = js.undefined
  var program: js.UndefOr[StringRequest[EventsResponseObject, VRC | VEXU]] = js.undefined
  var region: js.UndefOr[StringRequest[EventsResponseObject, String]] = js.undefined
  var season: js.UndefOr[StringRequest[EventsResponseObject, Seasons]] = js.undefined
  var sku: js.UndefOr[StringRequest[EventsResponseObject, String]] = js.undefined
  var start: js.UndefOr[StringRequest[EventsResponseObject, String]] = js.undefined
  var status: js.UndefOr[StringRequest[EventsResponseObject, String]] = js.undefined
  var team: js.UndefOr[String] = js.undefined
}

object LiveRequestObjectEventsRe {
  @scala.inline
  def apply(
    city: StringRequest[EventsResponseObject, String] = null,
    country: StringRequest[EventsResponseObject, String] = null,
    date: StringRequest[EventsResponseObject, String] = null,
    end: StringRequest[EventsResponseObject, String] = null,
    key: StringRequest[EventsResponseObject, String] = null,
    limit_number: js.UndefOr[Double] = js.undefined,
    limit_start: js.UndefOr[Double] = js.undefined,
    loc_address1: StringRequest[EventsResponseObject, String] = null,
    loc_address2: StringRequest[EventsResponseObject, String] = null,
    loc_city: StringRequest[EventsResponseObject, String] = null,
    loc_country: StringRequest[EventsResponseObject, String] = null,
    loc_postcode: StringRequest[EventsResponseObject, String] = null,
    loc_region: StringRequest[EventsResponseObject, String] = null,
    loc_venue: StringRequest[EventsResponseObject, String] = null,
    name: StringRequest[EventsResponseObject, String] = null,
    prefetch: js.UndefOr[Boolean] = js.undefined,
    program: StringRequest[EventsResponseObject, VRC | VEXU] = null,
    region: StringRequest[EventsResponseObject, String] = null,
    season: StringRequest[EventsResponseObject, Seasons] = null,
    sku: StringRequest[EventsResponseObject, String] = null,
    start: StringRequest[EventsResponseObject, String] = null,
    status: StringRequest[EventsResponseObject, String] = null,
    team: String = null
  ): LiveRequestObjectEventsRe = {
    val __obj = js.Dynamic.literal()
    if (city != null) __obj.updateDynamic("city")(city.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(limit_number)) __obj.updateDynamic("limit_number")(limit_number.get.asInstanceOf[js.Any])
    if (!js.isUndefined(limit_start)) __obj.updateDynamic("limit_start")(limit_start.get.asInstanceOf[js.Any])
    if (loc_address1 != null) __obj.updateDynamic("loc_address1")(loc_address1.asInstanceOf[js.Any])
    if (loc_address2 != null) __obj.updateDynamic("loc_address2")(loc_address2.asInstanceOf[js.Any])
    if (loc_city != null) __obj.updateDynamic("loc_city")(loc_city.asInstanceOf[js.Any])
    if (loc_country != null) __obj.updateDynamic("loc_country")(loc_country.asInstanceOf[js.Any])
    if (loc_postcode != null) __obj.updateDynamic("loc_postcode")(loc_postcode.asInstanceOf[js.Any])
    if (loc_region != null) __obj.updateDynamic("loc_region")(loc_region.asInstanceOf[js.Any])
    if (loc_venue != null) __obj.updateDynamic("loc_venue")(loc_venue.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(prefetch)) __obj.updateDynamic("prefetch")(prefetch.get.asInstanceOf[js.Any])
    if (program != null) __obj.updateDynamic("program")(program.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (season != null) __obj.updateDynamic("season")(season.asInstanceOf[js.Any])
    if (sku != null) __obj.updateDynamic("sku")(sku.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (team != null) __obj.updateDynamic("team")(team.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveRequestObjectEventsRe]
  }
}

