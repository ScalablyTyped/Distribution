package typings.tableResolver.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Column[T] extends js.Object {
  var column: T = js.native
}

object Column {
  @scala.inline
  def apply[T](column: T): Column[T] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column[T]]
  }
  @scala.inline
  implicit class ColumnOps[Self <: Column[_], T] (val x: Self with Column[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setColumn(value: T): Self = this.set("column", value.asInstanceOf[js.Any])
  }
  
}

