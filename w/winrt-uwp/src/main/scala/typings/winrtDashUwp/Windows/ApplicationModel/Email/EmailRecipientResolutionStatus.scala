package typings.winrtDashUwp.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmailRecipientResolutionStatus with Double] = js.native
  /* 2 */ @js.native
  object ambiguousRecipient extends TopLevel[ambiguousRecipient with Double]
  
  /* 5 */ @js.native
  object cannotResolveDistributionList extends TopLevel[cannotResolveDistributionList with Double]
  
  /* 4 */ @js.native
  object certificateRequestLimitReached extends TopLevel[certificateRequestLimitReached with Double]
  
  /* 3 */ @js.native
  object noCertificate extends TopLevel[noCertificate with Double]
  
  /* 1 */ @js.native
  object recipientNotFound extends TopLevel[recipientNotFound with Double]
  
  /* 6 */ @js.native
  object serverError extends TopLevel[serverError with Double]
  
  /* 0 */ @js.native
  object success extends TopLevel[success with Double]
  
  /* 7 */ @js.native
  object unknownFailure extends TopLevel[unknownFailure with Double]
  
}

