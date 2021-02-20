package typings.twit.mod.Twitter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaceAttribute extends StObject {
  
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
  implicit class PlaceAttributeMutableBuilder[Self <: PlaceAttribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppColonid(value: String): Self = StObject.set(x, "app:id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIso3(value: String): Self = StObject.set(x, "iso3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocality(value: String): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostal_code(value: String): Self = StObject.set(x, "postal_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreet_address(value: String): Self = StObject.set(x, "street_address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwitter(value: String): Self = StObject.set(x, "twitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
