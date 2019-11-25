package typings.watsonDashDeveloperDashCloud.naturalDashLanguageDashClassifierV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Response from the classifier for a phrase in a collection. */
trait CollectionItem extends js.Object {
  /** An array of up to ten class-confidence pairs sorted in descending order of confidence. */
  var classes: js.UndefOr[js.Array[ClassifiedClass]] = js.undefined
  /** The submitted phrase. The maximum length is 2048 characters. */
  var text: js.UndefOr[String] = js.undefined
  /** The class with the highest confidence. */
  var top_class: js.UndefOr[String] = js.undefined
}

object CollectionItem {
  @scala.inline
  def apply(classes: js.Array[ClassifiedClass] = null, text: String = null, top_class: String = null): CollectionItem = {
    val __obj = js.Dynamic.literal()
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (top_class != null) __obj.updateDynamic("top_class")(top_class.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionItem]
  }
}

