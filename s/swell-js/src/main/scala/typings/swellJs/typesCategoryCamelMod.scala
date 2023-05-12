package typings.swellJs

import typings.swellJs.typesProductMod.Image
import typings.swellJs.typesProductMod.Product
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCategoryCamelMod {
  
  /* Inlined {[ K in keyof swell-js.CategorySnake as swell-js.swell-js.SnakeToCamelCase<K> ]: swell-js.CategorySnake[K]} */
  trait CategoryCamel extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[js.Array[CategorySnake]] = js.undefined
    
    var date_created: js.UndefOr[String] = js.undefined
    
    var date_updated: js.UndefOr[String] = js.undefined
    
    var demo: js.UndefOr[Boolean] = js.undefined
    
    var description: String
    
    var id: js.UndefOr[String] = js.undefined
    
    var image: js.UndefOr[Image] = js.undefined
    
    var images: js.UndefOr[js.Array[Image]] = js.undefined
    
    var meta_description: js.UndefOr[String] = js.undefined
    
    var meta_keywords: js.UndefOr[String] = js.undefined
    
    var meta_title: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var parent: js.UndefOr[CategorySnake] = js.undefined
    
    var parent_id: js.UndefOr[String] = js.undefined
    
    var products: js.UndefOr[js.Array[Product]] = js.undefined
    
    var products_indexed: js.UndefOr[js.Array[Product]] = js.undefined
    
    var slug: String
    
    var sort: js.UndefOr[Double] = js.undefined
    
    var sorting: js.UndefOr[String] = js.undefined
    
    var top: js.UndefOr[CategorySnake] = js.undefined
    
    var top_id: js.UndefOr[String] = js.undefined
  }
  object CategoryCamel {
    
    inline def apply(description: String, name: String, slug: String): CategoryCamel = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
      __obj.asInstanceOf[CategoryCamel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CategoryCamel] (val x: Self) extends AnyVal {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setChildren(value: js.Array[CategorySnake]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: CategorySnake*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setDate_created(value: String): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_createdUndefined: Self = StObject.set(x, "date_created", js.undefined)
      
      inline def setDate_updated(value: String): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setDate_updatedUndefined: Self = StObject.set(x, "date_updated", js.undefined)
      
      inline def setDemo(value: Boolean): Self = StObject.set(x, "demo", value.asInstanceOf[js.Any])
      
      inline def setDemoUndefined: Self = StObject.set(x, "demo", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setImage(value: Image): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setImages(value: js.Array[Image]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      inline def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
      
      inline def setImagesVarargs(value: Image*): Self = StObject.set(x, "images", js.Array(value*))
      
      inline def setMeta_description(value: String): Self = StObject.set(x, "meta_description", value.asInstanceOf[js.Any])
      
      inline def setMeta_descriptionUndefined: Self = StObject.set(x, "meta_description", js.undefined)
      
      inline def setMeta_keywords(value: String): Self = StObject.set(x, "meta_keywords", value.asInstanceOf[js.Any])
      
      inline def setMeta_keywordsUndefined: Self = StObject.set(x, "meta_keywords", js.undefined)
      
      inline def setMeta_title(value: String): Self = StObject.set(x, "meta_title", value.asInstanceOf[js.Any])
      
      inline def setMeta_titleUndefined: Self = StObject.set(x, "meta_title", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setParent(value: CategorySnake): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setParent_id(value: String): Self = StObject.set(x, "parent_id", value.asInstanceOf[js.Any])
      
      inline def setParent_idUndefined: Self = StObject.set(x, "parent_id", js.undefined)
      
      inline def setProducts(value: js.Array[Product]): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
      
      inline def setProductsUndefined: Self = StObject.set(x, "products", js.undefined)
      
      inline def setProductsVarargs(value: Product*): Self = StObject.set(x, "products", js.Array(value*))
      
      inline def setProducts_indexed(value: js.Array[Product]): Self = StObject.set(x, "products_indexed", value.asInstanceOf[js.Any])
      
      inline def setProducts_indexedUndefined: Self = StObject.set(x, "products_indexed", js.undefined)
      
      inline def setProducts_indexedVarargs(value: Product*): Self = StObject.set(x, "products_indexed", js.Array(value*))
      
      inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
      
      inline def setSort(value: Double): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      inline def setSorting(value: String): Self = StObject.set(x, "sorting", value.asInstanceOf[js.Any])
      
      inline def setSortingUndefined: Self = StObject.set(x, "sorting", js.undefined)
      
      inline def setTop(value: CategorySnake): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      inline def setTop_id(value: String): Self = StObject.set(x, "top_id", value.asInstanceOf[js.Any])
      
      inline def setTop_idUndefined: Self = StObject.set(x, "top_id", js.undefined)
    }
  }
}
