package typings.vexdb.vexdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventsRequestObject extends RequestObject {
  var city: js.UndefOr[StringRequest] = js.undefined
  var country: js.UndefOr[StringRequest] = js.undefined
  var date: js.UndefOr[StringRequest] = js.undefined
  var end: js.UndefOr[StringRequest] = js.undefined
  var key: js.UndefOr[StringRequest] = js.undefined
  var limit_number: js.UndefOr[Double] = js.undefined
  var limit_start: js.UndefOr[Double] = js.undefined
  var loc_address1: js.UndefOr[StringRequest] = js.undefined
  var loc_address2: js.UndefOr[StringRequest] = js.undefined
  var loc_city: js.UndefOr[StringRequest] = js.undefined
  var loc_country: js.UndefOr[StringRequest] = js.undefined
  var loc_postcode: js.UndefOr[StringRequest] = js.undefined
  var loc_region: js.UndefOr[StringRequest] = js.undefined
  var loc_venue: js.UndefOr[StringRequest] = js.undefined
  var name: js.UndefOr[StringRequest] = js.undefined
  var program: js.UndefOr[StringRequest] = js.undefined
  var region: js.UndefOr[StringRequest] = js.undefined
  var season: js.UndefOr[StringRequest] = js.undefined
  var sku: js.UndefOr[StringRequest] = js.undefined
  var start: js.UndefOr[StringRequest] = js.undefined
  var status: js.UndefOr[StringRequest] = js.undefined
}

object EventsRequestObject {
  @scala.inline
  def apply(
    city: StringRequest = null,
    country: StringRequest = null,
    date: StringRequest = null,
    end: StringRequest = null,
    key: StringRequest = null,
    limit_number: Int | Double = null,
    limit_start: Int | Double = null,
    loc_address1: StringRequest = null,
    loc_address2: StringRequest = null,
    loc_city: StringRequest = null,
    loc_country: StringRequest = null,
    loc_postcode: StringRequest = null,
    loc_region: StringRequest = null,
    loc_venue: StringRequest = null,
    name: StringRequest = null,
    program: StringRequest = null,
    region: StringRequest = null,
    season: StringRequest = null,
    sku: StringRequest = null,
    start: StringRequest = null,
    status: StringRequest = null
  ): EventsRequestObject = {
    val __obj = js.Dynamic.literal()
    if (city != null) __obj.updateDynamic("city")(city.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (limit_number != null) __obj.updateDynamic("limit_number")(limit_number.asInstanceOf[js.Any])
    if (limit_start != null) __obj.updateDynamic("limit_start")(limit_start.asInstanceOf[js.Any])
    if (loc_address1 != null) __obj.updateDynamic("loc_address1")(loc_address1.asInstanceOf[js.Any])
    if (loc_address2 != null) __obj.updateDynamic("loc_address2")(loc_address2.asInstanceOf[js.Any])
    if (loc_city != null) __obj.updateDynamic("loc_city")(loc_city.asInstanceOf[js.Any])
    if (loc_country != null) __obj.updateDynamic("loc_country")(loc_country.asInstanceOf[js.Any])
    if (loc_postcode != null) __obj.updateDynamic("loc_postcode")(loc_postcode.asInstanceOf[js.Any])
    if (loc_region != null) __obj.updateDynamic("loc_region")(loc_region.asInstanceOf[js.Any])
    if (loc_venue != null) __obj.updateDynamic("loc_venue")(loc_venue.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (program != null) __obj.updateDynamic("program")(program.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (season != null) __obj.updateDynamic("season")(season.asInstanceOf[js.Any])
    if (sku != null) __obj.updateDynamic("sku")(sku.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventsRequestObject]
  }
}

