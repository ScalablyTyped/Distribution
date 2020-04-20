package typings.tabris.mod

import typings.tabris.OmitVideoset
import typings.tabris.tabrisStrings.autoPlay
import typings.tabris.tabrisStrings.controlsVisible
import typings.tabris.tabrisStrings.empty
import typings.tabris.tabrisStrings.fail
import typings.tabris.tabrisStrings.finish
import typings.tabris.tabrisStrings.open
import typings.tabris.tabrisStrings.pause
import typings.tabris.tabrisStrings.play
import typings.tabris.tabrisStrings.ready
import typings.tabris.tabrisStrings.set
import typings.tabris.tabrisStrings.stale
import typings.tabris.tabrisStrings.url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabris", "Video")
@js.native
class Video () extends Widget {
  def this(properties: Properties[Video, OmitVideoset]) = this()
  /**
    * If set to `true`, starts playing the video as soon as the state changes from `open` to `ready`.
    */
  var autoPlay: Boolean = js.native
  /**
    * If set to `true`, overlays the video with a native UI for controlling playback.
    */
  var controlsVisible: Boolean = js.native
  /**
    * Returns the full length of the current video in milliseconds.
    */
  val duration: Double = js.native
  /**
    * @constant
    */
  @JSName("jsxAttributes")
  val jsxAttributes_Video: (JSXAttributes[this.type, Omit[this.type, set | typings.tabris.tabrisStrings.jsxAttributes]]) with js.Object = js.native
  /**
    * Fired when the [*autoPlay*](#autoPlay) property has changed.
    */
  var onAutoPlayChanged: ChangeListeners[this.type, autoPlay] = js.native
  /**
    * Fired when the [*controlsVisible*](#controlsVisible) property has changed.
    */
  var onControlsVisibleChanged: ChangeListeners[this.type, controlsVisible] = js.native
  /**
    * Fired when the [*duration*](#duration) property has changed.
    */
  var onDurationChanged: ChangeListeners[this.type, typings.tabris.tabrisStrings.duration] = js.native
  /**
    * Fired when the [*position*](#position) property has changed.
    */
  var onPositionChanged: ChangeListeners[this.type, typings.tabris.tabrisStrings.position] = js.native
  /**
    * Fired when the [*speed*](#speed) property has changed.
    */
  var onSpeedChanged: ChangeListeners[this.type, typings.tabris.tabrisStrings.speed] = js.native
  /**
    * Fired when the [*state*](#state) property has changed.
    */
  var onStateChanged: ChangeListeners[this.type, typings.tabris.tabrisStrings.state] = js.native
  /**
    * Fired when the [*url*](#url) property has changed.
    */
  var onUrlChanged: ChangeListeners[this.type, url] = js.native
  /**
    * Returns the current playback position in milliseconds. This property does not trigger any change
    * events.
    */
  val position: Double = js.native
  /**
    * Returns the current playback speed. The value `1` represents the natural speed of the video. When the
    * *[state](#state)* of the widget is not `play` this property always has the value `0`.
    */
  val speed: Double = js.native
  /**
    * The current video playback state of the widget.
    * ![Video widget states](./img/Video-state.png)
    * - `'empty'` -  No `url` has been set.
    * - `'open'` - The `url` has been set to a valid value but the widget is not yet ready to play.
    * - `'ready'` - The widget has loaded enough content to be ready to play, but is not yet playing.
    * - `'play'` - A video is currently playing.
    * - `'stale'` - The video is paused because it is buffering more content and will resume playback once
    * it has enough content.
    * - `'pause'` - Playback is paused because of user input or `pause()` has been called.
    * - `'finish'` - Playback stopped at the end of the video.
    * - `'fail'` - An error occurred preventing video playback.
    */
  val state: empty | fail | finish | open | pause | play | ready | stale = js.native
  /**
    * The URL of the video to play. Setting this property to any non-empty string changes the
    * *[state](#state)* to `open` and the video starts loading. Setting this property to an empty string
    * unloads the current video and the *[state](#state)* returns to `empty`.
    */
  var url: String = js.native
  /**
    * Pauses the video. *[state](#state)* changes to `pause` and `speed` to `0`. Has no effect when
    * *[state](#state)* is not `play`.
    */
  def pause(): Unit = js.native
  /**
    * Starts playing the video, *[state](#state)* changes to `play`. Has no effect unless the current state
    * is either `pause` or `ready`.
    * @param speed Desired playback speed. If the given speed is not supported by the platform or video, the actual playback speed will be `1` - i.e. the natural speed of the video.
    */
  def play(): Unit = js.native
  def play(speed: Double): Unit = js.native
  /**
    * Attempts to change the `position` to the given time index. Success depends on the currently loaded
    * video. Has no effect if the current *[state](#state)* is `empty` or `fail`.
    * @param position Desired position in milliseconds.
    */
  def seek(position: Double): Unit = js.native
}

