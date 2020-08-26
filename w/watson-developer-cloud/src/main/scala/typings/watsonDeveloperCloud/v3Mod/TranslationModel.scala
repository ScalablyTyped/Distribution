package typings.watsonDeveloperCloud.v3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Response payload for models. */
@js.native
trait TranslationModel extends js.Object {
  /** Model ID of the base model that was used to customize the model. If the model is not a custom model, this will be an empty string. */
  var base_model_id: js.UndefOr[String] = js.native
  /** Whether this model can be used as a base for customization. Customized models are not further customizable, and some base models are not customizable. */
  var customizable: js.UndefOr[Boolean] = js.native
  /** Whether or not the model is a default model. A default model is the model for a given language pair that will be used when that language pair is specified in the source and target parameters. */
  var default_model: js.UndefOr[Boolean] = js.native
  /** The domain of the translation model. */
  var domain: js.UndefOr[String] = js.native
  /** A globally unique string that identifies the underlying model that is used for translation. */
  var model_id: String = js.native
  /** Optional name that can be specified when the model is created. */
  var name: js.UndefOr[String] = js.native
  /** Either an empty string, indicating the model is not a custom model, or the ID of the service instance that created the model. */
  var owner: js.UndefOr[String] = js.native
  /** Translation source language code. */
  var source: js.UndefOr[String] = js.native
  /** Availability of a model. */
  var status: js.UndefOr[String] = js.native
  /** Translation target language code. */
  var target: js.UndefOr[String] = js.native
}

object TranslationModel {
  @scala.inline
  def apply(model_id: String): TranslationModel = {
    val __obj = js.Dynamic.literal(model_id = model_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslationModel]
  }
  @scala.inline
  implicit class TranslationModelOps[Self <: TranslationModel] (val x: Self) extends AnyVal {
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
    def setModel_id(value: String): Self = this.set("model_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setBase_model_id(value: String): Self = this.set("base_model_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBase_model_id: Self = this.set("base_model_id", js.undefined)
    @scala.inline
    def setCustomizable(value: Boolean): Self = this.set("customizable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomizable: Self = this.set("customizable", js.undefined)
    @scala.inline
    def setDefault_model(value: Boolean): Self = this.set("default_model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault_model: Self = this.set("default_model", js.undefined)
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
  
}

