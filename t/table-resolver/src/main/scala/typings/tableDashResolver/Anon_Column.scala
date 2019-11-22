package typings.tableDashResolver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Column[T] extends js.Object {
  var column: T
}

object Anon_Column {
  @scala.inline
  def apply[T](column: T): Anon_Column[T] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Column[T]]
  }
}

