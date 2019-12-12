package typings.vsoDashNodeDashApi.interfacesPolicyInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesPolicyInterfacesMod.PolicyEvaluationStatus.Approved
import typings.vsoDashNodeDashApi.interfacesPolicyInterfacesMod.PolicyEvaluationStatus.Broken
import typings.vsoDashNodeDashApi.interfacesPolicyInterfacesMod.PolicyEvaluationStatus.NotApplicable
import typings.vsoDashNodeDashApi.interfacesPolicyInterfacesMod.PolicyEvaluationStatus.Queued
import typings.vsoDashNodeDashApi.interfacesPolicyInterfacesMod.PolicyEvaluationStatus.Rejected
import typings.vsoDashNodeDashApi.interfacesPolicyInterfacesMod.PolicyEvaluationStatus.Running
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
  sealed trait Approved extends PolicyEvaluationStatus
  
  /**
    * The policy has encountered an unexpected error.
    */
  @js.native
  sealed trait Broken extends PolicyEvaluationStatus
  
  /**
    * The policy does not apply to this pull request.
    */
  @js.native
  sealed trait NotApplicable extends PolicyEvaluationStatus
  
  /**
    * The policy is either queued to run, or is waiting for some event before progressing.
    */
  @js.native
  sealed trait Queued extends PolicyEvaluationStatus
  
  /**
    * The policy has rejected this pull request.
    */
  @js.native
  sealed trait Rejected extends PolicyEvaluationStatus
  
  /**
    * The policy is currently running.
    */
  @js.native
  sealed trait Running extends PolicyEvaluationStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PolicyEvaluationStatus with Double] = js.native
  /* 2 */ @js.native
  object Approved extends TopLevel[Approved with Double]
  
  /* 5 */ @js.native
  object Broken extends TopLevel[Broken with Double]
  
  /* 4 */ @js.native
  object NotApplicable extends TopLevel[NotApplicable with Double]
  
  /* 0 */ @js.native
  object Queued extends TopLevel[Queued with Double]
  
  /* 3 */ @js.native
  object Rejected extends TopLevel[Rejected with Double]
  
  /* 1 */ @js.native
  object Running extends TopLevel[Running with Double]
  
}

