package typings.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Details of semantically aligned elements. */
@js.native
trait ElementPair extends js.Object {
  /** List of document attributes. */
  var attributes: js.UndefOr[js.Array[Attribute]] = js.native
  /** List of functional categories into which the element falls; in other words, the subject matter of the element. */
  var categories: js.UndefOr[js.Array[CategoryComparison]] = js.native
  /** The label of the document (that is, the value of either the `file_1_label` or `file_2_label` parameters) in which the element occurs. */
  var document_label: js.UndefOr[String] = js.native
  /** The numeric location of the identified element in the document, represented with two integers labeled `begin` and `end`. */
  var location: js.UndefOr[Location] = js.native
  /** The contents of the element. */
  var text: js.UndefOr[String] = js.native
  /** Description of the action specified by the element and whom it affects. */
  var types: js.UndefOr[js.Array[TypeLabelComparison]] = js.native
}

object ElementPair {
  @scala.inline
  def apply(): ElementPair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElementPair]
  }
  @scala.inline
  implicit class ElementPairOps[Self <: ElementPair] (val x: Self) extends AnyVal {
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
    def setAttributesVarargs(value: Attribute*): Self = this.set("attributes", js.Array(value :_*))
    @scala.inline
    def setAttributes(value: js.Array[Attribute]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    @scala.inline
    def setCategoriesVarargs(value: CategoryComparison*): Self = this.set("categories", js.Array(value :_*))
    @scala.inline
    def setCategories(value: js.Array[CategoryComparison]): Self = this.set("categories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategories: Self = this.set("categories", js.undefined)
    @scala.inline
    def setDocument_label(value: String): Self = this.set("document_label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocument_label: Self = this.set("document_label", js.undefined)
    @scala.inline
    def setLocation(value: Location): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTypesVarargs(value: TypeLabelComparison*): Self = this.set("types", js.Array(value :_*))
    @scala.inline
    def setTypes(value: js.Array[TypeLabelComparison]): Self = this.set("types", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypes: Self = this.set("types", js.undefined)
  }
  
}

