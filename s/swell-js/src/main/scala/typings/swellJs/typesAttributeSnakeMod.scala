package typings.swellJs

import typings.swellJs.mod.BaseModel
import typings.swellJs.swellJsStrings.asset
import typings.swellJs.swellJsStrings.boolean
import typings.swellJs.swellJsStrings.checkbox
import typings.swellJs.swellJsStrings.collection
import typings.swellJs.swellJsStrings.currency
import typings.swellJs.swellJsStrings.date
import typings.swellJs.swellJsStrings.dropdown
import typings.swellJs.swellJsStrings.field_group
import typings.swellJs.swellJsStrings.file
import typings.swellJs.swellJsStrings.icon
import typings.swellJs.swellJsStrings.image
import typings.swellJs.swellJsStrings.long_text
import typings.swellJs.swellJsStrings.lookup
import typings.swellJs.swellJsStrings.number
import typings.swellJs.swellJsStrings.radio
import typings.swellJs.swellJsStrings.select
import typings.swellJs.swellJsStrings.short_text
import typings.swellJs.swellJsStrings.tags
import typings.swellJs.swellJsStrings.text
import typings.swellJs.swellJsStrings.textarea
import typings.swellJs.typesProductMod.Product
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAttributeSnakeMod {
  
  trait AttributeSnake
    extends StObject
       with BaseModel {
    
    var default: js.UndefOr[String | Null | Double | Boolean | js.Object] = js.undefined
    
    var filterable: js.UndefOr[Boolean] = js.undefined
    
    var localized: js.UndefOr[Boolean] = js.undefined
    
    var multi: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var products: js.UndefOr[js.Array[Product]] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var searchable: js.UndefOr[Boolean] = js.undefined
    
    var `type`: js.UndefOr[
        asset | boolean | checkbox | collection | date | currency | dropdown | field_group | file | icon | image | long_text | lookup | number | radio | select | short_text | tags | text | textarea
      ] = js.undefined
    
    var values: js.UndefOr[js.Array[String]] = js.undefined
    
    var variant: js.UndefOr[Boolean] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object AttributeSnake {
    
    inline def apply(): AttributeSnake = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AttributeSnake]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AttributeSnake] (val x: Self) extends AnyVal {
      
      inline def setDefault(value: String | Double | Boolean | js.Object): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultNull: Self = StObject.set(x, "default", null)
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setFilterable(value: Boolean): Self = StObject.set(x, "filterable", value.asInstanceOf[js.Any])
      
      inline def setFilterableUndefined: Self = StObject.set(x, "filterable", js.undefined)
      
      inline def setLocalized(value: Boolean): Self = StObject.set(x, "localized", value.asInstanceOf[js.Any])
      
      inline def setLocalizedUndefined: Self = StObject.set(x, "localized", js.undefined)
      
      inline def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
      
      inline def setMultiUndefined: Self = StObject.set(x, "multi", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setProducts(value: js.Array[Product]): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
      
      inline def setProductsUndefined: Self = StObject.set(x, "products", js.undefined)
      
      inline def setProductsVarargs(value: Product*): Self = StObject.set(x, "products", js.Array(value*))
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setSearchable(value: Boolean): Self = StObject.set(x, "searchable", value.asInstanceOf[js.Any])
      
      inline def setSearchableUndefined: Self = StObject.set(x, "searchable", js.undefined)
      
      inline def setType(
        value: asset | boolean | checkbox | collection | date | currency | dropdown | field_group | file | icon | image | long_text | lookup | number | radio | select | short_text | tags | text | textarea
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
      
      inline def setVariant(value: Boolean): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}
