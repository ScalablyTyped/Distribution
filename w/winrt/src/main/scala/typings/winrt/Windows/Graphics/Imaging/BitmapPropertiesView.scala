package typings.winrt.Windows.Graphics.Imaging

import typings.winrt.Windows.Foundation.Collections.IIterable
import typings.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BitmapPropertiesView extends IBitmapPropertiesView

object BitmapPropertiesView {
  @scala.inline
  def apply(getPropertiesAsync: IIterable[String] => IAsyncOperation[BitmapPropertySet]): BitmapPropertiesView = {
    val __obj = js.Dynamic.literal(getPropertiesAsync = js.Any.fromFunction1(getPropertiesAsync))
    __obj.asInstanceOf[BitmapPropertiesView]
  }
}

