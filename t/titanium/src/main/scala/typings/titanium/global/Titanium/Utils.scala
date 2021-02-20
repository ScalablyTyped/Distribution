package typings.titanium.global.Titanium

import typings.titanium.Titanium.Event
import typings.titanium.Titanium.Filesystem.File
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import org.scalablytyped.runtime.StObject
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
object Utils {
  
  @JSGlobal("Titanium.Utils")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  /* static member */
  @JSGlobal("Titanium.Utils.addEventListener")
  @js.native
  def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  
  /**
    * The name of the API that this proxy corresponds to.
    */
  /* static member */
  @JSGlobal("Titanium.Utils.apiName")
  @js.native
  val apiName: String = js.native
  
  /**
    * Applies the properties to the proxy.
    */
  /* static member */
  @JSGlobal("Titanium.Utils.applyProperties")
  @js.native
  def applyProperties(props: js.Any): Unit = js.native
  
  /**
    * Returns the specified data decoded from Base64.
    */
  /* static member */
  @JSGlobal("Titanium.Utils.base64decode")
  @js.native
  def base64decode(obj: String): typings.titanium.Titanium.Blob = js.native
  @JSGlobal("Titanium.Utils.base64decode")
  @js.native
  def base64decode(obj: typings.titanium.Titanium.Blob): typings.titanium.Titanium.Blob = js.native
  @JSGlobal("Titanium.Utils.base64decode")
  @js.native
  def base64decode(obj: File): typings.titanium.Titanium.Blob = js.native
  
  /**
    * Returns the specified data encoded to Base64.
    */
  /* static member */
  @JSGlobal("Titanium.Utils.base64encode")
  @js.native
  def base64encode(obj: String): typings.titanium.Titanium.Blob = js.native
  @JSGlobal("Titanium.Utils.base64encode")
  @js.native
  def base64encode(obj: typings.titanium.Titanium.Blob): typings.titanium.Titanium.Blob = js.native
  @JSGlobal("Titanium.Utils.base64encode")
  @js.native
  def base64encode(obj: File): typings.titanium.Titanium.Blob = js.native
  
  /**
    * Indicates if the proxy will bubble an event to its parent.
    */
  /* static member */
  @JSGlobal("Titanium.Utils.bubbleParent")
  @js.native
  def bubbleParent: Boolean = js.native
  @scala.inline
  def bubbleParent_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bubbleParent")(x.asInstanceOf[js.Any])
  
  /**
    * Fires a synthesized event to any registered listeners.
    */
  /* static member */
  @JSGlobal("Titanium.Utils.fireEvent")
  @js.native
  def fireEvent(name: String): Unit = js.native
  @JSGlobal("Titanium.Utils.fireEvent")
  @js.native
  def fireEvent(name: String, event: js.Any): Unit = js.native
  
  /**
    * Gets the value of the <Titanium.Utils.apiName> property.
    * @deprecated Access <Titanium.Utils.apiName> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Utils.getApiName")
  @js.native
  def getApiName(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Utils.bubbleParent> property.
    * @deprecated Access <Titanium.Utils.bubbleParent> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Utils.getBubbleParent")
  @js.native
  def getBubbleParent(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.Utils.lifecycleContainer> property.
    * @deprecated Access <Titanium.Utils.lifecycleContainer> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Utils.getLifecycleContainer")
  @js.native
  def getLifecycleContainer(): Window | TabGroup = js.native
  
  /**
    * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
    */
  /* static member */
  @JSGlobal("Titanium.Utils.lifecycleContainer")
  @js.native
  def lifecycleContainer: Window | TabGroup = js.native
  @scala.inline
  def lifecycleContainer_=(x: Window | TabGroup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lifecycleContainer")(x.asInstanceOf[js.Any])
  
  /**
    * Returns a MD5 digest of the specified data as a hex-based String.
    */
  /* static member */
  @JSGlobal("Titanium.Utils.md5HexDigest")
  @js.native
  def md5HexDigest(obj: String): String = js.native
  @JSGlobal("Titanium.Utils.md5HexDigest")
  @js.native
  def md5HexDigest(obj: typings.titanium.Titanium.Blob): String = js.native
  
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  /* static member */
  @JSGlobal("Titanium.Utils.removeEventListener")
  @js.native
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Utils.bubbleParent> property.
    * @deprecated Set the value using <Titanium.Utils.bubbleParent> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Utils.setBubbleParent")
  @js.native
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  
  @JSGlobal("Titanium.Utils.setLifecycleContainer")
  @js.native
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
    * Sets the value of the <Titanium.Utils.lifecycleContainer> property.
    * @deprecated Set the value using <Titanium.Utils.lifecycleContainer> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Utils.setLifecycleContainer")
  @js.native
  def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
  
  /**
    * Returns a SHA-1 hash of the specified data as a hex-based String.
    */
  /* static member */
  @JSGlobal("Titanium.Utils.sha1")
  @js.native
  def sha1(obj: String): String = js.native
  @JSGlobal("Titanium.Utils.sha1")
  @js.native
  def sha1(obj: typings.titanium.Titanium.Blob): String = js.native
  
  /**
    * Returns a SHA-256 hash of the specified data as a hex-based String.
    */
  /* static member */
  @JSGlobal("Titanium.Utils.sha256")
  @js.native
  def sha256(obj: String): String = js.native
  @JSGlobal("Titanium.Utils.sha256")
  @js.native
  def sha256(obj: typings.titanium.Titanium.Blob): String = js.native
}
