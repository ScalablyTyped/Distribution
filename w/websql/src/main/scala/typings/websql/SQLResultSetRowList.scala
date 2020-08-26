package typings.websql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** SQLResultSetRowList objects have a length attribute that must return the number of
  * rows it represents (the number of rows returned by the database). This is the length.
  * Fetching the length might be expensive, and authors are thus encouraged to avoid using
  * it (or enumerating over the object, which implicitly uses it) where possible.
  * The object's supported property indices are the numbers in the range zero to length-1,
  * unless the length is zero, in which case there are no supported property indices.
  * The item(index) attribute must return the row with the given index index.
  * If there is no such row, then the method must return null.
  *
  * Each row must be represented by a native ordered dictionary data type. In the
  * JavaScript binding, this must be Object. Each row object must have one property
  * (or dictionary entry) per column, with those properties enumerating in the order
  * that these columns were returned by the database. Each property must have the
  * name of the column and the value of the cell, as they were returned by the database
  */
@js.native
trait SQLResultSetRowList extends js.Object {
  var length: Double = js.native
  def item(index: Double): js.Any = js.native
}

object SQLResultSetRowList {
  @scala.inline
  def apply(item: Double => js.Any, length: Double): SQLResultSetRowList = {
    val __obj = js.Dynamic.literal(item = js.Any.fromFunction1(item), length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[SQLResultSetRowList]
  }
  @scala.inline
  implicit class SQLResultSetRowListOps[Self <: SQLResultSetRowList] (val x: Self) extends AnyVal {
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
    def setItem(value: Double => js.Any): Self = this.set("item", js.Any.fromFunction1(value))
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
  }
  
}

