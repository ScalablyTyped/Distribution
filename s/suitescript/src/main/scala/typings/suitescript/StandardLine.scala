package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StandardLine extends js.Object {
  def getEntityId(): Double
  def getId(): Double
  def getSubsidiaryId(): Double
  def getTaxAmount(): String
  def getTaxItemId(): Double
  def getTaxType(): String
  def getTaxableAmount(): String
  def isPosting(): Boolean
  def isTaxable(): Boolean
}

object StandardLine {
  @scala.inline
  def apply(
    getEntityId: () => Double,
    getId: () => Double,
    getSubsidiaryId: () => Double,
    getTaxAmount: () => String,
    getTaxItemId: () => Double,
    getTaxType: () => String,
    getTaxableAmount: () => String,
    isPosting: () => Boolean,
    isTaxable: () => Boolean
  ): StandardLine = {
    val __obj = js.Dynamic.literal(getEntityId = js.Any.fromFunction0(getEntityId), getId = js.Any.fromFunction0(getId), getSubsidiaryId = js.Any.fromFunction0(getSubsidiaryId), getTaxAmount = js.Any.fromFunction0(getTaxAmount), getTaxItemId = js.Any.fromFunction0(getTaxItemId), getTaxType = js.Any.fromFunction0(getTaxType), getTaxableAmount = js.Any.fromFunction0(getTaxableAmount), isPosting = js.Any.fromFunction0(isPosting), isTaxable = js.Any.fromFunction0(isTaxable))
    __obj.asInstanceOf[StandardLine]
  }
}

