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
    val __obj = js.Dynamic.literal(iso3 = iso3, locality = locality, phone = phone, postal_code = postal_code, region = region, street_address = street_address, twitter = twitter, url = url)
    __obj.updateDynamic("app:id")(`app:id`)
    __obj.asInstanceOf[PlaceAttribute]
  }
}

