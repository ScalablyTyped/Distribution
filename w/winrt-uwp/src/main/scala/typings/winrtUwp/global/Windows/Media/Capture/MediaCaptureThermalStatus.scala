package typings.winrtUwp.global.Windows.Media.Capture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies the thermal status of a media capture device. */
@JSGlobal("Windows.Media.Capture.MediaCaptureThermalStatus")
@js.native
object MediaCaptureThermalStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.Capture.MediaCaptureThermalStatus & Double] = js.native
  
  /* 0 */ val normal: typings.winrtUwp.Windows.Media.Capture.MediaCaptureThermalStatus.normal & Double = js.native
  
  /* 1 */ val overheated: typings.winrtUwp.Windows.Media.Capture.MediaCaptureThermalStatus.overheated & Double = js.native
}
