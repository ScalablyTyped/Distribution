package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Model. */
@js.native
trait Model extends js.Object {
  /** A dateTime indicating when the model was created. */
  var created: js.UndefOr[String] = js.native
  /** Model description. */
  var description: js.UndefOr[String] = js.native
  /** ISO 639-1 code indicating the language of the model. */
  var language: js.UndefOr[String] = js.native
  /** Unique model ID. */
  var model_id: js.UndefOr[String] = js.native
  /** When the status is `available`, the model is ready to use. */
  var status: js.UndefOr[String] = js.native
  /** The model version, if it was manually provided in Watson Knowledge Studio. */
  var version: js.UndefOr[String] = js.native
  /** The description of the version, if it was manually provided in Watson Knowledge Studio. */
  var version_description: js.UndefOr[String] = js.native
  /** ID of the Watson Knowledge Studio workspace that deployed this model to Natural Language Understanding. */
  var workspace_id: js.UndefOr[String] = js.native
}

object Model {
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
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
    def setCreated(value: String): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setModel_id(value: String): Self = this.set("model_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel_id: Self = this.set("model_id", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    @scala.inline
    def setVersion_description(value: String): Self = this.set("version_description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion_description: Self = this.set("version_description", js.undefined)
    @scala.inline
    def setWorkspace_id(value: String): Self = this.set("workspace_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkspace_id: Self = this.set("workspace_id", js.undefined)
  }
  
}

