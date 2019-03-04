package typings
package unityDashWebapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnityMediaPlayer extends js.Object {
  def getPlaybackstate(response: js.Function): js.Any
  def onNext(onNextCallback: js.Function): js.Any
  def onPlayPause(onPlayPauseCallback: js.Function): js.Any
  def onPrevious(onPreviousCallback: js.Function): js.Any
  def setCanGoNext(cangonext: scala.Boolean): js.Any
  def setCanGoPrev(cangoprev: scala.Boolean): js.Any
  def setCanPause(canpause: scala.Boolean): js.Any
  def setCanPlay(canplay: scala.Boolean): js.Any
  def setPlaybackstate(state: UnityPlaybackState): js.Any
  def setTrack(trackMetadata: UnityTrackMetadata): js.Any
}

object UnityMediaPlayer {
  @scala.inline
  def apply(
    getPlaybackstate: js.Function1[js.Function, js.Any],
    onNext: js.Function1[js.Function, js.Any],
    onPlayPause: js.Function1[js.Function, js.Any],
    onPrevious: js.Function1[js.Function, js.Any],
    setCanGoNext: js.Function1[scala.Boolean, js.Any],
    setCanGoPrev: js.Function1[scala.Boolean, js.Any],
    setCanPause: js.Function1[scala.Boolean, js.Any],
    setCanPlay: js.Function1[scala.Boolean, js.Any],
    setPlaybackstate: js.Function1[UnityPlaybackState, js.Any],
    setTrack: js.Function1[UnityTrackMetadata, js.Any]
  ): UnityMediaPlayer = {
    val __obj = js.Dynamic.literal(getPlaybackstate = getPlaybackstate, onNext = onNext, onPlayPause = onPlayPause, onPrevious = onPrevious, setCanGoNext = setCanGoNext, setCanGoPrev = setCanGoPrev, setCanPause = setCanPause, setCanPlay = setCanPlay, setPlaybackstate = setPlaybackstate, setTrack = setTrack)
  
    __obj.asInstanceOf[UnityMediaPlayer]
  }
}

