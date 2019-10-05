package typings.winrt.Windows.Graphics.Imaging

import typings.winrt.Windows.Foundation.Collections.IIterable
import typings.winrt.Windows.Foundation.Collections.IKeyValuePair
import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.Windows.Foundation.IAsyncOperation
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

