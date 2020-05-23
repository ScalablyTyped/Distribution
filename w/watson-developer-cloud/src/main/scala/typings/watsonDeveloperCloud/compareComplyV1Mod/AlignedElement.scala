package typings.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** AlignedElement. */
trait AlignedElement extends js.Object {
  /** Identifies two elements that semantically align between the compared documents. */
  var element_pair: js.UndefOr[js.Array[ElementPair]] = js.undefined
  /** Specifies whether the aligned element is identical. Elements are considered identical despite minor differences such as leading punctuation, end-of-sentence punctuation, whitespace, the presence or absence of definite or indefinite articles, and others. */
  var identical_text: js.UndefOr[Boolean] = js.undefined
  /** One or more hashed values that you can send to IBM to provide feedback or receive support. */
  var provenance_ids: js.UndefOr[js.Array[String]] = js.undefined
  /** Indicates that the elements aligned are contractual clauses of significance. */
  var significant_elements: js.UndefOr[Boolean] = js.undefined
}

object AlignedElement {
  @scala.inline
  def apply(
    element_pair: js.Array[ElementPair] = null,
    identical_text: js.UndefOr[Boolean] = js.undefined,
    provenance_ids: js.Array[String] = null,
    significant_elements: js.UndefOr[Boolean] = js.undefined
  ): AlignedElement = {
    val __obj = js.Dynamic.literal()
    if (element_pair != null) __obj.updateDynamic("element_pair")(element_pair.asInstanceOf[js.Any])
    if (!js.isUndefined(identical_text)) __obj.updateDynamic("identical_text")(identical_text.get.asInstanceOf[js.Any])
    if (provenance_ids != null) __obj.updateDynamic("provenance_ids")(provenance_ids.asInstanceOf[js.Any])
    if (!js.isUndefined(significant_elements)) __obj.updateDynamic("significant_elements")(significant_elements.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlignedElement]
  }
}

