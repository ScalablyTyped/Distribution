package typings.winrtUwp.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EmailRecipientResolutionStatus extends StObject
/** Describes the state of an attempt to resolve an email recipient. */
@JSGlobal("Windows.ApplicationModel.Email.EmailRecipientResolutionStatus")
@js.native
object EmailRecipientResolutionStatus extends StObject {
  
  /** Resolution failed. Multiple results returned. Refinement needed. */
  @js.native
  sealed trait ambiguousRecipient
    extends StObject
       with EmailRecipientResolutionStatus
  
  /** Resolution failed. The distribution list cannot be accessed. */
  @js.native
  sealed trait cannotResolveDistributionList
    extends StObject
       with EmailRecipientResolutionStatus
  
  /** Resolution failed. The limit of allowed requests for the current certificate has been reached. */
  @js.native
  sealed trait certificateRequestLimitReached
    extends StObject
       with EmailRecipientResolutionStatus
  
  /** Resolution failed. No valid certificate present. */
  @js.native
  sealed trait noCertificate
    extends StObject
       with EmailRecipientResolutionStatus
  
  /** Resolution failed. Recipient cannot be resolved because no match found in distribution list. */
  @js.native
  sealed trait recipientNotFound
    extends StObject
       with EmailRecipientResolutionStatus
  
  /** Resolution failed. There has been an error on the server. */
  @js.native
  sealed trait serverError
    extends StObject
       with EmailRecipientResolutionStatus
  
  /** Success. Email recipient resolved. */
  @js.native
  sealed trait success
    extends StObject
       with EmailRecipientResolutionStatus
  
  /** Resolution failed for unknown reason. */
  @js.native
  sealed trait unknownFailure
    extends StObject
       with EmailRecipientResolutionStatus
}
