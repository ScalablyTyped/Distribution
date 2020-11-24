package typings.titanium.global.Titanium

import typings.titanium.Titanium.Event
import typings.titanium.Titanium.Filesystem.File
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The top-level Utils module, containing a set of JavaScript methods that are often useful when
  * building applications.
  */
@JSGlobal("Titanium.Utils")
@js.native
class Utils ()
  extends typings.titanium.Titanium.Proxy
/* static members */
@JSGlobal("Titanium.Utils")
@js.native
object Utils extends js.Object {
  
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  
  /**
    * The name of the API that this proxy corresponds to.
    */
  val apiName: String = js.native
  
  /**
    * Applies the properties to the proxy.
    */
  def applyProperties(props: js.Any): Unit = js.native
  
  /**
    * Returns the specified data decoded from Base64.
    */
  def base64decode(obj: String): typings.titanium.Titanium.Blob = js.native
  def base64decode(obj: typings.titanium.Titanium.Blob): typings.titanium.Titanium.Blob = js.native
  def base64decode(obj: File): typings.titanium.Titanium.Blob = js.native
  
  /**
    * Returns the specified data encoded to Base64.
    */
  def base64encode(obj: String): typings.titanium.Titanium.Blob = js.native
  def base64encode(obj: typings.titanium.Titanium.Blob): typings.titanium.Titanium.Blob = js.native
  def base64encode(obj: File): typings.titanium.Titanium.Blob = js.native
  
  /**
    * Indicates if the proxy will bubble an event to its parent.
    */
  var bubbleParent: Boolean = js.native
  
  /**
    * Fires a synthesized event to any registered listeners.
    */
  def fireEvent(name: String): Unit = js.native
  def fireEvent(name: String, event: js.Any): Unit = js.native
  
  /**
    * Gets the value of the <Titanium.Utils.apiName> property.
    * @deprecated Access <Titanium.Utils.apiName> instead.
    */
  def getApiName(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Utils.bubbleParent> property.
    * @deprecated Access <Titanium.Utils.bubbleParent> instead.
    */
  def getBubbleParent(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.Utils.lifecycleContainer> property.
    * @deprecated Access <Titanium.Utils.lifecycleContainer> instead.
    */
  def getLifecycleContainer(): Window | TabGroup = js.native
  
  /**
    * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
    */
  var lifecycleContainer: Window | TabGroup = js.native
  
  /**
    * Returns a MD5 digest of the specified data as a hex-based String.
    */
  def md5HexDigest(obj: String): String = js.native
  def md5HexDigest(obj: typings.titanium.Titanium.Blob): String = js.native
  
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Utils.bubbleParent> property.
    * @deprecated Set the value using <Titanium.Utils.bubbleParent> instead.
    */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
    * Sets the value of the <Titanium.Utils.lifecycleContainer> property.
    * @deprecated Set the value using <Titanium.Utils.lifecycleContainer> instead.
    */
  def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
  
  /**
    * Returns a SHA-1 hash of the specified data as a hex-based String.
    */
  def sha1(obj: String): String = js.native
  def sha1(obj: typings.titanium.Titanium.Blob): String = js.native
  
  /**
    * Returns a SHA-256 hash of the specified data as a hex-based String.
    */
  def sha256(obj: String): String = js.native
  def sha256(obj: typings.titanium.Titanium.Blob): String = js.native
}
