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
    isBookSpecific: js.Function0[scala.Boolean],
    setAccountId: js.Function1[scala.Double, scala.Unit],
    setBookSpecific: js.Function1[scala.Boolean, scala.Unit],
    setClassId: js.Function1[scala.Double, scala.Unit],
    setCreditAmount: js.Function1[java.lang.String, scala.Unit],
    setDebitAmount: js.Function1[java.lang.String, scala.Unit],
    setDepartmentId: js.Function1[scala.Double, scala.Unit],
    setLocationId: js.Function1[scala.Double, scala.Unit],
    setMemo: js.Function1[java.lang.String, scala.Unit]
  ): CustomLine = {
    val __obj = js.Dynamic.literal(isBookSpecific = isBookSpecific, setAccountId = setAccountId, setBookSpecific = setBookSpecific, setClassId = setClassId, setCreditAmount = setCreditAmount, setDebitAmount = setDebitAmount, setDepartmentId = setDepartmentId, setLocationId = setLocationId, setMemo = setMemo)
  
    __obj.asInstanceOf[CustomLine]
  }
}

