package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `listLanguageModels` operation. */
@js.native
trait ListLanguageModelsParams extends js.Object {
  var headers: js.UndefOr[js.Object] = js.native
  /** The identifier of the language for which custom language or custom acoustic models are to be returned (for example, `en-US`). Omit the parameter to see all custom language or custom acoustic models that are owned by the requesting credentials. */
  var language: js.UndefOr[String] = js.native
  var return_response: js.UndefOr[Boolean] = js.native
}

object ListLanguageModelsParams {
  @scala.inline
  def apply(): ListLanguageModelsParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLanguageModelsParams]
  }
  @scala.inline
  implicit class ListLanguageModelsParamsOps[Self <: ListLanguageModelsParams] (val x: Self) extends AnyVal {
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
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setReturn_response(value: Boolean): Self = this.set("return_response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturn_response: Self = this.set("return_response", js.undefined)
  }
  
}

