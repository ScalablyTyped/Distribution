package typings.winrtUwp.Windows.Devices.Scanners

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ImageScannerScanSource with Double] = js.native
  /* 3 */ @js.native
  object autoConfigured extends TopLevel[autoConfigured with Double]
  
  /* 0 */ @js.native
  object default extends TopLevel[default with Double]
  
  /* 2 */ @js.native
  object feeder extends TopLevel[feeder with Double]
  
  /* 1 */ @js.native
  object flatbed extends TopLevel[flatbed with Double]
  
}

