package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

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
  sealed trait Approved
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ManualInterventionStatus
  
  /**
       * The manual intervention is canceled.
       */
  @js.native
  sealed trait Canceled
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ManualInterventionStatus
  
  /**
       * The manual intervention is pending.
       */
  @js.native
  sealed trait Pending
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ManualInterventionStatus
  
  /**
       * The manual intervention is rejected.
       */
  @js.native
  sealed trait Rejected
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ManualInterventionStatus
  
  /**
       * The manual intervention does not have the status set.
       */
  @js.native
  sealed trait Unknown
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ManualInterventionStatus
  
  /* 4 */ val Approved: Approved with scala.Double = js.native
  /* 8 */ val Canceled: Canceled with scala.Double = js.native
  /* 1 */ val Pending: Pending with scala.Double = js.native
  /* 2 */ val Rejected: Rejected with scala.Double = js.native
  /* 0 */ val Unknown: Unknown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ManualInterventionStatus with scala.Double
  ] = js.native
}

