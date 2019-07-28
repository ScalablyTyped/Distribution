package typings.winrtDashUwp.WindowsNs.NetworkingNs.ServiceDiscoveryNs.DnssdNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IMap
import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.WindowsNs.NetworkingNs.ConnectivityNs.NetworkAdapter
import typings.winrtDashUwp.WindowsNs.NetworkingNs.HostName
import typings.winrtDashUwp.WindowsNs.NetworkingNs.SocketsNs.DatagramSocket
import typings.winrtDashUwp.WindowsNs.NetworkingNs.SocketsNs.StreamSocketListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates an instance of a service that uses DNS Service Discovery (DNS-SD). */
@JSGlobal("Windows.Networking.ServiceDiscovery.Dnssd.DnssdServiceInstance")
@js.native
class DnssdServiceInstance protected () extends js.Object {
  /**
    * Creates a new DnssdServiceInstance object with the specified instance name, host name, and port.
    * @param DnssdServiceInstanceName The service instance name for the service instance being created.
    * @param hostName The hostname for the service instance being created.
    * @param port The port number for the service instance being created.
    */
  def this(DnssdServiceInstanceName: String, hostName: HostName, port: Double) = this()
  /** Gets or sets the DNS-SD service instance name for this DnssdServiceInstance . */
  var dnssdServiceInstanceName: String = js.native
  /** Gets or sets the hostname of the host for this DnssdServiceInstance . */
  var hostName: HostName = js.native
  /** Gets or sets the port number used by this DnssdServiceInstance . */
  var port: Double = js.native
  /** Gets or sets the priority value to assign to this service instance, as defined in RFC 2782. Clients use Priority to decide which of several equivalent service instances to attach to. */
  var priority: Double = js.native
  /** Gets the attributes of this service instance, as a list of [name, value] pairs of strings. Attributes can be inspected by service clients to determine additional information about a service instance. */
  var textAttributes: IMap[String, String] = js.native
  /** Gets or sets the weight value assigned to this service instance, as defined in RFC 2782. Clients use the Weight value to choose between servers with the same Priority value. */
  var weight: Double = js.native
  /**
    * Asynchronously registers a datagram (UDP) socket listener for the service, on a given socket.
    * @param socket Describes the socket that this service instance uses to listen for new service clients.
    * @return On successful completion of the asynchronous operation, returns an object describing the results of registration.
    */
  def registerDatagramSocketAsync(socket: DatagramSocket): IPromiseWithIAsyncOperation[DnssdRegistrationResult] = js.native
  /**
    * Asynchronously registers a datagram (UDP) socket listener for the service, on a given socket and network adapter.
    * @param socket Describes the socket that this service instance uses to listen for new service clients.
    * @param adapter Specifies the network adapter this service uses to listen for new service clients.
    * @return On successful completion of the asynchronous operation, returns an object describing the results of registration.
    */
  def registerDatagramSocketAsync(socket: DatagramSocket, adapter: NetworkAdapter): IPromiseWithIAsyncOperation[DnssdRegistrationResult] = js.native
  /**
    * Asynchronously registers a stream (TCP) socket listener for the service, on the given socket.
    * @param socket Describes the socket that this service instance uses to listen for new service clients.
    * @return On successful completion of the asynchronous operation, returns an object describing the results of registration.
    */
  def registerStreamSocketListenerAsync(socket: StreamSocketListener): IPromiseWithIAsyncOperation[DnssdRegistrationResult] = js.native
  /**
    * Asynchronously registers a stream (TCP) socket listener for the service, on the given socket and network adapter.
    * @param socket Describes the socket that this service instance uses to listen for new service clients.
    * @param adapter Specifies the network adapter this service uses to listen for new service clients.
    * @return On successful completion of the asynchronous operation, returns an object describing the results of registration.
    */
  def registerStreamSocketListenerAsync(socket: StreamSocketListener, adapter: NetworkAdapter): IPromiseWithIAsyncOperation[DnssdRegistrationResult] = js.native
}

