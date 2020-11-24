package typings.titanium.Titanium.Media

import typings.titanium.ProxyEventMap
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
  implicit class MusicPlayerEventMapOps[Self <: MusicPlayerEventMap] (val x: Self) extends AnyVal {
    
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
    def setPlayingchange(value: MusicPlayerPlayingchangeEvent): Self = this.set("playingchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatechange(value: MusicPlayerStatechangeEvent): Self = this.set("statechange", value.asInstanceOf[js.Any])
  }
}
