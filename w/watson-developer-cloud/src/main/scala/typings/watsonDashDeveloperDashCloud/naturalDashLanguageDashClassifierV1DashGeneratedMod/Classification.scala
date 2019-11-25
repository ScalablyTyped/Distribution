package typings.watsonDashDeveloperDashCloud.naturalDashLanguageDashClassifierV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*************************
  * model interfaces
  ************************/
/** Response from the classifier for a phrase. */
trait Classification extends js.Object {
  /** An array of up to ten class-confidence pairs sorted in descending order of confidence. */
  var classes: js.UndefOr[js.Array[ClassifiedClass]] = js.undefined
  /** Unique identifier for this classifier. */
  var classifier_id: js.UndefOr[String] = js.undefined
  /** The submitted phrase. */
  var text: js.UndefOr[String] = js.undefined
  /** The class with the highest confidence. */
  var top_class: js.UndefOr[String] = js.undefined
  /** Link to the classifier. */
  var url: js.UndefOr[String] = js.undefined
}

object Classification {
  @scala.inline
  def apply(
    classes: js.Array[ClassifiedClass] = null,
    classifier_id: String = null,
    text: String = null,
    top_class: String = null,
    url: String = null
  ): Classification = {
    val __obj = js.Dynamic.literal()
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (classifier_id != null) __obj.updateDynamic("classifier_id")(classifier_id.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (top_class != null) __obj.updateDynamic("top_class")(top_class.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Classification]
  }
}

