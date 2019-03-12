package typings
package suitescriptLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StandardLine extends js.Object {
  def getEntityId(): scala.Double
  def getId(): scala.Double
  def getSubsidiaryId(): scala.Double
  def getTaxAmount(): java.lang.String
  def getTaxItemId(): scala.Double
  def getTaxType(): java.lang.String
  def getTaxableAmount(): java.lang.String
  def isPosting(): scala.Boolean
  def isTaxable(): scala.Boolean
}

object StandardLine {
  @scala.inline
  def apply(
    getEntityId: () => scala.Double,
    getId: () => scala.Double,
    getSubsidiaryId: () => scala.Double,
    getTaxAmount: () => java.lang.String,
    getTaxItemId: () => scala.Double,
    getTaxType: () => java.lang.String,
    getTaxableAmount: () => java.lang.String,
    isPosting: () => scala.Boolean,
    isTaxable: () => scala.Boolean
  ): StandardLine = {
    val __obj = js.Dynamic.literal(getEntityId = js.Any.fromFunction0(getEntityId), getId = js.Any.fromFunction0(getId), getSubsidiaryId = js.Any.fromFunction0(getSubsidiaryId), getTaxAmount = js.Any.fromFunction0(getTaxAmount), getTaxItemId = js.Any.fromFunction0(getTaxItemId), getTaxType = js.Any.fromFunction0(getTaxType), getTaxableAmount = js.Any.fromFunction0(getTaxableAmount), isPosting = js.Any.fromFunction0(isPosting), isTaxable = js.Any.fromFunction0(isTaxable))
  
    __obj.asInstanceOf[StandardLine]
  }
}

