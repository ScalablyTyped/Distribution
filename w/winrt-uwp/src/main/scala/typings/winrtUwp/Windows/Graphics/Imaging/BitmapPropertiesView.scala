package typings.winrtUwp.Windows.Graphics.Imaging

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides read access to image properties and metadata. A particular instance of BitmapPropertiesView may represent the entire contents of the frame metadata, or any nested metadata block within the frame. */
@js.native
trait BitmapPropertiesView extends js.Object {
  /**
    * Asynchronously retrieves one or more bitmap properties.
    * @param propertiesToRetrieve A collection of strings representing the property keys or queries that are being requested. Valid strings include Windows properties and Windows Imaging Component metadata queries.
    * @return Object that manages the asynchronous retrieval of the bitmap properties.
    */
  def getPropertiesAsync(propertiesToRetrieve: IIterable[String]): IPromiseWithIAsyncOperation[BitmapPropertySet] = js.native
}

object BitmapPropertiesView {
  @scala.inline
  def apply(getPropertiesAsync: IIterable[String] => IPromiseWithIAsyncOperation[BitmapPropertySet]): BitmapPropertiesView = {
    val __obj = js.Dynamic.literal(getPropertiesAsync = js.Any.fromFunction1(getPropertiesAsync))
    __obj.asInstanceOf[BitmapPropertiesView]
  }
  @scala.inline
  implicit class BitmapPropertiesViewOps[Self <: BitmapPropertiesView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetPropertiesAsync(value: IIterable[String] => IPromiseWithIAsyncOperation[BitmapPropertySet]): Self = this.set("getPropertiesAsync", js.Any.fromFunction1(value))
  }
  
}

