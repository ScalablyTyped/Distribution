package typings.tmiJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoomState extends StObject {
  
  var `broadcaster-lang`: js.UndefOr[String] = js.undefined
  
  var channel: js.UndefOr[String] = js.undefined
  
  var `emote-only`: js.UndefOr[Boolean] = js.undefined
  
  var `followers-only`: js.UndefOr[String | Boolean] = js.undefined
  
  var r9k: js.UndefOr[Boolean] = js.undefined
  
  var rituals: js.UndefOr[Boolean] = js.undefined
  
  var `room-id`: js.UndefOr[String] = js.undefined
  
  var slow: js.UndefOr[String | Boolean] = js.undefined
  
  var `subs-only`: js.UndefOr[Boolean] = js.undefined
}
object RoomState {
  
  inline def apply(): RoomState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoomState]
  }
  
  extension [Self <: RoomState](x: Self) {
    
    inline def `setBroadcaster-lang`(value: String): Self = StObject.set(x, "broadcaster-lang", value.asInstanceOf[js.Any])
    
    inline def `setBroadcaster-langUndefined`: Self = StObject.set(x, "broadcaster-lang", js.undefined)
    
    inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
    
    inline def `setEmote-only`(value: Boolean): Self = StObject.set(x, "emote-only", value.asInstanceOf[js.Any])
    
    inline def `setEmote-onlyUndefined`: Self = StObject.set(x, "emote-only", js.undefined)
    
    inline def `setFollowers-only`(value: String | Boolean): Self = StObject.set(x, "followers-only", value.asInstanceOf[js.Any])
    
    inline def `setFollowers-onlyUndefined`: Self = StObject.set(x, "followers-only", js.undefined)
    
    inline def setR9k(value: Boolean): Self = StObject.set(x, "r9k", value.asInstanceOf[js.Any])
    
    inline def setR9kUndefined: Self = StObject.set(x, "r9k", js.undefined)
    
    inline def setRituals(value: Boolean): Self = StObject.set(x, "rituals", value.asInstanceOf[js.Any])
    
    inline def setRitualsUndefined: Self = StObject.set(x, "rituals", js.undefined)
    
    inline def `setRoom-id`(value: String): Self = StObject.set(x, "room-id", value.asInstanceOf[js.Any])
    
    inline def `setRoom-idUndefined`: Self = StObject.set(x, "room-id", js.undefined)
    
    inline def setSlow(value: String | Boolean): Self = StObject.set(x, "slow", value.asInstanceOf[js.Any])
    
    inline def setSlowUndefined: Self = StObject.set(x, "slow", js.undefined)
    
    inline def `setSubs-only`(value: Boolean): Self = StObject.set(x, "subs-only", value.asInstanceOf[js.Any])
    
    inline def `setSubs-onlyUndefined`: Self = StObject.set(x, "subs-only", js.undefined)
  }
}
