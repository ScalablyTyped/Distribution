package typings.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** CreateEntity. */
trait CreateEntity extends js.Object {
  /** The timestamp for creation of the object. */
  var created: js.UndefOr[String] = js.undefined
  /** The description of the entity. This string cannot contain carriage return, newline, or tab characters, and it must be no longer than 128 characters. */
  var description: js.UndefOr[String] = js.undefined
  /** The name of the entity. This string must conform to the following restrictions: - It can contain only Unicode alphanumeric, underscore, and hyphen characters. - It must be no longer than 64 characters. If you specify an entity name beginning with the reserved prefix `sys-`, it must be the name of a system entity that you want to enable. (Any entity content specified with the request is ignored.). */
  var entity: String
  /** Whether to use fuzzy matching for the entity. */
  var fuzzy_match: js.UndefOr[Boolean] = js.undefined
  /** Any metadata related to the entity. */
  var metadata: js.UndefOr[js.Object] = js.undefined
  /** The timestamp for the most recent update to the object. */
  var updated: js.UndefOr[String] = js.undefined
  /** An array of objects describing the entity values. */
  var values: js.UndefOr[js.Array[CreateValue]] = js.undefined
}

object CreateEntity {
  @scala.inline
  def apply(
    entity: String,
    created: String = null,
    description: String = null,
    fuzzy_match: js.UndefOr[Boolean] = js.undefined,
    metadata: js.Object = null,
    updated: String = null,
    values: js.Array[CreateValue] = null
  ): CreateEntity = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(fuzzy_match)) __obj.updateDynamic("fuzzy_match")(fuzzy_match.get.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEntity]
  }
}

