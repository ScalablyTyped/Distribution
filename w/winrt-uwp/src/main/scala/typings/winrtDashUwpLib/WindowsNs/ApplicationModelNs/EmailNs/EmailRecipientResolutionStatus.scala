package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs

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
  sealed trait ambiguousRecipient
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailRecipientResolutionStatus
  
  /** Resolution failed. The distribution list cannot be accessed. */
  @js.native
  sealed trait cannotResolveDistributionList
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailRecipientResolutionStatus
  
  /** Resolution failed. The limit of allowed requests for the current certificate has been reached. */
  @js.native
  sealed trait certificateRequestLimitReached
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailRecipientResolutionStatus
  
  /** Resolution failed. No valid certificate present. */
  @js.native
  sealed trait noCertificate
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailRecipientResolutionStatus
  
  /** Resolution failed. Recipient cannot be resolved because no match found in distribution list. */
  @js.native
  sealed trait recipientNotFound
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailRecipientResolutionStatus
  
  /** Resolution failed. There has been an error on the server. */
  @js.native
  sealed trait serverError
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailRecipientResolutionStatus
  
  /** Success. Email recipient resolved. */
  @js.native
  sealed trait success
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailRecipientResolutionStatus
  
  /** Resolution failed for unknown reason. */
  @js.native
  sealed trait unknownFailure
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailRecipientResolutionStatus
  
  /* 2 */ val ambiguousRecipient: ambiguousRecipient with scala.Double = js.native
  /* 5 */ val cannotResolveDistributionList: cannotResolveDistributionList with scala.Double = js.native
  /* 4 */ val certificateRequestLimitReached: certificateRequestLimitReached with scala.Double = js.native
  /* 3 */ val noCertificate: noCertificate with scala.Double = js.native
  /* 1 */ val recipientNotFound: recipientNotFound with scala.Double = js.native
  /* 6 */ val serverError: serverError with scala.Double = js.native
  /* 0 */ val success: success with scala.Double = js.native
  /* 7 */ val unknownFailure: unknownFailure with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailRecipientResolutionStatus with scala.Double
  ] = js.native
}

