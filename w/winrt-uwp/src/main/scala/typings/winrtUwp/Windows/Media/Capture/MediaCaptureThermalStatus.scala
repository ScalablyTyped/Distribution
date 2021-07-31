package typings.winrtUwp.Windows.Media.Capture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MediaCaptureThermalStatus extends StObject
/** Specifies the thermal status of a media capture device. */
@JSGlobal("Windows.Media.Capture.MediaCaptureThermalStatus")
@js.native
object MediaCaptureThermalStatus extends StObject {
  
  /** The thermal state is normal. */
  @js.native
  sealed trait normal
    extends StObject
       with MediaCaptureThermalStatus
  
  /** The capture device is overheated. You should stop the current capture session and save any captured media. */
  @js.native
  sealed trait overheated
    extends StObject
       with MediaCaptureThermalStatus
}
