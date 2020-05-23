package typings.winrtUwp.Windows.Services.Store

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides info about a completed package update request for the current app. */
trait StorePackageUpdateResult extends js.Object {
  /** Gets the state of the completed package update request. */
  var overallState: StorePackageUpdateState
  /** Gets info about the status of each of the package updates that are associated with the completed request. */
  var storePackageUpdateStatuses: IVectorView[StorePackageUpdateStatus]
}

object StorePackageUpdateResult {
  @scala.inline
  def apply(
    overallState: StorePackageUpdateState,
    storePackageUpdateStatuses: IVectorView[StorePackageUpdateStatus]
  ): StorePackageUpdateResult = {
    val __obj = js.Dynamic.literal(overallState = overallState.asInstanceOf[js.Any], storePackageUpdateStatuses = storePackageUpdateStatuses.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorePackageUpdateResult]
  }
}

