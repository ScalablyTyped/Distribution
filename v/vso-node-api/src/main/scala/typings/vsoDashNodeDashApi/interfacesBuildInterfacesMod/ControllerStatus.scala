package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ControllerStatus extends js.Object

@JSImport("vso-node-api/interfaces/BuildInterfaces", "ControllerStatus")
@js.native
object ControllerStatus extends js.Object {
  /**
    * Indicates that the build controller is currently available.
    */
  @js.native
  sealed trait Available extends ControllerStatus
  
  /**
    * Indicates that the build controller has taken itself offline.
    */
  @js.native
  sealed trait Offline extends ControllerStatus
  
  /**
    * Indicates that the build controller cannot be contacted.
    */
  @js.native
  sealed trait Unavailable extends ControllerStatus
  
  /* 1 */ val Available: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.ControllerStatus.Available with Double = js.native
  /* 2 */ val Offline: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.ControllerStatus.Offline with Double = js.native
  /* 0 */ val Unavailable: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.ControllerStatus.Unavailable with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ControllerStatus with Double] = js.native
}

