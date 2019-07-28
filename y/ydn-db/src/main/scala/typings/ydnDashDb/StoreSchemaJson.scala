package typings.ydnDashDb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoreSchemaJson extends js.Object {
  var autoIncrement: js.UndefOr[Boolean] = js.undefined
  var dispatchEvents: js.UndefOr[Boolean] = js.undefined
  var indexes: js.UndefOr[js.Array[IndexSchemaJson]] = js.undefined
  var keyPath: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object StoreSchemaJson {
  @scala.inline
  def apply(
    autoIncrement: js.UndefOr[Boolean] = js.undefined,
    dispatchEvents: js.UndefOr[Boolean] = js.undefined,
    indexes: js.Array[IndexSchemaJson] = null,
    keyPath: String = null,
    name: String = null,
    `type`: String = null
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

