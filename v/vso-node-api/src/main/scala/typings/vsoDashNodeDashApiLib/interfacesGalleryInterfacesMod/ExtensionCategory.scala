package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionCategory extends js.Object {
  /**
    * The name of the products with which this category is associated to.
    */
  var associatedProducts: js.Array[java.lang.String]
  var categoryId: scala.Double
  /**
    * This is the internal name for a category
    */
  var categoryName: java.lang.String
  /**
    * This parameter is obsolete. Refer to LanguageTitles for langauge specific titles
    */
  var language: java.lang.String
  /**
    * The list of all the titles of this category in various languages
    */
  var languageTitles: js.Array[CategoryLanguageTitle]
  /**
    * This is the internal name of the parent if this is associated with a parent
    */
  var parentCategoryName: java.lang.String
}

object ExtensionCategory {
  @scala.inline
  def apply(
    associatedProducts: js.Array[java.lang.String],
    categoryId: scala.Double,
    categoryName: java.lang.String,
    language: java.lang.String,
    languageTitles: js.Array[CategoryLanguageTitle],
    parentCategoryName: java.lang.String
  ): ExtensionCategory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("associatedProducts")(associatedProducts)
    __obj.updateDynamic("categoryId")(categoryId)
    __obj.updateDynamic("categoryName")(categoryName)
    __obj.updateDynamic("language")(language)
    __obj.updateDynamic("languageTitles")(languageTitles)
    __obj.updateDynamic("parentCategoryName")(parentCategoryName)
    __obj.asInstanceOf[ExtensionCategory]
  }
}

