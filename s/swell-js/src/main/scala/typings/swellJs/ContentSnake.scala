package typings.swellJs

import typings.swellJs.mod.BaseModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentSnake
  extends StObject
     with BaseModel {
  
  var content: js.UndefOr[String] = js.undefined
  
  var meta_description: js.UndefOr[String | Null] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var published: js.UndefOr[Boolean] = js.undefined
  
  var redirect: js.UndefOr[String | Null] = js.undefined
  
  var sections: js.UndefOr[js.Array[ContentSectionSnake]] = js.undefined
  
  var slug: js.UndefOr[String] = js.undefined
}
object ContentSnake {
  
  inline def apply(): ContentSnake = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentSnake]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentSnake] (val x: Self) extends AnyVal {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setMeta_description(value: String): Self = StObject.set(x, "meta_description", value.asInstanceOf[js.Any])
    
    inline def setMeta_descriptionNull: Self = StObject.set(x, "meta_description", null)
    
    inline def setMeta_descriptionUndefined: Self = StObject.set(x, "meta_description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPublished(value: Boolean): Self = StObject.set(x, "published", value.asInstanceOf[js.Any])
    
    inline def setPublishedUndefined: Self = StObject.set(x, "published", js.undefined)
    
    inline def setRedirect(value: String): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
    
    inline def setRedirectNull: Self = StObject.set(x, "redirect", null)
    
    inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
    
    inline def setSections(value: js.Array[ContentSectionSnake]): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
    
    inline def setSectionsUndefined: Self = StObject.set(x, "sections", js.undefined)
    
    inline def setSectionsVarargs(value: ContentSectionSnake*): Self = StObject.set(x, "sections", js.Array(value*))
    
    inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    
    inline def setSlugUndefined: Self = StObject.set(x, "slug", js.undefined)
  }
}
