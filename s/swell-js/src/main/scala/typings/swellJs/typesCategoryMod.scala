package typings.swellJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCategoryMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.swellJs.typesCategoryCamelMod.CategoryCamel because var conflicts: active, children, date_created, date_updated, demo, description, id, image, images, meta_description, meta_keywords, meta_title, name, parent, parent_id, products, products_indexed, slug, sort, sorting, top, top_id. Inlined  */ trait Category
    extends StObject
       with CategorySnake
  object Category {
    
    inline def apply(description: String, name: String, slug: String): Category = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
      __obj.asInstanceOf[Category]
    }
  }
}
