package typings
package tediousLib.tediousMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnType extends js.Object {
  /**
    * The column's type, such as VarChar, Int or Binary.
    */
  var name: java.lang.String
}

object ColumnType {
  @scala.inline
  def apply(name: java.lang.String): ColumnType = {
    val __obj = js.Dynamic.literal(name = name)
  
    __obj.asInstanceOf[ColumnType]
  }
}

