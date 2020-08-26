package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountingBook extends js.Object {
  def getId(): Double = js.native
  def isPrimary(): Boolean = js.native
}

object AccountingBook {
  @scala.inline
  def apply(getId: () => Double, isPrimary: () => Boolean): AccountingBook = {
    val __obj = js.Dynamic.literal(getId = js.Any.fromFunction0(getId), isPrimary = js.Any.fromFunction0(isPrimary))
    __obj.asInstanceOf[AccountingBook]
  }
  @scala.inline
  implicit class AccountingBookOps[Self <: AccountingBook] (val x: Self) extends AnyVal {
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
    def setGetId(value: () => Double): Self = this.set("getId", js.Any.fromFunction0(value))
    @scala.inline
    def setIsPrimary(value: () => Boolean): Self = this.set("isPrimary", js.Any.fromFunction0(value))
  }
  
}

