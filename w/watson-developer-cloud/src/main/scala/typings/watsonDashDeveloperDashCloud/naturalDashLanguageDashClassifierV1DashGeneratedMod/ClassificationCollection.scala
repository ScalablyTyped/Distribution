package typings.watsonDashDeveloperDashCloud.naturalDashLanguageDashClassifierV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Response from the classifier for multiple phrases. */
trait ClassificationCollection extends js.Object {
  /** Unique identifier for this classifier. */
  var classifier_id: js.UndefOr[String] = js.undefined
  /** An array of classifier responses for each submitted phrase. */
  var collection: js.UndefOr[js.Array[CollectionItem]] = js.undefined
  /** Link to the classifier. */
  var url: js.UndefOr[String] = js.undefined
}

object ClassificationCollection {
  @scala.inline
  def apply(classifier_id: String = null, collection: js.Array[CollectionItem] = null, url: String = null): ClassificationCollection = {
    val __obj = js.Dynamic.literal()
    if (classifier_id != null) __obj.updateDynamic("classifier_id")(classifier_id.asInstanceOf[js.Any])
    if (collection != null) __obj.updateDynamic("collection")(collection.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassificationCollection]
  }
}

