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
    getEntityId: js.Function0[scala.Double],
    getId: js.Function0[scala.Double],
    getSubsidiaryId: js.Function0[scala.Double],
    getTaxAmount: js.Function0[java.lang.String],
    getTaxItemId: js.Function0[scala.Double],
    getTaxType: js.Function0[java.lang.String],
    getTaxableAmount: js.Function0[java.lang.String],
    isPosting: js.Function0[scala.Boolean],
    isTaxable: js.Function0[scala.Boolean]
  ): StandardLine = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getEntityId")(getEntityId)
    __obj.updateDynamic("getId")(getId)
    __obj.updateDynamic("getSubsidiaryId")(getSubsidiaryId)
    __obj.updateDynamic("getTaxAmount")(getTaxAmount)
    __obj.updateDynamic("getTaxItemId")(getTaxItemId)
    __obj.updateDynamic("getTaxType")(getTaxType)
    __obj.updateDynamic("getTaxableAmount")(getTaxableAmount)
    __obj.updateDynamic("isPosting")(isPosting)
    __obj.updateDynamic("isTaxable")(isTaxable)
    __obj.asInstanceOf[StandardLine]
  }
}

