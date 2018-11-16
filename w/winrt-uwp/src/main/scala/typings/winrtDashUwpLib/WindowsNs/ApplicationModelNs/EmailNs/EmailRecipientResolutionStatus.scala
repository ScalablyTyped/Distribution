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
  
  val ambiguousRecipient: ambiguousRecipient with java.lang.String = js.native
  val cannotResolveDistributionList: cannotResolveDistributionList with java.lang.String = js.native
  val certificateRequestLimitReached: certificateRequestLimitReached with java.lang.String = js.native
  val noCertificate: noCertificate with java.lang.String = js.native
  val recipientNotFound: recipientNotFound with java.lang.String = js.native
  val serverError: serverError with java.lang.String = js.native
  val success: success with java.lang.String = js.native
  val unknownFailure: unknownFailure with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailRecipientResolutionStatus with java.lang.String
  ] = js.native
}

