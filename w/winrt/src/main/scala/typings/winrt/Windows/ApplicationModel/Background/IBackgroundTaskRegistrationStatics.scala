package typings.winrt.Windows.ApplicationModel.Background

import typings.winrt.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBackgroundTaskRegistrationStatics extends js.Object {
  
  var allTasks: IMapView[String, IBackgroundTaskRegistration] = js.native
}
object IBackgroundTaskRegistrationStatics {
  
  @scala.inline
  def apply(allTasks: IMapView[String, IBackgroundTaskRegistration]): IBackgroundTaskRegistrationStatics = {
    val __obj = js.Dynamic.literal(allTasks = allTasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBackgroundTaskRegistrationStatics]
  }
  
  @scala.inline
  implicit class IBackgroundTaskRegistrationStaticsOps[Self <: IBackgroundTaskRegistrationStatics] (val x: Self) extends AnyVal {
    
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
    def setAllTasks(value: IMapView[String, IBackgroundTaskRegistration]): Self = this.set("allTasks", value.asInstanceOf[js.Any])
  }
}
