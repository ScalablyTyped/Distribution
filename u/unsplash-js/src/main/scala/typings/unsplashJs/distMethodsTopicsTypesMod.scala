package typings.unsplashJs

import typings.unsplashJs.anon.Html
import typings.unsplashJs.distHelpersTypescriptMod.NonEmptyArray
import typings.unsplashJs.distMethodsPhotosTypesMod.VeryBasic
import typings.unsplashJs.distTypesEntitiesMod.Entity
import typings.unsplashJs.unsplashJsStrings.closed
import typings.unsplashJs.unsplashJsStrings.open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMethodsTopicsTypesMod {
  
  trait Basic
    extends StObject
       with Entity {
    
    var cover_photo: typings.unsplashJs.distMethodsPhotosTypesMod.Basic | Null
    
    var current_user_contributions: js.Array[VeryBasic]
    
    var description: String | Null
    
    var ends_at: String | Null
    
    var featured: Boolean
    
    var links: Html
    
    var owners: NonEmptyArray[typings.unsplashJs.distMethodsUsersTypesMod.Basic]
    
    var preview_photos: js.Array[VeryBasic] | Null
    
    var published_at: String
    
    var slug: String
    
    var starts_at: String
    
    var status: open | closed
    
    var title: String
    
    var total_photos: Double
    
    var updated_at: String
  }
  object Basic {
    
    inline def apply(
      current_user_contributions: js.Array[VeryBasic],
      featured: Boolean,
      id: String,
      links: Html,
      owners: NonEmptyArray[typings.unsplashJs.distMethodsUsersTypesMod.Basic],
      published_at: String,
      slug: String,
      starts_at: String,
      status: open | closed,
      title: String,
      total_photos: Double,
      updated_at: String
    ): Basic = {
      val __obj = js.Dynamic.literal(current_user_contributions = current_user_contributions.asInstanceOf[js.Any], featured = featured.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], owners = owners.asInstanceOf[js.Any], published_at = published_at.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], starts_at = starts_at.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], total_photos = total_photos.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], cover_photo = null, description = null, ends_at = null, preview_photos = null)
      __obj.asInstanceOf[Basic]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Basic] (val x: Self) extends AnyVal {
      
      inline def setCover_photo(value: typings.unsplashJs.distMethodsPhotosTypesMod.Basic): Self = StObject.set(x, "cover_photo", value.asInstanceOf[js.Any])
      
      inline def setCover_photoNull: Self = StObject.set(x, "cover_photo", null)
      
      inline def setCurrent_user_contributions(value: js.Array[VeryBasic]): Self = StObject.set(x, "current_user_contributions", value.asInstanceOf[js.Any])
      
      inline def setCurrent_user_contributionsVarargs(value: VeryBasic*): Self = StObject.set(x, "current_user_contributions", js.Array(value*))
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionNull: Self = StObject.set(x, "description", null)
      
      inline def setEnds_at(value: String): Self = StObject.set(x, "ends_at", value.asInstanceOf[js.Any])
      
      inline def setEnds_atNull: Self = StObject.set(x, "ends_at", null)
      
      inline def setFeatured(value: Boolean): Self = StObject.set(x, "featured", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: Html): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setOwners(value: NonEmptyArray[typings.unsplashJs.distMethodsUsersTypesMod.Basic]): Self = StObject.set(x, "owners", value.asInstanceOf[js.Any])
      
      inline def setPreview_photos(value: js.Array[VeryBasic]): Self = StObject.set(x, "preview_photos", value.asInstanceOf[js.Any])
      
      inline def setPreview_photosNull: Self = StObject.set(x, "preview_photos", null)
      
      inline def setPreview_photosVarargs(value: VeryBasic*): Self = StObject.set(x, "preview_photos", js.Array(value*))
      
      inline def setPublished_at(value: String): Self = StObject.set(x, "published_at", value.asInstanceOf[js.Any])
      
      inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
      
      inline def setStarts_at(value: String): Self = StObject.set(x, "starts_at", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: open | closed): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTotal_photos(value: Double): Self = StObject.set(x, "total_photos", value.asInstanceOf[js.Any])
      
      inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    }
  }
  
  trait Full
    extends StObject
       with Basic {
    
    var top_contributors: js.Array[typings.unsplashJs.distMethodsUsersTypesMod.Basic]
  }
  object Full {
    
    inline def apply(
      current_user_contributions: js.Array[VeryBasic],
      featured: Boolean,
      id: String,
      links: Html,
      owners: NonEmptyArray[typings.unsplashJs.distMethodsUsersTypesMod.Basic],
      published_at: String,
      slug: String,
      starts_at: String,
      status: open | closed,
      title: String,
      top_contributors: js.Array[typings.unsplashJs.distMethodsUsersTypesMod.Basic],
      total_photos: Double,
      updated_at: String
    ): Full = {
      val __obj = js.Dynamic.literal(current_user_contributions = current_user_contributions.asInstanceOf[js.Any], featured = featured.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], owners = owners.asInstanceOf[js.Any], published_at = published_at.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], starts_at = starts_at.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], top_contributors = top_contributors.asInstanceOf[js.Any], total_photos = total_photos.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], cover_photo = null, description = null, ends_at = null, preview_photos = null)
      __obj.asInstanceOf[Full]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Full] (val x: Self) extends AnyVal {
      
      inline def setTop_contributors(value: js.Array[typings.unsplashJs.distMethodsUsersTypesMod.Basic]): Self = StObject.set(x, "top_contributors", value.asInstanceOf[js.Any])
      
      inline def setTop_contributorsVarargs(value: typings.unsplashJs.distMethodsUsersTypesMod.Basic*): Self = StObject.set(x, "top_contributors", js.Array(value*))
    }
  }
}
