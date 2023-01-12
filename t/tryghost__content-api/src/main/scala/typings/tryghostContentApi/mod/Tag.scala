package typings.tryghostContentApi.mod

import typings.tryghostContentApi.anon.Posts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tag
  extends StObject
     with Identification
     with Metadata
     with SocialMedia
     with GhostData {
  
  var accent_color: js.UndefOr[Nullable[String]] = js.undefined
  
  var canonical_url: js.UndefOr[Nullable[String]] = js.undefined
  
  var count: js.UndefOr[Posts] = js.undefined
  
  var description: js.UndefOr[Nullable[String]] = js.undefined
  
  var feature_image: js.UndefOr[Nullable[String]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
  
  var visibility: js.UndefOr[TagVisibility] = js.undefined
}
object Tag {
  
  inline def apply(id: String, slug: String): Tag = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Tag] (val x: Self) extends AnyVal {
    
    inline def setAccent_color(value: Nullable[String]): Self = StObject.set(x, "accent_color", value.asInstanceOf[js.Any])
    
    inline def setAccent_colorNull: Self = StObject.set(x, "accent_color", null)
    
    inline def setAccent_colorUndefined: Self = StObject.set(x, "accent_color", js.undefined)
    
    inline def setCanonical_url(value: Nullable[String]): Self = StObject.set(x, "canonical_url", value.asInstanceOf[js.Any])
    
    inline def setCanonical_urlNull: Self = StObject.set(x, "canonical_url", null)
    
    inline def setCanonical_urlUndefined: Self = StObject.set(x, "canonical_url", js.undefined)
    
    inline def setCount(value: Posts): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setDescription(value: Nullable[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFeature_image(value: Nullable[String]): Self = StObject.set(x, "feature_image", value.asInstanceOf[js.Any])
    
    inline def setFeature_imageNull: Self = StObject.set(x, "feature_image", null)
    
    inline def setFeature_imageUndefined: Self = StObject.set(x, "feature_image", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setVisibility(value: TagVisibility): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
