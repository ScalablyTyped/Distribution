package typings
package vsoDashNodeDashApiLib.interfacesPolicyInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PolicyEvaluationStatus extends js.Object

@JSImport("vso-node-api/interfaces/PolicyInterfaces", "PolicyEvaluationStatus")
@js.native
object PolicyEvaluationStatus extends js.Object {
  /**
    * The policy has been fulfilled for this pull request.
    */
  @js.native
  sealed trait Approved
    extends vsoDashNodeDashApiLib.interfacesPolicyInterfacesMod.PolicyEvaluationStatus
  
  /**
    * The policy has encountered an unexpected error.
    */
  @js.native
  sealed trait Broken
    extends vsoDashNodeDashApiLib.interfacesPolicyInterfacesMod.PolicyEvaluationStatus
  
  /**
    * The policy does not apply to this pull request.
    */
  @js.native
  sealed trait NotApplicable
    extends vsoDashNodeDashApiLib.interfacesPolicyInterfacesMod.PolicyEvaluationStatus
  
  /**
    * The policy is either queued to run, or is waiting for some event before progressing.
    */
  @js.native
  sealed trait Queued
    extends vsoDashNodeDashApiLib.interfacesPolicyInterfacesMod.PolicyEvaluationStatus
  
  /**
    * The policy has rejected this pull request.
    */
  @js.native
  sealed trait Rejected
    extends vsoDashNodeDashApiLib.interfacesPolicyInterfacesMod.PolicyEvaluationStatus
  
  /**
    * The policy is currently running.
    */
  @js.native
  sealed trait Running
    extends vsoDashNodeDashApiLib.interfacesPolicyInterfacesMod.PolicyEvaluationStatus
  
  /* 2 */ val Approved: Approved with scala.Double = js.native
  /* 5 */ val Broken: Broken with scala.Double = js.native
  /* 4 */ val NotApplicable: NotApplicable with scala.Double = js.native
  /* 0 */ val Queued: Queued with scala.Double = js.native
  /* 3 */ val Rejected: Rejected with scala.Double = js.native
  /* 1 */ val Running: Running with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesPolicyInterfacesMod.PolicyEvaluationStatus with scala.Double
  ] = js.native
}

