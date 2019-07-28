package typings.titanium

import typings.titanium.TitaniumNs.NetworkNs.SocketNs.TCP
import typings.titanium.TitaniumNs.UINs.TabGroup
import typings.titanium.TitaniumNs.UINs.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofSocket extends js.Object {
  /**
  			 * State value representing a closed socket.
  			 */
  val CLOSED: Double = js.native
  /**
  			 * State value representing a connected socket.
  			 */
  val CONNECTED: Double = js.native
  /**
  			 * State value indicating an error has occurred on the socket.
  			 */
  val ERROR: Double = js.native
  /**
  			 * State value representing an initialized socket.
  			 */
  val INITIALIZED: Double = js.native
  /**
  			 * State value representing a socket that is listening for connections.
  			 */
  val LISTENING: Double = js.native
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
  			 * Returns a new TCP socket object.
  			 */
  def createTCP(): TCP = js.native
  def createTCP(params: js.Any): TCP = js.native
  /**
  			 * Fires a synthesized event to any registered listeners.
  			 */
  def fireEvent(name: String, event: js.Any): Unit = js.native
  /**
  			 * Gets the value of the <Titanium.Network.Socket.apiName> property.
  			 */
  def getApiName(): String = js.native
  /**
  			 * Gets the value of the <Titanium.Network.Socket.bubbleParent> property.
  			 */
  def getBubbleParent(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.Network.Socket.lifecycleContainer> property.
  			 */
  def getLifecycleContainer(): Window | TabGroup = js.native
  /**
  			 * Removes the specified callback as an event listener for the named event.
  			 */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Network.Socket.bubbleParent> property.
  			 */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Network.Socket.lifecycleContainer> property.
  			 */
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Network.Socket.lifecycleContainer> property.
  			 */
  def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
}

