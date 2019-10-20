package typings.watsonDashDeveloperDashCloud.assistantV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `createEntity` operation. */
trait CreateEntityParams extends js.Object {
  /** The description of the entity. This string cannot contain carriage return, newline, or tab characters, and it must be no longer than 128 characters. */
  var description: js.UndefOr[String] = js.undefined
  /** The name of the entity. This string must conform to the following restrictions: - It can contain only Unicode alphanumeric, underscore, and hyphen characters. - It must be no longer than 64 characters. If you specify an entity name beginning with the reserved prefix `sys-`, it must be the name of a system entity that you want to enable. (Any entity content specified with the request is ignored.). */
  var entity: String
  /** Whether to use fuzzy matching for the entity. */
  var fuzzy_match: js.UndefOr[Boolean] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  /** Any metadata related to the entity. */
  var metadata: js.UndefOr[js.Object] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
  /** An array of objects describing the entity values. */
  var values: js.UndefOr[js.Array[CreateValue]] = js.undefined
  /** Unique identifier of the workspace. */
  var workspace_id: String
}

object CreateEntityParams {
  @scala.inline
  def apply(
    entity: String,
    workspace_id: String,
    description: String = null,
    fuzzy_match: js.UndefOr[Boolean] = js.undefined,
    headers: js.Object = null,
    metadata: js.Object = null,
    return_response: js.UndefOr[Boolean] = js.undefined,
    values: js.Array[CreateValue] = null
  ): CreateEntityParams = {
    val __obj = js.Dynamic.literal(entity = entity, workspace_id = workspace_id)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(fuzzy_match)) __obj.updateDynamic("fuzzy_match")(fuzzy_match)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[CreateEntityParams]
  }
}

