package typings.xummApi

import typings.xummApi.mod.XrplTransactionType
import typings.xummApi.mod.XummCancelReason
import typings.xummApi.mod.XummQrQuality
import typings.xummApi.mod.XummTransactionApprovalType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object xummApiStrings {
  @js.native
  sealed trait ALREADY_CANCELLED extends XummCancelReason
  
  @js.native
  sealed trait ALREADY_EXPIRED extends XummCancelReason
  
  @js.native
  sealed trait ALREADY_OPENED extends XummCancelReason
  
  @js.native
  sealed trait ALREADY_RESOLVED extends XummCancelReason
  
  @js.native
  sealed trait AccountDelete extends XrplTransactionType
  
  @js.native
  sealed trait AccountSet extends XrplTransactionType
  
  @js.native
  sealed trait BIOMETRIC extends XummTransactionApprovalType
  
  @js.native
  sealed trait CheckCancel extends XrplTransactionType
  
  @js.native
  sealed trait CheckCash extends XrplTransactionType
  
  @js.native
  sealed trait CheckCreate extends XrplTransactionType
  
  @js.native
  sealed trait DepositPreauth extends XrplTransactionType
  
  @js.native
  sealed trait EnableAmendment extends XrplTransactionType
  
  @js.native
  sealed trait EscrowCancel extends XrplTransactionType
  
  @js.native
  sealed trait EscrowCreate extends XrplTransactionType
  
  @js.native
  sealed trait EscrowFinish extends XrplTransactionType
  
  @js.native
  sealed trait OTHER extends XummTransactionApprovalType
  
  @js.native
  sealed trait OfferCancel extends XrplTransactionType
  
  @js.native
  sealed trait OfferCreate extends XrplTransactionType
  
  @js.native
  sealed trait PASSPHRASE extends XummTransactionApprovalType
  
  @js.native
  sealed trait PIN extends XummTransactionApprovalType
  
  @js.native
  sealed trait Payment extends XrplTransactionType
  
  @js.native
  sealed trait PaymentChannelCreate extends XrplTransactionType
  
  @js.native
  sealed trait PaymentChannelFund extends XrplTransactionType
  
  @js.native
  sealed trait SetFee extends XrplTransactionType
  
  @js.native
  sealed trait SetRegularKey extends XrplTransactionType
  
  @js.native
  sealed trait SignIn extends js.Object
  
  @js.native
  sealed trait SignerListSet extends XrplTransactionType
  
  @js.native
  sealed trait TrustSet extends XrplTransactionType
  
  @js.native
  sealed trait h extends XummQrQuality
  
  @js.native
  sealed trait m extends XummQrQuality
  
  @js.native
  sealed trait q extends XummQrQuality
  
  @scala.inline
  def ALREADY_CANCELLED: ALREADY_CANCELLED = "ALREADY_CANCELLED".asInstanceOf[ALREADY_CANCELLED]
  @scala.inline
  def ALREADY_EXPIRED: ALREADY_EXPIRED = "ALREADY_EXPIRED".asInstanceOf[ALREADY_EXPIRED]
  @scala.inline
  def ALREADY_OPENED: ALREADY_OPENED = "ALREADY_OPENED".asInstanceOf[ALREADY_OPENED]
  @scala.inline
  def ALREADY_RESOLVED: ALREADY_RESOLVED = "ALREADY_RESOLVED".asInstanceOf[ALREADY_RESOLVED]
  @scala.inline
  def AccountDelete: AccountDelete = "AccountDelete".asInstanceOf[AccountDelete]
  @scala.inline
  def AccountSet: AccountSet = "AccountSet".asInstanceOf[AccountSet]
  @scala.inline
  def BIOMETRIC: BIOMETRIC = "BIOMETRIC".asInstanceOf[BIOMETRIC]
  @scala.inline
  def CheckCancel: CheckCancel = "CheckCancel".asInstanceOf[CheckCancel]
  @scala.inline
  def CheckCash: CheckCash = "CheckCash".asInstanceOf[CheckCash]
  @scala.inline
  def CheckCreate: CheckCreate = "CheckCreate".asInstanceOf[CheckCreate]
  @scala.inline
  def DepositPreauth: DepositPreauth = "DepositPreauth".asInstanceOf[DepositPreauth]
  @scala.inline
  def EnableAmendment: EnableAmendment = "EnableAmendment".asInstanceOf[EnableAmendment]
  @scala.inline
  def EscrowCancel: EscrowCancel = "EscrowCancel".asInstanceOf[EscrowCancel]
  @scala.inline
  def EscrowCreate: EscrowCreate = "EscrowCreate".asInstanceOf[EscrowCreate]
  @scala.inline
  def EscrowFinish: EscrowFinish = "EscrowFinish".asInstanceOf[EscrowFinish]
  @scala.inline
  def OTHER: OTHER = "OTHER".asInstanceOf[OTHER]
  @scala.inline
  def OfferCancel: OfferCancel = "OfferCancel".asInstanceOf[OfferCancel]
  @scala.inline
  def OfferCreate: OfferCreate = "OfferCreate".asInstanceOf[OfferCreate]
  @scala.inline
  def PASSPHRASE: PASSPHRASE = "PASSPHRASE".asInstanceOf[PASSPHRASE]
  @scala.inline
  def PIN: PIN = "PIN".asInstanceOf[PIN]
  @scala.inline
  def Payment: Payment = "Payment".asInstanceOf[Payment]
  @scala.inline
  def PaymentChannelCreate: PaymentChannelCreate = "PaymentChannelCreate".asInstanceOf[PaymentChannelCreate]
  @scala.inline
  def PaymentChannelFund: PaymentChannelFund = "PaymentChannelFund".asInstanceOf[PaymentChannelFund]
  @scala.inline
  def SetFee: SetFee = "SetFee".asInstanceOf[SetFee]
  @scala.inline
  def SetRegularKey: SetRegularKey = "SetRegularKey".asInstanceOf[SetRegularKey]
  @scala.inline
  def SignIn: SignIn = "SignIn".asInstanceOf[SignIn]
  @scala.inline
  def SignerListSet: SignerListSet = "SignerListSet".asInstanceOf[SignerListSet]
  @scala.inline
  def TrustSet: TrustSet = "TrustSet".asInstanceOf[TrustSet]
  @scala.inline
  def h: h = "h".asInstanceOf[h]
  @scala.inline
  def m: m = "m".asInstanceOf[m]
  @scala.inline
  def q: q = "q".asInstanceOf[q]
}

