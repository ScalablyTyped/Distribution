package typings.xummSdk

import typings.xummSdk.distSrcTypesXummApiMod.XrplTransactionType
import typings.xummSdk.distSrcTypesXummApiMod.XummCancelReason
import typings.xummSdk.distSrcTypesXummApiMod.XummQrQuality
import typings.xummSdk.distSrcTypesXummApiMod.XummTransactionApprovalType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xummSdkStrings {
  
  @js.native
  sealed trait ALREADY_CANCELLED
    extends StObject
       with XummCancelReason
  inline def ALREADY_CANCELLED: ALREADY_CANCELLED = "ALREADY_CANCELLED".asInstanceOf[ALREADY_CANCELLED]
  
  @js.native
  sealed trait ALREADY_EXPIRED
    extends StObject
       with XummCancelReason
  inline def ALREADY_EXPIRED: ALREADY_EXPIRED = "ALREADY_EXPIRED".asInstanceOf[ALREADY_EXPIRED]
  
  @js.native
  sealed trait ALREADY_OPENED
    extends StObject
       with XummCancelReason
  inline def ALREADY_OPENED: ALREADY_OPENED = "ALREADY_OPENED".asInstanceOf[ALREADY_OPENED]
  
  @js.native
  sealed trait ALREADY_RESOLVED
    extends StObject
       with XummCancelReason
  inline def ALREADY_RESOLVED: ALREADY_RESOLVED = "ALREADY_RESOLVED".asInstanceOf[ALREADY_RESOLVED]
  
  @js.native
  sealed trait AccountDelete
    extends StObject
       with XrplTransactionType
  inline def AccountDelete: AccountDelete = "AccountDelete".asInstanceOf[AccountDelete]
  
  @js.native
  sealed trait AccountSet
    extends StObject
       with XrplTransactionType
  inline def AccountSet: AccountSet = "AccountSet".asInstanceOf[AccountSet]
  
  @js.native
  sealed trait BIOMETRIC
    extends StObject
       with XummTransactionApprovalType
  inline def BIOMETRIC: BIOMETRIC = "BIOMETRIC".asInstanceOf[BIOMETRIC]
  
  @js.native
  sealed trait CheckCancel
    extends StObject
       with XrplTransactionType
  inline def CheckCancel: CheckCancel = "CheckCancel".asInstanceOf[CheckCancel]
  
  @js.native
  sealed trait CheckCash
    extends StObject
       with XrplTransactionType
  inline def CheckCash: CheckCash = "CheckCash".asInstanceOf[CheckCash]
  
  @js.native
  sealed trait CheckCreate
    extends StObject
       with XrplTransactionType
  inline def CheckCreate: CheckCreate = "CheckCreate".asInstanceOf[CheckCreate]
  
  @js.native
  sealed trait DepositPreauth
    extends StObject
       with XrplTransactionType
  inline def DepositPreauth: DepositPreauth = "DepositPreauth".asInstanceOf[DepositPreauth]
  
  @js.native
  sealed trait EscrowCancel
    extends StObject
       with XrplTransactionType
  inline def EscrowCancel: EscrowCancel = "EscrowCancel".asInstanceOf[EscrowCancel]
  
  @js.native
  sealed trait EscrowCreate
    extends StObject
       with XrplTransactionType
  inline def EscrowCreate: EscrowCreate = "EscrowCreate".asInstanceOf[EscrowCreate]
  
  @js.native
  sealed trait EscrowFinish
    extends StObject
       with XrplTransactionType
  inline def EscrowFinish: EscrowFinish = "EscrowFinish".asInstanceOf[EscrowFinish]
  
  @js.native
  sealed trait IN_PROGRESS extends StObject
  inline def IN_PROGRESS: IN_PROGRESS = "IN_PROGRESS".asInstanceOf[IN_PROGRESS]
  
  @js.native
  sealed trait LIST extends StObject
  inline def LIST: LIST = "LIST".asInstanceOf[LIST]
  
  @js.native
  sealed trait NFTokenAcceptOffer
    extends StObject
       with XrplTransactionType
  inline def NFTokenAcceptOffer: NFTokenAcceptOffer = "NFTokenAcceptOffer".asInstanceOf[NFTokenAcceptOffer]
  
  @js.native
  sealed trait NFTokenBurn
    extends StObject
       with XrplTransactionType
  inline def NFTokenBurn: NFTokenBurn = "NFTokenBurn".asInstanceOf[NFTokenBurn]
  
  @js.native
  sealed trait NFTokenCancelOffer
    extends StObject
       with XrplTransactionType
  inline def NFTokenCancelOffer: NFTokenCancelOffer = "NFTokenCancelOffer".asInstanceOf[NFTokenCancelOffer]
  
  @js.native
  sealed trait NFTokenCreateOffer
    extends StObject
       with XrplTransactionType
  inline def NFTokenCreateOffer: NFTokenCreateOffer = "NFTokenCreateOffer".asInstanceOf[NFTokenCreateOffer]
  
  @js.native
  sealed trait NFTokenMint
    extends StObject
       with XrplTransactionType
  inline def NFTokenMint: NFTokenMint = "NFTokenMint".asInstanceOf[NFTokenMint]
  
  @js.native
  sealed trait NONE extends StObject
  inline def NONE: NONE = "NONE".asInstanceOf[NONE]
  
  @js.native
  sealed trait OK
    extends StObject
       with XummCancelReason
  inline def OK: OK = "OK".asInstanceOf[OK]
  
  @js.native
  sealed trait OTHER
    extends StObject
       with XummTransactionApprovalType
  inline def OTHER: OTHER = "OTHER".asInstanceOf[OTHER]
  
  @js.native
  sealed trait OfferCancel
    extends StObject
       with XrplTransactionType
  inline def OfferCancel: OfferCancel = "OfferCancel".asInstanceOf[OfferCancel]
  
  @js.native
  sealed trait OfferCreate
    extends StObject
       with XrplTransactionType
  inline def OfferCreate: OfferCreate = "OfferCreate".asInstanceOf[OfferCreate]
  
  @js.native
  sealed trait PASSPHRASE
    extends StObject
       with XummTransactionApprovalType
  inline def PASSPHRASE: PASSPHRASE = "PASSPHRASE".asInstanceOf[PASSPHRASE]
  
  @js.native
  sealed trait PERSIST extends StObject
  inline def PERSIST: PERSIST = "PERSIST".asInstanceOf[PERSIST]
  
  @js.native
  sealed trait PIN
    extends StObject
       with XummTransactionApprovalType
  inline def PIN: PIN = "PIN".asInstanceOf[PIN]
  
  @js.native
  sealed trait Payment
    extends StObject
       with XrplTransactionType
  inline def Payment: Payment = "Payment".asInstanceOf[Payment]
  
  @js.native
  sealed trait PaymentChannelClaim
    extends StObject
       with XrplTransactionType
  inline def PaymentChannelClaim: PaymentChannelClaim = "PaymentChannelClaim".asInstanceOf[PaymentChannelClaim]
  
  @js.native
  sealed trait PaymentChannelCreate
    extends StObject
       with XrplTransactionType
  inline def PaymentChannelCreate: PaymentChannelCreate = "PaymentChannelCreate".asInstanceOf[PaymentChannelCreate]
  
  @js.native
  sealed trait PaymentChannelFund
    extends StObject
       with XrplTransactionType
  inline def PaymentChannelFund: PaymentChannelFund = "PaymentChannelFund".asInstanceOf[PaymentChannelFund]
  
  @js.native
  sealed trait REJECTED extends StObject
  inline def REJECTED: REJECTED = "REJECTED".asInstanceOf[REJECTED]
  
  @js.native
  sealed trait REMOVE extends StObject
  inline def REMOVE: REMOVE = "REMOVE".asInstanceOf[REMOVE]
  
  @js.native
  sealed trait RETRIEVE extends StObject
  inline def RETRIEVE: RETRIEVE = "RETRIEVE".asInstanceOf[RETRIEVE]
  
  @js.native
  sealed trait SUCCESSFUL extends StObject
  inline def SUCCESSFUL: SUCCESSFUL = "SUCCESSFUL".asInstanceOf[SUCCESSFUL]
  
  @js.native
  sealed trait SetRegularKey
    extends StObject
       with XrplTransactionType
  inline def SetRegularKey: SetRegularKey = "SetRegularKey".asInstanceOf[SetRegularKey]
  
  @js.native
  sealed trait SignIn extends StObject
  inline def SignIn: SignIn = "SignIn".asInstanceOf[SignIn]
  
  @js.native
  sealed trait SignerListSet
    extends StObject
       with XrplTransactionType
  inline def SignerListSet: SignerListSet = "SignerListSet".asInstanceOf[SignerListSet]
  
  @js.native
  sealed trait TicketCreate
    extends StObject
       with XrplTransactionType
  inline def TicketCreate: TicketCreate = "TicketCreate".asInstanceOf[TicketCreate]
  
  @js.native
  sealed trait TrustSet
    extends StObject
       with XrplTransactionType
  inline def TrustSet: TrustSet = "TrustSet".asInstanceOf[TrustSet]
  
  @js.native
  sealed trait h
    extends StObject
       with XummQrQuality
  inline def h: h = "h".asInstanceOf[h]
  
  @js.native
  sealed trait m
    extends StObject
       with XummQrQuality
  inline def m: m = "m".asInstanceOf[m]
  
  @js.native
  sealed trait q
    extends StObject
       with XummQrQuality
  inline def q: q = "q".asInstanceOf[q]
}
