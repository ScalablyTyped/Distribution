package typings.winrtUwp.Windows.Graphics.Imaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to the pixel data from a bitmap frame. */
trait PixelDataProvider extends js.Object {
  /**
    * Returns the internally-stored pixel data.
    * @return The pixel data.
    */
  def detachPixelData(): js.Array[Double]
}

object PixelDataProvider {
  @scala.inline
  def apply(detachPixelData: () => js.Array[Double]): PixelDataProvider = {
    val __obj = js.Dynamic.literal(detachPixelData = js.Any.fromFunction0(detachPixelData))
    __obj.asInstanceOf[PixelDataProvider]
  }
}

