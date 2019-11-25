package typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Details of semantically aligned elements. */
trait ElementPair extends js.Object {
  /** List of document attributes. */
  var attributes: js.UndefOr[js.Array[Attribute]] = js.undefined
  /** List of functional categories into which the element falls; in other words, the subject matter of the element. */
  var categories: js.UndefOr[js.Array[CategoryComparison]] = js.undefined
  /** The label of the document (that is, the value of either the `file_1_label` or `file_2_label` parameters) in which the element occurs. */
  var document_label: js.UndefOr[String] = js.undefined
  /** The numeric location of the identified element in the document, represented with two integers labeled `begin` and `end`. */
  var location: js.UndefOr[Location] = js.undefined
  /** The contents of the element. */
  var text: js.UndefOr[String] = js.undefined
  /** Description of the action specified by the element and whom it affects. */
  var types: js.UndefOr[js.Array[TypeLabelComparison]] = js.undefined
}

object ElementPair {
  @scala.inline
  def apply(
    attributes: js.Array[Attribute] = null,
    categories: js.Array[CategoryComparison] = null,
    document_label: String = null,
    location: Location = null,
    text: String = null,
    types: js.Array[TypeLabelComparison] = null
  ): ElementPair = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (document_label != null) __obj.updateDynamic("document_label")(document_label.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementPair]
  }
}

