package typings.winrt.WindowsNs.GraphicsNs.ImagingNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IIterable
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IKeyValuePair
import typings.winrt.WindowsNs.FoundationNs.IAsyncAction
import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBitmapProperties extends IBitmapPropertiesView {
  def setPropertiesAsync(propertiesToSet: IIterable[IKeyValuePair[String, BitmapTypedValue]]): IAsyncAction
}

object IBitmapProperties {
  @scala.inline
  def apply(
    getPropertiesAsync: IIterable[String] => IAsyncOperation[BitmapPropertySet],
    setPropertiesAsync: IIterable[IKeyValuePair[String, BitmapTypedValue]] => IAsyncAction
  ): IBitmapProperties = {
    val __obj = js.Dynamic.literal(getPropertiesAsync = js.Any.fromFunction1(getPropertiesAsync), setPropertiesAsync = js.Any.fromFunction1(setPropertiesAsync))
  
    __obj.asInstanceOf[IBitmapProperties]
  }
}

