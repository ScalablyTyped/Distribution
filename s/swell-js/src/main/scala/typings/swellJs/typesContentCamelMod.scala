package typings.swellJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesContentCamelMod {
  
  /* Inlined {[ K in keyof swell-js.ContentSnake as swell-js.swell-js.SnakeToCamelCase<K> ]: swell-js.ContentSnake[K]} */
  trait ContentCamel extends StObject {
    
    var content: js.UndefOr[String] = js.undefined
    
    var date_created: js.UndefOr[String] = js.undefined
    
    var date_updated: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var meta_description: js.UndefOr[String | Null] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var published: js.UndefOr[Boolean] = js.undefined
    
    var redirect: js.UndefOr[String | Null] = js.undefined
    
    var sections: js.UndefOr[js.Array[ContentSectionSnake]] = js.undefined
    
    var slug: js.UndefOr[String] = js.undefined
  }
  object ContentCamel {
    
    inline def apply(): ContentCamel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContentCamel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContentCamel] (val x: Self) extends AnyVal {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDate_created(value: String): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_createdUndefined: Self = StObject.set(x, "date_created", js.undefined)
      
      inline def setDate_updated(value: String): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setDate_updatedUndefined: Self = StObject.set(x, "date_updated", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
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
  
  /* Inlined {[ K in keyof swell-js.ContentSectionSnake as swell-js.swell-js.SnakeToCamelCase<K> ]: swell-js.ContentSectionSnake[K]} */
  trait ContentSectionCamel extends StObject {
    
    var id: String
    
    var `type`: String
  }
  object ContentSectionCamel {
    
    inline def apply(id: String, `type`: String): ContentSectionCamel = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContentSectionCamel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContentSectionCamel] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
