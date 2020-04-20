package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomLine extends js.Object {
  def isBookSpecific(): Boolean
  def setAccountId(accountId: Double): Unit
  def setBookSpecific(bookSpecific: Boolean): Unit
  def setClassId(classId: Double): Unit
  def setCreditAmount(credit: String): Unit
  def setDebitAmount(debit: String): Unit
  def setDepartmentId(departmentId: Double): Unit
  def setLocationId(locationId: Double): Unit
  def setMemo(memo: String): Unit
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
}

