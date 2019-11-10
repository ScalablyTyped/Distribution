package typings.winrtDashUwp.Windows.System.RemoteSystems

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RemoteSystemWatcherError extends js.Object

/** Contains values that describe a watcher error, which may stop discovery. */
@JSGlobal("Windows.System.RemoteSystems.RemoteSystemWatcherError")
@js.native
object RemoteSystemWatcherError extends js.Object {
  /** Discovery of cloud remote systems for a web account failed because authentication of that web account failed. */
  @js.native
  sealed trait authenticationError extends RemoteSystemWatcherError
  
  /** Discovery of cloud remote systems failed because Internet connection was lost or is unavailable. */
  @js.native
  sealed trait internetNotAvailable extends RemoteSystemWatcherError
  
  /** Discovery stopped for an unknown reason. */
  @js.native
  sealed trait unknown extends RemoteSystemWatcherError
  
  /* 2 */ val authenticationError: typings.winrtDashUwp.Windows.System.RemoteSystems.RemoteSystemWatcherError.authenticationError with Double = js.native
  /* 1 */ val internetNotAvailable: typings.winrtDashUwp.Windows.System.RemoteSystems.RemoteSystemWatcherError.internetNotAvailable with Double = js.native
  /* 0 */ val unknown: typings.winrtDashUwp.Windows.System.RemoteSystems.RemoteSystemWatcherError.unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RemoteSystemWatcherError with Double] = js.native
}

