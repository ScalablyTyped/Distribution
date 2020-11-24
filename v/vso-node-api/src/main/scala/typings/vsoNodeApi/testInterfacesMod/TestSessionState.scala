package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TestSessionState extends js.Object
@JSImport("vso-node-api/interfaces/TestInterfaces", "TestSessionState")
@js.native
object TestSessionState extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TestSessionState with Double] = js.native
  
  /**
    * The session has completed.
    */
  @js.native
  sealed trait Completed extends TestSessionState
  /* 4 */ @js.native
  object Completed extends TopLevel[Completed with Double]
  
  /**
    * This is required for Feedback session which are declined
    */
  @js.native
  sealed trait Declined extends TestSessionState
  /* 5 */ @js.native
  object Declined extends TopLevel[Declined with Double]
  
  /**
    * The session is running.
    */
  @js.native
  sealed trait InProgress extends TestSessionState
  /* 2 */ @js.native
  object InProgress extends TopLevel[InProgress with Double]
  
  /**
    * The session is still being created.
    */
  @js.native
  sealed trait NotStarted extends TestSessionState
  /* 1 */ @js.native
  object NotStarted extends TopLevel[NotStarted with Double]
  
  /**
    * The session has paused.
    */
  @js.native
  sealed trait Paused extends TestSessionState
  /* 3 */ @js.native
  object Paused extends TopLevel[Paused with Double]
  
  /**
    * Only used during an update to preserve the existing value.
    */
  @js.native
  sealed trait Unspecified extends TestSessionState
  /* 0 */ @js.native
  object Unspecified extends TopLevel[Unspecified with Double]
}
