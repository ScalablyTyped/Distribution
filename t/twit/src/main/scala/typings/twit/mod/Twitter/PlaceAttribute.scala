package typings.twit.mod.Twitter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaceAttribute extends StObject {
  
  @JSName("app:id")
  var appColonid: String
  
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
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: PlaceAttribute] (val x: Self) extends AnyVal {
    
    inline def setAppColonid(value: String): Self = StObject.set(x, "app:id", value.asInstanceOf[js.Any])
    
    inline def setIso3(value: String): Self = StObject.set(x, "iso3", value.asInstanceOf[js.Any])
    
    inline def setLocality(value: String): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
    
    inline def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    inline def setPostal_code(value: String): Self = StObject.set(x, "postal_code", value.asInstanceOf[js.Any])
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setStreet_address(value: String): Self = StObject.set(x, "street_address", value.asInstanceOf[js.Any])
    
    inline def setTwitter(value: String): Self = StObject.set(x, "twitter", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
