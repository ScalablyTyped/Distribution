package typings.tryghostContentApi.mod

import typings.tryghostContentApi.anon.Posts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Author
  extends StObject
     with Identification
     with Metadata
     with GhostData {
  
  var bio: js.UndefOr[Nullable[String]] = js.undefined
  
  var count: js.UndefOr[Posts] = js.undefined
  
  var cover_image: js.UndefOr[Nullable[String]] = js.undefined
  
  var facebook: js.UndefOr[Nullable[String]] = js.undefined
  
  var location: js.UndefOr[Nullable[String]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var profile_image: js.UndefOr[Nullable[String]] = js.undefined
  
  var twitter: js.UndefOr[Nullable[String]] = js.undefined
  
  var url: js.UndefOr[Nullable[String]] = js.undefined
  
  var website: js.UndefOr[Nullable[String]] = js.undefined
}
object Author {
  
  inline def apply(id: String, slug: String): Author = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[Author]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Author] (val x: Self) extends AnyVal {
    
    inline def setBio(value: Nullable[String]): Self = StObject.set(x, "bio", value.asInstanceOf[js.Any])
    
    inline def setBioNull: Self = StObject.set(x, "bio", null)
    
    inline def setBioUndefined: Self = StObject.set(x, "bio", js.undefined)
    
    inline def setCount(value: Posts): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setCover_image(value: Nullable[String]): Self = StObject.set(x, "cover_image", value.asInstanceOf[js.Any])
    
    inline def setCover_imageNull: Self = StObject.set(x, "cover_image", null)
    
    inline def setCover_imageUndefined: Self = StObject.set(x, "cover_image", js.undefined)
    
    inline def setFacebook(value: Nullable[String]): Self = StObject.set(x, "facebook", value.asInstanceOf[js.Any])
    
    inline def setFacebookNull: Self = StObject.set(x, "facebook", null)
    
    inline def setFacebookUndefined: Self = StObject.set(x, "facebook", js.undefined)
    
    inline def setLocation(value: Nullable[String]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProfile_image(value: Nullable[String]): Self = StObject.set(x, "profile_image", value.asInstanceOf[js.Any])
    
    inline def setProfile_imageNull: Self = StObject.set(x, "profile_image", null)
    
    inline def setProfile_imageUndefined: Self = StObject.set(x, "profile_image", js.undefined)
    
    inline def setTwitter(value: Nullable[String]): Self = StObject.set(x, "twitter", value.asInstanceOf[js.Any])
    
    inline def setTwitterNull: Self = StObject.set(x, "twitter", null)
    
    inline def setTwitterUndefined: Self = StObject.set(x, "twitter", js.undefined)
    
    inline def setUrl(value: Nullable[String]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setWebsite(value: Nullable[String]): Self = StObject.set(x, "website", value.asInstanceOf[js.Any])
    
    inline def setWebsiteNull: Self = StObject.set(x, "website", null)
    
    inline def setWebsiteUndefined: Self = StObject.set(x, "website", js.undefined)
  }
}
