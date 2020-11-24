package typings.vsoNodeApi.policyInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PolicyEvaluationStatus extends js.Object
@JSImport("vso-node-api/interfaces/PolicyInterfaces", "PolicyEvaluationStatus")
@js.native
object PolicyEvaluationStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PolicyEvaluationStatus with Double] = js.native
  
  /**
    * The policy has been fulfilled for this pull request.
    */
  @js.native
  sealed trait Approved extends PolicyEvaluationStatus
  /* 2 */ @js.native
  object Approved extends TopLevel[Approved with Double]
  
  /**
    * The policy has encountered an unexpected error.
    */
  @js.native
  sealed trait Broken extends PolicyEvaluationStatus
  /* 5 */ @js.native
  object Broken extends TopLevel[Broken with Double]
  
  /**
    * The policy does not apply to this pull request.
    */
  @js.native
  sealed trait NotApplicable extends PolicyEvaluationStatus
  /* 4 */ @js.native
  object NotApplicable extends TopLevel[NotApplicable with Double]
  
  /**
    * The policy is either queued to run, or is waiting for some event before progressing.
    */
  @js.native
  sealed trait Queued extends PolicyEvaluationStatus
  /* 0 */ @js.native
  object Queued extends TopLevel[Queued with Double]
  
  /**
    * The policy has rejected this pull request.
    */
  @js.native
  sealed trait Rejected extends PolicyEvaluationStatus
  /* 3 */ @js.native
  object Rejected extends TopLevel[Rejected with Double]
  
  /**
    * The policy is currently running.
    */
  @js.native
  sealed trait Running extends PolicyEvaluationStatus
  /* 1 */ @js.native
  object Running extends TopLevel[Running with Double]
}
