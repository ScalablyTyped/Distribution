package typings.tedious.mod

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
    dataLength: js.UndefOr[Double] = js.undefined,
    precision: js.UndefOr[Double] = js.undefined,
    scale: js.UndefOr[Double] = js.undefined
  ): ColumnMetaData = {
    val __obj = js.Dynamic.literal(colName = colName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(dataLength)) __obj.updateDynamic("dataLength")(dataLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(precision)) __obj.updateDynamic("precision")(precision.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnMetaData]
  }
}

