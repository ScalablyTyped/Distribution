package typings.titanium.Titanium.Media

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MusicPlayerEventMap extends ProxyEventMap {
  var playingchange: MusicPlayerPlayingchangeEvent
  var statechange: MusicPlayerStatechangeEvent
}

object MusicPlayerEventMap {
  @scala.inline
  def apply(playingchange: MusicPlayerPlayingchangeEvent, statechange: MusicPlayerStatechangeEvent): MusicPlayerEventMap = {
    val __obj = js.Dynamic.literal(playingchange = playingchange.asInstanceOf[js.Any], statechange = statechange.asInstanceOf[js.Any])
    __obj.asInstanceOf[MusicPlayerEventMap]
  }
}

