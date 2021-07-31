package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageUrl extends StObject {
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var id: String | Double
  
  var imageUrl: js.UndefOr[String] = js.undefined
  
  var subtitle: js.UndefOr[String] = js.undefined
  
  var title: String
}
object ImageUrl {
  
  @scala.inline
  def apply(id: String | Double, title: String): ImageUrl = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageUrl]
  }
  
  @scala.inline
  implicit class ImageUrlMutableBuilder[Self <: ImageUrl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
    
    @scala.inline
    def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
