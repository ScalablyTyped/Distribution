package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A custom configuration for the environment. */
trait Configuration extends js.Object {
  /** The unique identifier of the configuration. */
  var configuration_id: js.UndefOr[String] = js.undefined
  /** Document conversion settings. */
  var conversions: js.UndefOr[Conversions] = js.undefined
  /** The creation date of the configuration in the format yyyy-MM-dd'T'HH:mm:ss.SSS'Z'. */
  var created: js.UndefOr[String] = js.undefined
  /** The description of the configuration, if available. */
  var description: js.UndefOr[String] = js.undefined
  /** An array of document enrichment settings for the configuration. */
  var enrichments: js.UndefOr[js.Array[Enrichment]] = js.undefined
  /** The name of the configuration. */
  var name: String
  /** Defines operations that can be used to transform the final output JSON into a normalized form. Operations are executed in the order that they appear in the array. */
  var normalizations: js.UndefOr[js.Array[NormalizationOperation]] = js.undefined
  /** Object containing source parameters for the configuration. */
  var source: js.UndefOr[Source] = js.undefined
  /** The timestamp of when the configuration was last updated in the format yyyy-MM-dd'T'HH:mm:ss.SSS'Z'. */
  var updated: js.UndefOr[String] = js.undefined
}

object Configuration {
  @scala.inline
  def apply(
    name: String,
    configuration_id: String = null,
    conversions: Conversions = null,
    created: String = null,
    description: String = null,
    enrichments: js.Array[Enrichment] = null,
    normalizations: js.Array[NormalizationOperation] = null,
    source: Source = null,
    updated: String = null
  ): Configuration = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (configuration_id != null) __obj.updateDynamic("configuration_id")(configuration_id.asInstanceOf[js.Any])
    if (conversions != null) __obj.updateDynamic("conversions")(conversions.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (enrichments != null) __obj.updateDynamic("enrichments")(enrichments.asInstanceOf[js.Any])
    if (normalizations != null) __obj.updateDynamic("normalizations")(normalizations.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
}

