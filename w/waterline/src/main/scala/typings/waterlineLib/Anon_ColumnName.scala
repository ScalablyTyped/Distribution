package typings
package waterlineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnName[T] extends js.Object {
  var columnName: js.UndefOr[java.lang.String] = js.undefined
  var defaultsTo: js.UndefOr[T | waterlineLib.waterlineMod.DefaultsToFn[T]] = js.undefined
  var enum: js.UndefOr[js.Array[T]] = js.undefined
  var index: js.UndefOr[scala.Boolean] = js.undefined
  var primaryKey: js.UndefOr[scala.Boolean] = js.undefined
  var required: js.UndefOr[scala.Boolean] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var unique: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_ColumnName {
  @scala.inline
  def apply[T](
    columnName: java.lang.String = null,
    defaultsTo: T | waterlineLib.waterlineMod.DefaultsToFn[T] = null,
    enum: js.Array[T] = null,
    index: js.UndefOr[scala.Boolean] = js.undefined,
    primaryKey: js.UndefOr[scala.Boolean] = js.undefined,
    required: js.UndefOr[scala.Boolean] = js.undefined,
    size: scala.Int | scala.Double = null,
    `type`: java.lang.String = null,
    unique: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_ColumnName[T] = {
    val __obj = js.Dynamic.literal()
    if (columnName != null) __obj.updateDynamic("columnName")(columnName)
    if (defaultsTo != null) __obj.updateDynamic("defaultsTo")(defaultsTo.asInstanceOf[js.Any])
    if (enum != null) __obj.updateDynamic("enum")(enum)
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index)
    if (!js.isUndefined(primaryKey)) __obj.updateDynamic("primaryKey")(primaryKey)
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(unique)) __obj.updateDynamic("unique")(unique)
    __obj.asInstanceOf[Anon_ColumnName[T]]
  }
}

