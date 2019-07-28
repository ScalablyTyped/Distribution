package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CloneOperationState extends js.Object

@JSImport("vso-node-api/interfaces/TestInterfaces", "CloneOperationState")
@js.native
object CloneOperationState extends js.Object {
  @js.native
  sealed trait Failed extends CloneOperationState
  
  @js.native
  sealed trait InProgress extends CloneOperationState
  
  @js.native
  sealed trait Queued extends CloneOperationState
  
  @js.native
  sealed trait Succeeded extends CloneOperationState
  
  /* 2 */ val Failed: typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.CloneOperationState.Failed with Double = js.native
  /* 1 */ val InProgress: typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.CloneOperationState.InProgress with Double = js.native
  /* 0 */ val Queued: typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.CloneOperationState.Queued with Double = js.native
  /* 3 */ val Succeeded: typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.CloneOperationState.Succeeded with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CloneOperationState with Double] = js.native
}

