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
    addEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    apiName: java.lang.String,
    applyProperties: js.Function1[js.Any, scala.Unit],
    bubbleParent: scala.Boolean,
    domain: java.lang.String,
    fireEvent: js.Function2[java.lang.String, js.Any, scala.Unit],
    getApiName: js.Function0[java.lang.String],
    getBubbleParent: js.Function0[scala.Boolean],
    getDomain: js.Function0[java.lang.String],
    getIsLocal: js.Function0[scala.Boolean],
    getName: js.Function0[java.lang.String],
    getSocket: js.Function0[js.Any],
    getType: js.Function0[java.lang.String],
    isLocal: scala.Boolean,
    name: java.lang.String,
    publish: js.Function1[js.Any, scala.Unit],
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    resolve: js.Function1[scala.Double, scala.Unit],
    setBubbleParent: js.Function1[scala.Boolean, scala.Unit],
    setDomain: js.Function1[java.lang.String, scala.Unit],
    setIsLocal: js.Function1[scala.Boolean, scala.Unit],
    setName: js.Function1[java.lang.String, scala.Unit],
    setSocket: js.Function1[js.Any, scala.Unit],
    setType: js.Function1[java.lang.String, scala.Unit],
    socket: js.Any,
    stop: js.Function0[scala.Unit],
    `type`: java.lang.String,
    getLifecycleContainer: js.Function0[titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup] = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): BonjourService = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("apiName")(apiName)
    __obj.updateDynamic("applyProperties")(applyProperties)
    __obj.updateDynamic("bubbleParent")(bubbleParent)
    __obj.updateDynamic("domain")(domain)
    __obj.updateDynamic("fireEvent")(fireEvent)
    __obj.updateDynamic("getApiName")(getApiName)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent)
    __obj.updateDynamic("getDomain")(getDomain)
    __obj.updateDynamic("getIsLocal")(getIsLocal)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("getSocket")(getSocket)
    __obj.updateDynamic("getType")(getType)
    __obj.updateDynamic("isLocal")(isLocal)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("publish")(publish)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("resolve")(resolve)
    __obj.updateDynamic("setBubbleParent")(setBubbleParent)
    __obj.updateDynamic("setDomain")(setDomain)
    __obj.updateDynamic("setIsLocal")(setIsLocal)
    __obj.updateDynamic("setName")(setName)
    __obj.updateDynamic("setSocket")(setSocket)
    __obj.updateDynamic("setType")(setType)
    __obj.updateDynamic("socket")(socket)
    __obj.updateDynamic("stop")(stop)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(getLifecycleContainer)
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[BonjourService]
  }
}

