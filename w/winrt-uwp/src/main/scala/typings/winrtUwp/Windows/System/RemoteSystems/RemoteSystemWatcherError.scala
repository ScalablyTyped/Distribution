package typings.winrtUwp.Windows.System.RemoteSystems

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RemoteSystemWatcherError extends StObject
/** Contains values that describe a watcher error, which may stop discovery. */
@JSGlobal("Windows.System.RemoteSystems.RemoteSystemWatcherError")
@js.native
object RemoteSystemWatcherError extends StObject {
  
  /** Discovery of cloud remote systems for a web account failed because authentication of that web account failed. */
  @js.native
  sealed trait authenticationError
    extends StObject
       with RemoteSystemWatcherError
  
  /** Discovery of cloud remote systems failed because Internet connection was lost or is unavailable. */
  @js.native
  sealed trait internetNotAvailable
    extends StObject
       with RemoteSystemWatcherError
  
  /** Discovery stopped for an unknown reason. */
  @js.native
  sealed trait unknown
    extends StObject
       with RemoteSystemWatcherError
}
