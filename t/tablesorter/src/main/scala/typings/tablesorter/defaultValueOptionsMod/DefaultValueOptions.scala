package typings.tablesorter.defaultValueOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultValueOptions[T] extends js.Object {
  /**
    * The default value of the control.
    */
  var value: js.UndefOr[T] = js.native
}

object DefaultValueOptions {
  @scala.inline
  def apply[T](): DefaultValueOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultValueOptions[T]]
  }
  @scala.inline
  implicit class DefaultValueOptionsOps[Self <: DefaultValueOptions[_], T] (val x: Self with DefaultValueOptions[T]) extends AnyVal {
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
    def setValue(value: T): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

