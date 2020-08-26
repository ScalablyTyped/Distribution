package typings.winrtUwp.Windows.Graphics.Imaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to the pixel data from a bitmap frame. */
@js.native
trait PixelDataProvider extends js.Object {
  /**
    * Returns the internally-stored pixel data.
    * @return The pixel data.
    */
  def detachPixelData(): js.Array[Double] = js.native
}

object PixelDataProvider {
  @scala.inline
  def apply(detachPixelData: () => js.Array[Double]): PixelDataProvider = {
    val __obj = js.Dynamic.literal(detachPixelData = js.Any.fromFunction0(detachPixelData))
    __obj.asInstanceOf[PixelDataProvider]
  }
  @scala.inline
  implicit class PixelDataProviderOps[Self <: PixelDataProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDetachPixelData(value: () => js.Array[Double]): Self = this.set("detachPixelData", js.Any.fromFunction0(value))
  }
  
}

