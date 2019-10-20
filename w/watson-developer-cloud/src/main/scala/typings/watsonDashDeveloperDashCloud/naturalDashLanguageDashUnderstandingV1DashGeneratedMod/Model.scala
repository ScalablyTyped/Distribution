package typings.watsonDashDeveloperDashCloud.naturalDashLanguageDashUnderstandingV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Model. */
trait Model extends js.Object {
  /** A dateTime indicating when the model was created. */
  var created: js.UndefOr[String] = js.undefined
  /** Model description. */
  var description: js.UndefOr[String] = js.undefined
  /** ISO 639-1 code indicating the language of the model. */
  var language: js.UndefOr[String] = js.undefined
  /** Unique model ID. */
  var model_id: js.UndefOr[String] = js.undefined
  /** When the status is `available`, the model is ready to use. */
  var status: js.UndefOr[String] = js.undefined
  /** The model version, if it was manually provided in Watson Knowledge Studio. */
  var version: js.UndefOr[String] = js.undefined
  /** The description of the version, if it was manually provided in Watson Knowledge Studio. */
  var version_description: js.UndefOr[String] = js.undefined
  /** ID of the Watson Knowledge Studio workspace that deployed this model to Natural Language Understanding. */
  var workspace_id: js.UndefOr[String] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    created: String = null,
    description: String = null,
    language: String = null,
    model_id: String = null,
    status: String = null,
    version: String = null,
    version_description: String = null,
    workspace_id: String = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (created != null) __obj.updateDynamic("created")(created)
    if (description != null) __obj.updateDynamic("description")(description)
    if (language != null) __obj.updateDynamic("language")(language)
    if (model_id != null) __obj.updateDynamic("model_id")(model_id)
    if (status != null) __obj.updateDynamic("status")(status)
    if (version != null) __obj.updateDynamic("version")(version)
    if (version_description != null) __obj.updateDynamic("version_description")(version_description)
    if (workspace_id != null) __obj.updateDynamic("workspace_id")(workspace_id)
    __obj.asInstanceOf[Model]
  }
}

