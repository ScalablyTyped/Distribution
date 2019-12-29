package typings.winrtDashUwp.Windows.System.RemoteSystems

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RemoteSystemWatcherError with Double] = js.native
  /* 2 */ @js.native
  object authenticationError extends TopLevel[authenticationError with Double]
  
  /* 1 */ @js.native
  object internetNotAvailable extends TopLevel[internetNotAvailable with Double]
  
  /* 0 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
}

