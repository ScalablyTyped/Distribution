package typings.titanium.Titanium.App

import typings.titanium.LaunchOptionsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when a new URL is handled by the application.
  */
@js.native
trait iOSHandleurlEvent extends iOSBaseEvent {
  
  /**
    * The launch options that are related to opening the URL.
    */
  var launchOptions: LaunchOptionsType = js.native
}
object iOSHandleurlEvent {
  
  @scala.inline
  def apply(launchOptions: LaunchOptionsType, source: iOS): iOSHandleurlEvent = {
    val __obj = js.Dynamic.literal(launchOptions = launchOptions.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[iOSHandleurlEvent]
  }
  
  @scala.inline
  implicit class iOSHandleurlEventOps[Self <: iOSHandleurlEvent] (val x: Self) extends AnyVal {
    
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
    def setLaunchOptions(value: LaunchOptionsType): Self = this.set("launchOptions", value.asInstanceOf[js.Any])
  }
}
