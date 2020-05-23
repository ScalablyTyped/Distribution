package typings.titanium.Titanium.UI.iOS

import typings.titanium.Titanium.UI.View
import typings.titanium.titaniumStrings.click
import typings.titanium.titaniumStrings.dblclick
import typings.titanium.titaniumStrings.doubletap
import typings.titanium.titaniumStrings.keypressed
import typings.titanium.titaniumStrings.longpress
import typings.titanium.titaniumStrings.pinch
import typings.titanium.titaniumStrings.postlayout
import typings.titanium.titaniumStrings.singletap
import typings.titanium.titaniumStrings.start
import typings.titanium.titaniumStrings.stop
import typings.titanium.titaniumStrings.swipe
import typings.titanium.titaniumStrings.touchcancel
import typings.titanium.titaniumStrings.touchend
import typings.titanium.titaniumStrings.touchmove
import typings.titanium.titaniumStrings.touchstart
import typings.titanium.titaniumStrings.twofingertap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A view to display a <Titanium.UI.iOS.LivePhoto> object introduced in iOS 9.1.
  */
@js.native
trait LivePhotoView extends View {
  /**
    * The Live Photo displayed in the view.
    */
  var livePhoto: LivePhoto = js.native
  /**
    * A Boolean value that determines whether the view plays the audio content of its Live Photo.
    */
  var muted: Boolean = js.native
  @JSName("addEventListener")
  def addEventListener_start(
    name: start,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ LivePhotoViewStartEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stop(
    name: stop,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ LivePhotoViewStopEvent, Unit]
  ): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_click(name: click, event: LivePhotoViewClickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dblclick(name: dblclick, event: LivePhotoViewDblclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_doubletap(name: doubletap, event: LivePhotoViewDoubletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_keypressed(name: keypressed, event: LivePhotoViewKeypressedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longpress(name: longpress, event: LivePhotoViewLongpressEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_pinch(name: pinch, event: LivePhotoViewPinchEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_postlayout(name: postlayout, event: LivePhotoViewPostlayoutEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_singletap(name: singletap, event: LivePhotoViewSingletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_start(name: start): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_start(name: start, event: LivePhotoViewStartEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_stop(name: stop): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_stop(name: stop, event: LivePhotoViewStopEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_swipe(name: swipe, event: LivePhotoViewSwipeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchcancel(name: touchcancel, event: LivePhotoViewTouchcancelEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchend(name: touchend, event: LivePhotoViewTouchendEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchmove(name: touchmove, event: LivePhotoViewTouchmoveEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchstart(name: touchstart, event: LivePhotoViewTouchstartEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_twofingertap(name: twofingertap, event: LivePhotoViewTwofingertapEvent): Unit = js.native
  /**
    * Gets the value of the <Titanium.UI.iOS.LivePhotoView.livePhoto> property.
    * @deprecated Access <Titanium.UI.iOS.LivePhotoView.livePhoto> instead.
    */
  def getLivePhoto(): LivePhoto = js.native
  /**
    * Gets the value of the <Titanium.UI.iOS.LivePhotoView.muted> property.
    * @deprecated Access <Titanium.UI.iOS.LivePhotoView.muted> instead.
    */
  def getMuted(): Boolean = js.native
  @JSName("removeEventListener")
  def removeEventListener_start(
    name: start,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ LivePhotoViewStartEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stop(
    name: stop,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ LivePhotoViewStopEvent, Unit]
  ): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.iOS.LivePhotoView.livePhoto> property.
    * @deprecated Set the value using <Titanium.UI.iOS.LivePhotoView.livePhoto> instead.
    */
  def setLivePhoto(livePhoto: LivePhoto): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.iOS.LivePhotoView.muted> property.
    * @deprecated Set the value using <Titanium.UI.iOS.LivePhotoView.muted> instead.
    */
  def setMuted(muted: Boolean): Unit = js.native
  /**
    * Begins playback of Live Photo content in the view.
    */
  def startPlaybackWithStyle(playbackStyle: Double): Unit = js.native
  /**
    * Ends playback of Live Photo content in the view.
    */
  def stopPlayback(): Unit = js.native
}

