package typings
package titaniumLib.TitaniumNs

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
  val apiName: java.lang.String = js.native
  /**
  		 * Indicates if the proxy will bubble an event to its parent.
  		 */
  var bubbleParent: scala.Boolean = js.native
  /**
  		 * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
  		 */
  var lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = js.native
  /**
  		 * Adds the specified callback as an event listener for the named event.
  		 */
  def addEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  		 * Applies the properties to the proxy.
  		 */
  def applyProperties(props: js.Any): scala.Unit = js.native
  /**
  		 * Returns the specified data decoded from Base64.
  		 */
  def base64decode(obj: java.lang.String): titaniumLib.TitaniumNs.Blob = js.native
  /**
  		 * Returns the specified data decoded from Base64.
  		 */
  def base64decode(obj: titaniumLib.TitaniumNs.Blob): titaniumLib.TitaniumNs.Blob = js.native
  /**
  		 * Returns the specified data decoded from Base64.
  		 */
  def base64decode(obj: titaniumLib.TitaniumNs.FilesystemNs.File): titaniumLib.TitaniumNs.Blob = js.native
  /**
  		 * Returns the specified data encoded to Base64.
  		 */
  def base64encode(obj: java.lang.String): titaniumLib.TitaniumNs.Blob = js.native
  /**
  		 * Returns the specified data encoded to Base64.
  		 */
  def base64encode(obj: titaniumLib.TitaniumNs.Blob): titaniumLib.TitaniumNs.Blob = js.native
  /**
  		 * Returns the specified data encoded to Base64.
  		 */
  def base64encode(obj: titaniumLib.TitaniumNs.FilesystemNs.File): titaniumLib.TitaniumNs.Blob = js.native
  /**
  		 * Fires a synthesized event to any registered listeners.
  		 */
  def fireEvent(name: java.lang.String, event: js.Any): scala.Unit = js.native
  /**
  		 * Gets the value of the <Titanium.Utils.apiName> property.
  		 */
  def getApiName(): java.lang.String = js.native
  /**
  		 * Gets the value of the <Titanium.Utils.bubbleParent> property.
  		 */
  def getBubbleParent(): scala.Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.Utils.lifecycleContainer> property.
  		 */
  def getLifecycleContainer(): titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = js.native
  /**
  		 * Returns a MD5 digest of the specified data as a hex-based String.
  		 */
  def md5HexDigest(obj: java.lang.String): java.lang.String = js.native
  /**
  		 * Returns a MD5 digest of the specified data as a hex-based String.
  		 */
  def md5HexDigest(obj: titaniumLib.TitaniumNs.Blob): java.lang.String = js.native
  /**
  		 * Removes the specified callback as an event listener for the named event.
  		 */
  def removeEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Utils.bubbleParent> property.
  		 */
  def setBubbleParent(bubbleParent: scala.Boolean): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Utils.lifecycleContainer> property.
  		 */
  def setLifecycleContainer(lifecycleContainer: titaniumLib.TitaniumNs.UINs.TabGroup): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Utils.lifecycleContainer> property.
  		 */
  def setLifecycleContainer(lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window): scala.Unit = js.native
  /**
  		 * Returns a SHA-1 hash of the specified data as a hex-based String.
  		 */
  def sha1(obj: java.lang.String): java.lang.String = js.native
  /**
  		 * Returns a SHA-1 hash of the specified data as a hex-based String.
  		 */
  def sha1(obj: titaniumLib.TitaniumNs.Blob): java.lang.String = js.native
  /**
  		 * Returns a SHA-256 hash of the specified data as a hex-based String.
  		 */
  def sha256(obj: java.lang.String): java.lang.String = js.native
  /**
  		 * Returns a SHA-256 hash of the specified data as a hex-based String.
  		 */
  def sha256(obj: titaniumLib.TitaniumNs.Blob): java.lang.String = js.native
}

