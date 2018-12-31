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

