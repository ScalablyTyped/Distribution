package typings
package vsoDashNodeDashApiLib.interfacesCommonOperationsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OperationStatus extends js.Object

@JSImport("vso-node-api/interfaces/common/OperationsInterfaces", "OperationStatus")
@js.native
object OperationStatus extends js.Object {
  /**
       * The operation was cancelled by the user.
       */
  @js.native
  sealed trait Cancelled
    extends vsoDashNodeDashApiLib.interfacesCommonOperationsInterfacesMod.OperationStatus
  
  /**
       * The operation completed with a failure.
       */
  @js.native
  sealed trait Failed
    extends vsoDashNodeDashApiLib.interfacesCommonOperationsInterfacesMod.OperationStatus
  
  /**
       * The operation is in progress.
       */
  @js.native
  sealed trait InProgress
    extends vsoDashNodeDashApiLib.interfacesCommonOperationsInterfacesMod.OperationStatus
  
  /**
       * The operation object does not have the status set.
       */
  @js.native
  sealed trait NotSet
    extends vsoDashNodeDashApiLib.interfacesCommonOperationsInterfacesMod.OperationStatus
  
  /**
       * The operation has been queued.
       */
  @js.native
  sealed trait Queued
    extends vsoDashNodeDashApiLib.interfacesCommonOperationsInterfacesMod.OperationStatus
  
  /**
       * The operation completed successfully.
       */
  @js.native
  sealed trait Succeeded
    extends vsoDashNodeDashApiLib.interfacesCommonOperationsInterfacesMod.OperationStatus
  
  /* 3 */ val Cancelled: Cancelled with scala.Double = js.native
  /* 5 */ val Failed: Failed with scala.Double = js.native
  /* 2 */ val InProgress: InProgress with scala.Double = js.native
  /* 0 */ val NotSet: NotSet with scala.Double = js.native
  /* 1 */ val Queued: Queued with scala.Double = js.native
  /* 4 */ val Succeeded: Succeeded with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesCommonOperationsInterfacesMod.OperationStatus with scala.Double
  ] = js.native
}

