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

