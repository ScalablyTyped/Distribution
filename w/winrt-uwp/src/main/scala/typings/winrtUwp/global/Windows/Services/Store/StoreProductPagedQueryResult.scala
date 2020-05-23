package typings.winrtUwp.global.Windows.Services.Store

import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides response data for a paged request to retrieve details about products that can be purchased from within the current app. */
@JSGlobal("Windows.Services.Store.StoreProductPagedQueryResult")
@js.native
abstract class StoreProductPagedQueryResult ()
  extends typings.winrtUwp.Windows.Services.Store.StoreProductPagedQueryResult {
  /** Gets the error code for the request, if the operation encountered an error. */
  /* CompleteClass */
  override var extendedError: WinRTError = js.native
  /** Gets a value that indicates whether there are additional pages of results. To get the next page of results, use the GetNextAsync method. */
  /* CompleteClass */
  override var hasMoreResults: Boolean = js.native
  /** Gets the collection of products returned by the request. */
  /* CompleteClass */
  override var products: IMapView[String, typings.winrtUwp.Windows.Services.Store.StoreProduct] = js.native
  /**
    * Returns the next page of results. To determine if there are more pages of results, use the HasMoreResults property.
    * @return An asynchronous operation that, on successful completion, returns a StoreProductPagedQueryResult object that provides the next page of results.
    */
  /* CompleteClass */
  override def getNextAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Services.Store.StoreProductPagedQueryResult] = js.native
}

