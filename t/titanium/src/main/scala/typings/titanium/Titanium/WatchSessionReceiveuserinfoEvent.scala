package typings.titanium.Titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * App received user info from apple watch in background. Will be called on startup if the user info finished
  * transferring when the receiver was not running.
  */
@js.native
trait WatchSessionReceiveuserinfoEvent extends WatchSessionBaseEvent {
  
  /**
    * The user info content
    */
  var userInfo: js.Any = js.native
}
object WatchSessionReceiveuserinfoEvent {
  
  @scala.inline
  def apply(source: WatchSession, userInfo: js.Any): WatchSessionReceiveuserinfoEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchSessionReceiveuserinfoEvent]
  }
  
  @scala.inline
  implicit class WatchSessionReceiveuserinfoEventOps[Self <: WatchSessionReceiveuserinfoEvent] (val x: Self) extends AnyVal {
    
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
    def setUserInfo(value: js.Any): Self = this.set("userInfo", value.asInstanceOf[js.Any])
  }
}
