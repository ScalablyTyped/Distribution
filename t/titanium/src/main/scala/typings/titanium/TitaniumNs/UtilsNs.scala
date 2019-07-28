package typings.titanium.TitaniumNs

import typings.titanium.TitaniumNs.FilesystemNs.File
import typings.titanium.TitaniumNs.UINs.TabGroup
import typings.titanium.TitaniumNs.UINs.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * The top-level Utils module, containing a set of JavaScript methods that are often useful when
	 * building applications.
	 */
@JSGlobal("Titanium.Utils")
@js.native
object UtilsNs extends js.Object {
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
  		 * Returns the specified data decoded from Base64.
  		 */
  def base64decode(obj: String): Blob = js.native
  /**
  		 * Returns the specified data decoded from Base64.
  		 */
  def base64decode(obj: Blob): Blob = js.native
  /**
  		 * Returns the specified data decoded from Base64.
  		 */
  def base64decode(obj: File): Blob = js.native
  /**
  		 * Returns the specified data encoded to Base64.
  		 */
  def base64encode(obj: String): Blob = js.native
  /**
  		 * Returns the specified data encoded to Base64.
  		 */
  def base64encode(obj: Blob): Blob = js.native
  /**
  		 * Returns the specified data encoded to Base64.
  		 */
  def base64encode(obj: File): Blob = js.native
  /**
  		 * Fires a synthesized event to any registered listeners.
  		 */
  def fireEvent(name: String, event: js.Any): Unit = js.native
  /**
  		 * Gets the value of the <Titanium.Utils.apiName> property.
  		 */
  def getApiName(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Utils.bubbleParent> property.
  		 */
  def getBubbleParent(): Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.Utils.lifecycleContainer> property.
  		 */
  def getLifecycleContainer(): Window | TabGroup = js.native
  /**
  		 * Returns a MD5 digest of the specified data as a hex-based String.
  		 */
  def md5HexDigest(obj: String): String = js.native
  /**
  		 * Returns a MD5 digest of the specified data as a hex-based String.
  		 */
  def md5HexDigest(obj: Blob): String = js.native
  /**
  		 * Removes the specified callback as an event listener for the named event.
  		 */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Utils.bubbleParent> property.
  		 */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Utils.lifecycleContainer> property.
  		 */
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Utils.lifecycleContainer> property.
  		 */
  def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
  /**
  		 * Returns a SHA-1 hash of the specified data as a hex-based String.
  		 */
  def sha1(obj: String): String = js.native
  /**
  		 * Returns a SHA-1 hash of the specified data as a hex-based String.
  		 */
  def sha1(obj: Blob): String = js.native
  /**
  		 * Returns a SHA-256 hash of the specified data as a hex-based String.
  		 */
  def sha256(obj: String): String = js.native
  /**
  		 * Returns a SHA-256 hash of the specified data as a hex-based String.
  		 */
  def sha256(obj: Blob): String = js.native
}

