package typings.unsplashJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Followers extends StObject {
  
  var followers: String
  
  var following: String
  
  var html: String
  
  var likes: String
  
  var photos: String
  
  var portfolio: String
  
  var self: String
}
object Followers {
  
  inline def apply(
    followers: String,
    following: String,
    html: String,
    likes: String,
    photos: String,
    portfolio: String,
    self: String
  ): Followers = {
    val __obj = js.Dynamic.literal(followers = followers.asInstanceOf[js.Any], following = following.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], likes = likes.asInstanceOf[js.Any], photos = photos.asInstanceOf[js.Any], portfolio = portfolio.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any])
    __obj.asInstanceOf[Followers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Followers] (val x: Self) extends AnyVal {
    
    inline def setFollowers(value: String): Self = StObject.set(x, "followers", value.asInstanceOf[js.Any])
    
    inline def setFollowing(value: String): Self = StObject.set(x, "following", value.asInstanceOf[js.Any])
    
    inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setLikes(value: String): Self = StObject.set(x, "likes", value.asInstanceOf[js.Any])
    
    inline def setPhotos(value: String): Self = StObject.set(x, "photos", value.asInstanceOf[js.Any])
    
    inline def setPortfolio(value: String): Self = StObject.set(x, "portfolio", value.asInstanceOf[js.Any])
    
    inline def setSelf(value: String): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
  }
}
