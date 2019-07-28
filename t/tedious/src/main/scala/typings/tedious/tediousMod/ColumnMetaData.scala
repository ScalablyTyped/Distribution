package typings.tedious.tediousMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnMetaData extends js.Object {
  /**
    * The column's name
    */
  var colName: String
  /**
    * The length, for char, varchar, nvarchar and varbinary.
    */
  var dataLength: js.UndefOr[Double] = js.undefined
  /**
    * The precision. Only applicable to numeric and decimal.
    */
  var precision: js.UndefOr[Double] = js.undefined
  /**
    * The scale. Only applicable to numeric, decimal, time, datetime2 and datetimeoffset.
    */
  var scale: js.UndefOr[Double] = js.undefined
  /**
    * The column type.
    */
  var `type`: ColumnType
}

object ColumnMetaData {
  @scala.inline
  def apply(
    colName: String,
    `type`: ColumnType,
    dataLength: Int | Double = null,
    precision: Int | Double = null,
    scale: Int | Double = null
  ): ColumnMetaData = {
    val __obj = js.Dynamic.literal(colName = colName)
    __obj.updateDynamic("type")(`type`)
    if (dataLength != null) __obj.updateDynamic("dataLength")(dataLength.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnMetaData]
  }
}

