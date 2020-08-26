package typings.winrtUwp.Windows.Services.Store

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides info about a completed package update request for the current app. */
@js.native
trait StorePackageUpdateResult extends js.Object {
  /** Gets the state of the completed package update request. */
  var overallState: StorePackageUpdateState = js.native
  /** Gets info about the status of each of the package updates that are associated with the completed request. */
  var storePackageUpdateStatuses: IVectorView[StorePackageUpdateStatus] = js.native
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
  @scala.inline
  implicit class StorePackageUpdateResultOps[Self <: StorePackageUpdateResult] (val x: Self) extends AnyVal {
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
    def setOverallState(value: StorePackageUpdateState): Self = this.set("overallState", value.asInstanceOf[js.Any])
    @scala.inline
    def setStorePackageUpdateStatuses(value: IVectorView[StorePackageUpdateStatus]): Self = this.set("storePackageUpdateStatuses", value.asInstanceOf[js.Any])
  }
  
}

