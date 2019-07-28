package typings.winrt.WindowsNs.GraphicsNs.ImagingNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IIterable
import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBitmapPropertiesView extends js.Object {
  def getPropertiesAsync(propertiesToRetrieve: IIterable[String]): IAsyncOperation[BitmapPropertySet]
}

object IBitmapPropertiesView {
  @scala.inline
  def apply(getPropertiesAsync: IIterable[String] => IAsyncOperation[BitmapPropertySet]): IBitmapPropertiesView = {
    val __obj = js.Dynamic.literal(getPropertiesAsync = js.Any.fromFunction1(getPropertiesAsync))
  
    __obj.asInstanceOf[IBitmapPropertiesView]
  }
}

