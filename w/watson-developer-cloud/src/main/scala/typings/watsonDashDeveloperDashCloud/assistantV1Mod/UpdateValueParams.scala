package typings.watsonDashDeveloperDashCloud.assistantV1Mod

import typings.watsonDashDeveloperDashCloud.assistantV1Mod.UpdateValueConstants.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `updateValue` operation. */
trait UpdateValueParams extends js.Object {
  /** The name of the entity. */
  var entity: String
  var headers: js.UndefOr[js.Object] = js.undefined
  /** Any metadata related to the entity value. */
  var new_metadata: js.UndefOr[js.Object] = js.undefined
  /** An array of patterns for the entity value. A value can specify either synonyms or patterns (depending on the value type), but not both. A pattern is a regular expression no longer than 512 characters. For more information about how to specify a pattern, see the [documentation](https://cloud.ibm.com/docs/services/assistant/entities.html#entities-create-dictionary-based). */
  var new_patterns: js.UndefOr[js.Array[String]] = js.undefined
  /** An array of synonyms for the entity value. A value can specify either synonyms or patterns (depending on the value type), but not both. A synonym must conform to the following resrictions: - It cannot contain carriage return, newline, or tab characters. - It cannot consist of only whitespace characters. - It must be no longer than 64 characters. */
  var new_synonyms: js.UndefOr[js.Array[String]] = js.undefined
  /** The text of the entity value. This string must conform to the following restrictions: - It cannot contain carriage return, newline, or tab characters. - It cannot consist of only whitespace characters. - It must be no longer than 64 characters. */
  var new_value: js.UndefOr[String] = js.undefined
  /** Specifies the type of entity value. */
  var new_value_type: js.UndefOr[ValueType | String] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
  /** The text of the entity value. */
  var value: String
  /** Unique identifier of the workspace. */
  var workspace_id: String
}

object UpdateValueParams {
  @scala.inline
  def apply(
    entity: String,
    value: String,
    workspace_id: String,
    headers: js.Object = null,
    new_metadata: js.Object = null,
    new_patterns: js.Array[String] = null,
    new_synonyms: js.Array[String] = null,
    new_value: String = null,
    new_value_type: ValueType | String = null,
    return_response: js.UndefOr[Boolean] = js.undefined
  ): UpdateValueParams = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], workspace_id = workspace_id.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (new_metadata != null) __obj.updateDynamic("new_metadata")(new_metadata.asInstanceOf[js.Any])
    if (new_patterns != null) __obj.updateDynamic("new_patterns")(new_patterns.asInstanceOf[js.Any])
    if (new_synonyms != null) __obj.updateDynamic("new_synonyms")(new_synonyms.asInstanceOf[js.Any])
    if (new_value != null) __obj.updateDynamic("new_value")(new_value.asInstanceOf[js.Any])
    if (new_value_type != null) __obj.updateDynamic("new_value_type")(new_value_type.asInstanceOf[js.Any])
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateValueParams]
  }
}

