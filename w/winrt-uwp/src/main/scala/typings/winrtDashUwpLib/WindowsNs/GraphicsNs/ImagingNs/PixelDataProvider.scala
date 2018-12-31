package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to the pixel data from a bitmap frame. */
@JSGlobal("Windows.Graphics.Imaging.PixelDataProvider")
@js.native
abstract class PixelDataProvider () extends js.Object {
  /**
    * Returns the internally-stored pixel data.
    * @return The pixel data.
    */
  def detachPixelData(): js.Array[scala.Double] = js.native
}

