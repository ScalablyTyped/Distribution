package typings.winrtUwp.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ZoomTransitionMode extends js.Object
/** Defines the zoom transition modes. */
@JSGlobal("Windows.Media.Devices.ZoomTransitionMode")
@js.native
object ZoomTransitionMode extends js.Object {
  
  /** The default zoom transition mode for the device. Can be Direct or Smooth, depending on the device. */
  @js.native
  sealed trait auto extends ZoomTransitionMode
  
  /** The zoom transition is instantaneous. */
  @js.native
  sealed trait direct extends ZoomTransitionMode
  
  /** The zoom transition is smooth. */
  @js.native
  sealed trait smooth extends ZoomTransitionMode
}
