package typings
package ydnDashDbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexSchemaJson extends js.Object {
  var keyPath: java.lang.String | js.Array[java.lang.String]
  var multiEntry: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var unique: js.UndefOr[scala.Boolean] = js.undefined
}

object IndexSchemaJson {
  @scala.inline
  def apply(
    keyPath: java.lang.String | js.Array[java.lang.String],
    multiEntry: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    `type`: java.lang.String = null,
    unique: js.UndefOr[scala.Boolean] = js.undefined
  ): IndexSchemaJson = {
    val __obj = js.Dynamic.literal(keyPath = keyPath.asInstanceOf[js.Any])
    if (!js.isUndefined(multiEntry)) __obj.updateDynamic("multiEntry")(multiEntry)
    if (name != null) __obj.updateDynamic("name")(name)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(unique)) __obj.updateDynamic("unique")(unique)
    __obj.asInstanceOf[IndexSchemaJson]
  }
}

