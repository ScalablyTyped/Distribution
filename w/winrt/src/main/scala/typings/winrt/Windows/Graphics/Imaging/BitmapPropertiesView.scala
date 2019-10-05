package typings.winrt.Windows.Graphics.Imaging

import typings.winrt.Windows.Foundation.Collections.IIterable
import typings.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Graphics.Imaging.BitmapPropertiesView")
@js.native
class BitmapPropertiesView () extends IBitmapPropertiesView {
  /* CompleteClass */
  override def getPropertiesAsync(propertiesToRetrieve: IIterable[String]): IAsyncOperation[BitmapPropertySet] = js.native
}

