package typings.watsonDashDeveloperDashCloud.languageDashTranslatorV3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Response payload for models. */
trait TranslationModel extends js.Object {
  /** Model ID of the base model that was used to customize the model. If the model is not a custom model, this will be an empty string. */
  var base_model_id: js.UndefOr[String] = js.undefined
  /** Whether this model can be used as a base for customization. Customized models are not further customizable, and some base models are not customizable. */
  var customizable: js.UndefOr[Boolean] = js.undefined
  /** Whether or not the model is a default model. A default model is the model for a given language pair that will be used when that language pair is specified in the source and target parameters. */
  var default_model: js.UndefOr[Boolean] = js.undefined
  /** The domain of the translation model. */
  var domain: js.UndefOr[String] = js.undefined
  /** A globally unique string that identifies the underlying model that is used for translation. */
  var model_id: String
  /** Optional name that can be specified when the model is created. */
  var name: js.UndefOr[String] = js.undefined
  /** Either an empty string, indicating the model is not a custom model, or the ID of the service instance that created the model. */
  var owner: js.UndefOr[String] = js.undefined
  /** Translation source language code. */
  var source: js.UndefOr[String] = js.undefined
  /** Availability of a model. */
  var status: js.UndefOr[String] = js.undefined
  /** Translation target language code. */
  var target: js.UndefOr[String] = js.undefined
}

object TranslationModel {
  @scala.inline
  def apply(
    model_id: String,
    base_model_id: String = null,
    customizable: js.UndefOr[Boolean] = js.undefined,
    default_model: js.UndefOr[Boolean] = js.undefined,
    domain: String = null,
    name: String = null,
    owner: String = null,
    source: String = null,
    status: String = null,
    target: String = null
  ): TranslationModel = {
    val __obj = js.Dynamic.literal(model_id = model_id)
    if (base_model_id != null) __obj.updateDynamic("base_model_id")(base_model_id)
    if (!js.isUndefined(customizable)) __obj.updateDynamic("customizable")(customizable)
    if (!js.isUndefined(default_model)) __obj.updateDynamic("default_model")(default_model)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (name != null) __obj.updateDynamic("name")(name)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (source != null) __obj.updateDynamic("source")(source)
    if (status != null) __obj.updateDynamic("status")(status)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[TranslationModel]
  }
}

