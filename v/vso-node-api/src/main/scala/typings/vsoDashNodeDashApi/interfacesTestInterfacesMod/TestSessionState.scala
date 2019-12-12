package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestSessionState.Completed
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestSessionState.Declined
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestSessionState.InProgress
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestSessionState.NotStarted
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestSessionState.Paused
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestSessionState.Unspecified
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TestSessionState with Double] = js.native
  /* 4 */ @js.native
  object Completed extends TopLevel[Completed with Double]
  
  /* 5 */ @js.native
  object Declined extends TopLevel[Declined with Double]
  
  /* 2 */ @js.native
  object InProgress extends TopLevel[InProgress with Double]
  
  /* 1 */ @js.native
  object NotStarted extends TopLevel[NotStarted with Double]
  
  /* 3 */ @js.native
  object Paused extends TopLevel[Paused with Double]
  
  /* 0 */ @js.native
  object Unspecified extends TopLevel[Unspecified with Double]
  
}

