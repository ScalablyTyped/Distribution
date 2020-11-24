package typings.udpDiscovery.mod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("udp-discovery", "Discovery")
@js.native
/**
  * Invokes the constructor to create an instance of Discovery to receive discovery events. The config options object is optional, but if included, the following options are available:
  * @param options constructor options
  */
class Discovery () extends EventEmitter {
  def this(options: DiscoveryConstructorOptions) = this()
  
  /**
    * Starts announcing the service at the specified interval. The parameter, serviceObject, is an object describing the service that udp-discoveryy announces.
    * @param name The name of the service being announced. It must be unique, or it will collide with another.
    * @param userData The duration between announcements in milliseconds.
    * @param interval Any data that can be serialized into JSON.
    * @param available Optional parameter to set availability of the service. If not specified, the default is 'true', meaning available.
    */
  def announce(name: String, userData: js.Any): Unit = js.native
  def announce(name: String, userData: js.Any, interval: js.UndefOr[scala.Nothing], available: Boolean): Unit = js.native
  def announce(name: String, userData: js.Any, interval: Double): Unit = js.native
  def announce(name: String, userData: js.Any, interval: Double, available: Boolean): Unit = js.native
  
  /**
    * Returns the service object, which can be modified. For example, if you need to alter the userData, you can. You cannot, however, alter the name (it's a constant property).
    * @param name name of the service.
    * @returns Returns Object serviceObject from announce.
    */
  def getData(name: String): js.Any = js.native
  
  /**
    * Halts announcements.
    * @param name The name of the service.
    * @returns Returns true if successful, false otherwise.
    */
  def pause(name: String): Boolean = js.native
  
  /**
    * Resumes the announcements at the time interval.
    * @param name The name of the service.
    * @param interval optional interval between announcements in ms.
    * @returns Returns true if successful, false otherwise.
    */
  def resume(name: String): Boolean = js.native
  def resume(name: String, interval: Double): Boolean = js.native
  
  /**
    * Not documented at the time this type definition was created.
    * Network traffic inspection shows that it sends an event as UDP multicast, and a listener receives it.
    * @param eventName The name of the event.
    * @param data The payload for the event.
    */
  def sendEvent(eventName: String, data: js.Any): Unit = js.native
  
  /**
    * Updates the existing service.
    * @param name The name of the service being announced. It must be unique, or it will collide with another.
    * @param userData The duration between announcements in milliseconds.
    * @param interval Any data that can be serialized into JSON.
    * @param available Optional parameter to set availability of the service. If not specified, the default is 'true', meaning available.
    */
  def update(name: String, userData: js.Any): Unit = js.native
  def update(name: String, userData: js.Any, interval: js.UndefOr[scala.Nothing], available: Boolean): Unit = js.native
  def update(name: String, userData: js.Any, interval: Double): Unit = js.native
  def update(name: String, userData: js.Any, interval: Double, available: Boolean): Unit = js.native
}
