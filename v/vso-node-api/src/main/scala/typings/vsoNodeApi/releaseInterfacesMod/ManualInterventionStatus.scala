package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ManualInterventionStatus extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ManualInterventionStatus")
@js.native
object ManualInterventionStatus extends js.Object {
  /**
    * The manual intervention is approved.
    */
  @js.native
  sealed trait Approved extends ManualInterventionStatus
  
  /**
    * The manual intervention is canceled.
    */
  @js.native
  sealed trait Canceled extends ManualInterventionStatus
  
  /**
    * The manual intervention is pending.
    */
  @js.native
  sealed trait Pending extends ManualInterventionStatus
  
  /**
    * The manual intervention is rejected.
    */
  @js.native
  sealed trait Rejected extends ManualInterventionStatus
  
  /**
    * The manual intervention does not have the status set.
    */
  @js.native
  sealed trait Unknown extends ManualInterventionStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ManualInterventionStatus with Double] = js.native
  /* 4 */ @js.native
  object Approved extends TopLevel[Approved with Double]
  
  /* 8 */ @js.native
  object Canceled extends TopLevel[Canceled with Double]
  
  /* 1 */ @js.native
  object Pending extends TopLevel[Pending with Double]
  
  /* 2 */ @js.native
  object Rejected extends TopLevel[Rejected with Double]
  
  /* 0 */ @js.native
  object Unknown extends TopLevel[Unknown with Double]
  
}

