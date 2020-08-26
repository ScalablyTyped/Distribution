package typings.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtensionCategory extends js.Object {
  /**
    * The name of the products with which this category is associated to.
    */
  var associatedProducts: js.Array[String] = js.native
  var categoryId: Double = js.native
  /**
    * This is the internal name for a category
    */
  var categoryName: String = js.native
  /**
    * This parameter is obsolete. Refer to LanguageTitles for langauge specific titles
    */
  var language: String = js.native
  /**
    * The list of all the titles of this category in various languages
    */
  var languageTitles: js.Array[CategoryLanguageTitle] = js.native
  /**
    * This is the internal name of the parent if this is associated with a parent
    */
  var parentCategoryName: String = js.native
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
    val __obj = js.Dynamic.literal(associatedProducts = associatedProducts.asInstanceOf[js.Any], categoryId = categoryId.asInstanceOf[js.Any], categoryName = categoryName.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], languageTitles = languageTitles.asInstanceOf[js.Any], parentCategoryName = parentCategoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionCategory]
  }
  @scala.inline
  implicit class ExtensionCategoryOps[Self <: ExtensionCategory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAssociatedProductsVarargs(value: String*): Self = this.set("associatedProducts", js.Array(value :_*))
    @scala.inline
    def setAssociatedProducts(value: js.Array[String]): Self = this.set("associatedProducts", value.asInstanceOf[js.Any])
    @scala.inline
    def setCategoryId(value: Double): Self = this.set("categoryId", value.asInstanceOf[js.Any])
    @scala.inline
    def setCategoryName(value: String): Self = this.set("categoryName", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguageTitlesVarargs(value: CategoryLanguageTitle*): Self = this.set("languageTitles", js.Array(value :_*))
    @scala.inline
    def setLanguageTitles(value: js.Array[CategoryLanguageTitle]): Self = this.set("languageTitles", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentCategoryName(value: String): Self = this.set("parentCategoryName", value.asInstanceOf[js.Any])
  }
  
}

