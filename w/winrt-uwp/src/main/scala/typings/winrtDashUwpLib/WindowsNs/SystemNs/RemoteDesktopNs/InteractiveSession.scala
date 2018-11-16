package typings
package winrtDashUwpLib.WindowsNs.SystemNs.RemoteDesktopNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides Remote Desktop information about the current session. */
@JSGlobal("Windows.System.RemoteDesktop.InteractiveSession")
@js.native
abstract class InteractiveSession () extends js.Object

/** Provides Remote Desktop information about the current session. */
@JSGlobal("Windows.System.RemoteDesktop.InteractiveSession")
@js.native
object InteractiveSession extends js.Object {
  /** Indicates whether the calling process is running in a Remote Desktop session. */
  var isRemote: scala.Boolean = js.native
}

