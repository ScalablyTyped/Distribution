package typings.winrtDashUwp.Windows.ApplicationModel.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EmailRecipientResolutionStatus extends js.Object

/** Describes the state of an attempt to resolve an email recipient. */
@JSGlobal("Windows.ApplicationModel.Email.EmailRecipientResolutionStatus")
@js.native
object EmailRecipientResolutionStatus extends js.Object {
  /** Resolution failed. Multiple results returned. Refinement needed. */
  @js.native
  sealed trait ambiguousRecipient extends EmailRecipientResolutionStatus
  
  /** Resolution failed. The distribution list cannot be accessed. */
  @js.native
  sealed trait cannotResolveDistributionList extends EmailRecipientResolutionStatus
  
  /** Resolution failed. The limit of allowed requests for the current certificate has been reached. */
  @js.native
  sealed trait certificateRequestLimitReached extends EmailRecipientResolutionStatus
  
  /** Resolution failed. No valid certificate present. */
  @js.native
  sealed trait noCertificate extends EmailRecipientResolutionStatus
  
  /** Resolution failed. Recipient cannot be resolved because no match found in distribution list. */
  @js.native
  sealed trait recipientNotFound extends EmailRecipientResolutionStatus
  
  /** Resolution failed. There has been an error on the server. */
  @js.native
  sealed trait serverError extends EmailRecipientResolutionStatus
  
  /** Success. Email recipient resolved. */
  @js.native
  sealed trait success extends EmailRecipientResolutionStatus
  
  /** Resolution failed for unknown reason. */
  @js.native
  sealed trait unknownFailure extends EmailRecipientResolutionStatus
  
  /* 2 */ val ambiguousRecipient: typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailRecipientResolutionStatus.ambiguousRecipient with Double = js.native
  /* 5 */ val cannotResolveDistributionList: typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailRecipientResolutionStatus.cannotResolveDistributionList with Double = js.native
  /* 4 */ val certificateRequestLimitReached: typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailRecipientResolutionStatus.certificateRequestLimitReached with Double = js.native
  /* 3 */ val noCertificate: typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailRecipientResolutionStatus.noCertificate with Double = js.native
  /* 1 */ val recipientNotFound: typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailRecipientResolutionStatus.recipientNotFound with Double = js.native
  /* 6 */ val serverError: typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailRecipientResolutionStatus.serverError with Double = js.native
  /* 0 */ val success: typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailRecipientResolutionStatus.success with Double = js.native
  /* 7 */ val unknownFailure: typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailRecipientResolutionStatus.unknownFailure with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmailRecipientResolutionStatus with Double] = js.native
}

