package typings.winrtUwp.Windows.Services.Store

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides info about a completed package update request for the current app. */
trait StorePackageUpdateResult extends StObject {
  
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
  
  @scala.inline
  implicit class StorePackageUpdateResultMutableBuilder[Self <: StorePackageUpdateResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOverallState(value: StorePackageUpdateState): Self = StObject.set(x, "overallState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorePackageUpdateStatuses(value: IVectorView[StorePackageUpdateStatus]): Self = StObject.set(x, "storePackageUpdateStatuses", value.asInstanceOf[js.Any])
  }
}
