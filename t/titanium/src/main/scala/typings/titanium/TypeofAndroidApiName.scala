package typings.titanium

import typings.titanium.Titanium.Blob
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofAndroidApiName extends js.Object {
  /**
  			 * The name of the API that this proxy corresponds to.
  			 */
  val apiName: String = js.native
  /**
  			 * Indicates if the proxy will bubble an event to its parent.
  			 */
  var bubbleParent: Boolean = js.native
  /**
  			 * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
  			 */
  var lifecycleContainer: Window | TabGroup = js.native
  /**
  			 * Adds the specified callback as an event listener for the named event.
  			 */
  def addEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  			 * Applies the properties to the proxy.
  			 */
  def applyProperties(props: js.Any): Unit = js.native
  /**
  			 * Fires a synthesized event to any registered listeners.
  			 */
  def fireEvent(name: String, event: js.Any): Unit = js.native
  /**
  			 * Gets the value of the <Titanium.Media.Android.apiName> property.
  			 */
  def getApiName(): String = js.native
  /**
  			 * Gets the value of the <Titanium.Media.Android.bubbleParent> property.
  			 */
  def getBubbleParent(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.Media.Android.lifecycleContainer> property.
  			 */
  def getLifecycleContainer(): Window | TabGroup = js.native
  /**
  			 * Removes the specified callback as an event listener for the named event.
  			 */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  			 * Scans newly created or downloaded media files to make them available to other
  			 * Android media providers, such as the Gallery.
  			 */
  def scanMediaFiles(
    paths: js.Array[String],
    mimeTypes: js.Array[String],
    callback: js.Function1[/* param0 */ MediaScannerResponse, _]
  ): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.Android.bubbleParent> property.
  			 */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.Android.lifecycleContainer> property.
  			 */
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.Android.lifecycleContainer> property.
  			 */
  def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
  /**
  			 * Set the system homescreen wallpaper.
  			 */
  def setSystemWallpaper(image: Blob, scale: Boolean): Unit = js.native
}

