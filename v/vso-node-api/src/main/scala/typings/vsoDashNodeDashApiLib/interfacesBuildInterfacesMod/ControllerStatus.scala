package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

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
  sealed trait Available
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.ControllerStatus
  
  /**
       * Indicates that the build controller has taken itself offline.
       */
  @js.native
  sealed trait Offline
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.ControllerStatus
  
  /**
       * Indicates that the build controller cannot be contacted.
       */
  @js.native
  sealed trait Unavailable
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.ControllerStatus
  
  /* 1 */ val Available: Available with scala.Double = js.native
  /* 2 */ val Offline: Offline with scala.Double = js.native
  /* 0 */ val Unavailable: Unavailable with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.ControllerStatus with scala.Double
  ] = js.native
}

