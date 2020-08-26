package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `updateConfiguration` operation. */
@js.native
trait UpdateConfigurationParams extends js.Object {
  /** The ID of the configuration. */
  var configuration_id: String = js.native
  /** Document conversion settings. */
  var conversions: js.UndefOr[Conversions] = js.native
  /** The description of the configuration, if available. */
  var description: js.UndefOr[String] = js.native
  /** An array of document enrichment settings for the configuration. */
  var enrichments: js.UndefOr[js.Array[Enrichment]] = js.native
  /** The ID of the environment. */
  var environment_id: String = js.native
  var headers: js.UndefOr[js.Object] = js.native
  /** The name of the configuration. */
  var name: String = js.native
  /** Defines operations that can be used to transform the final output JSON into a normalized form. Operations are executed in the order that they appear in the array. */
  var normalizations: js.UndefOr[js.Array[NormalizationOperation]] = js.native
  var return_response: js.UndefOr[Boolean] = js.native
  /** Object containing source parameters for the configuration. */
  var source: js.UndefOr[Source] = js.native
}

object UpdateConfigurationParams {
  @scala.inline
  def apply(configuration_id: String, environment_id: String, name: String): UpdateConfigurationParams = {
    val __obj = js.Dynamic.literal(configuration_id = configuration_id.asInstanceOf[js.Any], environment_id = environment_id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConfigurationParams]
  }
  @scala.inline
  implicit class UpdateConfigurationParamsOps[Self <: UpdateConfigurationParams] (val x: Self) extends AnyVal {
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
    def setConfiguration_id(value: String): Self = this.set("configuration_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnvironment_id(value: String): Self = this.set("environment_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setConversions(value: Conversions): Self = this.set("conversions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConversions: Self = this.set("conversions", js.undefined)
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
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setNormalizationsVarargs(value: NormalizationOperation*): Self = this.set("normalizations", js.Array(value :_*))
    @scala.inline
    def setNormalizations(value: js.Array[NormalizationOperation]): Self = this.set("normalizations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNormalizations: Self = this.set("normalizations", js.undefined)
    @scala.inline
    def setReturn_response(value: Boolean): Self = this.set("return_response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturn_response: Self = this.set("return_response", js.undefined)
    @scala.inline
    def setSource(value: Source): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
  
}

