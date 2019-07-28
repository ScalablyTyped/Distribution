package typings.vsoDashNodeDashApi.interfacesCommonOperationsInterfacesMod

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
  sealed trait Cancelled extends OperationStatus
  
  /**
    * The operation completed with a failure.
    */
  @js.native
  sealed trait Failed extends OperationStatus
  
  /**
    * The operation is in progress.
    */
  @js.native
  sealed trait InProgress extends OperationStatus
  
  /**
    * The operation object does not have the status set.
    */
  @js.native
  sealed trait NotSet extends OperationStatus
  
  /**
    * The operation has been queued.
    */
  @js.native
  sealed trait Queued extends OperationStatus
  
  /**
    * The operation completed successfully.
    */
  @js.native
  sealed trait Succeeded extends OperationStatus
  
  /* 3 */ val Cancelled: typings.vsoDashNodeDashApi.interfacesCommonOperationsInterfacesMod.OperationStatus.Cancelled with Double = js.native
  /* 5 */ val Failed: typings.vsoDashNodeDashApi.interfacesCommonOperationsInterfacesMod.OperationStatus.Failed with Double = js.native
  /* 2 */ val InProgress: typings.vsoDashNodeDashApi.interfacesCommonOperationsInterfacesMod.OperationStatus.InProgress with Double = js.native
  /* 0 */ val NotSet: typings.vsoDashNodeDashApi.interfacesCommonOperationsInterfacesMod.OperationStatus.NotSet with Double = js.native
  /* 1 */ val Queued: typings.vsoDashNodeDashApi.interfacesCommonOperationsInterfacesMod.OperationStatus.Queued with Double = js.native
  /* 4 */ val Succeeded: typings.vsoDashNodeDashApi.interfacesCommonOperationsInterfacesMod.OperationStatus.Succeeded with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OperationStatus with Double] = js.native
}

