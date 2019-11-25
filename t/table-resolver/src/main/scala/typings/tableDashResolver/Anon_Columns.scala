package typings.tableDashResolver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Columns[T] extends js.Object {
  var columns: js.Array[T]
}

object Anon_Columns {
  @scala.inline
  def apply[T](columns: js.Array[T]): Anon_Columns[T] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Columns[T]]
  }
}

