package typings.unityWebapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnityMediaPlayer extends js.Object {
  def getPlaybackstate(response: js.Function): js.Any = js.native
  def onNext(onNextCallback: js.Function): js.Any = js.native
  def onPlayPause(onPlayPauseCallback: js.Function): js.Any = js.native
  def onPrevious(onPreviousCallback: js.Function): js.Any = js.native
  def setCanGoNext(cangonext: Boolean): js.Any = js.native
  def setCanGoPrev(cangoprev: Boolean): js.Any = js.native
  def setCanPause(canpause: Boolean): js.Any = js.native
  def setCanPlay(canplay: Boolean): js.Any = js.native
  def setPlaybackstate(state: UnityPlaybackState): js.Any = js.native
  def setTrack(trackMetadata: UnityTrackMetadata): js.Any = js.native
}

object UnityMediaPlayer {
  @scala.inline
  def apply(
    getPlaybackstate: js.Function => js.Any,
    onNext: js.Function => js.Any,
    onPlayPause: js.Function => js.Any,
    onPrevious: js.Function => js.Any,
    setCanGoNext: Boolean => js.Any,
    setCanGoPrev: Boolean => js.Any,
    setCanPause: Boolean => js.Any,
    setCanPlay: Boolean => js.Any,
    setPlaybackstate: UnityPlaybackState => js.Any,
    setTrack: UnityTrackMetadata => js.Any
  ): UnityMediaPlayer = {
    val __obj = js.Dynamic.literal(getPlaybackstate = js.Any.fromFunction1(getPlaybackstate), onNext = js.Any.fromFunction1(onNext), onPlayPause = js.Any.fromFunction1(onPlayPause), onPrevious = js.Any.fromFunction1(onPrevious), setCanGoNext = js.Any.fromFunction1(setCanGoNext), setCanGoPrev = js.Any.fromFunction1(setCanGoPrev), setCanPause = js.Any.fromFunction1(setCanPause), setCanPlay = js.Any.fromFunction1(setCanPlay), setPlaybackstate = js.Any.fromFunction1(setPlaybackstate), setTrack = js.Any.fromFunction1(setTrack))
    __obj.asInstanceOf[UnityMediaPlayer]
  }
  @scala.inline
  implicit class UnityMediaPlayerOps[Self <: UnityMediaPlayer] (val x: Self) extends AnyVal {
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
    def setGetPlaybackstate(value: js.Function => js.Any): Self = this.set("getPlaybackstate", js.Any.fromFunction1(value))
    @scala.inline
    def setOnNext(value: js.Function => js.Any): Self = this.set("onNext", js.Any.fromFunction1(value))
    @scala.inline
    def setOnPlayPause(value: js.Function => js.Any): Self = this.set("onPlayPause", js.Any.fromFunction1(value))
    @scala.inline
    def setOnPrevious(value: js.Function => js.Any): Self = this.set("onPrevious", js.Any.fromFunction1(value))
    @scala.inline
    def setSetCanGoNext(value: Boolean => js.Any): Self = this.set("setCanGoNext", js.Any.fromFunction1(value))
    @scala.inline
    def setSetCanGoPrev(value: Boolean => js.Any): Self = this.set("setCanGoPrev", js.Any.fromFunction1(value))
    @scala.inline
    def setSetCanPause(value: Boolean => js.Any): Self = this.set("setCanPause", js.Any.fromFunction1(value))
    @scala.inline
    def setSetCanPlay(value: Boolean => js.Any): Self = this.set("setCanPlay", js.Any.fromFunction1(value))
    @scala.inline
    def setSetPlaybackstate(value: UnityPlaybackState => js.Any): Self = this.set("setPlaybackstate", js.Any.fromFunction1(value))
    @scala.inline
    def setSetTrack(value: UnityTrackMetadata => js.Any): Self = this.set("setTrack", js.Any.fromFunction1(value))
  }
  
}

