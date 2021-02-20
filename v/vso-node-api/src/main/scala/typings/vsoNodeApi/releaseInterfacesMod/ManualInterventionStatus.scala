package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ManualInterventionStatus extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ManualInterventionStatus")
@js.native
object ManualInterventionStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ManualInterventionStatus with Double] = js.native
  
  /**
    * The manual intervention is approved.
    */
  @js.native
  sealed trait Approved extends ManualInterventionStatus
  /* 4 */ val Approved: typings.vsoNodeApi.releaseInterfacesMod.ManualInterventionStatus.Approved with Double = js.native
  
  /**
    * The manual intervention is canceled.
    */
  @js.native
  sealed trait Canceled extends ManualInterventionStatus
  /* 8 */ val Canceled: typings.vsoNodeApi.releaseInterfacesMod.ManualInterventionStatus.Canceled with Double = js.native
  
  /**
    * The manual intervention is pending.
    */
  @js.native
  sealed trait Pending extends ManualInterventionStatus
  /* 1 */ val Pending: typings.vsoNodeApi.releaseInterfacesMod.ManualInterventionStatus.Pending with Double = js.native
  
  /**
    * The manual intervention is rejected.
    */
  @js.native
  sealed trait Rejected extends ManualInterventionStatus
  /* 2 */ val Rejected: typings.vsoNodeApi.releaseInterfacesMod.ManualInterventionStatus.Rejected with Double = js.native
  
  /**
    * The manual intervention does not have the status set.
    */
  @js.native
  sealed trait Unknown extends ManualInterventionStatus
  /* 0 */ val Unknown: typings.vsoNodeApi.releaseInterfacesMod.ManualInterventionStatus.Unknown with Double = js.native
}
