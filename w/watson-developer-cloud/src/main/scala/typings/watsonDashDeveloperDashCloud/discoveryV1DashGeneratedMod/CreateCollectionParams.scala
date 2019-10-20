package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.CreateCollectionConstants.Language
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `createCollection` operation. */
trait CreateCollectionParams extends js.Object {
  /** The ID of the configuration in which the collection is to be created. */
  var configuration_id: js.UndefOr[String] = js.undefined
  /** A description of the collection. */
  var description: js.UndefOr[String] = js.undefined
  /** The ID of the environment. */
  var environment_id: String
  var headers: js.UndefOr[js.Object] = js.undefined
  /** The language of the documents stored in the collection, in the form of an ISO 639-1 language code. */
  var language: js.UndefOr[Language | String] = js.undefined
  /** The name of the collection to be created. */
  var name: String
  var return_response: js.UndefOr[Boolean] = js.undefined
}

object CreateCollectionParams {
  @scala.inline
  def apply(
    environment_id: String,
    name: String,
    configuration_id: String = null,
    description: String = null,
    headers: js.Object = null,
    language: Language | String = null,
    return_response: js.UndefOr[Boolean] = js.undefined
  ): CreateCollectionParams = {
    val __obj = js.Dynamic.literal(environment_id = environment_id, name = name)
    if (configuration_id != null) __obj.updateDynamic("configuration_id")(configuration_id)
    if (description != null) __obj.updateDynamic("description")(description)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response)
    __obj.asInstanceOf[CreateCollectionParams]
  }
}

