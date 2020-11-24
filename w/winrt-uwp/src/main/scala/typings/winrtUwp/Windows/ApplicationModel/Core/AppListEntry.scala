package typings.winrtUwp.Windows.ApplicationModel.Core

import typings.winrtUwp.Windows.ApplicationModel.AppDisplayInfo
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides an app's display info such as its display name and description, and a method to launch the app. */
@js.native
trait AppListEntry extends js.Object {
  
  /** Provides an app's display name, description, and logo. */
  var displayInfo: AppDisplayInfo = js.native
  
  /**
    * Launches the app associated with this AppListEntry
    * @return If the launch fails for any reason, the Boolean value is false
    */
  def launchAsync(): IPromiseWithIAsyncOperation[Boolean] = js.native
}
object AppListEntry {
  
  @scala.inline
  def apply(displayInfo: AppDisplayInfo, launchAsync: () => IPromiseWithIAsyncOperation[Boolean]): AppListEntry = {
    val __obj = js.Dynamic.literal(displayInfo = displayInfo.asInstanceOf[js.Any], launchAsync = js.Any.fromFunction0(launchAsync))
    __obj.asInstanceOf[AppListEntry]
  }
  
  @scala.inline
  implicit class AppListEntryOps[Self <: AppListEntry] (val x: Self) extends AnyVal {
    
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
    def setDisplayInfo(value: AppDisplayInfo): Self = this.set("displayInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchAsync(value: () => IPromiseWithIAsyncOperation[Boolean]): Self = this.set("launchAsync", js.Any.fromFunction0(value))
  }
}
