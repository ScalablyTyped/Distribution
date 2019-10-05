package typings.winrtDashUwp.Windows.Devices.Scanners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ImageScannerAutoCroppingMode extends js.Object

/** Specifies the automatic crop mode of the scanning device. */
@JSGlobal("Windows.Devices.Scanners.ImageScannerAutoCroppingMode")
@js.native
object ImageScannerAutoCroppingMode extends js.Object {
  /** Automatic detection is disabled. At the beginning of a new scan session, the AutoCroppingMode property is set to this value by default. */
  @js.native
  sealed trait disabled extends ImageScannerAutoCroppingMode
  
  /** Scan multiple scan regions into individual, separate images. */
  @js.native
  sealed trait multipleRegion extends ImageScannerAutoCroppingMode
  
  /** Scan a single scan region into individual, separate images. */
  @js.native
  sealed trait singleRegion extends ImageScannerAutoCroppingMode
  
  /* 0 */ val disabled: typings.winrtDashUwp.Windows.Devices.Scanners.ImageScannerAutoCroppingMode.disabled with Double = js.native
  /* 2 */ val multipleRegion: typings.winrtDashUwp.Windows.Devices.Scanners.ImageScannerAutoCroppingMode.multipleRegion with Double = js.native
  /* 1 */ val singleRegion: typings.winrtDashUwp.Windows.Devices.Scanners.ImageScannerAutoCroppingMode.singleRegion with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ImageScannerAutoCroppingMode with Double] = js.native
}

