package typings.winrtUwp.Windows.Services.Store

import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides response data for a paged request to retrieve details about products that can be purchased from within the current app. */
trait StoreProductPagedQueryResult extends js.Object {
  /** Gets the error code for the request, if the operation encountered an error. */
  var extendedError: WinRTError
  /** Gets a value that indicates whether there are additional pages of results. To get the next page of results, use the GetNextAsync method. */
  var hasMoreResults: Boolean
  /** Gets the collection of products returned by the request. */
  var products: IMapView[String, StoreProduct]
  /**
    * Returns the next page of results. To determine if there are more pages of results, use the HasMoreResults property.
    * @return An asynchronous operation that, on successful completion, returns a StoreProductPagedQueryResult object that provides the next page of results.
    */
  def getNextAsync(): IPromiseWithIAsyncOperation[StoreProductPagedQueryResult]
}

object StoreProductPagedQueryResult {
  @scala.inline
  def apply(
    extendedError: WinRTError,
    getNextAsync: () => IPromiseWithIAsyncOperation[StoreProductPagedQueryResult],
    hasMoreResults: Boolean,
    products: IMapView[String, StoreProduct]
  ): StoreProductPagedQueryResult = {
    val __obj = js.Dynamic.literal(extendedError = extendedError.asInstanceOf[js.Any], getNextAsync = js.Any.fromFunction0(getNextAsync), hasMoreResults = hasMoreResults.asInstanceOf[js.Any], products = products.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreProductPagedQueryResult]
  }
}

