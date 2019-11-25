package typings.twit.twitMod.Twitter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaceAttribute extends js.Object {
  var `app:id`: String
  var iso3: String
  var locality: String
  var phone: String
  var postal_code: String
  var region: String
  var street_address: String
  var twitter: String
  var url: String
}

object PlaceAttribute {
  @scala.inline
  def apply(
    `app:id`: String,
    iso3: String,
    locality: String,
    phone: String,
    postal_code: String,
    region: String,
    street_address: String,
    twitter: String,
    url: String
  ): PlaceAttribute = {
    val __obj = js.Dynamic.literal(iso3 = iso3.asInstanceOf[js.Any], locality = locality.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], postal_code = postal_code.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], street_address = street_address.asInstanceOf[js.Any], twitter = twitter.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("app:id")(`app:id`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaceAttribute]
  }
}

