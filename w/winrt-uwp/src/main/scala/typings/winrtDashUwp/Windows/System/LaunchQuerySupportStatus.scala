package typings.winrtDashUwp.Windows.System

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LaunchQuerySupportStatus extends js.Object

/** Specifies whether an app is available that supports activation. */
@JSGlobal("Windows.System.LaunchQuerySupportStatus")
@js.native
object LaunchQuerySupportStatus extends js.Object {
  /** No app is installed to handle the activation. */
  @js.native
  sealed trait appNotInstalled extends LaunchQuerySupportStatus
  
  /** An app that handles the activation is installed but not available because it is being updated by the store or it was installed on a removable device that is not available. */
  @js.native
  sealed trait appUnavailable extends LaunchQuerySupportStatus
  
  /** An app that handles the activation is available and may be activated. */
  @js.native
  sealed trait available extends LaunchQuerySupportStatus
  
  /** The app does not handle the activation. */
  @js.native
  sealed trait notSupported extends LaunchQuerySupportStatus
  
  /** An unknown error was encountered while determining whether an app supports the activation. */
  @js.native
  sealed trait unknown extends LaunchQuerySupportStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LaunchQuerySupportStatus with Double] = js.native
  /* 1 */ @js.native
  object appNotInstalled extends TopLevel[appNotInstalled with Double]
  
  /* 2 */ @js.native
  object appUnavailable extends TopLevel[appUnavailable with Double]
  
  /* 0 */ @js.native
  object available extends TopLevel[available with Double]
  
  /* 3 */ @js.native
  object notSupported extends TopLevel[notSupported with Double]
  
  /* 4 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
}

