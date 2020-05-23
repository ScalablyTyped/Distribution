package typings.winrtUwp.global.Windows.Graphics.Imaging

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides read access to image properties and metadata. A particular instance of BitmapPropertiesView may represent the entire contents of the frame metadata, or any nested metadata block within the frame. */
@JSGlobal("Windows.Graphics.Imaging.BitmapPropertiesView")
@js.native
abstract class BitmapPropertiesView ()
  extends typings.winrtUwp.Windows.Graphics.Imaging.BitmapPropertiesView {
  /**
    * Asynchronously retrieves one or more bitmap properties.
    * @param propertiesToRetrieve A collection of strings representing the property keys or queries that are being requested. Valid strings include Windows properties and Windows Imaging Component metadata queries.
    * @return Object that manages the asynchronous retrieval of the bitmap properties.
    */
  /* CompleteClass */
  override def getPropertiesAsync(propertiesToRetrieve: IIterable[String]): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Graphics.Imaging.BitmapPropertySet] = js.native
}

