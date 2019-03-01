package typings
package winrtLib.WindowsNs.GraphicsNs.ImagingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPixelDataProvider extends js.Object {
  def detachPixelData(): stdLib.Uint8Array
}

object IPixelDataProvider {
  @scala.inline
  def apply(detachPixelData: js.Function0[stdLib.Uint8Array]): IPixelDataProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("detachPixelData")(detachPixelData)
    __obj.asInstanceOf[IPixelDataProvider]
  }
}

