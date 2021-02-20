package typings.titanium.Titanium.Media

import typings.titanium.ProxyEventMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MusicPlayerEventMap extends ProxyEventMap {
  
  var playingchange: MusicPlayerPlayingchangeEvent = js.native
  
  var statechange: MusicPlayerStatechangeEvent = js.native
}
object MusicPlayerEventMap {
  
  @scala.inline
  def apply(playingchange: MusicPlayerPlayingchangeEvent, statechange: MusicPlayerStatechangeEvent): MusicPlayerEventMap = {
    val __obj = js.Dynamic.literal(playingchange = playingchange.asInstanceOf[js.Any], statechange = statechange.asInstanceOf[js.Any])
    __obj.asInstanceOf[MusicPlayerEventMap]
  }
  
  @scala.inline
  implicit class MusicPlayerEventMapMutableBuilder[Self <: MusicPlayerEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlayingchange(value: MusicPlayerPlayingchangeEvent): Self = StObject.set(x, "playingchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatechange(value: MusicPlayerStatechangeEvent): Self = StObject.set(x, "statechange", value.asInstanceOf[js.Any])
  }
}
