package typings.vegaTypings.runtimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Item[T] extends js.Object {
  /**
    * The underlying data element to which this item corresponds.
    */
  var datum: T = js.native
  /**
    * The mark to which this item belongs.
    */
  var mark: RuntimeMark = js.native
}

object Item {
  @scala.inline
  def apply[T](datum: T, mark: RuntimeMark): Item[T] = {
    val __obj = js.Dynamic.literal(datum = datum.asInstanceOf[js.Any], mark = mark.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item[T]]
  }
  @scala.inline
  implicit class ItemOps[Self <: Item[_], T] (val x: Self with Item[T]) extends AnyVal {
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
    def setDatum(value: T): Self = this.set("datum", value.asInstanceOf[js.Any])
    @scala.inline
    def setMark(value: RuntimeMark): Self = this.set("mark", value.asInstanceOf[js.Any])
  }
  
}

