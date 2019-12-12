package typings.winrtDashUwp.Windows.System

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.System.RemoteLaunchUriStatus.appUnavailable
import typings.winrtDashUwp.Windows.System.RemoteLaunchUriStatus.deniedByLocalSystem
import typings.winrtDashUwp.Windows.System.RemoteLaunchUriStatus.deniedByRemoteSystem
import typings.winrtDashUwp.Windows.System.RemoteLaunchUriStatus.protocolUnavailable
import typings.winrtDashUwp.Windows.System.RemoteLaunchUriStatus.remoteSystemUnavailable
import typings.winrtDashUwp.Windows.System.RemoteLaunchUriStatus.success
import typings.winrtDashUwp.Windows.System.RemoteLaunchUriStatus.unknown
import typings.winrtDashUwp.Windows.System.RemoteLaunchUriStatus.valueSetTooLarge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RemoteLaunchUriStatus extends js.Object

/** Specifies the result of activating an application for a URI on a remote device. */
@JSGlobal("Windows.System.RemoteLaunchUriStatus")
@js.native
object RemoteLaunchUriStatus extends js.Object {
  /** The app is not installed on the remote system */
  @js.native
  sealed trait appUnavailable extends RemoteLaunchUriStatus
  
  /** The user is not authorized to launch an app on the remote system. */
  @js.native
  sealed trait deniedByLocalSystem extends RemoteLaunchUriStatus
  
  /** The user is not signed in on the target device or may be blocked by group policy. */
  @js.native
  sealed trait deniedByRemoteSystem extends RemoteLaunchUriStatus
  
  /** The application you are trying to activate on the remote system does not support this URI. */
  @js.native
  sealed trait protocolUnavailable extends RemoteLaunchUriStatus
  
  /** The remote system could not be reached. */
  @js.native
  sealed trait remoteSystemUnavailable extends RemoteLaunchUriStatus
  
  /** The URI was successfully launched on the remote system. */
  @js.native
  sealed trait success extends RemoteLaunchUriStatus
  
  /** The URI could not be successfully launched on the remote system. */
  @js.native
  sealed trait unknown extends RemoteLaunchUriStatus
  
  /** The amount of data you tried to send to the remote system exceeded the limit. */
  @js.native
  sealed trait valueSetTooLarge extends RemoteLaunchUriStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RemoteLaunchUriStatus with Double] = js.native
  /* 2 */ @js.native
  object appUnavailable extends TopLevel[appUnavailable with Double]
  
  /* 6 */ @js.native
  object deniedByLocalSystem extends TopLevel[deniedByLocalSystem with Double]
  
  /* 7 */ @js.native
  object deniedByRemoteSystem extends TopLevel[deniedByRemoteSystem with Double]
  
  /* 3 */ @js.native
  object protocolUnavailable extends TopLevel[protocolUnavailable with Double]
  
  /* 4 */ @js.native
  object remoteSystemUnavailable extends TopLevel[remoteSystemUnavailable with Double]
  
  /* 1 */ @js.native
  object success extends TopLevel[success with Double]
  
  /* 0 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
  /* 5 */ @js.native
  object valueSetTooLarge extends TopLevel[valueSetTooLarge with Double]
  
}

