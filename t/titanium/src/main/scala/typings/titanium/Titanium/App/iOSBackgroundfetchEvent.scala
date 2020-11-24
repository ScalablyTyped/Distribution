package typings.titanium.Titanium.App

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the application is woken up for a fetch operation. Available only on iOS 7 and later.
  */
@js.native
trait iOSBackgroundfetchEvent extends iOSBaseEvent {
  
  /**
    * Unique string identifier for the `backgroundfetch` event. This identifier should be passed as the argument
    * to the [endBackgroundHandler](Titanium.App.iOS.endBackgroundHandler) method.
    */
  var handlerId: String = js.native
}
object iOSBackgroundfetchEvent {
  
  @scala.inline
  def apply(handlerId: String, source: iOS): iOSBackgroundfetchEvent = {
    val __obj = js.Dynamic.literal(handlerId = handlerId.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[iOSBackgroundfetchEvent]
  }
  
  @scala.inline
  implicit class iOSBackgroundfetchEventOps[Self <: iOSBackgroundfetchEvent] (val x: Self) extends AnyVal {
    
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
    def setHandlerId(value: String): Self = this.set("handlerId", value.asInstanceOf[js.Any])
  }
}
