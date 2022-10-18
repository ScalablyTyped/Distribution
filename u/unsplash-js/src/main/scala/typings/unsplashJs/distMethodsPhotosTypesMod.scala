package typings.unsplashJs

import typings.unsplashJs.anon.Aperture
import typings.unsplashJs.anon.Change
import typings.unsplashJs.anon.City
import typings.unsplashJs.anon.Downloadlocation
import typings.unsplashJs.anon.Type
import typings.unsplashJs.distHelpersTypescriptMod.Nullable
import typings.unsplashJs.distTypesEntitiesMod.Entity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMethodsPhotosTypesMod {
  
  trait Basic
    extends StObject
       with VeryBasic {
    
    var alt_description: Nullable[String]
    
    var blur_hash: Nullable[String]
    
    var color: Nullable[String]
    
    var description: Nullable[String]
    
    var height: Double
    
    var likes: Double
    
    var links: Downloadlocation
    
    var promoted_at: Nullable[String]
    
    var user: typings.unsplashJs.distMethodsUsersTypesMod.Basic
    
    var width: Double
  }
  object Basic {
    
    inline def apply(
      created_at: String,
      height: Double,
      id: String,
      likes: Double,
      links: Downloadlocation,
      updated_at: String,
      urls: typings.unsplashJs.anon.Full,
      user: typings.unsplashJs.distMethodsUsersTypesMod.Basic,
      width: Double
    ): Basic = {
      val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], likes = likes.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], alt_description = null, blur_hash = null, color = null, description = null, promoted_at = null)
      __obj.asInstanceOf[Basic]
    }
    
    extension [Self <: Basic](x: Self) {
      
      inline def setAlt_description(value: Nullable[String]): Self = StObject.set(x, "alt_description", value.asInstanceOf[js.Any])
      
      inline def setAlt_descriptionNull: Self = StObject.set(x, "alt_description", null)
      
      inline def setBlur_hash(value: Nullable[String]): Self = StObject.set(x, "blur_hash", value.asInstanceOf[js.Any])
      
      inline def setBlur_hashNull: Self = StObject.set(x, "blur_hash", null)
      
      inline def setColor(value: Nullable[String]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorNull: Self = StObject.set(x, "color", null)
      
      inline def setDescription(value: Nullable[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionNull: Self = StObject.set(x, "description", null)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLikes(value: Double): Self = StObject.set(x, "likes", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: Downloadlocation): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setPromoted_at(value: Nullable[String]): Self = StObject.set(x, "promoted_at", value.asInstanceOf[js.Any])
      
      inline def setPromoted_atNull: Self = StObject.set(x, "promoted_at", null)
      
      inline def setUser(value: typings.unsplashJs.distMethodsUsersTypesMod.Basic): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExifAndLocation extends StObject {
    
    var exif: Aperture
    
    var location: City
  }
  object ExifAndLocation {
    
    inline def apply(exif: Aperture, location: City): ExifAndLocation = {
      val __obj = js.Dynamic.literal(exif = exif.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExifAndLocation]
    }
    
    extension [Self <: ExifAndLocation](x: Self) {
      
      inline def setExif(value: Aperture): Self = StObject.set(x, "exif", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: City): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    }
  }
  
  trait Full
    extends StObject
       with Basic
       with ExifAndLocation {
    
    var related_collections: Type
  }
  object Full {
    
    inline def apply(
      created_at: String,
      exif: Aperture,
      height: Double,
      id: String,
      likes: Double,
      links: Downloadlocation,
      location: City,
      related_collections: Type,
      updated_at: String,
      urls: typings.unsplashJs.anon.Full,
      user: typings.unsplashJs.distMethodsUsersTypesMod.Basic,
      width: Double
    ): Full = {
      val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], exif = exif.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], likes = likes.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], related_collections = related_collections.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], alt_description = null, blur_hash = null, color = null, description = null, promoted_at = null)
      __obj.asInstanceOf[Full]
    }
    
    extension [Self <: Full](x: Self) {
      
      inline def setRelated_collections(value: Type): Self = StObject.set(x, "related_collections", value.asInstanceOf[js.Any])
    }
  }
  
  trait Random
    extends StObject
       with Basic
       with ExifAndLocation
  object Random {
    
    inline def apply(
      created_at: String,
      exif: Aperture,
      height: Double,
      id: String,
      likes: Double,
      links: Downloadlocation,
      location: City,
      updated_at: String,
      urls: typings.unsplashJs.anon.Full,
      user: typings.unsplashJs.distMethodsUsersTypesMod.Basic,
      width: Double
    ): Random = {
      val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], exif = exif.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], likes = likes.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], alt_description = null, blur_hash = null, color = null, description = null, promoted_at = null)
      __obj.asInstanceOf[Random]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.unsplashJs.unsplashJsStrings.related
    - typings.unsplashJs.unsplashJsStrings.collected
  */
  trait RelatedCollectionsType extends StObject
  object RelatedCollectionsType {
    
    inline def collected: typings.unsplashJs.unsplashJsStrings.collected = "collected".asInstanceOf[typings.unsplashJs.unsplashJsStrings.collected]
    
    inline def related: typings.unsplashJs.unsplashJsStrings.related = "related".asInstanceOf[typings.unsplashJs.unsplashJsStrings.related]
  }
  
  trait Stat extends StObject {
    
    var historical: Change
    
    var total: Double
  }
  object Stat {
    
    inline def apply(historical: Change, total: Double): Stat = {
      val __obj = js.Dynamic.literal(historical = historical.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stat]
    }
    
    extension [Self <: Stat](x: Self) {
      
      inline def setHistorical(value: Change): Self = StObject.set(x, "historical", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  trait StatValue extends StObject {
    
    var date: String
    
    var value: Double
  }
  object StatValue {
    
    inline def apply(date: String, value: Double): StatValue = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatValue]
    }
    
    extension [Self <: StatValue](x: Self) {
      
      inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Stats
    extends StObject
       with Entity {
    
    var downloads: Stat
    
    var views: Stat
  }
  object Stats {
    
    inline def apply(downloads: Stat, id: String, views: Stat): Stats = {
      val __obj = js.Dynamic.literal(downloads = downloads.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stats]
    }
    
    extension [Self <: Stats](x: Self) {
      
      inline def setDownloads(value: Stat): Self = StObject.set(x, "downloads", value.asInstanceOf[js.Any])
      
      inline def setViews(value: Stat): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
    }
  }
  
  trait VeryBasic
    extends StObject
       with Entity {
    
    var created_at: String
    
    var updated_at: String
    
    var urls: typings.unsplashJs.anon.Full
  }
  object VeryBasic {
    
    inline def apply(created_at: String, id: String, updated_at: String, urls: typings.unsplashJs.anon.Full): VeryBasic = {
      val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any])
      __obj.asInstanceOf[VeryBasic]
    }
    
    extension [Self <: VeryBasic](x: Self) {
      
      inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
      
      inline def setUrls(value: typings.unsplashJs.anon.Full): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    }
  }
}
