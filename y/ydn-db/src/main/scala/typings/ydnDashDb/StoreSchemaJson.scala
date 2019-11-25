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
    if (!js.isUndefined(autoIncrement)) __obj.updateDynamic("autoIncrement")(autoIncrement.asInstanceOf[js.Any])
    if (!js.isUndefined(dispatchEvents)) __obj.updateDynamic("dispatchEvents")(dispatchEvents.asInstanceOf[js.Any])
    if (indexes != null) __obj.updateDynamic("indexes")(indexes.asInstanceOf[js.Any])
    if (keyPath != null) __obj.updateDynamic("keyPath")(keyPath.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreSchemaJson]
  }
}

