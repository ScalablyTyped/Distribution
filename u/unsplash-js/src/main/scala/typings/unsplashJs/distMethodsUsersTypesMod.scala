package typings.unsplashJs

import typings.unsplashJs.anon.Followers
import typings.unsplashJs.anon.Large
import typings.unsplashJs.distHelpersTypescriptMod.Nullable
import typings.unsplashJs.distMethodsPhotosTypesMod.VeryBasic
import typings.unsplashJs.distTypesEntitiesMod.Entity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMethodsUsersTypesMod {
  
  trait Basic
    extends StObject
       with Entity {
    
    var bio: Nullable[String]
    
    var first_name: String
    
    var instagram_username: Nullable[String]
    
    var last_name: Nullable[String]
    
    var links: Followers
    
    var location: Nullable[String]
    
    var name: String
    
    var portfolio_url: Nullable[String]
    
    var profile_image: Large
    
    var total_collections: Double
    
    var total_likes: Double
    
    var total_photos: Double
    
    var twitter_username: Nullable[String]
    
    var updated_at: String
    
    var username: String
  }
  object Basic {
    
    inline def apply(
      first_name: String,
      id: String,
      links: Followers,
      name: String,
      profile_image: Large,
      total_collections: Double,
      total_likes: Double,
      total_photos: Double,
      updated_at: String,
      username: String
    ): Basic = {
      val __obj = js.Dynamic.literal(first_name = first_name.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], profile_image = profile_image.asInstanceOf[js.Any], total_collections = total_collections.asInstanceOf[js.Any], total_likes = total_likes.asInstanceOf[js.Any], total_photos = total_photos.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], bio = null, instagram_username = null, last_name = null, location = null, portfolio_url = null, twitter_username = null)
      __obj.asInstanceOf[Basic]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Basic] (val x: Self) extends AnyVal {
      
      inline def setBio(value: Nullable[String]): Self = StObject.set(x, "bio", value.asInstanceOf[js.Any])
      
      inline def setBioNull: Self = StObject.set(x, "bio", null)
      
      inline def setFirst_name(value: String): Self = StObject.set(x, "first_name", value.asInstanceOf[js.Any])
      
      inline def setInstagram_username(value: Nullable[String]): Self = StObject.set(x, "instagram_username", value.asInstanceOf[js.Any])
      
      inline def setInstagram_usernameNull: Self = StObject.set(x, "instagram_username", null)
      
      inline def setLast_name(value: Nullable[String]): Self = StObject.set(x, "last_name", value.asInstanceOf[js.Any])
      
      inline def setLast_nameNull: Self = StObject.set(x, "last_name", null)
      
      inline def setLinks(value: Followers): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: Nullable[String]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationNull: Self = StObject.set(x, "location", null)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPortfolio_url(value: Nullable[String]): Self = StObject.set(x, "portfolio_url", value.asInstanceOf[js.Any])
      
      inline def setPortfolio_urlNull: Self = StObject.set(x, "portfolio_url", null)
      
      inline def setProfile_image(value: Large): Self = StObject.set(x, "profile_image", value.asInstanceOf[js.Any])
      
      inline def setTotal_collections(value: Double): Self = StObject.set(x, "total_collections", value.asInstanceOf[js.Any])
      
      inline def setTotal_likes(value: Double): Self = StObject.set(x, "total_likes", value.asInstanceOf[js.Any])
      
      inline def setTotal_photos(value: Double): Self = StObject.set(x, "total_photos", value.asInstanceOf[js.Any])
      
      inline def setTwitter_username(value: Nullable[String]): Self = StObject.set(x, "twitter_username", value.asInstanceOf[js.Any])
      
      inline def setTwitter_usernameNull: Self = StObject.set(x, "twitter_username", null)
      
      inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  trait Full
    extends StObject
       with Medium {
    
    var downloads: Double
    
    var followers_count: Double
    
    var following_count: Double
  }
  object Full {
    
    inline def apply(
      downloads: Double,
      first_name: String,
      followers_count: Double,
      following_count: Double,
      id: String,
      links: Followers,
      name: String,
      photos: js.Array[VeryBasic],
      profile_image: Large,
      total_collections: Double,
      total_likes: Double,
      total_photos: Double,
      updated_at: String,
      username: String
    ): Full = {
      val __obj = js.Dynamic.literal(downloads = downloads.asInstanceOf[js.Any], first_name = first_name.asInstanceOf[js.Any], followers_count = followers_count.asInstanceOf[js.Any], following_count = following_count.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], photos = photos.asInstanceOf[js.Any], profile_image = profile_image.asInstanceOf[js.Any], total_collections = total_collections.asInstanceOf[js.Any], total_likes = total_likes.asInstanceOf[js.Any], total_photos = total_photos.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], bio = null, instagram_username = null, last_name = null, location = null, portfolio_url = null, twitter_username = null)
      __obj.asInstanceOf[Full]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Full] (val x: Self) extends AnyVal {
      
      inline def setDownloads(value: Double): Self = StObject.set(x, "downloads", value.asInstanceOf[js.Any])
      
      inline def setFollowers_count(value: Double): Self = StObject.set(x, "followers_count", value.asInstanceOf[js.Any])
      
      inline def setFollowing_count(value: Double): Self = StObject.set(x, "following_count", value.asInstanceOf[js.Any])
    }
  }
  
  trait Medium
    extends StObject
       with Basic {
    
    var photos: js.Array[VeryBasic]
  }
  object Medium {
    
    inline def apply(
      first_name: String,
      id: String,
      links: Followers,
      name: String,
      photos: js.Array[VeryBasic],
      profile_image: Large,
      total_collections: Double,
      total_likes: Double,
      total_photos: Double,
      updated_at: String,
      username: String
    ): Medium = {
      val __obj = js.Dynamic.literal(first_name = first_name.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], photos = photos.asInstanceOf[js.Any], profile_image = profile_image.asInstanceOf[js.Any], total_collections = total_collections.asInstanceOf[js.Any], total_likes = total_likes.asInstanceOf[js.Any], total_photos = total_photos.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], bio = null, instagram_username = null, last_name = null, location = null, portfolio_url = null, twitter_username = null)
      __obj.asInstanceOf[Medium]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Medium] (val x: Self) extends AnyVal {
      
      inline def setPhotos(value: js.Array[VeryBasic]): Self = StObject.set(x, "photos", value.asInstanceOf[js.Any])
      
      inline def setPhotosVarargs(value: VeryBasic*): Self = StObject.set(x, "photos", js.Array(value*))
    }
  }
}
