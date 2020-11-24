package typings.winrtUwp.global.Windows.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an object that enables integrate with the system media transport controls and support for media commands. */
@JSGlobal("Windows.Media.SystemMediaTransportControls")
@js.native
abstract class SystemMediaTransportControls ()
  extends typings.winrtUwp.Windows.Media.SystemMediaTransportControls
/* static members */
@JSGlobal("Windows.Media.SystemMediaTransportControls")
@js.native
object SystemMediaTransportControls extends js.Object {
  
  /**
    * The system transport controls for the current view.
    * @return The system transport controls for the current view.
    */
  def getForCurrentView(): typings.winrtUwp.Windows.Media.SystemMediaTransportControls = js.native
}
