package typings.tryghostContentApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Twitter extends StObject {
  
  var twitter_description: js.UndefOr[Nullable[String]] = js.undefined
  
  var twitter_image: js.UndefOr[Nullable[String]] = js.undefined
  
  var twitter_title: js.UndefOr[Nullable[String]] = js.undefined
}
object Twitter {
  
  inline def apply(): Twitter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Twitter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Twitter] (val x: Self) extends AnyVal {
    
    inline def setTwitter_description(value: Nullable[String]): Self = StObject.set(x, "twitter_description", value.asInstanceOf[js.Any])
    
    inline def setTwitter_descriptionNull: Self = StObject.set(x, "twitter_description", null)
    
    inline def setTwitter_descriptionUndefined: Self = StObject.set(x, "twitter_description", js.undefined)
    
    inline def setTwitter_image(value: Nullable[String]): Self = StObject.set(x, "twitter_image", value.asInstanceOf[js.Any])
    
    inline def setTwitter_imageNull: Self = StObject.set(x, "twitter_image", null)
    
    inline def setTwitter_imageUndefined: Self = StObject.set(x, "twitter_image", js.undefined)
    
    inline def setTwitter_title(value: Nullable[String]): Self = StObject.set(x, "twitter_title", value.asInstanceOf[js.Any])
    
    inline def setTwitter_titleNull: Self = StObject.set(x, "twitter_title", null)
    
    inline def setTwitter_titleUndefined: Self = StObject.set(x, "twitter_title", js.undefined)
  }
}
