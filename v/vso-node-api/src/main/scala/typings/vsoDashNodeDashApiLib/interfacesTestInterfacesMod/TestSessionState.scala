package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TestSessionState extends js.Object

@JSImport("vso-node-api/interfaces/TestInterfaces", "TestSessionState")
@js.native
object TestSessionState extends js.Object {
  /**
       * The session has completed.
       */
  @js.native
  sealed trait Completed
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestSessionState
  
  /**
       * This is required for Feedback session which are declined
       */
  @js.native
  sealed trait Declined
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestSessionState
  
  /**
       * The session is running.
       */
  @js.native
  sealed trait InProgress
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestSessionState
  
  /**
       * The session is still being created.
       */
  @js.native
  sealed trait NotStarted
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestSessionState
  
  /**
       * The session has paused.
       */
  @js.native
  sealed trait Paused
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestSessionState
  
  /**
       * Only used during an update to preserve the existing value.
       */
  @js.native
  sealed trait Unspecified
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestSessionState
  
  /* 4 */ val Completed: Completed with scala.Double = js.native
  /* 5 */ val Declined: Declined with scala.Double = js.native
  /* 2 */ val InProgress: InProgress with scala.Double = js.native
  /* 1 */ val NotStarted: NotStarted with scala.Double = js.native
  /* 3 */ val Paused: Paused with scala.Double = js.native
  /* 0 */ val Unspecified: Unspecified with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestSessionState with scala.Double
  ] = js.native
}

