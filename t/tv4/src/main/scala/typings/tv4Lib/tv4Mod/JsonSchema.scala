package typings
package tv4Lib.tv4Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonSchema
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  @JSName("$schema")
  var $schema: js.UndefOr[java.lang.String] = js.undefined
  var additionalProperties: js.UndefOr[scala.Boolean] = js.undefined
  var default: js.UndefOr[js.Any] = js.undefined
  var definitions: js.UndefOr[js.Any] = js.undefined
            // used for humans only, and not used for computation
  var description: js.UndefOr[java.lang.String] = js.undefined
      // used for humans only, and not used for computation
  var id: js.UndefOr[java.lang.String] = js.undefined
  var items: js.UndefOr[js.Any] = js.undefined
  var patternProperties: js.UndefOr[js.Any] = js.undefined
  var properties: js.UndefOr[js.Any] = js.undefined
  var required: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

object JsonSchema {
  @scala.inline
  def apply(
    $schema: java.lang.String = null,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    additionalProperties: js.UndefOr[scala.Boolean] = js.undefined,
    default: js.Any = null,
    definitions: js.Any = null,
    description: java.lang.String = null,
    id: java.lang.String = null,
    items: js.Any = null,
    patternProperties: js.Any = null,
    properties: js.Any = null,
    required: js.Array[java.lang.String] = null,
    title: java.lang.String = null,
    `type`: java.lang.String | js.Array[java.lang.String] = null
  ): JsonSchema = {
    val __obj = js.Dynamic.literal()
    if ($schema != null) __obj.updateDynamic("$schema")($schema)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(additionalProperties)) __obj.updateDynamic("additionalProperties")(additionalProperties)
    if (default != null) __obj.updateDynamic("default")(default)
    if (definitions != null) __obj.updateDynamic("definitions")(definitions)
    if (description != null) __obj.updateDynamic("description")(description)
    if (id != null) __obj.updateDynamic("id")(id)
    if (items != null) __obj.updateDynamic("items")(items)
    if (patternProperties != null) __obj.updateDynamic("patternProperties")(patternProperties)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (required != null) __obj.updateDynamic("required")(required)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonSchema]
  }
}

