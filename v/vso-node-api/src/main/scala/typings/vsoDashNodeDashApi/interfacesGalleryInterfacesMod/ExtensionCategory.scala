package typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionCategory extends js.Object {
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
  @scala.inline
  def apply(
    associatedProducts: js.Array[String],
    categoryId: Double,
    categoryName: String,
    language: String,
    languageTitles: js.Array[CategoryLanguageTitle],
    parentCategoryName: String
  ): ExtensionCategory = {
    val __obj = js.Dynamic.literal(associatedProducts = associatedProducts, categoryId = categoryId, categoryName = categoryName, language = language, languageTitles = languageTitles, parentCategoryName = parentCategoryName)
  
    __obj.asInstanceOf[ExtensionCategory]
  }
}

