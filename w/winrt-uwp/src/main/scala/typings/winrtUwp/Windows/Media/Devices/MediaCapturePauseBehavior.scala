package typings.winrtUwp.Windows.Media.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MediaCapturePauseBehavior extends StObject
/** Defines the behavior when media capture is paused with a call to PauseAsync or PauseRecordAsync . */
@JSGlobal("Windows.Media.Devices.MediaCapturePauseBehavior")
@js.native
object MediaCapturePauseBehavior extends StObject {
  
  /** The hardware resources are released while capturing is paused. */
  @js.native
  sealed trait releaseHardwareResources extends MediaCapturePauseBehavior
  
  /** The calling app keeps control of the hardware resources, such as the camera, while capturing is paused. */
  @js.native
  sealed trait retainHardwareResources extends MediaCapturePauseBehavior
}
