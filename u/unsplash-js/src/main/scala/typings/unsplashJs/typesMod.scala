package typings.unsplashJs

import typings.unsplashJs.anon.Download
import typings.unsplashJs.entitiesMod.Entity
import typings.unsplashJs.photosTypesMod.VeryBasic
import typings.unsplashJs.typescriptMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait Basic
    extends StObject
       with Entity {
    
    var cover_photo: Nullable[typings.unsplashJs.photosTypesMod.Basic]
    
    var description: Nullable[String]
    
    var featured: Boolean
    
    /**
      * This is different from `updated_at` because that may also change when a photo inside changes or
      * is deleted.
      */
    var last_collected_at: String
    
    var links: Download
    
    var preview_photos: Nullable[js.Array[VeryBasic]]
    
    var published_at: String
    
    var title: String
    
    var total_photos: Double
    
    var updated_at: String
    
    var user: typings.unsplashJs.usersTypesMod.Basic
  }
  object Basic {
    
    inline def apply(
      featured: Boolean,
      id: String,
      last_collected_at: String,
      links: Download,
      published_at: String,
      title: String,
      total_photos: Double,
      updated_at: String,
      user: typings.unsplashJs.usersTypesMod.Basic
    ): Basic = {
      val __obj = js.Dynamic.literal(featured = featured.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last_collected_at = last_collected_at.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], published_at = published_at.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], total_photos = total_photos.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], cover_photo = null, description = null, preview_photos = null)
      __obj.asInstanceOf[Basic]
    }
    
    extension [Self <: Basic](x: Self) {
      
      inline def setCover_photo(value: Nullable[typings.unsplashJs.photosTypesMod.Basic]): Self = StObject.set(x, "cover_photo", value.asInstanceOf[js.Any])
      
      inline def setCover_photoNull: Self = StObject.set(x, "cover_photo", null)
      
      inline def setDescription(value: Nullable[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionNull: Self = StObject.set(x, "description", null)
      
      inline def setFeatured(value: Boolean): Self = StObject.set(x, "featured", value.asInstanceOf[js.Any])
      
      inline def setLast_collected_at(value: String): Self = StObject.set(x, "last_collected_at", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: Download): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setPreview_photos(value: Nullable[js.Array[VeryBasic]]): Self = StObject.set(x, "preview_photos", value.asInstanceOf[js.Any])
      
      inline def setPreview_photosNull: Self = StObject.set(x, "preview_photos", null)
      
      inline def setPreview_photosVarargs(value: VeryBasic*): Self = StObject.set(x, "preview_photos", js.Array(value*))
      
      inline def setPublished_at(value: String): Self = StObject.set(x, "published_at", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTotal_photos(value: Double): Self = StObject.set(x, "total_photos", value.asInstanceOf[js.Any])
      
      inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
      
      inline def setUser(value: typings.unsplashJs.usersTypesMod.Basic): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
}
