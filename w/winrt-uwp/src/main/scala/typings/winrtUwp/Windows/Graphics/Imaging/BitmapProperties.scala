package typings.winrtUwp.Windows.Graphics.Imaging

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Collections.IKeyValuePair
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides read and write access to image properties and metadata. */
trait BitmapProperties extends js.Object {
  /**
    * Asynchronously retrieves one or more bitmap properties.
    * @param propertiesToRetrieve A collection of strings containing the specified property keys.
    * @return Object that manages the asynchronous retrieval of the bitmap properties.
    */
  def getPropertiesAsync(propertiesToRetrieve: IIterable[String]): IPromiseWithIAsyncOperation[BitmapPropertySet]
  /**
    * Asynchronously sets one or more bitmap properties.
    * @param propertiesToSet A collection of key-value pairs representing the bitmap properties to be set. Each key is a string containing the Windows property or metadata query, and the corresponding value is a BitmapTypedValue with the data and the correct PropertyType .
    * @return Object that manages the setting of the bitmap properties asynchronously.
    */
  def setPropertiesAsync(propertiesToSet: IIterable[IKeyValuePair[_, _]]): IPromiseWithIAsyncAction
}

object BitmapProperties {
  @scala.inline
  def apply(
    getPropertiesAsync: IIterable[String] => IPromiseWithIAsyncOperation[BitmapPropertySet],
    setPropertiesAsync: IIterable[IKeyValuePair[_, _]] => IPromiseWithIAsyncAction
  ): BitmapProperties = {
    val __obj = js.Dynamic.literal(getPropertiesAsync = js.Any.fromFunction1(getPropertiesAsync), setPropertiesAsync = js.Any.fromFunction1(setPropertiesAsync))
    __obj.asInstanceOf[BitmapProperties]
  }
}

