package typings.watsonDeveloperCloud.naturalLanguageClassifierV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A classifier for natural language phrases. */
trait Classifier extends js.Object {
  /** Unique identifier for this classifier. */
  var classifier_id: String
  /** Date and time (UTC) the classifier was created. */
  var created: js.UndefOr[String] = js.undefined
  /** The language used for the classifier. */
  var language: js.UndefOr[String] = js.undefined
  /** User-supplied name for the classifier. */
  var name: js.UndefOr[String] = js.undefined
  /** The state of the classifier. */
  var status: js.UndefOr[String] = js.undefined
  /** Additional detail about the status. */
  var status_description: js.UndefOr[String] = js.undefined
  /** Link to the classifier. */
  var url: String
}

object Classifier {
  @scala.inline
  def apply(
    classifier_id: String,
    url: String,
    created: String = null,
    language: String = null,
    name: String = null,
    status: String = null,
    status_description: String = null
  ): Classifier = {
    val __obj = js.Dynamic.literal(classifier_id = classifier_id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (status_description != null) __obj.updateDynamic("status_description")(status_description.asInstanceOf[js.Any])
    __obj.asInstanceOf[Classifier]
  }
}

