package typings.tmiJs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.tmiJs.tmiJsStrings._empty
import typings.tmiJs.tmiJsStrings.admin
import typings.tmiJs.tmiJsStrings.global_mod
import typings.tmiJs.tmiJsStrings.staff
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommonUserstate
  extends StObject
     with /* paramater */ StringDictionary[Any] {
  
  var `badge-info`: js.UndefOr[BadgeInfo] = js.undefined
  
  var `badge-info-raw`: js.UndefOr[String] = js.undefined
  
  var badges: js.UndefOr[Badges] = js.undefined
  
  var `badges-raw`: js.UndefOr[String] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var `display-name`: js.UndefOr[String] = js.undefined
  
  var emotes: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
  
  var `emotes-raw`: js.UndefOr[String] = js.undefined
  
  var flags: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var mod: js.UndefOr[Boolean] = js.undefined
  
  var `room-id`: js.UndefOr[String] = js.undefined
  
  var subscriber: js.UndefOr[Boolean] = js.undefined
  
  var `tmi-sent-ts`: js.UndefOr[String] = js.undefined
  
  var turbo: js.UndefOr[Boolean] = js.undefined
  
  var `user-id`: js.UndefOr[String] = js.undefined
  
  var `user-type`: js.UndefOr[_empty | typings.tmiJs.tmiJsStrings.mod | global_mod | admin | staff] = js.undefined
}
object CommonUserstate {
  
  inline def apply(): CommonUserstate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonUserstate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommonUserstate] (val x: Self) extends AnyVal {
    
    inline def `setBadge-info`(value: BadgeInfo): Self = StObject.set(x, "badge-info", value.asInstanceOf[js.Any])
    
    inline def `setBadge-info-raw`(value: String): Self = StObject.set(x, "badge-info-raw", value.asInstanceOf[js.Any])
    
    inline def `setBadge-info-rawUndefined`: Self = StObject.set(x, "badge-info-raw", js.undefined)
    
    inline def `setBadge-infoUndefined`: Self = StObject.set(x, "badge-info", js.undefined)
    
    inline def setBadges(value: Badges): Self = StObject.set(x, "badges", value.asInstanceOf[js.Any])
    
    inline def `setBadges-raw`(value: String): Self = StObject.set(x, "badges-raw", value.asInstanceOf[js.Any])
    
    inline def `setBadges-rawUndefined`: Self = StObject.set(x, "badges-raw", js.undefined)
    
    inline def setBadgesUndefined: Self = StObject.set(x, "badges", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def `setDisplay-name`(value: String): Self = StObject.set(x, "display-name", value.asInstanceOf[js.Any])
    
    inline def `setDisplay-nameUndefined`: Self = StObject.set(x, "display-name", js.undefined)
    
    inline def setEmotes(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "emotes", value.asInstanceOf[js.Any])
    
    inline def `setEmotes-raw`(value: String): Self = StObject.set(x, "emotes-raw", value.asInstanceOf[js.Any])
    
    inline def `setEmotes-rawUndefined`: Self = StObject.set(x, "emotes-raw", js.undefined)
    
    inline def setEmotesUndefined: Self = StObject.set(x, "emotes", js.undefined)
    
    inline def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMod(value: Boolean): Self = StObject.set(x, "mod", value.asInstanceOf[js.Any])
    
    inline def setModUndefined: Self = StObject.set(x, "mod", js.undefined)
    
    inline def `setRoom-id`(value: String): Self = StObject.set(x, "room-id", value.asInstanceOf[js.Any])
    
    inline def `setRoom-idUndefined`: Self = StObject.set(x, "room-id", js.undefined)
    
    inline def setSubscriber(value: Boolean): Self = StObject.set(x, "subscriber", value.asInstanceOf[js.Any])
    
    inline def setSubscriberUndefined: Self = StObject.set(x, "subscriber", js.undefined)
    
    inline def `setTmi-sent-ts`(value: String): Self = StObject.set(x, "tmi-sent-ts", value.asInstanceOf[js.Any])
    
    inline def `setTmi-sent-tsUndefined`: Self = StObject.set(x, "tmi-sent-ts", js.undefined)
    
    inline def setTurbo(value: Boolean): Self = StObject.set(x, "turbo", value.asInstanceOf[js.Any])
    
    inline def setTurboUndefined: Self = StObject.set(x, "turbo", js.undefined)
    
    inline def `setUser-id`(value: String): Self = StObject.set(x, "user-id", value.asInstanceOf[js.Any])
    
    inline def `setUser-idUndefined`: Self = StObject.set(x, "user-id", js.undefined)
    
    inline def `setUser-type`(value: _empty | typings.tmiJs.tmiJsStrings.mod | global_mod | admin | staff): Self = StObject.set(x, "user-type", value.asInstanceOf[js.Any])
    
    inline def `setUser-typeUndefined`: Self = StObject.set(x, "user-type", js.undefined)
  }
}
