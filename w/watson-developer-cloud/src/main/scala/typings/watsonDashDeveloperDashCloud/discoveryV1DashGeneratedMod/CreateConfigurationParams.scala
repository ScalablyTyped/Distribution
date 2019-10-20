package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `createConfiguration` operation. */
trait CreateConfigurationParams extends js.Object {
  /** Document conversion settings. */
  var conversions: js.UndefOr[Conversions] = js.undefined
  /** The description of the configuration, if available. */
  var description: js.UndefOr[String] = js.undefined
  /** An array of document enrichment settings for the configuration. */
  var enrichments: js.UndefOr[js.Array[Enrichment]] = js.undefined
  /** The ID of the environment. */
  var environment_id: String
  var headers: js.UndefOr[js.Object] = js.undefined
  /** The name of the configuration. */
  var name: String
  /** Defines operations that can be used to transform the final output JSON into a normalized form. Operations are executed in the order that they appear in the array. */
  var normalizations: js.UndefOr[js.Array[NormalizationOperation]] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
  /** Object containing source parameters for the configuration. */
  var source: js.UndefOr[Source] = js.undefined
}

object CreateConfigurationParams {
  @scala.inline
  def apply(
    environment_id: String,
    name: String,
    conversions: Conversions = null,
    description: String = null,
    enrichments: js.Array[Enrichment] = null,
    headers: js.Object = null,
    normalizations: js.Array[NormalizationOperation] = null,
    return_response: js.UndefOr[Boolean] = js.undefined,
    source: Source = null
  ): CreateConfigurationParams = {
    val __obj = js.Dynamic.literal(environment_id = environment_id, name = name)
    if (conversions != null) __obj.updateDynamic("conversions")(conversions)
    if (description != null) __obj.updateDynamic("description")(description)
    if (enrichments != null) __obj.updateDynamic("enrichments")(enrichments)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (normalizations != null) __obj.updateDynamic("normalizations")(normalizations)
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[CreateConfigurationParams]
  }
}

