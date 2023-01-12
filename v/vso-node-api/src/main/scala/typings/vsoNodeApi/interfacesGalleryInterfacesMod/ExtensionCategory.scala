package typings.vsoNodeApi.interfacesGalleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionCategory extends StObject {
  
  /**
    * The name of the products with which this category is associated to.
    */
  var associatedProducts: js.Array[String]
  
  var categoryId: Double
  
  /**
    * This is the internal name for a category
    */
  var categoryName: String
  
  /**
    * This parameter is obsolete. Refer to LanguageTitles for langauge specific titles
    */
  var language: String
  
  /**
    * The list of all the titles of this category in various languages
    */
  var languageTitles: js.Array[CategoryLanguageTitle]
  
  /**
    * This is the internal name of the parent if this is associated with a parent
    */
  var parentCategoryName: String
}
object ExtensionCategory {
  
  inline def apply(
    associatedProducts: js.Array[String],
    categoryId: Double,
    categoryName: String,
    language: String,
    languageTitles: js.Array[CategoryLanguageTitle],
    parentCategoryName: String
  ): ExtensionCategory = {
    val __obj = js.Dynamic.literal(associatedProducts = associatedProducts.asInstanceOf[js.Any], categoryId = categoryId.asInstanceOf[js.Any], categoryName = categoryName.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], languageTitles = languageTitles.asInstanceOf[js.Any], parentCategoryName = parentCategoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionCategory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtensionCategory] (val x: Self) extends AnyVal {
    
    inline def setAssociatedProducts(value: js.Array[String]): Self = StObject.set(x, "associatedProducts", value.asInstanceOf[js.Any])
    
    inline def setAssociatedProductsVarargs(value: String*): Self = StObject.set(x, "associatedProducts", js.Array(value*))
    
    inline def setCategoryId(value: Double): Self = StObject.set(x, "categoryId", value.asInstanceOf[js.Any])
    
    inline def setCategoryName(value: String): Self = StObject.set(x, "categoryName", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageTitles(value: js.Array[CategoryLanguageTitle]): Self = StObject.set(x, "languageTitles", value.asInstanceOf[js.Any])
    
    inline def setLanguageTitlesVarargs(value: CategoryLanguageTitle*): Self = StObject.set(x, "languageTitles", js.Array(value*))
    
    inline def setParentCategoryName(value: String): Self = StObject.set(x, "parentCategoryName", value.asInstanceOf[js.Any])
  }
}
