package typings.winrtUwp.Windows.Graphics.Imaging

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides read access to image properties and metadata. A particular instance of BitmapPropertiesView may represent the entire contents of the frame metadata, or any nested metadata block within the frame. */
trait BitmapPropertiesView extends StObject {
  
  /**
    * Asynchronously retrieves one or more bitmap properties.
    * @param propertiesToRetrieve A collection of strings representing the property keys or queries that are being requested. Valid strings include Windows properties and Windows Imaging Component metadata queries.
    * @return Object that manages the asynchronous retrieval of the bitmap properties.
    */
  def getPropertiesAsync(propertiesToRetrieve: IIterable[String]): IPromiseWithIAsyncOperation[BitmapPropertySet]
}
object BitmapPropertiesView {
  
  inline def apply(getPropertiesAsync: IIterable[String] => IPromiseWithIAsyncOperation[BitmapPropertySet]): BitmapPropertiesView = {
    val __obj = js.Dynamic.literal(getPropertiesAsync = js.Any.fromFunction1(getPropertiesAsync))
    __obj.asInstanceOf[BitmapPropertiesView]
  }
  
  extension [Self <: BitmapPropertiesView](x: Self) {
    
    inline def setGetPropertiesAsync(value: IIterable[String] => IPromiseWithIAsyncOperation[BitmapPropertySet]): Self = StObject.set(x, "getPropertiesAsync", js.Any.fromFunction1(value))
  }
}
