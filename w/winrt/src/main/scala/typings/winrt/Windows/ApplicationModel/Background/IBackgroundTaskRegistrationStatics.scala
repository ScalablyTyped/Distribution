package typings.winrt.Windows.ApplicationModel.Background

import typings.winrt.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBackgroundTaskRegistrationStatics extends js.Object {
  var allTasks: IMapView[String, IBackgroundTaskRegistration]
}

object IBackgroundTaskRegistrationStatics {
  @scala.inline
  def apply(allTasks: IMapView[String, IBackgroundTaskRegistration]): IBackgroundTaskRegistrationStatics = {
    val __obj = js.Dynamic.literal(allTasks = allTasks.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IBackgroundTaskRegistrationStatics]
  }
}

