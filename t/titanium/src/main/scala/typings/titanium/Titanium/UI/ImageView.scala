package typings.titanium.Titanium.UI

import typings.titanium.Titanium.Blob
import typings.titanium.Titanium.Filesystem.File
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
  			 * URL to the image to display.
  			 */
  var url: String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ImageView.animating> property.
  			 */
  def getAnimating(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ImageView.autorotate> property.
  			 */
  def getAutorotate(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ImageView.decodeRetries> property.
  			 */
  def getDecodeRetries(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ImageView.defaultImage> property.
  			 */
  def getDefaultImage(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ImageView.duration> property.
  			 */
  def getDuration(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ImageView.enableZoomControls> property.
  			 */
  def getEnableZoomControls(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ImageView.hires> property.
  			 */
  def getHires(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ImageView.image> property.
  			 */
  def getImage(): String | Blob | File = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ImageView.images> property.
  			 */
  def getImages(): js.Array[Blob | File | String] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ImageView.paused> property.
  			 */
  def getPaused(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ImageView.preventDefaultImage> property.
  			 */
  def getPreventDefaultImage(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ImageView.repeatCount> property.
  			 */
  def getRepeatCount(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ImageView.reverse> property.
  			 */
  def getReverse(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ImageView.url> property.
  			 */
  def getUrl(): String = js.native
  /**
  			 * Pauses a running animation. Use `resume` method to continue.
  			 */
  def pause(): Unit = js.native
  /**
  			 * Resumes an animation from a `pause` state.
  			 */
  def resume(): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ImageView.autorotate> property.
  			 */
  def setAutorotate(autorotate: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ImageView.decodeRetries> property.
  			 */
  def setDecodeRetries(decodeRetries: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ImageView.defaultImage> property.
  			 */
  def setDefaultImage(defaultImage: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ImageView.duration> property.
  			 */
  def setDuration(duration: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ImageView.enableZoomControls> property.
  			 */
  def setEnableZoomControls(enableZoomControls: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ImageView.hires> property.
  			 */
  def setHires(hires: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ImageView.image> property.
  			 */
  def setImage(image: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ImageView.image> property.
  			 */
  def setImage(image: Blob): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ImageView.image> property.
  			 */
  def setImage(image: File): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ImageView.images> property.
  			 */
  def setImages(images: js.Array[Blob | File | String]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ImageView.preventDefaultImage> property.
  			 */
  def setPreventDefaultImage(preventDefaultImage: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ImageView.repeatCount> property.
  			 */
  def setRepeatCount(repeatCount: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ImageView.reverse> property.
  			 */
  def setReverse(reverse: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ImageView.url> property.
  			 */
  def setUrl(url: String): Unit = js.native
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

