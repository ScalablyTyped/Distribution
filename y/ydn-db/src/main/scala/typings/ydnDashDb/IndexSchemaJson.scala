package typings.ydnDashDb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexSchemaJson extends js.Object {
  var keyPath: String | js.Array[String]
  var multiEntry: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var unique: js.UndefOr[Boolean] = js.undefined
}

object IndexSchemaJson {
  @scala.inline
  def apply(
    keyPath: String | js.Array[String],
    multiEntry: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    `type`: String = null,
    unique: js.UndefOr[Boolean] = js.undefined
  ): IndexSchemaJson = {
    val __obj = js.Dynamic.literal(keyPath = keyPath.asInstanceOf[js.Any])
    if (!js.isUndefined(multiEntry)) __obj.updateDynamic("multiEntry")(multiEntry)
    if (name != null) __obj.updateDynamic("name")(name)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(unique)) __obj.updateDynamic("unique")(unique)
    __obj.asInstanceOf[IndexSchemaJson]
  }
}

