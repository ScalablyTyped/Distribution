package typings.watsonDashDeveloperDashCloud.visualDashRecognitionV3DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Information about a classifier. */
trait Classifier extends js.Object {
  /** Classes that define a classifier. */
  var classes: js.UndefOr[js.Array[Class]] = js.undefined
  /** ID of a classifier identified in the image. */
  var classifier_id: String
  /** Whether the classifier can be downloaded as a Core ML model after the training status is `ready`. */
  var core_ml_enabled: js.UndefOr[Boolean] = js.undefined
  /** Date and time in Coordinated Universal Time (UTC) that the classifier was created. */
  var created: js.UndefOr[String] = js.undefined
  /** If classifier training has failed, this field might explain why. */
  var explanation: js.UndefOr[String] = js.undefined
  /** Name of the classifier. */
  var name: String
  /** Unique ID of the account who owns the classifier. Might not be returned by some requests. */
  var owner: js.UndefOr[String] = js.undefined
  /** Date and time in Coordinated Universal Time (UTC) that the classifier was updated. Might not be returned by some requests. Identical to `updated` and retained for backward compatibility. */
  var retrained: js.UndefOr[String] = js.undefined
  /** Training status of classifier. */
  var status: js.UndefOr[String] = js.undefined
  /** Date and time in Coordinated Universal Time (UTC) that the classifier was most recently updated. The field matches either `retrained` or `created`. Might not be returned by some requests. */
  var updated: js.UndefOr[String] = js.undefined
}

object Classifier {
  @scala.inline
  def apply(
    classifier_id: String,
    name: String,
    classes: js.Array[Class] = null,
    core_ml_enabled: js.UndefOr[Boolean] = js.undefined,
    created: String = null,
    explanation: String = null,
    owner: String = null,
    retrained: String = null,
    status: String = null,
    updated: String = null
  ): Classifier = {
    val __obj = js.Dynamic.literal(classifier_id = classifier_id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (!js.isUndefined(core_ml_enabled)) __obj.updateDynamic("core_ml_enabled")(core_ml_enabled.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (explanation != null) __obj.updateDynamic("explanation")(explanation.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (retrained != null) __obj.updateDynamic("retrained")(retrained.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Classifier]
  }
}

