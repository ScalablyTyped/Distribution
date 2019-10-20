package typings.watsonDashDeveloperDashCloud.assistantV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `updateEntity` operation. */
trait UpdateEntityParams extends js.Object {
  /** The name of the entity. */
  var entity: String
  var headers: js.UndefOr[js.Object] = js.undefined
  /** The description of the entity. This string cannot contain carriage return, newline, or tab characters, and it must be no longer than 128 characters. */
  var new_description: js.UndefOr[String] = js.undefined
  /** The name of the entity. This string must conform to the following restrictions: - It can contain only Unicode alphanumeric, underscore, and hyphen characters. - It cannot begin with the reserved prefix `sys-`. - It must be no longer than 64 characters. */
  var new_entity: js.UndefOr[String] = js.undefined
  /** Whether to use fuzzy matching for the entity. */
  var new_fuzzy_match: js.UndefOr[Boolean] = js.undefined
  /** Any metadata related to the entity. */
  var new_metadata: js.UndefOr[js.Object] = js.undefined
  /** An array of objects describing the entity values. */
  var new_values: js.UndefOr[js.Array[CreateValue]] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
  /** Unique identifier of the workspace. */
  var workspace_id: String
}

object UpdateEntityParams {
  @scala.inline
  def apply(
    entity: String,
    workspace_id: String,
    headers: js.Object = null,
    new_description: String = null,
    new_entity: String = null,
    new_fuzzy_match: js.UndefOr[Boolean] = js.undefined,
    new_metadata: js.Object = null,
    new_values: js.Array[CreateValue] = null,
    return_response: js.UndefOr[Boolean] = js.undefined
  ): UpdateEntityParams = {
    val __obj = js.Dynamic.literal(entity = entity, workspace_id = workspace_id)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (new_description != null) __obj.updateDynamic("new_description")(new_description)
    if (new_entity != null) __obj.updateDynamic("new_entity")(new_entity)
    if (!js.isUndefined(new_fuzzy_match)) __obj.updateDynamic("new_fuzzy_match")(new_fuzzy_match)
    if (new_metadata != null) __obj.updateDynamic("new_metadata")(new_metadata)
    if (new_values != null) __obj.updateDynamic("new_values")(new_values)
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response)
    __obj.asInstanceOf[UpdateEntityParams]
  }
}

