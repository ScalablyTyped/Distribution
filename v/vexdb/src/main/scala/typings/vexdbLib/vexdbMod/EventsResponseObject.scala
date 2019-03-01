package typings
package vexdbLib.vexdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventsResponseObject extends ResponseObject {
  var divisions: js.Array[java.lang.String]
  var end: java.lang.String
  var key: java.lang.String
  var loc_address1: java.lang.String
  var loc_address2: java.lang.String
  var loc_city: java.lang.String
  var loc_country: java.lang.String
  var loc_postcode: java.lang.String
  var loc_region: java.lang.String
  var loc_venue: java.lang.String
  var name: java.lang.String
  var program: java.lang.String
  var season: java.lang.String
  var sku: java.lang.String
  var start: java.lang.String
}

object EventsResponseObject {
  @scala.inline
  def apply(
    divisions: js.Array[java.lang.String],
    end: java.lang.String,
    key: java.lang.String,
    loc_address1: java.lang.String,
    loc_address2: java.lang.String,
    loc_city: java.lang.String,
    loc_country: java.lang.String,
    loc_postcode: java.lang.String,
    loc_region: java.lang.String,
    loc_venue: java.lang.String,
    name: java.lang.String,
    program: java.lang.String,
    season: java.lang.String,
    sku: java.lang.String,
    start: java.lang.String
  ): EventsResponseObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("divisions")(divisions)
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("loc_address1")(loc_address1)
    __obj.updateDynamic("loc_address2")(loc_address2)
    __obj.updateDynamic("loc_city")(loc_city)
    __obj.updateDynamic("loc_country")(loc_country)
    __obj.updateDynamic("loc_postcode")(loc_postcode)
    __obj.updateDynamic("loc_region")(loc_region)
    __obj.updateDynamic("loc_venue")(loc_venue)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("program")(program)
    __obj.updateDynamic("season")(season)
    __obj.updateDynamic("sku")(sku)
    __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[EventsResponseObject]
  }
}

