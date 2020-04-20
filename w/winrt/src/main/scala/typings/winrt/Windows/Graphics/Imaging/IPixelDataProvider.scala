package typings.winrt.Windows.Graphics.Imaging

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPixelDataProvider extends js.Object {
  def detachPixelData(): Uint8Array
}

object IPixelDataProvider {
  @scala.inline
  def apply(detachPixelData: () => Uint8Array): IPixelDataProvider = {
    val __obj = js.Dynamic.literal(detachPixelData = js.Any.fromFunction0(detachPixelData))
    __obj.asInstanceOf[IPixelDataProvider]
  }
}

