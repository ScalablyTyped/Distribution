package typings.winrt.global.Windows.Graphics.Imaging

import typings.winrt.Windows.Foundation.Collections.IIterable
import typings.winrt.Windows.Foundation.Collections.IKeyValuePair
import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Graphics.Imaging.BitmapProperties")
@js.native
class BitmapProperties ()
  extends typings.winrt.Windows.Graphics.Imaging.BitmapProperties {
  /* CompleteClass */
  override def getPropertiesAsync(propertiesToRetrieve: IIterable[String]): IAsyncOperation[typings.winrt.Windows.Graphics.Imaging.BitmapPropertySet] = js.native
  /* CompleteClass */
  override def setPropertiesAsync(
    propertiesToSet: IIterable[IKeyValuePair[String, typings.winrt.Windows.Graphics.Imaging.BitmapTypedValue]]
  ): IAsyncAction = js.native
}

