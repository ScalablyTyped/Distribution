package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ManualInterventionStatus extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ManualInterventionStatus")
@js.native
object ManualInterventionStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ManualInterventionStatus & Double] = js.native
  
  /**
    * The manual intervention is approved.
    */
  @js.native
  sealed trait Approved
    extends StObject
       with ManualInterventionStatus
  /* 4 */ val Approved: typings.vsoNodeApi.interfacesReleaseInterfacesMod.ManualInterventionStatus.Approved & Double = js.native
  
  /**
    * The manual intervention is canceled.
    */
  @js.native
  sealed trait Canceled
    extends StObject
       with ManualInterventionStatus
  /* 8 */ val Canceled: typings.vsoNodeApi.interfacesReleaseInterfacesMod.ManualInterventionStatus.Canceled & Double = js.native
  
  /**
    * The manual intervention is pending.
    */
  @js.native
  sealed trait Pending
    extends StObject
       with ManualInterventionStatus
  /* 1 */ val Pending: typings.vsoNodeApi.interfacesReleaseInterfacesMod.ManualInterventionStatus.Pending & Double = js.native
  
  /**
    * The manual intervention is rejected.
    */
  @js.native
  sealed trait Rejected
    extends StObject
       with ManualInterventionStatus
  /* 2 */ val Rejected: typings.vsoNodeApi.interfacesReleaseInterfacesMod.ManualInterventionStatus.Rejected & Double = js.native
  
  /**
    * The manual intervention does not have the status set.
    */
  @js.native
  sealed trait Unknown
    extends StObject
       with ManualInterventionStatus
  /* 0 */ val Unknown: typings.vsoNodeApi.interfacesReleaseInterfacesMod.ManualInterventionStatus.Unknown & Double = js.native
}
