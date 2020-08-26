package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A custom configuration for the environment. */
@js.native
trait Configuration extends js.Object {
  /** The unique identifier of the configuration. */
  var configuration_id: js.UndefOr[String] = js.native
  /** Document conversion settings. */
  var conversions: js.UndefOr[Conversions] = js.native
  /** The creation date of the configuration in the format yyyy-MM-dd'T'HH:mm:ss.SSS'Z'. */
  var created: js.UndefOr[String] = js.native
  /** The description of the configuration, if available. */
  var description: js.UndefOr[String] = js.native
  /** An array of document enrichment settings for the configuration. */
  var enrichments: js.UndefOr[js.Array[Enrichment]] = js.native
  /** The name of the configuration. */
  var name: String = js.native
  /** Defines operations that can be used to transform the final output JSON into a normalized form. Operations are executed in the order that they appear in the array. */
  var normalizations: js.UndefOr[js.Array[NormalizationOperation]] = js.native
  /** Object containing source parameters for the configuration. */
  var source: js.UndefOr[Source] = js.native
  /** The timestamp of when the configuration was last updated in the format yyyy-MM-dd'T'HH:mm:ss.SSS'Z'. */
  var updated: js.UndefOr[String] = js.native
}

object Configuration {
  @scala.inline
  def apply(name: String): Configuration = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
  @scala.inline
  implicit class ConfigurationOps[Self <: Configuration] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfiguration_id(value: String): Self = this.set("configuration_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfiguration_id: Self = this.set("configuration_id", js.undefined)
    @scala.inline
    def setConversions(value: Conversions): Self = this.set("conversions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConversions: Self = this.set("conversions", js.undefined)
    @scala.inline
    def setCreated(value: String): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEnrichmentsVarargs(value: Enrichment*): Self = this.set("enrichments", js.Array(value :_*))
    @scala.inline
    def setEnrichments(value: js.Array[Enrichment]): Self = this.set("enrichments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnrichments: Self = this.set("enrichments", js.undefined)
    @scala.inline
    def setNormalizationsVarargs(value: NormalizationOperation*): Self = this.set("normalizations", js.Array(value :_*))
    @scala.inline
    def setNormalizations(value: js.Array[NormalizationOperation]): Self = this.set("normalizations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNormalizations: Self = this.set("normalizations", js.undefined)
    @scala.inline
    def setSource(value: Source): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setUpdated(value: String): Self = this.set("updated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdated: Self = this.set("updated", js.undefined)
  }
  
}

