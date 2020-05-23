package typings.winrtUwp.global.Windows.Graphics.Imaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to the pixel data from a bitmap frame. */
@JSGlobal("Windows.Graphics.Imaging.PixelDataProvider")
@js.native
abstract class PixelDataProvider ()
  extends typings.winrtUwp.Windows.Graphics.Imaging.PixelDataProvider {
  /**
    * Returns the internally-stored pixel data.
    * @return The pixel data.
    */
  /* CompleteClass */
  override def detachPixelData(): js.Array[Double] = js.native
}

