package typings.watsonDashDeveloperDashCloud.assistantV1Mod

import typings.watsonDashDeveloperDashCloud.assistantV1Mod.CreateValueConstants.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `createValue` operation. */
trait CreateValueParams extends js.Object {
  /** The name of the entity. */
  var entity: String
  var headers: js.UndefOr[js.Object] = js.undefined
  /** Any metadata related to the entity value. */
  var metadata: js.UndefOr[js.Object] = js.undefined
  /** An array of patterns for the entity value. A value can specify either synonyms or patterns (depending on the value type), but not both. A pattern is a regular expression no longer than 512 characters. For more information about how to specify a pattern, see the [documentation](https://cloud.ibm.com/docs/services/assistant/entities.html#entities-create-dictionary-based). */
  var patterns: js.UndefOr[js.Array[String]] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
  /** An array of synonyms for the entity value. A value can specify either synonyms or patterns (depending on the value type), but not both. A synonym must conform to the following resrictions: - It cannot contain carriage return, newline, or tab characters. - It cannot consist of only whitespace characters. - It must be no longer than 64 characters. */
  var synonyms: js.UndefOr[js.Array[String]] = js.undefined
  /** The text of the entity value. This string must conform to the following restrictions: - It cannot contain carriage return, newline, or tab characters. - It cannot consist of only whitespace characters. - It must be no longer than 64 characters. */
  var value: String
  /** Specifies the type of entity value. */
  var value_type: js.UndefOr[ValueType | String] = js.undefined
  /** Unique identifier of the workspace. */
  var workspace_id: String
}

object CreateValueParams {
  @scala.inline
  def apply(
    entity: String,
    value: String,
    workspace_id: String,
    headers: js.Object = null,
    metadata: js.Object = null,
    patterns: js.Array[String] = null,
    return_response: js.UndefOr[Boolean] = js.undefined,
    synonyms: js.Array[String] = null,
    value_type: ValueType | String = null
  ): CreateValueParams = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], workspace_id = workspace_id.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (patterns != null) __obj.updateDynamic("patterns")(patterns.asInstanceOf[js.Any])
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response.asInstanceOf[js.Any])
    if (synonyms != null) __obj.updateDynamic("synonyms")(synonyms.asInstanceOf[js.Any])
    if (value_type != null) __obj.updateDynamic("value_type")(value_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateValueParams]
  }
}

