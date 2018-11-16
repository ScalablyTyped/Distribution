package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CloneOperationState extends js.Object

@JSImport("vso-node-api/interfaces/TestInterfaces", "CloneOperationState")
@js.native
object CloneOperationState extends js.Object {
  @js.native
  sealed trait Failed
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.CloneOperationState
  
  @js.native
  sealed trait InProgress
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.CloneOperationState
  
  @js.native
  sealed trait Queued
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.CloneOperationState
  
  @js.native
  sealed trait Succeeded
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.CloneOperationState
  
  /* 2 */ val Failed: Failed with scala.Double = js.native
  /* 1 */ val InProgress: InProgress with scala.Double = js.native
  /* 0 */ val Queued: Queued with scala.Double = js.native
  /* 3 */ val Succeeded: Succeeded with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesTestInterfacesMod.CloneOperationState with scala.Double
  ] = js.native
}

