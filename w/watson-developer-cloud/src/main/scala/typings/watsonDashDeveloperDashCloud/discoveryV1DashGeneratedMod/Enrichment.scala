package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enrichment. */
trait Enrichment extends js.Object {
  /** Describes what the enrichment step does. */
  var description: js.UndefOr[String] = js.undefined
  /** Field where enrichments will be stored. This field must already exist or be at most 1 level deeper than an existing field. For example, if `text` is a top-level field with no sub-fields, `text.foo` is a valid destination but `text.foo.bar` is not. */
  var destination_field: String
  /** Name of the enrichment service to call. Current options are `natural_language_understanding` and `elements`. When using `natual_language_understanding`, the **options** object must contain Natural Language Understanding options. When using `elements` the **options** object must contain Element Classification options. Additionally, when using the `elements` enrichment the configuration specified and files ingested must meet all the criteria specified in [the documentation](https://cloud.ibm.com/docs/services/discovery?topic=discovery-element-classification#element-classification). */
  var enrichment_name: String
  /** If true, then most errors generated during the enrichment process will be treated as warnings and will not cause the document to fail processing. */
  var ignore_downstream_errors: js.UndefOr[Boolean] = js.undefined
  /** An object representing the configuration options to use for the `elements` enrichment. */
  var options: js.UndefOr[EnrichmentOptions] = js.undefined
  /** Indicates that the enrichments will overwrite the destination_field field if it already exists. */
  var overwrite: js.UndefOr[Boolean] = js.undefined
  /** Field to be enriched. Arrays can be specified as the **source_field** if the **enrichment** service for this enrichment is set to `natural_language_undstanding`. */
  var source_field: String
}

object Enrichment {
  @scala.inline
  def apply(
    destination_field: String,
    enrichment_name: String,
    source_field: String,
    description: String = null,
    ignore_downstream_errors: js.UndefOr[Boolean] = js.undefined,
    options: EnrichmentOptions = null,
    overwrite: js.UndefOr[Boolean] = js.undefined
  ): Enrichment = {
    val __obj = js.Dynamic.literal(destination_field = destination_field.asInstanceOf[js.Any], enrichment_name = enrichment_name.asInstanceOf[js.Any], source_field = source_field.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(ignore_downstream_errors)) __obj.updateDynamic("ignore_downstream_errors")(ignore_downstream_errors.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (!js.isUndefined(overwrite)) __obj.updateDynamic("overwrite")(overwrite.asInstanceOf[js.Any])
    __obj.asInstanceOf[Enrichment]
  }
}

