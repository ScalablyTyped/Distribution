package typings.titanium.Titanium.Network

import typings.titanium.Titanium.Proxy
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Describes a service on the network which is published by Bonjour.
		 */
trait BonjourService extends Proxy {
  /**
  			 * the domain of the service
  			 */
  var domain: String
  /**
  			 * whether or not the service is local to the device
  			 */
  var isLocal: Boolean
  /**
  			 * the name of the service
  			 */
  var name: String
  /**
  			 * the TCPSocket object that is used to connect to the service
  			 */
  var socket: js.Any
  /**
  			 * the type of the service
  			 */
  var `type`: String
  /**
  			 * Gets the value of the <Titanium.Network.BonjourService.domain> property.
  			 */
  def getDomain(): String
  /**
  			 * Gets the value of the <Titanium.Network.BonjourService.isLocal> property.
  			 */
  def getIsLocal(): Boolean
  /**
  			 * Gets the value of the <Titanium.Network.BonjourService.name> property.
  			 */
  def getName(): String
  /**
  			 * Gets the value of the <Titanium.Network.BonjourService.socket> property.
  			 */
  def getSocket(): js.Any
  /**
  			 * Gets the value of the <Titanium.Network.BonjourService.type> property.
  			 */
  def getType(): String
  /**
  			 * Publish a Bonjour service to the network.  Only works if isLocal is TRUE
  			 */
  def publish(socket: js.Any): Unit
  /**
  			 * Resolve a Bonjour service from the network.  Must be done before attempting to access the service's socket information, if a remote service.  You cannot resolve a locally published service.
  			 */
  def resolve(timeout: Double): Unit
  /**
  			 * Sets the value of the <Titanium.Network.BonjourService.domain> property.
  			 */
  def setDomain(domain: String): Unit
  /**
  			 * Sets the value of the <Titanium.Network.BonjourService.isLocal> property.
  			 */
  def setIsLocal(isLocal: Boolean): Unit
  /**
  			 * Sets the value of the <Titanium.Network.BonjourService.name> property.
  			 */
  def setName(name: String): Unit
  /**
  			 * Sets the value of the <Titanium.Network.BonjourService.socket> property.
  			 */
  def setSocket(socket: js.Any): Unit
  /**
  			 * Sets the value of the <Titanium.Network.BonjourService.type> property.
  			 */
  def setType(`type`: String): Unit
  /**
  			 * Halts publication of a service.
  			 */
  def stop(): Unit
}

object BonjourService {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    apiName: String,
    applyProperties: js.Any => Unit,
    bubbleParent: Boolean,
    domain: String,
    fireEvent: (String, js.Any) => Unit,
    getApiName: () => String,
    getBubbleParent: () => Boolean,
    getDomain: () => String,
    getIsLocal: () => Boolean,
    getName: () => String,
    getSocket: () => js.Any,
    getType: () => String,
    isLocal: Boolean,
    name: String,
    publish: js.Any => Unit,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    resolve: Double => Unit,
    setBubbleParent: Boolean => Unit,
    setDomain: String => Unit,
    setIsLocal: Boolean => Unit,
    setName: String => Unit,
    setSocket: js.Any => Unit,
    setType: String => Unit,
    socket: js.Any,
    stop: () => Unit,
    `type`: String,
    getLifecycleContainer: () => Window | TabGroup = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): BonjourService = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, domain = domain, fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getDomain = js.Any.fromFunction0(getDomain), getIsLocal = js.Any.fromFunction0(getIsLocal), getName = js.Any.fromFunction0(getName), getSocket = js.Any.fromFunction0(getSocket), getType = js.Any.fromFunction0(getType), isLocal = isLocal, name = name, publish = js.Any.fromFunction1(publish), removeEventListener = js.Any.fromFunction2(removeEventListener), resolve = js.Any.fromFunction1(resolve), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setDomain = js.Any.fromFunction1(setDomain), setIsLocal = js.Any.fromFunction1(setIsLocal), setName = js.Any.fromFunction1(setName), setSocket = js.Any.fromFunction1(setSocket), setType = js.Any.fromFunction1(setType), socket = socket, stop = js.Any.fromFunction0(stop))
    __obj.updateDynamic("type")(`type`)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[BonjourService]
  }
}

