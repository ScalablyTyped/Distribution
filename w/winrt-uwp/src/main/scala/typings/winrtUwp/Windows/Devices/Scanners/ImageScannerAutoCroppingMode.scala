package typings.winrtUwp.Windows.Devices.Scanners

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ImageScannerAutoCroppingMode with Double] = js.native
  /* 0 */ @js.native
  object disabled extends TopLevel[disabled with Double]
  
  /* 2 */ @js.native
  object multipleRegion extends TopLevel[multipleRegion with Double]
  
  /* 1 */ @js.native
  object singleRegion extends TopLevel[singleRegion with Double]
  
}

