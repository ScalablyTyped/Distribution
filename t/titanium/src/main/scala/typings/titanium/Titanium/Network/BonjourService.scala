package typings.titanium.Titanium.Network

import typings.std.Error
import typings.titanium.Titanium.Network.Socket.TCP
import typings.titanium.Titanium.Proxy
import typings.titanium.titaniumStrings.publish
import typings.titanium.titaniumStrings.resolve
import typings.titanium.titaniumStrings.stop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a service on the network which is published by Bonjour.
  */
@js.native
trait BonjourService extends Proxy {
  /**
    * the domain of the service
    */
  var domain: String = js.native
  /**
    * whether or not the service is local to the device
    */
  var isLocal: Boolean = js.native
  /**
    * the name of the service
    */
  var name: String = js.native
  /**
    * the TCPSocket object that is used to connect to the service
    */
  var socket: TCP = js.native
  /**
    * the type of the service
    */
  var `type`: String = js.native
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  @JSName("addEventListener")
  def addEventListener_publish(
    name: publish,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ BonjourServicePublishEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resolve(
    name: resolve,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ BonjourServiceResolveEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stop(
    name: stop,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ BonjourServiceStopEvent, Unit]
  ): Unit = js.native
  /**
    * Fires a synthesized event to any registered listeners.
    */
  @JSName("fireEvent")
  def fireEvent_publish(name: publish): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_publish(name: publish, event: BonjourServicePublishEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_resolve(name: resolve): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_resolve(name: resolve, event: BonjourServiceResolveEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_stop(name: stop): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_stop(name: stop, event: BonjourServiceStopEvent): Unit = js.native
  /**
    * Gets the value of the <Titanium.Network.BonjourService.domain> property.
    * @deprecated Access <Titanium.Network.BonjourService.domain> instead.
    */
  def getDomain(): String = js.native
  /**
    * Gets the value of the <Titanium.Network.BonjourService.isLocal> property.
    * @deprecated Access <Titanium.Network.BonjourService.isLocal> instead.
    */
  def getIsLocal(): Boolean = js.native
  /**
    * Gets the value of the <Titanium.Network.BonjourService.name> property.
    * @deprecated Access <Titanium.Network.BonjourService.name> instead.
    */
  def getName(): String = js.native
  /**
    * Gets the value of the <Titanium.Network.BonjourService.socket> property.
    * @deprecated Access <Titanium.Network.BonjourService.socket> instead.
    */
  def getSocket(): TCP = js.native
  /**
    * Gets the value of the <Titanium.Network.BonjourService.type> property.
    * @deprecated Access <Titanium.Network.BonjourService.type> instead.
    */
  def getType(): String = js.native
  /**
    * Asynchronously publish a Bonjour service to the network.  Only works if isLocal is TRUE
    */
  def publish(socket: TCP): Unit = js.native
  def publish(socket: TCP, callback: js.Function2[/* param0 */ Error, /* param1 */ Boolean, Unit]): Unit = js.native
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  @JSName("removeEventListener")
  def removeEventListener_publish(
    name: publish,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ BonjourServicePublishEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resolve(
    name: resolve,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ BonjourServiceResolveEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stop(
    name: stop,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ BonjourServiceStopEvent, Unit]
  ): Unit = js.native
  /**
    * Asynchronously resolve a Bonjour service from the network.  Must be done before attempting to access the service's socket information, if a remote service.  You cannot resolve a locally published service.
    */
  def resolve(): Unit = js.native
  def resolve(
    timeout: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* param0 */ Error, /* param1 */ Boolean, Unit]
  ): Unit = js.native
  def resolve(timeout: Double): Unit = js.native
  def resolve(timeout: Double, callback: js.Function2[/* param0 */ Error, /* param1 */ Boolean, Unit]): Unit = js.native
  /**
    * Sets the value of the <Titanium.Network.BonjourService.domain> property.
    * @deprecated Set the value using <Titanium.Network.BonjourService.domain> instead.
    */
  def setDomain(domain: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.Network.BonjourService.isLocal> property.
    * @deprecated Set the value using <Titanium.Network.BonjourService.isLocal> instead.
    */
  def setIsLocal(isLocal: Boolean): Unit = js.native
  /**
    * Sets the value of the <Titanium.Network.BonjourService.name> property.
    * @deprecated Set the value using <Titanium.Network.BonjourService.name> instead.
    */
  def setName(name: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.Network.BonjourService.socket> property.
    * @deprecated Set the value using <Titanium.Network.BonjourService.socket> instead.
    */
  def setSocket(socket: TCP): Unit = js.native
  /**
    * Sets the value of the <Titanium.Network.BonjourService.type> property.
    * @deprecated Set the value using <Titanium.Network.BonjourService.type> instead.
    */
  def setType(`type`: String): Unit = js.native
  /**
    * Asynchronously halts a currently running attempt to publish or resolve a service.
    */
  def stop(): Unit = js.native
  def stop(callback: js.Function2[/* param0 */ Error, /* param1 */ Boolean, Unit]): Unit = js.native
}

