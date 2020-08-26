package typings.twit.mod.Twitter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlaceAttribute extends js.Object {
  @JSName("app:id")
  var appColonid: String = js.native
  var iso3: String = js.native
  var locality: String = js.native
  var phone: String = js.native
  var postal_code: String = js.native
  var region: String = js.native
  var street_address: String = js.native
  var twitter: String = js.native
  var url: String = js.native
}

object PlaceAttribute {
  @scala.inline
  def apply(
    appColonid: String,
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
    __obj.updateDynamic("app:id")(appColonid.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaceAttribute]
  }
  @scala.inline
  implicit class PlaceAttributeOps[Self <: PlaceAttribute] (val x: Self) extends AnyVal {
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
    def setAppColonid(value: String): Self = this.set("app:id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIso3(value: String): Self = this.set("iso3", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocality(value: String): Self = this.set("locality", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhone(value: String): Self = this.set("phone", value.asInstanceOf[js.Any])
    @scala.inline
    def setPostal_code(value: String): Self = this.set("postal_code", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def setStreet_address(value: String): Self = this.set("street_address", value.asInstanceOf[js.Any])
    @scala.inline
    def setTwitter(value: String): Self = this.set("twitter", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

