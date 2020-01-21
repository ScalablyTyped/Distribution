package typings.winrtUwp.Windows.System

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables an application to request that a device's display remain on even if there is no user activity for an extended period of time. */
@JSGlobal("Windows.System.Display")
@js.native
object Display extends js.Object {
  /** Represents a display request. */
  @js.native
  /** Creates an instance of the DisplayRequest class. */
  class DisplayRequest () extends js.Object {
    /** Activates a display request. */
    def requestActive(): Unit = js.native
    /** Deactivates a display request. */
    def requestRelease(): Unit = js.native
  }
  
}

