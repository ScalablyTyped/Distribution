package typings.winrtDashUwp.Windows.System

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LaunchUriStatus extends js.Object

/** Specifies the result of activating an application. */
@JSGlobal("Windows.System.LaunchUriStatus")
@js.native
object LaunchUriStatus extends js.Object {
  /** The application cannot be activated which may be because it is being updated by the store, it was installed on a removable device that is not available, and so on. */
  @js.native
  sealed trait appUnavailable extends LaunchUriStatus
  
  /** The application you are trying to activate does not support this URI. */
  @js.native
  sealed trait protocolUnavailable extends LaunchUriStatus
  
  /** The application activated successfully. */
  @js.native
  sealed trait success extends LaunchUriStatus
  
  /** An unknown error was encountered while activating the application. */
  @js.native
  sealed trait unknown extends LaunchUriStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LaunchUriStatus with Double] = js.native
  /* 1 */ @js.native
  object appUnavailable extends TopLevel[appUnavailable with Double]
  
  /* 2 */ @js.native
  object protocolUnavailable extends TopLevel[protocolUnavailable with Double]
  
  /* 0 */ @js.native
  object success extends TopLevel[success with Double]
  
  /* 3 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
}

