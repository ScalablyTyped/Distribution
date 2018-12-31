package typings
package winrtDashUwpLib.WindowsNs.ServicesNs.StoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides response data for a paged request to retrieve details about products that can be purchased from within the current app. */
@JSGlobal("Windows.Services.Store.StoreProductPagedQueryResult")
@js.native
abstract class StoreProductPagedQueryResult () extends js.Object {
  /** Gets the error code for the request, if the operation encountered an error. */
  var extendedError: winrtDashUwpLib.WindowsNs.WinRTError = js.native
  /** Gets a value that indicates whether there are additional pages of results. To get the next page of results, use the GetNextAsync method. */
  var hasMoreResults: scala.Boolean = js.native
  /** Gets the collection of products returned by the request. */
  var products: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, StoreProduct] = js.native
  /**
    * Returns the next page of results. To determine if there are more pages of results, use the HasMoreResults property.
    * @return An asynchronous operation that, on successful completion, returns a StoreProductPagedQueryResult object that provides the next page of results.
    */
  def getNextAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[StoreProductPagedQueryResult] = js.native
}

