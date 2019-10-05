package typings.winrt.Windows.Graphics.Imaging

import typings.winrt.Windows.Foundation.Collections.IIterable
import typings.winrt.Windows.Foundation.Collections.IKeyValuePair
import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Graphics.Imaging.BitmapProperties")
@js.native
class BitmapProperties () extends IBitmapProperties {
  /* CompleteClass */
  override def getPropertiesAsync(propertiesToRetrieve: IIterable[String]): IAsyncOperation[BitmapPropertySet] = js.native
  /* CompleteClass */
  override def setPropertiesAsync(propertiesToSet: IIterable[IKeyValuePair[String, BitmapTypedValue]]): IAsyncAction = js.native
}

