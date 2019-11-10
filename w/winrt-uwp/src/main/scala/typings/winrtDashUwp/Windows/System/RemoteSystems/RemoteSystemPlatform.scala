package typings.winrtDashUwp.Windows.System.RemoteSystems

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RemoteSystemPlatform extends js.Object

/** Contains values that describe the operating system platforms that a remote system could be running. */
@JSGlobal("Windows.System.RemoteSystems.RemoteSystemPlatform")
@js.native
object RemoteSystemPlatform extends js.Object {
  /** The device is running Android. */
  @js.native
  sealed trait android extends RemoteSystemPlatform
  
  /** The device is running iOS. */
  @js.native
  sealed trait ios extends RemoteSystemPlatform
  
  /** The device is running Linux. */
  @js.native
  sealed trait linux extends RemoteSystemPlatform
  
  /** The OS platform is unknown. */
  @js.native
  sealed trait unknown extends RemoteSystemPlatform
  
  /** The device is running Windows. */
  @js.native
  sealed trait windows extends RemoteSystemPlatform
  
  /* 2 */ val android: typings.winrtDashUwp.Windows.System.RemoteSystems.RemoteSystemPlatform.android with Double = js.native
  /* 3 */ val ios: typings.winrtDashUwp.Windows.System.RemoteSystems.RemoteSystemPlatform.ios with Double = js.native
  /* 4 */ val linux: typings.winrtDashUwp.Windows.System.RemoteSystems.RemoteSystemPlatform.linux with Double = js.native
  /* 0 */ val unknown: typings.winrtDashUwp.Windows.System.RemoteSystems.RemoteSystemPlatform.unknown with Double = js.native
  /* 1 */ val windows: typings.winrtDashUwp.Windows.System.RemoteSystems.RemoteSystemPlatform.windows with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RemoteSystemPlatform with Double] = js.native
}

