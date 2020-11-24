package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enrichment. */
@js.native
trait Enrichment extends js.Object {
  
  /** Describes what the enrichment step does. */
  var description: js.UndefOr[String] = js.native
  
  /** Field where enrichments will be stored. This field must already exist or be at most 1 level deeper than an existing field. For example, if `text` is a top-level field with no sub-fields, `text.foo` is a valid destination but `text.foo.bar` is not. */
  var destination_field: String = js.native
  
  /** Name of the enrichment service to call. Current options are `natural_language_understanding` and `elements`. When using `natual_language_understanding`, the **options** object must contain Natural Language Understanding options. When using `elements` the **options** object must contain Element Classification options. Additionally, when using the `elements` enrichment the configuration specified and files ingested must meet all the criteria specified in [the documentation](https://cloud.ibm.com/docs/services/discovery?topic=discovery-element-classification#element-classification). */
  var enrichment_name: String = js.native
  
  /** If true, then most errors generated during the enrichment process will be treated as warnings and will not cause the document to fail processing. */
  var ignore_downstream_errors: js.UndefOr[Boolean] = js.native
  
  /** An object representing the configuration options to use for the `elements` enrichment. */
  var options: js.UndefOr[EnrichmentOptions] = js.native
  
  /** Indicates that the enrichments will overwrite the destination_field field if it already exists. */
  var overwrite: js.UndefOr[Boolean] = js.native
  
  /** Field to be enriched. Arrays can be specified as the **source_field** if the **enrichment** service for this enrichment is set to `natural_language_undstanding`. */
  var source_field: String = js.native
}
object Enrichment {
  
  @scala.inline
  def apply(destination_field: String, enrichment_name: String, source_field: String): Enrichment = {
    val __obj = js.Dynamic.literal(destination_field = destination_field.asInstanceOf[js.Any], enrichment_name = enrichment_name.asInstanceOf[js.Any], source_field = source_field.asInstanceOf[js.Any])
    __obj.asInstanceOf[Enrichment]
  }
  
  @scala.inline
  implicit class EnrichmentOps[Self <: Enrichment] (val x: Self) extends AnyVal {
    
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
    def setDestination_field(value: String): Self = this.set("destination_field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnrichment_name(value: String): Self = this.set("enrichment_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource_field(value: String): Self = this.set("source_field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setIgnore_downstream_errors(value: Boolean): Self = this.set("ignore_downstream_errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnore_downstream_errors: Self = this.set("ignore_downstream_errors", js.undefined)
    
    @scala.inline
    def setOptions(value: EnrichmentOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setOverwrite(value: Boolean): Self = this.set("overwrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverwrite: Self = this.set("overwrite", js.undefined)
  }
}
