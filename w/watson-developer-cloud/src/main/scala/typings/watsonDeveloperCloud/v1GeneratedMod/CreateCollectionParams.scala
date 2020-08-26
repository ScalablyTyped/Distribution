package typings.watsonDeveloperCloud.v1GeneratedMod

import typings.watsonDeveloperCloud.v1GeneratedMod.CreateCollectionConstants.Language
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `createCollection` operation. */
@js.native
trait CreateCollectionParams extends js.Object {
  /** The ID of the configuration in which the collection is to be created. */
  var configuration_id: js.UndefOr[String] = js.native
  /** A description of the collection. */
  var description: js.UndefOr[String] = js.native
  /** The ID of the environment. */
  var environment_id: String = js.native
  var headers: js.UndefOr[js.Object] = js.native
  /** The language of the documents stored in the collection, in the form of an ISO 639-1 language code. */
  var language: js.UndefOr[Language | String] = js.native
  /** The name of the collection to be created. */
  var name: String = js.native
  var return_response: js.UndefOr[Boolean] = js.native
}

object CreateCollectionParams {
  @scala.inline
  def apply(environment_id: String, name: String): CreateCollectionParams = {
    val __obj = js.Dynamic.literal(environment_id = environment_id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCollectionParams]
  }
  @scala.inline
  implicit class CreateCollectionParamsOps[Self <: CreateCollectionParams] (val x: Self) extends AnyVal {
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
    def setEnvironment_id(value: String): Self = this.set("environment_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfiguration_id(value: String): Self = this.set("configuration_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfiguration_id: Self = this.set("configuration_id", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setLanguage(value: Language | String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setReturn_response(value: Boolean): Self = this.set("return_response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturn_response: Self = this.set("return_response", js.undefined)
  }
  
}

