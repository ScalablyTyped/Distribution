package typings.utility.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * -----------------0_0---------------------------
  * @description Defines For Optimize Methods
  * @see https://github.com/node-modules/utility#argumentstoarray
  * -----------------0^0------------------------
  */
@js.native
trait ITryStaticReturns extends js.Object {
  var error: js.UndefOr[Error] = js.native
  var value: js.Any = js.native
}

object ITryStaticReturns {
  @scala.inline
  def apply(value: js.Any): ITryStaticReturns = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITryStaticReturns]
  }
  @scala.inline
  implicit class ITryStaticReturnsOps[Self <: ITryStaticReturns] (val x: Self) extends AnyVal {
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
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: Error): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
  }
  
}

