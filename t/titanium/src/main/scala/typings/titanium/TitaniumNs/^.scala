package typings.titanium.TitaniumNs

import typings.titanium.CreateBufferArgs
import typings.titanium.TitaniumNs.UINs.TabGroup
import typings.titanium.TitaniumNs.UINs.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Titanium")
@js.native
object ^ extends js.Object {
  /**
  	 * The name of the API that this proxy corresponds to.
  	 */
  val apiName: String = js.native
  /**
  	 * Indicates if the proxy will bubble an event to its parent.
  	 */
  var bubbleParent: Boolean = js.native
  /**
  	 * Date of the Titanium build.
  	 */
  val buildDate: String = js.native
  /**
  	 * Git hash of the Titanium build.
  	 */
  val buildHash: String = js.native
  /**
  	 * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
  	 */
  var lifecycleContainer: Window | TabGroup = js.native
  /**
  	 * User-agent string used by Titanium.
  	 */
  var userAgent: String = js.native
  /**
  	 * Version of Titanium that is executing.
  	 */
  val version: String = js.native
  /**
  	 * Adds the specified callback as an event listener for the named event.
  	 */
  def addEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  	 * Applies the properties to the proxy.
  	 */
  def applyProperties(props: js.Any): Unit = js.native
  /**
  	 * Creates a new buffer based on the params.
  	 */
  def createBuffer(params: CreateBufferArgs): Buffer = js.native
  /**
  	 * Creates and returns an instance of <Titanium.Proxy>.
  	 */
  def createProxy(): Proxy = js.native
  def createProxy(parameters: js.Any): Proxy = js.native
  /**
  	 * Fires a synthesized event to any registered listeners.
  	 */
  def fireEvent(name: String, event: js.Any): Unit = js.native
  /**
  	 * Gets the value of the <Titanium.apiName> property.
  	 */
  def getApiName(): String = js.native
  /**
  	 * Gets the value of the <Titanium.bubbleParent> property.
  	 */
  def getBubbleParent(): Boolean = js.native
  /**
  	 * Gets the value of the <Titanium.buildDate> property.
  	 */
  def getBuildDate(): String = js.native
  /**
  	 * Gets the value of the <Titanium.buildHash> property.
  	 */
  def getBuildHash(): String = js.native
  /**
  	 * Gets the value of the <Titanium.lifecycleContainer> property.
  	 */
  def getLifecycleContainer(): Window | TabGroup = js.native
  /**
  	 * Gets the value of the <Titanium.userAgent> property.
  	 */
  def getUserAgent(): String = js.native
  /**
  	 * Gets the value of the <Titanium.version> property.
  	 */
  def getVersion(): String = js.native
  /**
  	 * Removes the specified callback as an event listener for the named event.
  	 */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  	 * Sets the value of the <Titanium.bubbleParent> property.
  	 */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  /**
  	 * Sets the value of the <Titanium.lifecycleContainer> property.
  	 */
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
  	 * Sets the value of the <Titanium.lifecycleContainer> property.
  	 */
  def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
  /**
  	 * Sets the value of the <Titanium.userAgent> property.
  	 */
  def setUserAgent(userAgent: String): Unit = js.native
}

