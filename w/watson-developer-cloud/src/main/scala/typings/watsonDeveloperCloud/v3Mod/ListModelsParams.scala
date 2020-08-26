package typings.watsonDeveloperCloud.v3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `listModels` operation. */
@js.native
trait ListModelsParams extends js.Object {
  /** If the default parameter isn't specified, the service will return all models (default and non-default) for each language pair. To return only default models, set this to `true`. To return only non-default models, set this to `false`. There is exactly one default model per language pair, the IBM provided base model. */
  var default_models: js.UndefOr[Boolean] = js.native
  var headers: js.UndefOr[js.Object] = js.native
  var return_response: js.UndefOr[Boolean] = js.native
  /** Specify a language code to filter results by source language. */
  var source: js.UndefOr[String] = js.native
  /** Specify a language code to filter results by target language. */
  var target: js.UndefOr[String] = js.native
}

object ListModelsParams {
  @scala.inline
  def apply(): ListModelsParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListModelsParams]
  }
  @scala.inline
  implicit class ListModelsParamsOps[Self <: ListModelsParams] (val x: Self) extends AnyVal {
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
    def setDefault_models(value: Boolean): Self = this.set("default_models", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault_models: Self = this.set("default_models", js.undefined)
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setReturn_response(value: Boolean): Self = this.set("return_response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturn_response: Self = this.set("return_response", js.undefined)
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
  
}

