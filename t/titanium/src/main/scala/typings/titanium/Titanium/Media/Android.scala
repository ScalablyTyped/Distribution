package typings.titanium.Titanium.Media

import typings.titanium.MediaScannerResponse
import typings.titanium.Titanium.Blob
import typings.titanium.Titanium.Event
import typings.titanium.Titanium.Module
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Android-specific media-related functionality.
		 */
@JSGlobal("Titanium.Media.Android")
@js.native
class Android () extends Module

/* static members */
@JSGlobal("Titanium.Media.Android")
@js.native
object Android extends js.Object {
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
  def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
  			 * Applies the properties to the proxy.
  			 */
  def applyProperties(props: js.Any): Unit = js.native
  /**
  			 * Fires a synthesized event to any registered listeners.
  			 */
  def fireEvent(name: String): Unit = js.native
  def fireEvent(name: String, event: js.Any): Unit = js.native
  /**
  			 * Gets the value of the <Titanium.Media.Android.apiName> property.
  			 * @deprecated Access <Titanium.Media.Android.apiName> instead.
  			 */
  def getApiName(): String = js.native
  /**
  			 * Gets the value of the <Titanium.Media.Android.bubbleParent> property.
  			 * @deprecated Access <Titanium.Media.Android.bubbleParent> instead.
  			 */
  def getBubbleParent(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.Media.Android.lifecycleContainer> property.
  			 * @deprecated Access <Titanium.Media.Android.lifecycleContainer> instead.
  			 */
  def getLifecycleContainer(): Window | TabGroup = js.native
  /**
  			 * Removes the specified callback as an event listener for the named event.
  			 */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
  			 * Scans newly created or downloaded media files to make them available to other
  			 * Android media providers, such as the Gallery.
  			 */
  def scanMediaFiles(
    paths: js.Array[String],
    mimeTypes: js.Array[String],
    callback: js.Function1[/* param0 */ MediaScannerResponse, Unit]
  ): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.Android.bubbleParent> property.
  			 * @deprecated Set the value using <Titanium.Media.Android.bubbleParent> instead.
  			 */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.Android.lifecycleContainer> property.
  			 * @deprecated Set the value using <Titanium.Media.Android.lifecycleContainer> instead.
  			 */
  def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
  /**
  			 * Set the system homescreen wallpaper.
  			 */
  def setSystemWallpaper(image: Blob, scale: Boolean): Unit = js.native
}

