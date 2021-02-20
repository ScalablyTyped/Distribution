package typings.winrtUwp.Windows.Media.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ZoomTransitionMode extends StObject
/** Defines the zoom transition modes. */
@JSGlobal("Windows.Media.Devices.ZoomTransitionMode")
@js.native
object ZoomTransitionMode extends StObject {
  
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
