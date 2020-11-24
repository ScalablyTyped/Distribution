package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ManualInterventionStatus extends js.Object
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ManualInterventionStatus")
@js.native
object ManualInterventionStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ManualInterventionStatus with Double] = js.native
  
  /**
    * The manual intervention is approved.
    */
  @js.native
  sealed trait Approved extends ManualInterventionStatus
  /* 4 */ @js.native
  object Approved extends TopLevel[Approved with Double]
  
  /**
    * The manual intervention is canceled.
    */
  @js.native
  sealed trait Canceled extends ManualInterventionStatus
  /* 8 */ @js.native
  object Canceled extends TopLevel[Canceled with Double]
  
  /**
    * The manual intervention is pending.
    */
  @js.native
  sealed trait Pending extends ManualInterventionStatus
  /* 1 */ @js.native
  object Pending extends TopLevel[Pending with Double]
  
  /**
    * The manual intervention is rejected.
    */
  @js.native
  sealed trait Rejected extends ManualInterventionStatus
  /* 2 */ @js.native
  object Rejected extends TopLevel[Rejected with Double]
  
  /**
    * The manual intervention does not have the status set.
    */
  @js.native
  sealed trait Unknown extends ManualInterventionStatus
  /* 0 */ @js.native
  object Unknown extends TopLevel[Unknown with Double]
}
