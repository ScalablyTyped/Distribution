package typings
package titaniumLib.TitaniumNs.NetworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Describes a service on the network which is published by Bonjour.
		 */
trait BonjourService
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  			 * the domain of the service
  			 */
  var domain: java.lang.String
  /**
  			 * whether or not the service is local to the device
  			 */
  var isLocal: scala.Boolean
  /**
  			 * the name of the service
  			 */
  var name: java.lang.String
  /**
  			 * the TCPSocket object that is used to connect to the service
  			 */
  var socket: js.Any
  /**
  			 * the type of the service
  			 */
  var `type`: java.lang.String
  /**
  			 * Gets the value of the <Titanium.Network.BonjourService.domain> property.
  			 */
  def getDomain(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Network.BonjourService.isLocal> property.
  			 */
  def getIsLocal(): scala.Boolean
  /**
  			 * Gets the value of the <Titanium.Network.BonjourService.name> property.
  			 */
  def getName(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Network.BonjourService.socket> property.
  			 */
  def getSocket(): js.Any
  /**
  			 * Gets the value of the <Titanium.Network.BonjourService.type> property.
  			 */
  def getType(): java.lang.String
  /**
  			 * Publish a Bonjour service to the network.  Only works if isLocal is TRUE
  			 */
  def publish(socket: js.Any): scala.Unit
  /**
  			 * Resolve a Bonjour service from the network.  Must be done before attempting to access the service's socket information, if a remote service.  You cannot resolve a locally published service.
  			 */
  def resolve(timeout: scala.Double): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Network.BonjourService.domain> property.
  			 */
  def setDomain(domain: java.lang.String): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Network.BonjourService.isLocal> property.
  			 */
  def setIsLocal(isLocal: scala.Boolean): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Network.BonjourService.name> property.
  			 */
  def setName(name: java.lang.String): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Network.BonjourService.socket> property.
  			 */
  def setSocket(socket: js.Any): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Network.BonjourService.type> property.
  			 */
  def setType(`type`: java.lang.String): scala.Unit
  /**
  			 * Halts publication of a service.
  			 */
  def stop(): scala.Unit
}

object BonjourService {
  @scala.inline
  def apply(
    addEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    apiName: java.lang.String,
    applyProperties: js.Any => scala.Unit,
    bubbleParent: scala.Boolean,
    domain: java.lang.String,
    fireEvent: (java.lang.String, js.Any) => scala.Unit,
    getApiName: () => java.lang.String,
    getBubbleParent: () => scala.Boolean,
    getDomain: () => java.lang.String,
    getIsLocal: () => scala.Boolean,
    getName: () => java.lang.String,
    getSocket: () => js.Any,
    getType: () => java.lang.String,
    isLocal: scala.Boolean,
    name: java.lang.String,
    publish: js.Any => scala.Unit,
    removeEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    resolve: scala.Double => scala.Unit,
    setBubbleParent: scala.Boolean => scala.Unit,
    setDomain: java.lang.String => scala.Unit,
    setIsLocal: scala.Boolean => scala.Unit,
    setName: java.lang.String => scala.Unit,
    setSocket: js.Any => scala.Unit,
    setType: java.lang.String => scala.Unit,
    socket: js.Any,
    stop: () => scala.Unit,
    `type`: java.lang.String,
    getLifecycleContainer: () => titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): BonjourService = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, domain = domain, fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getDomain = js.Any.fromFunction0(getDomain), getIsLocal = js.Any.fromFunction0(getIsLocal), getName = js.Any.fromFunction0(getName), getSocket = js.Any.fromFunction0(getSocket), getType = js.Any.fromFunction0(getType), isLocal = isLocal, name = name, publish = js.Any.fromFunction1(publish), removeEventListener = js.Any.fromFunction2(removeEventListener), resolve = js.Any.fromFunction1(resolve), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setDomain = js.Any.fromFunction1(setDomain), setIsLocal = js.Any.fromFunction1(setIsLocal), setName = js.Any.fromFunction1(setName), setSocket = js.Any.fromFunction1(setSocket), setType = js.Any.fromFunction1(setType), socket = socket, stop = js.Any.fromFunction0(stop))
    __obj.updateDynamic("type")(`type`)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[BonjourService]
  }
}

