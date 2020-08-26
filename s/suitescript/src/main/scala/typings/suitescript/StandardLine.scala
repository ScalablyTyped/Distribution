package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StandardLine extends js.Object {
  def getEntityId(): Double = js.native
  def getId(): Double = js.native
  def getSubsidiaryId(): Double = js.native
  def getTaxAmount(): String = js.native
  def getTaxItemId(): Double = js.native
  def getTaxType(): String = js.native
  def getTaxableAmount(): String = js.native
  def isPosting(): Boolean = js.native
  def isTaxable(): Boolean = js.native
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
  @scala.inline
  implicit class StandardLineOps[Self <: StandardLine] (val x: Self) extends AnyVal {
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
    def setGetEntityId(value: () => Double): Self = this.set("getEntityId", js.Any.fromFunction0(value))
    @scala.inline
    def setGetId(value: () => Double): Self = this.set("getId", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSubsidiaryId(value: () => Double): Self = this.set("getSubsidiaryId", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTaxAmount(value: () => String): Self = this.set("getTaxAmount", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTaxItemId(value: () => Double): Self = this.set("getTaxItemId", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTaxType(value: () => String): Self = this.set("getTaxType", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTaxableAmount(value: () => String): Self = this.set("getTaxableAmount", js.Any.fromFunction0(value))
    @scala.inline
    def setIsPosting(value: () => Boolean): Self = this.set("isPosting", js.Any.fromFunction0(value))
    @scala.inline
    def setIsTaxable(value: () => Boolean): Self = this.set("isTaxable", js.Any.fromFunction0(value))
  }
  
}

