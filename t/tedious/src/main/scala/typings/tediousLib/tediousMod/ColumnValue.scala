package typings
package tediousLib.tediousMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnValue extends js.Object {
  var metadata: ColumnMetaData
  var value: js.Any
}

object ColumnValue {
  @scala.inline
  def apply(metadata: ColumnMetaData, value: js.Any): ColumnValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("metadata")(metadata)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ColumnValue]
  }
}

