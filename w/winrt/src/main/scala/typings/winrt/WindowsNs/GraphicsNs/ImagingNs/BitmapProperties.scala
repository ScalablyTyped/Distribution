package typings.winrt.WindowsNs.GraphicsNs.ImagingNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IIterable
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IKeyValuePair
import typings.winrt.WindowsNs.FoundationNs.IAsyncAction
import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
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

