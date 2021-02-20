package typings.winrtUwp.Windows.Storage.Search

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.StorageFolder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a query for content properties in the ContentIndexer . */
@js.native
trait ContentIndexerQuery extends StObject {
  
  /**
    * Runs the query on the app's indexed content properties.
    * @return When this method completes, it returns the query results, represented as a collection of IIndexableContent instances.
    */
  def getAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Runs the query on the app's indexed content properties and returns the specified number of items from the specified start index in the results collection.
    * @param startIndex The index of the first item to get from the results collection.
    * @param maxItems The maximum number of items to get.
    * @return When this method completes, it returns the query results, represented as a collection of IndexableContent instances.
    */
  def getAsync(startIndex: Double, maxItems: Double): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  
  /**
    * Gets the number of items in the search results.
    * @return When this method completes, it returns the number of items in the search results.
    */
  def getCountAsync(): IPromiseWithIAsyncOperation[Double] = js.native
  
  /**
    * Retrieves a collection of property sets for an app, where the property sets are key-value pairs.
    * @return When this method completes, it returns the query results as a collection of PropertyValue instances.
    */
  def getPropertiesAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Runs the query on the app's indexed content properties and returns the specified number of properties from the specified start index in the results collection.
    * @param startIndex The index of the first item to get from the results collection.
    * @param maxItems The maximum number of items to get.
    * @return When this method completes, it returns the query results as a collection of PropertyValue instances.
    */
  def getPropertiesAsync(startIndex: Double, maxItems: Double): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  
  /** Gets the StorageFolder representation of the app-provided items in the ContentIndexer query. */
  var queryFolder: StorageFolder = js.native
}
