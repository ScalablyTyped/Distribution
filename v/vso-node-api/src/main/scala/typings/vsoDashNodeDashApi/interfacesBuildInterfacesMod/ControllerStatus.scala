package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.ControllerStatus.Available
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.ControllerStatus.Offline
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.ControllerStatus.Unavailable
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ControllerStatus with Double] = js.native
  /* 1 */ @js.native
  object Available extends TopLevel[Available with Double]
  
  /* 2 */ @js.native
  object Offline extends TopLevel[Offline with Double]
  
  /* 0 */ @js.native
  object Unavailable extends TopLevel[Unavailable with Double]
  
}

