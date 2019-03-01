package typings
package twitLib.twitMod.TwitNs.TwitterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaceAttribute extends js.Object {
  var `app:id`: java.lang.String
  var iso3: java.lang.String
  var locality: java.lang.String
  var phone: java.lang.String
  var postal_code: java.lang.String
  var region: java.lang.String
  var street_address: java.lang.String
  var twitter: java.lang.String
  var url: java.lang.String
}

object PlaceAttribute {
  @scala.inline
  def apply(
    `app:id`: java.lang.String,
    iso3: java.lang.String,
    locality: java.lang.String,
    phone: java.lang.String,
    postal_code: java.lang.String,
    region: java.lang.String,
    street_address: java.lang.String,
    twitter: java.lang.String,
    url: java.lang.String
  ): PlaceAttribute = {
    val __obj = js.Dynamic.literal(`app:id` = `app:id`)
    __obj.updateDynamic("iso3")(iso3)
    __obj.updateDynamic("locality")(locality)
    __obj.updateDynamic("phone")(phone)
    __obj.updateDynamic("postal_code")(postal_code)
    __obj.updateDynamic("region")(region)
    __obj.updateDynamic("street_address")(street_address)
    __obj.updateDynamic("twitter")(twitter)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[PlaceAttribute]
  }
}

