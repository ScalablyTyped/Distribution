package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomLine extends js.Object {
  def isBookSpecific(): Boolean = js.native
  def setAccountId(accountId: Double): Unit = js.native
  def setBookSpecific(bookSpecific: Boolean): Unit = js.native
  def setClassId(classId: Double): Unit = js.native
  def setCreditAmount(credit: String): Unit = js.native
  def setDebitAmount(debit: String): Unit = js.native
  def setDepartmentId(departmentId: Double): Unit = js.native
  def setLocationId(locationId: Double): Unit = js.native
  def setMemo(memo: String): Unit = js.native
}

object CustomLine {
  @scala.inline
  def apply(
    isBookSpecific: () => Boolean,
    setAccountId: Double => Unit,
    setBookSpecific: Boolean => Unit,
    setClassId: Double => Unit,
    setCreditAmount: String => Unit,
    setDebitAmount: String => Unit,
    setDepartmentId: Double => Unit,
    setLocationId: Double => Unit,
    setMemo: String => Unit
  ): CustomLine = {
    val __obj = js.Dynamic.literal(isBookSpecific = js.Any.fromFunction0(isBookSpecific), setAccountId = js.Any.fromFunction1(setAccountId), setBookSpecific = js.Any.fromFunction1(setBookSpecific), setClassId = js.Any.fromFunction1(setClassId), setCreditAmount = js.Any.fromFunction1(setCreditAmount), setDebitAmount = js.Any.fromFunction1(setDebitAmount), setDepartmentId = js.Any.fromFunction1(setDepartmentId), setLocationId = js.Any.fromFunction1(setLocationId), setMemo = js.Any.fromFunction1(setMemo))
    __obj.asInstanceOf[CustomLine]
  }
  @scala.inline
  implicit class CustomLineOps[Self <: CustomLine] (val x: Self) extends AnyVal {
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
    def setIsBookSpecific(value: () => Boolean): Self = this.set("isBookSpecific", js.Any.fromFunction0(value))
    @scala.inline
    def setSetAccountId(value: Double => Unit): Self = this.set("setAccountId", js.Any.fromFunction1(value))
    @scala.inline
    def setSetBookSpecific(value: Boolean => Unit): Self = this.set("setBookSpecific", js.Any.fromFunction1(value))
    @scala.inline
    def setSetClassId(value: Double => Unit): Self = this.set("setClassId", js.Any.fromFunction1(value))
    @scala.inline
    def setSetCreditAmount(value: String => Unit): Self = this.set("setCreditAmount", js.Any.fromFunction1(value))
    @scala.inline
    def setSetDebitAmount(value: String => Unit): Self = this.set("setDebitAmount", js.Any.fromFunction1(value))
    @scala.inline
    def setSetDepartmentId(value: Double => Unit): Self = this.set("setDepartmentId", js.Any.fromFunction1(value))
    @scala.inline
    def setSetLocationId(value: Double => Unit): Self = this.set("setLocationId", js.Any.fromFunction1(value))
    @scala.inline
    def setSetMemo(value: String => Unit): Self = this.set("setMemo", js.Any.fromFunction1(value))
  }
  
}

