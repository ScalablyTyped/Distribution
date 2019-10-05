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
    val __obj = js.Dynamic.literal(iso3 = iso3, locality = locality, phone = phone, postal_code = postal_code, region = region, street_address = street_address, twitter = twitter, url = url)
    __obj.updateDynamic("app:id")(`app:id`)
    __obj.asInstanceOf[PlaceAttribute]
  }
}

