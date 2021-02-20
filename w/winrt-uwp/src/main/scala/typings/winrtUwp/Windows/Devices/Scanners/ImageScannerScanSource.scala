package typings.winrtUwp.Windows.Devices.Scanners

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ImageScannerScanSource extends StObject
/** The types of scan source for the scanning device. */
@JSGlobal("Windows.Devices.Scanners.ImageScannerScanSource")
@js.native
object ImageScannerScanSource extends StObject {
  
  /** The default source. */
  @js.native
  sealed trait default extends ImageScannerScanSource
  
  /** The scan source is automatically configured. */
  @js.native
  sealed trait autoConfigured extends ImageScannerScanSource
  
  /** A Feeder scan source. */
  @js.native
  sealed trait feeder extends ImageScannerScanSource
  
  /** A Flatbed scan source. */
  @js.native
  sealed trait flatbed extends ImageScannerScanSource
}
