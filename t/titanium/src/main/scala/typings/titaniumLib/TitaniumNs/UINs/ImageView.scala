package typings
package titaniumLib.TitaniumNs.UINs

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
  val animating: scala.Boolean = js.native
  /**
  			 * Indicates whether the image should be rotated based on exif orientation data.
  			 * By default, this is false on android and true on iOS.
  			 */
  var autorotate: scala.Boolean = js.native
  /**
  			 * Number of times to retry decoding the bitmap at a URL.
  			 */
  var decodeRetries: scala.Double = js.native
  /**
  			 * Local path to the default image to display while loading a remote image.
  			 */
  var defaultImage: java.lang.String = js.native
  /**
  			 * Amount of time in milliseconds to animate one cycle.
  			 */
  var duration: scala.Double = js.native
  /**
  			 * Show zoom controls when the user touches the image view.
  			 */
  var enableZoomControls: scala.Boolean = js.native
  /**
  			 * Set to `true` to prevent scaling of 2x/3x-resolution remote images for retina
  			 * displays.
  			 */
  var hires: scala.Boolean = js.native
  /**
  			 * Image to display.
  			 */
  var image: java.lang.String | titaniumLib.TitaniumNs.Blob | titaniumLib.TitaniumNs.FilesystemNs.File = js.native
  /**
  			 * Array of images to animate, defined using local filesystem paths, `File` objects,
  			 * remote URLs (Android only), or `Blob` objects containing image data.
  			 * When using this property, an initial `start()` needs to be called upon the ImageView before any image will show in this imageview.
  			 * Related properties/methods to look at: `start`, `stop`, `pause`, `reverse`, `resume` and `repeatCount`
  			 */
  var images: js.Array[
    titaniumLib.TitaniumNs.Blob | titaniumLib.TitaniumNs.FilesystemNs.File | java.lang.String
  ] = js.native
  /**
  			 * Indicates whether the animation is paused.
  			 */
  val paused: scala.Boolean = js.native
  /**
  			 * Prevent the default image from being displayed while loading a remote image. This property
  			 * is ignored when the `defaultImage` property is set.
  			 */
  var preventDefaultImage: scala.Boolean = js.native
  /**
  			 * Number of times to repeat the image animation.
  			 */
  var repeatCount: scala.Double = js.native
  /**
  			 * Run the animation in reverse.
  			 */
  var reverse: scala.Boolean = js.native
  /**
  			 * URL to the image to display.
  			 */
  var url: java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ImageView.animating> property.
  			 */
  def getAnimating(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ImageView.autorotate> property.
  			 */
  def getAutorotate(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ImageView.decodeRetries> property.
  			 */
  def getDecodeRetries(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ImageView.defaultImage> property.
  			 */
  def getDefaultImage(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ImageView.duration> property.
  			 */
  def getDuration(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ImageView.enableZoomControls> property.
  			 */
  def getEnableZoomControls(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ImageView.hires> property.
  			 */
  def getHires(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ImageView.image> property.
  			 */
  def getImage(): java.lang.String | titaniumLib.TitaniumNs.Blob | titaniumLib.TitaniumNs.FilesystemNs.File = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ImageView.images> property.
  			 */
  def getImages(): js.Array[
    titaniumLib.TitaniumNs.Blob | titaniumLib.TitaniumNs.FilesystemNs.File | java.lang.String
  ] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ImageView.paused> property.
  			 */
  def getPaused(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ImageView.preventDefaultImage> property.
  			 */
  def getPreventDefaultImage(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ImageView.repeatCount> property.
  			 */
  def getRepeatCount(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ImageView.reverse> property.
  			 */
  def getReverse(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ImageView.url> property.
  			 */
  def getUrl(): java.lang.String = js.native
  /**
  			 * Pauses a running animation. Use `resume` method to continue.
  			 */
  def pause(): scala.Unit = js.native
  /**
  			 * Resumes an animation from a `pause` state.
  			 */
  def resume(): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ImageView.autorotate> property.
  			 */
  def setAutorotate(autorotate: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ImageView.decodeRetries> property.
  			 */
  def setDecodeRetries(decodeRetries: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ImageView.defaultImage> property.
  			 */
  def setDefaultImage(defaultImage: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ImageView.duration> property.
  			 */
  def setDuration(duration: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ImageView.enableZoomControls> property.
  			 */
  def setEnableZoomControls(enableZoomControls: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ImageView.hires> property.
  			 */
  def setHires(hires: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ImageView.image> property.
  			 */
  def setImage(image: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ImageView.image> property.
  			 */
  def setImage(image: titaniumLib.TitaniumNs.Blob): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ImageView.image> property.
  			 */
  def setImage(image: titaniumLib.TitaniumNs.FilesystemNs.File): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ImageView.images> property.
  			 */
  def setImages(
    images: js.Array[
      titaniumLib.TitaniumNs.Blob | titaniumLib.TitaniumNs.FilesystemNs.File | java.lang.String
    ]
  ): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ImageView.preventDefaultImage> property.
  			 */
  def setPreventDefaultImage(preventDefaultImage: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ImageView.repeatCount> property.
  			 */
  def setRepeatCount(repeatCount: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ImageView.reverse> property.
  			 */
  def setReverse(reverse: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ImageView.url> property.
  			 */
  def setUrl(url: java.lang.String): scala.Unit = js.native
  /**
  			 * Starts the image animation. On Android, also resets `index` to the first image.
  			 */
  def start(): scala.Unit = js.native
  /**
  			 * Stops a running animation. On iOS, also resets `index` to the first image.
  			 */
  def stop(): scala.Unit = js.native
  /**
  			 * Returns the image as a Blob object.
  			 */
  def toBlob(): titaniumLib.TitaniumNs.Blob = js.native
}

