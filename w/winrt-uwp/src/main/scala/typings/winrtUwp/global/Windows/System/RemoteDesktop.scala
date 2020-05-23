package typings.winrtUwp.global.Windows.System

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables an application to obtain information about Remote Desktop sessions. */
@JSGlobal("Windows.System.RemoteDesktop")
@js.native
object RemoteDesktop extends js.Object {
  /** Provides Remote Desktop information about the current session. */
  @js.native
  abstract class InteractiveSession ()
    extends typings.winrtUwp.Windows.System.RemoteDesktop.InteractiveSession
  
  /* static members */
  @js.native
  object InteractiveSession extends js.Object {
    /** Indicates whether the calling process is running in a Remote Desktop session. */
    var isRemote: Boolean = js.native
  }
  
}

