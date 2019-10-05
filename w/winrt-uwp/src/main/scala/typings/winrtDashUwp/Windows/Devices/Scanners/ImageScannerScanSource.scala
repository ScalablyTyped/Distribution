package typings.winrtDashUwp.Windows.Devices.Scanners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ImageScannerScanSource extends js.Object

/** The types of scan source for the scanning device. */
@JSGlobal("Windows.Devices.Scanners.ImageScannerScanSource")
@js.native
object ImageScannerScanSource extends js.Object {
  /** The scan source is automatically configured. */
  @js.native
  sealed trait autoConfigured extends ImageScannerScanSource
  
  /** The default source. */
  @js.native
  sealed trait default extends ImageScannerScanSource
  
  /** A Feeder scan source. */
  @js.native
  sealed trait feeder extends ImageScannerScanSource
  
  /** A Flatbed scan source. */
  @js.native
  sealed trait flatbed extends ImageScannerScanSource
  
  /* 3 */ val autoConfigured: typings.winrtDashUwp.Windows.Devices.Scanners.ImageScannerScanSource.autoConfigured with Double = js.native
  /* 0 */ val default: typings.winrtDashUwp.Windows.Devices.Scanners.ImageScannerScanSource.default with Double = js.native
  /* 2 */ val feeder: typings.winrtDashUwp.Windows.Devices.Scanners.ImageScannerScanSource.feeder with Double = js.native
  /* 1 */ val flatbed: typings.winrtDashUwp.Windows.Devices.Scanners.ImageScannerScanSource.flatbed with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ImageScannerScanSource with Double] = js.native
}

