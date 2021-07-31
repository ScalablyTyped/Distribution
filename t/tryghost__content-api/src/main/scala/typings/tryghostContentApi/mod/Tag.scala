package typings.tryghostContentApi.mod

import typings.tryghostContentApi.anon.Posts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tag
  extends StObject
     with Identification
     with Metadata
     with GhostData {
  
  var count: js.UndefOr[Posts] = js.undefined
  
  var description: js.UndefOr[Nullable[String]] = js.undefined
  
  var feature_image: js.UndefOr[Nullable[String]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
  
  var visibility: js.UndefOr[TagVisibility] = js.undefined
}
object Tag {
  
  @scala.inline
  def apply(id: String, slug: String): Tag = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
  
  @scala.inline
  implicit class TagMutableBuilder[Self <: Tag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Posts): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setDescription(value: Nullable[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setFeature_image(value: Nullable[String]): Self = StObject.set(x, "feature_image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeature_imageNull: Self = StObject.set(x, "feature_image", null)
    
    @scala.inline
    def setFeature_imageUndefined: Self = StObject.set(x, "feature_image", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setVisibility(value: TagVisibility): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
