package typings
package winrtDashUwpLib.WindowsNs.StorageNs.SearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a query for content properties in the ContentIndexer . */
@JSGlobal("Windows.Storage.Search.ContentIndexerQuery")
@js.native
abstract class ContentIndexerQuery () extends js.Object {
  /** Gets the StorageFolder representation of the app-provided items in the ContentIndexer query. */
  var queryFolder: winrtDashUwpLib.WindowsNs.StorageNs.StorageFolder = js.native
  /**
                   * Runs the query on the app's indexed content properties.
                   * @return When this method completes, it returns the query results, represented as a collection of IIndexableContent instances.
                   */
  def getAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
  /**
                   * Runs the query on the app's indexed content properties and returns the specified number of items from the specified start index in the results collection.
                   * @param startIndex The index of the first item to get from the results collection.
                   * @param maxItems The maximum number of items to get.
                   * @return When this method completes, it returns the query results, represented as a collection of IndexableContent instances.
                   */
  def getAsync(startIndex: scala.Double, maxItems: scala.Double): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
  /**
                   * Gets the number of items in the search results.
                   * @return When this method completes, it returns the number of items in the search results.
                   */
  def getCountAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Double] = js.native
  /**
                   * Retrieves a collection of property sets for an app, where the property sets are key-value pairs.
                   * @return When this method completes, it returns the query results as a collection of PropertyValue instances.
                   */
  def getPropertiesAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
  /**
                   * Runs the query on the app's indexed content properties and returns the specified number of properties from the specified start index in the results collection.
                   * @param startIndex The index of the first item to get from the results collection.
                   * @param maxItems The maximum number of items to get.
                   * @return When this method completes, it returns the query results as a collection of PropertyValue instances.
                   */
  def getPropertiesAsync(startIndex: scala.Double, maxItems: scala.Double): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
}

