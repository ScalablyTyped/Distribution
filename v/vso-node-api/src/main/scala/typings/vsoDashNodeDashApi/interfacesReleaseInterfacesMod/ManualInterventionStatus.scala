package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

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
  
  /* 4 */ val Approved: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ManualInterventionStatus.Approved with Double = js.native
  /* 8 */ val Canceled: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ManualInterventionStatus.Canceled with Double = js.native
  /* 1 */ val Pending: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ManualInterventionStatus.Pending with Double = js.native
  /* 2 */ val Rejected: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ManualInterventionStatus.Rejected with Double = js.native
  /* 0 */ val Unknown: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ManualInterventionStatus.Unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ManualInterventionStatus with Double] = js.native
}

