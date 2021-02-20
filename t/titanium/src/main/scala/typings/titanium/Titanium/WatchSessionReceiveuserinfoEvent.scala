package typings.titanium.Titanium

import org.scalablytyped.runtime.StObject
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
  implicit class WatchSessionReceiveuserinfoEventMutableBuilder[Self <: WatchSessionReceiveuserinfoEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserInfo(value: js.Any): Self = StObject.set(x, "userInfo", value.asInstanceOf[js.Any])
  }
}
