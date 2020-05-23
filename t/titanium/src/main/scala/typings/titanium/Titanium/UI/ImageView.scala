package typings.titanium.Titanium.UI

import typings.titanium.Titanium.Blob
import typings.titanium.Titanium.Filesystem.File
import typings.titanium.titaniumStrings.change
import typings.titanium.titaniumStrings.click
import typings.titanium.titaniumStrings.dblclick
import typings.titanium.titaniumStrings.doubletap
import typings.titanium.titaniumStrings.error
import typings.titanium.titaniumStrings.focus
import typings.titanium.titaniumStrings.keypressed
import typings.titanium.titaniumStrings.load
import typings.titanium.titaniumStrings.longclick
import typings.titanium.titaniumStrings.longpress
import typings.titanium.titaniumStrings.pause
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
  * A view to display a single image or series of animated images.
  */
@js.native
trait ImageView extends View {
  /**
    * Indicates whether animation is running.
    */
  val animating: Boolean = js.native
  /**
    * Indicates whether the image should be rotated based on exif orientation data.
    * By default, this is false on android and true on iOS.
    */
  var autorotate: Boolean = js.native
  /**
    * Number of times to retry decoding the bitmap at a URL.
    */
  var decodeRetries: Double = js.native
  /**
    * Local path to the default image to display while loading a remote image.
    */
  var defaultImage: String = js.native
  /**
    * Amount of time in milliseconds to animate one cycle.
    */
  var duration: Double = js.native
  /**
    * Show zoom controls when the user touches the image view.
    */
  var enableZoomControls: Boolean = js.native
  /**
    * Set to `true` to prevent scaling of 2x/3x-resolution remote images for retina
    * displays.
    */
  var hires: Boolean = js.native
  /**
    * Image to display.
    */
  var image: String | Blob | File = js.native
  /**
    * Array of images to animate, defined using local filesystem paths, `File` objects,
    * remote URLs (Android only), or `Blob` objects containing image data.
    * When using this property, an initial `start()` needs to be called upon the ImageView before any image will show in this imageview.
    * Related properties/methods to look at: `start`, `stop`, `pause`, `reverse`, `resume` and `repeatCount`
    */
  var images: js.Array[Blob | File | String] = js.native
  /**
    * Indicates whether the animation is paused.
    */
  val paused: Boolean = js.native
  /**
    * Prevent the default image from being displayed while loading a remote image. This property
    * is ignored when the `defaultImage` property is set.
    */
  var preventDefaultImage: Boolean = js.native
  /**
    * Number of times to repeat the image animation.
    */
  var repeatCount: Double = js.native
  /**
    * Run the animation in reverse.
    */
  var reverse: Boolean = js.native
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  @JSName("addEventListener")
  def addEventListener_change(
    name: change,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ImageViewChangeEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    name: error,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ImageViewErrorEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(name: load, callback: js.ThisFunction1[/* this */ this.type, /* event */ ImageViewLoadEvent, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    name: pause,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ImageViewPauseEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_start(
    name: start,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ImageViewStartEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stop(name: stop, callback: js.ThisFunction1[/* this */ this.type, /* event */ ImageViewStopEvent, Unit]): Unit = js.native
  /**
    * Fires a synthesized event to any registered listeners.
    */
  @JSName("fireEvent")
  def fireEvent_change(name: change): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_change(name: change, event: ImageViewChangeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_click(name: click, event: ImageViewClickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dblclick(name: dblclick, event: ImageViewDblclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_doubletap(name: doubletap, event: ImageViewDoubletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_error(name: error): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_error(name: error, event: ImageViewErrorEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_focus(name: focus, event: ImageViewFocusEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_keypressed(name: keypressed, event: ImageViewKeypressedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_load(name: load): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_load(name: load, event: ImageViewLoadEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longclick(name: longclick, event: ImageViewLongclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longpress(name: longpress, event: ImageViewLongpressEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_pause(name: pause): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_pause(name: pause, event: ImageViewPauseEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_pinch(name: pinch, event: ImageViewPinchEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_postlayout(name: postlayout, event: ImageViewPostlayoutEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_singletap(name: singletap, event: ImageViewSingletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_start(name: start): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_start(name: start, event: ImageViewStartEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_stop(name: stop): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_stop(name: stop, event: ImageViewStopEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_swipe(name: swipe, event: ImageViewSwipeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchcancel(name: touchcancel, event: ImageViewTouchcancelEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchend(name: touchend, event: ImageViewTouchendEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchmove(name: touchmove, event: ImageViewTouchmoveEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchstart(name: touchstart, event: ImageViewTouchstartEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_twofingertap(name: twofingertap, event: ImageViewTwofingertapEvent): Unit = js.native
  /**
    * Gets the value of the <Titanium.UI.ImageView.animating> property.
    * @deprecated Access <Titanium.UI.ImageView.animating> instead.
    */
  def getAnimating(): Boolean = js.native
  /**
    * Gets the value of the <Titanium.UI.ImageView.autorotate> property.
    * @deprecated Access <Titanium.UI.ImageView.autorotate> instead.
    */
  def getAutorotate(): Boolean = js.native
  /**
    * Gets the value of the <Titanium.UI.ImageView.decodeRetries> property.
    * @deprecated Access <Titanium.UI.ImageView.decodeRetries> instead.
    */
  def getDecodeRetries(): Double = js.native
  /**
    * Gets the value of the <Titanium.UI.ImageView.defaultImage> property.
    * @deprecated Access <Titanium.UI.ImageView.defaultImage> instead.
    */
  def getDefaultImage(): String = js.native
  /**
    * Gets the value of the <Titanium.UI.ImageView.duration> property.
    * @deprecated Access <Titanium.UI.ImageView.duration> instead.
    */
  def getDuration(): Double = js.native
  /**
    * Gets the value of the <Titanium.UI.ImageView.enableZoomControls> property.
    * @deprecated Access <Titanium.UI.ImageView.enableZoomControls> instead.
    */
  def getEnableZoomControls(): Boolean = js.native
  /**
    * Gets the value of the <Titanium.UI.ImageView.hires> property.
    * @deprecated Access <Titanium.UI.ImageView.hires> instead.
    */
  def getHires(): Boolean = js.native
  /**
    * Gets the value of the <Titanium.UI.ImageView.image> property.
    * @deprecated Access <Titanium.UI.ImageView.image> instead.
    */
  def getImage(): String | Blob | File = js.native
  /**
    * Gets the value of the <Titanium.UI.ImageView.images> property.
    * @deprecated Access <Titanium.UI.ImageView.images> instead.
    */
  def getImages(): js.Array[Blob | File | String] = js.native
  /**
    * Gets the value of the <Titanium.UI.ImageView.paused> property.
    * @deprecated Access <Titanium.UI.ImageView.paused> instead.
    */
  def getPaused(): Boolean = js.native
  /**
    * Gets the value of the <Titanium.UI.ImageView.preventDefaultImage> property.
    * @deprecated Access <Titanium.UI.ImageView.preventDefaultImage> instead.
    */
  def getPreventDefaultImage(): Boolean = js.native
  /**
    * Gets the value of the <Titanium.UI.ImageView.repeatCount> property.
    * @deprecated Access <Titanium.UI.ImageView.repeatCount> instead.
    */
  def getRepeatCount(): Double = js.native
  /**
    * Gets the value of the <Titanium.UI.ImageView.reverse> property.
    * @deprecated Access <Titanium.UI.ImageView.reverse> instead.
    */
  def getReverse(): Boolean = js.native
  /**
    * Pauses a running animation. Use `resume` method to continue.
    */
  def pause(): Unit = js.native
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  @JSName("removeEventListener")
  def removeEventListener_change(
    name: change,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ImageViewChangeEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    name: error,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ImageViewErrorEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_load(name: load, callback: js.ThisFunction1[/* this */ this.type, /* event */ ImageViewLoadEvent, Unit]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pause(
    name: pause,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ImageViewPauseEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_start(
    name: start,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ImageViewStartEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stop(name: stop, callback: js.ThisFunction1[/* this */ this.type, /* event */ ImageViewStopEvent, Unit]): Unit = js.native
  /**
    * Resumes an animation from a `pause` state.
    */
  def resume(): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.ImageView.autorotate> property.
    * @deprecated Set the value using <Titanium.UI.ImageView.autorotate> instead.
    */
  def setAutorotate(autorotate: Boolean): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.ImageView.decodeRetries> property.
    * @deprecated Set the value using <Titanium.UI.ImageView.decodeRetries> instead.
    */
  def setDecodeRetries(decodeRetries: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.ImageView.defaultImage> property.
    * @deprecated Set the value using <Titanium.UI.ImageView.defaultImage> instead.
    */
  def setDefaultImage(defaultImage: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.ImageView.duration> property.
    * @deprecated Set the value using <Titanium.UI.ImageView.duration> instead.
    */
  def setDuration(duration: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.ImageView.enableZoomControls> property.
    * @deprecated Set the value using <Titanium.UI.ImageView.enableZoomControls> instead.
    */
  def setEnableZoomControls(enableZoomControls: Boolean): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.ImageView.hires> property.
    * @deprecated Set the value using <Titanium.UI.ImageView.hires> instead.
    */
  def setHires(hires: Boolean): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.ImageView.image> property.
    * @deprecated Set the value using <Titanium.UI.ImageView.image> instead.
    */
  def setImage(image: String): Unit = js.native
  def setImage(image: Blob): Unit = js.native
  def setImage(image: File): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.ImageView.images> property.
    * @deprecated Set the value using <Titanium.UI.ImageView.images> instead.
    */
  def setImages(images: js.Array[Blob | File | String]): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.ImageView.preventDefaultImage> property.
    * @deprecated Set the value using <Titanium.UI.ImageView.preventDefaultImage> instead.
    */
  def setPreventDefaultImage(preventDefaultImage: Boolean): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.ImageView.repeatCount> property.
    * @deprecated Set the value using <Titanium.UI.ImageView.repeatCount> instead.
    */
  def setRepeatCount(repeatCount: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.ImageView.reverse> property.
    * @deprecated Set the value using <Titanium.UI.ImageView.reverse> instead.
    */
  def setReverse(reverse: Boolean): Unit = js.native
  /**
    * Starts the image animation. On Android, also resets `index` to the first image.
    */
  def start(): Unit = js.native
  /**
    * Stops a running animation. On iOS, also resets `index` to the first image.
    */
  def stop(): Unit = js.native
  /**
    * Returns the image as a Blob object.
    */
  def toBlob(): Blob = js.native
}

