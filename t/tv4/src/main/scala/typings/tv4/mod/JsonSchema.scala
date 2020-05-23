package typings.tv4.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonSchema
  extends /* key */ StringDictionary[js.Any] {
  @JSName("$schema")
  var $schema: js.UndefOr[String] = js.undefined
  var additionalProperties: js.UndefOr[Boolean] = js.undefined
  var default: js.UndefOr[js.Any] = js.undefined
  var definitions: js.UndefOr[js.Any] = js.undefined
            // used for humans only, and not used for computation
  var description: js.UndefOr[String] = js.undefined
      // used for humans only, and not used for computation
  var id: js.UndefOr[String] = js.undefined
  var items: js.UndefOr[js.Any] = js.undefined
  var patternProperties: js.UndefOr[js.Any] = js.undefined
  var properties: js.UndefOr[js.Any] = js.undefined
  var required: js.UndefOr[js.Array[String]] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String | js.Array[String]] = js.undefined
}

object JsonSchema {
  @scala.inline
  def apply(
    $schema: String = null,
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    additionalProperties: js.UndefOr[Boolean] = js.undefined,
    default: js.Any = null,
    definitions: js.Any = null,
    description: String = null,
    id: String = null,
    items: js.Any = null,
    patternProperties: js.Any = null,
    properties: js.Any = null,
    required: js.Array[String] = null,
    title: String = null,
    `type`: String | js.Array[String] = null
  ): JsonSchema = {
    val __obj = js.Dynamic.literal()
    if ($schema != null) __obj.updateDynamic("$schema")($schema.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(additionalProperties)) __obj.updateDynamic("additionalProperties")(additionalProperties.get.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (definitions != null) __obj.updateDynamic("definitions")(definitions.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (patternProperties != null) __obj.updateDynamic("patternProperties")(patternProperties.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (required != null) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonSchema]
  }
}

