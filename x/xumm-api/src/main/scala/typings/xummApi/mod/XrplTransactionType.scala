package typings.xummApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.xummApi.xummApiStrings.Payment
  - typings.xummApi.xummApiStrings.OfferCreate
  - typings.xummApi.xummApiStrings.OfferCancel
  - typings.xummApi.xummApiStrings.EscrowFinish
  - typings.xummApi.xummApiStrings.EscrowCreate
  - typings.xummApi.xummApiStrings.EscrowCancel
  - typings.xummApi.xummApiStrings.DepositPreauth
  - typings.xummApi.xummApiStrings.CheckCreate
  - typings.xummApi.xummApiStrings.CheckCash
  - typings.xummApi.xummApiStrings.CheckCancel
  - typings.xummApi.xummApiStrings.AccountSet
  - typings.xummApi.xummApiStrings.PaymentChannelCreate
  - typings.xummApi.xummApiStrings.PaymentChannelFund
  - typings.xummApi.xummApiStrings.SetRegularKey
  - typings.xummApi.xummApiStrings.SignerListSet
  - typings.xummApi.xummApiStrings.TrustSet
  - typings.xummApi.xummApiStrings.EnableAmendment
  - typings.xummApi.xummApiStrings.SetFee
*/
trait XrplTransactionType extends js.Object

object XrplTransactionType {
  @scala.inline
  def AccountSet: typings.xummApi.xummApiStrings.AccountSet = this.cast("AccountSet")
  @scala.inline
  def CheckCancel: typings.xummApi.xummApiStrings.CheckCancel = this.cast("CheckCancel")
  @scala.inline
  def CheckCash: typings.xummApi.xummApiStrings.CheckCash = this.cast("CheckCash")
  @scala.inline
  def CheckCreate: typings.xummApi.xummApiStrings.CheckCreate = this.cast("CheckCreate")
  @scala.inline
  def DepositPreauth: typings.xummApi.xummApiStrings.DepositPreauth = this.cast("DepositPreauth")
  @scala.inline
  def EnableAmendment: typings.xummApi.xummApiStrings.EnableAmendment = this.cast("EnableAmendment")
  @scala.inline
  def EscrowCancel: typings.xummApi.xummApiStrings.EscrowCancel = this.cast("EscrowCancel")
  @scala.inline
  def EscrowCreate: typings.xummApi.xummApiStrings.EscrowCreate = this.cast("EscrowCreate")
  @scala.inline
  def EscrowFinish: typings.xummApi.xummApiStrings.EscrowFinish = this.cast("EscrowFinish")
  @scala.inline
  def OfferCancel: typings.xummApi.xummApiStrings.OfferCancel = this.cast("OfferCancel")
  @scala.inline
  def OfferCreate: typings.xummApi.xummApiStrings.OfferCreate = this.cast("OfferCreate")
  @scala.inline
  def Payment: typings.xummApi.xummApiStrings.Payment = this.cast("Payment")
  @scala.inline
  def PaymentChannelCreate: typings.xummApi.xummApiStrings.PaymentChannelCreate = this.cast("PaymentChannelCreate")
  @scala.inline
  def PaymentChannelFund: typings.xummApi.xummApiStrings.PaymentChannelFund = this.cast("PaymentChannelFund")
  @scala.inline
  def SetFee: typings.xummApi.xummApiStrings.SetFee = this.cast("SetFee")
  @scala.inline
  def SetRegularKey: typings.xummApi.xummApiStrings.SetRegularKey = this.cast("SetRegularKey")
  @scala.inline
  def SignerListSet: typings.xummApi.xummApiStrings.SignerListSet = this.cast("SignerListSet")
  @scala.inline
  def TrustSet: typings.xummApi.xummApiStrings.TrustSet = this.cast("TrustSet")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

