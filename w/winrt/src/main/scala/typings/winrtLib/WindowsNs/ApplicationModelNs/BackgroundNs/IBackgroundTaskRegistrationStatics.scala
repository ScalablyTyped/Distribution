package typings
package winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBackgroundTaskRegistrationStatics extends js.Object {
  var allTasks: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, IBackgroundTaskRegistration]
}

object IBackgroundTaskRegistrationStatics {
  @scala.inline
  def apply(
    allTasks: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, IBackgroundTaskRegistration]
  ): IBackgroundTaskRegistrationStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("allTasks")(allTasks)
    __obj.asInstanceOf[IBackgroundTaskRegistrationStatics]
  }
}

