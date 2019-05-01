package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A widget that plays a video from an URL.
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- tabrisLib.tabrisMod._VideoProperties because var conflicts: background, backgroundImage, baseline, bottom, centerX, centerY, `class`, classList, cornerRadius, elevation, enabled, font, height, highlightOnTouch, id, layoutData, left, opacity, right, top, transform, visible, width, win_theme. Inlined autoPlay, controlsVisible, url */ @JSImport("tabris", "Video")
@js.native
class Video () extends Widget {
  def this(properties: Properties[Video, TypeScriptPropertiesKey]) = this()
  /**
    * If set to `true`, starts playing the video as soon as the state changes from `open` to `ready`.
    */
  var autoPlay: scala.Boolean = js.native
  /**
    * If set to `true`, overlays the video with a native UI for controlling playback.
    */
  var controlsVisible: scala.Boolean = js.native
  /**
    * Returns the full length of the current video in milliseconds.
    */
  val duration: scala.Double = js.native
  /**
    * Returns the current playback position in milliseconds. This property does not trigger any change
    * events.
    */
  val position: scala.Double = js.native
  /**
    * Returns the current playback speed. The value `1` represents the natural speed of the video. When the
    * *[state](#state)* of the widget is not `play` this property always has the value `0`.
    */
  val speed: scala.Double = js.native
  /**
    * The current state of the widget.
    */
  val state: tabrisLib.tabrisLibStrings.empty | tabrisLib.tabrisLibStrings.fail | tabrisLib.tabrisLibStrings.finish | tabrisLib.tabrisLibStrings.open | tabrisLib.tabrisLibStrings.pause | tabrisLib.tabrisLibStrings.play | tabrisLib.tabrisLibStrings.ready | tabrisLib.tabrisLibStrings.stale = js.native
  /**
    * The type of this property defines the interface used by `set`, `get`, and
    * the `Properties` interface. It's value is always undefined.
    */
  @JSName("tsProperties")
  val tsProperties_Video: VideoProperties = js.native
  /**
    * The URL of the video to play. Setting this property to any non-empty string changes the
    * *[state](#state)* to `open` and the video starts loading. Setting this property to an empty string
    * unloads the current video and the *[state](#state)* returns to `empty`.
    */
  var url: java.lang.String = js.native
  /**
    * Removes all listeners in the given object from the event type indicated by their key.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to deregister from these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def off(listeners: VideoEvents): this.type = js.native
  /**
    * Registers all listeners in the given object for the event type indicated by their key.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to register for these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def on(listeners: VideoEvents): this.type = js.native
  /**
    * Same as `on`, but removes the listener after it has been invoked by an event.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to register for these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def once(listeners: VideoEvents): this.type = js.native
  /**
    * Pauses the video. *[state](#state)* changes to `pause` and `speed` to `0`. Has no effect when
    * *[state](#state)* is not `play`.
    */
  def pause(): scala.Unit = js.native
  /**
    * Starts playing the video, *[state](#state)* changes to `play`. Has no effect unless the current state
    * is either `pause` or `ready`.
    * @param speed Desired playback speed. If the given speed is not supported by the platform or video, the actual playback speed will be `1` - i.e. the natural speed of the video.
    */
  def play(): scala.Unit = js.native
  def play(speed: scala.Double): scala.Unit = js.native
  /**
    * Attempts to change the `position` to the given time index. Success depends on the currently loaded
    * video. Has no effect if the current *[state](#state)* is `empty` or `fail`.
    * @param position Desired position in milliseconds.
    */
  def seek(position: scala.Double): scala.Unit = js.native
}

