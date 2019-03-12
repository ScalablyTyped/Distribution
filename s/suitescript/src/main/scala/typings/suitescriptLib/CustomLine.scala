package typings
package suitescriptLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomLine extends js.Object {
  def isBookSpecific(): scala.Boolean
  def setAccountId(accountId: scala.Double): scala.Unit
  def setBookSpecific(bookSpecific: scala.Boolean): scala.Unit
  def setClassId(classId: scala.Double): scala.Unit
  def setCreditAmount(credit: java.lang.String): scala.Unit
  def setDebitAmount(debit: java.lang.String): scala.Unit
  def setDepartmentId(departmentId: scala.Double): scala.Unit
  def setLocationId(locationId: scala.Double): scala.Unit
  def setMemo(memo: java.lang.String): scala.Unit
}

object CustomLine {
  @scala.inline
  def apply(
    isBookSpecific: () => scala.Boolean,
    setAccountId: scala.Double => scala.Unit,
    setBookSpecific: scala.Boolean => scala.Unit,
    setClassId: scala.Double => scala.Unit,
    setCreditAmount: java.lang.String => scala.Unit,
    setDebitAmount: java.lang.String => scala.Unit,
    setDepartmentId: scala.Double => scala.Unit,
    setLocationId: scala.Double => scala.Unit,
    setMemo: java.lang.String => scala.Unit
  ): CustomLine = {
    val __obj = js.Dynamic.literal(isBookSpecific = js.Any.fromFunction0(isBookSpecific), setAccountId = js.Any.fromFunction1(setAccountId), setBookSpecific = js.Any.fromFunction1(setBookSpecific), setClassId = js.Any.fromFunction1(setClassId), setCreditAmount = js.Any.fromFunction1(setCreditAmount), setDebitAmount = js.Any.fromFunction1(setDebitAmount), setDepartmentId = js.Any.fromFunction1(setDepartmentId), setLocationId = js.Any.fromFunction1(setLocationId), setMemo = js.Any.fromFunction1(setMemo))
  
    __obj.asInstanceOf[CustomLine]
  }
}

