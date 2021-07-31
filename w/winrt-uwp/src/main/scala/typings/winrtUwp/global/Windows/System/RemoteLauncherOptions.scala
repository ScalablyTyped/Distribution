package typings.winrtUwp.global.Windows.System

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies the options used to launch the default app for URI on a remote device. */
@JSGlobal("Windows.System.RemoteLauncherOptions")
@js.native
/** Creates an instance of the RemoteLauncherOptions class. */
class RemoteLauncherOptions ()
  extends StObject
     with typings.winrtUwp.Windows.System.RemoteLauncherOptions {
  
  /** Specifies the URI of the web site to view if the app to handle the URI can't be launched on the remote device. */
  /* CompleteClass */
  var FallbackUri: Uri = js.native
  
  /** A list of package family names that should be used to launch the URI on the remote device. The first one in the list should be the preferred application to launch on the remote system (device). */
  /* CompleteClass */
  var PreferredAppIds: IIterable[String] = js.native
}
