package typings.vexdb.responseObjectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventsResponseObject extends ResponseObject {
  var divisions: js.Array[String]
  var end: String
  var key: String
  var loc_address1: String
  var loc_address2: String
  var loc_city: String
  var loc_country: String
  var loc_postcode: String
  var loc_region: String
  var loc_venue: String
  var name: String
  var program: String
  var season: String
  var sku: String
  var start: String
}

object EventsResponseObject {
  @scala.inline
  def apply(
    divisions: js.Array[String],
    end: String,
    key: String,
    loc_address1: String,
    loc_address2: String,
    loc_city: String,
    loc_country: String,
    loc_postcode: String,
    loc_region: String,
    loc_venue: String,
    name: String,
    program: String,
    season: String,
    sku: String,
    start: String
  ): EventsResponseObject = {
    val __obj = js.Dynamic.literal(divisions = divisions.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], loc_address1 = loc_address1.asInstanceOf[js.Any], loc_address2 = loc_address2.asInstanceOf[js.Any], loc_city = loc_city.asInstanceOf[js.Any], loc_country = loc_country.asInstanceOf[js.Any], loc_postcode = loc_postcode.asInstanceOf[js.Any], loc_region = loc_region.asInstanceOf[js.Any], loc_venue = loc_venue.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], program = program.asInstanceOf[js.Any], season = season.asInstanceOf[js.Any], sku = sku.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventsResponseObject]
  }
}

