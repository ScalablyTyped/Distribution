package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

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
  sealed trait Completed extends TestSessionState
  
  /**
    * This is required for Feedback session which are declined
    */
  @js.native
  sealed trait Declined extends TestSessionState
  
  /**
    * The session is running.
    */
  @js.native
  sealed trait InProgress extends TestSessionState
  
  /**
    * The session is still being created.
    */
  @js.native
  sealed trait NotStarted extends TestSessionState
  
  /**
    * The session has paused.
    */
  @js.native
  sealed trait Paused extends TestSessionState
  
  /**
    * Only used during an update to preserve the existing value.
    */
  @js.native
  sealed trait Unspecified extends TestSessionState
  
  /* 4 */ val Completed: typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestSessionState.Completed with Double = js.native
  /* 5 */ val Declined: typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestSessionState.Declined with Double = js.native
  /* 2 */ val InProgress: typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestSessionState.InProgress with Double = js.native
  /* 1 */ val NotStarted: typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestSessionState.NotStarted with Double = js.native
  /* 3 */ val Paused: typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestSessionState.Paused with Double = js.native
  /* 0 */ val Unspecified: typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestSessionState.Unspecified with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TestSessionState with Double] = js.native
}

