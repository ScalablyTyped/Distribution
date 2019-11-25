package typings.tedious.tediousMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnType extends js.Object {
  /**
    * The column's type, such as VarChar, Int or Binary.
    */
  var name: String
}

object ColumnType {
  @scala.inline
  def apply(name: String): ColumnType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ColumnType]
  }
}

