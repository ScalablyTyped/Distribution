package typings
package ydnDashDbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoreSchemaJson extends js.Object {
  var autoIncrement: js.UndefOr[scala.Boolean] = js.undefined
  var dispatchEvents: js.UndefOr[scala.Boolean] = js.undefined
  var indexes: js.UndefOr[js.Array[IndexSchemaJson]] = js.undefined
  var keyPath: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object StoreSchemaJson {
  @scala.inline
  def apply(
    autoIncrement: js.UndefOr[scala.Boolean] = js.undefined,
    dispatchEvents: js.UndefOr[scala.Boolean] = js.undefined,
    indexes: js.Array[IndexSchemaJson] = null,
    keyPath: java.lang.String = null,
    name: java.lang.String = null,
    `type`: java.lang.String = null
  ): StoreSchemaJson = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoIncrement)) __obj.updateDynamic("autoIncrement")(autoIncrement)
    if (!js.isUndefined(dispatchEvents)) __obj.updateDynamic("dispatchEvents")(dispatchEvents)
    if (indexes != null) __obj.updateDynamic("indexes")(indexes)
    if (keyPath != null) __obj.updateDynamic("keyPath")(keyPath)
    if (name != null) __obj.updateDynamic("name")(name)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[StoreSchemaJson]
  }
}

