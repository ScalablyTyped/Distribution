package typings.winrtUwp.global.Windows.Networking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Networking.ServiceDiscovery")
@js.native
object ServiceDiscovery extends js.Object {
  
  /** Supports the registration and discovery of services that advertise themselves using DNS Service Discovery (DNS-SD). */
  @js.native
  object Dnssd extends js.Object {
    
    /** Encapsulates detailed information about the result of an attempt to register a service instance using DNS-SD. */
    @js.native
    /** Constructor. */
    class DnssdRegistrationResult ()
      extends typings.winrtUwp.Windows.Networking.ServiceDiscovery.Dnssd.DnssdRegistrationResult
    
    /** Values representing the status of a DNS-SD registration attempt. */
    @js.native
    object DnssdRegistrationStatus extends js.Object {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.Networking.ServiceDiscovery.Dnssd.DnssdRegistrationStatus with Double
          ] = js.native
      
      /* 1 */ val invalidServiceName: typings.winrtUwp.Windows.Networking.ServiceDiscovery.Dnssd.DnssdRegistrationStatus.invalidServiceName with Double = js.native
      
      /* 3 */ val securityError: typings.winrtUwp.Windows.Networking.ServiceDiscovery.Dnssd.DnssdRegistrationStatus.securityError with Double = js.native
      
      /* 2 */ val serverError: typings.winrtUwp.Windows.Networking.ServiceDiscovery.Dnssd.DnssdRegistrationStatus.serverError with Double = js.native
      
      /* 0 */ val success: typings.winrtUwp.Windows.Networking.ServiceDiscovery.Dnssd.DnssdRegistrationStatus.success with Double = js.native
    }
    
    /** Encapsulates an instance of a service that uses DNS Service Discovery (DNS-SD). */
    @js.native
    class DnssdServiceInstance protected ()
      extends typings.winrtUwp.Windows.Networking.ServiceDiscovery.Dnssd.DnssdServiceInstance {
      /**
        * Creates a new DnssdServiceInstance object with the specified instance name, host name, and port.
        * @param DnssdServiceInstanceName The service instance name for the service instance being created.
        * @param hostName The hostname for the service instance being created.
        * @param port The port number for the service instance being created.
        */
      def this(
        DnssdServiceInstanceName: String,
        hostName: typings.winrtUwp.Windows.Networking.HostName,
        port: Double
      ) = this()
    }
    
    /** A collection of DNS Service Discovery (DNS-SD) service instances. */
    @js.native
    abstract class DnssdServiceInstanceCollection ()
      extends typings.winrtUwp.Windows.Networking.ServiceDiscovery.Dnssd.DnssdServiceInstanceCollection
    
    /** Maintains a collection of available DNS Service Discovery (DNS-SD) service instances. */
    @js.native
    abstract class DnssdServiceWatcher ()
      extends typings.winrtUwp.Windows.Networking.ServiceDiscovery.Dnssd.DnssdServiceWatcher
    
    /** Values representing the status of a DnssdServiceWatcher. */
    @js.native
    object DnssdServiceWatcherStatus extends js.Object {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.Networking.ServiceDiscovery.Dnssd.DnssdServiceWatcherStatus with Double
          ] = js.native
      
      /* 5 */ val aborted: typings.winrtUwp.Windows.Networking.ServiceDiscovery.Dnssd.DnssdServiceWatcherStatus.aborted with Double = js.native
      
      /* 0 */ val created: typings.winrtUwp.Windows.Networking.ServiceDiscovery.Dnssd.DnssdServiceWatcherStatus.created with Double = js.native
      
      /* 2 */ val enumerationCompleted: typings.winrtUwp.Windows.Networking.ServiceDiscovery.Dnssd.DnssdServiceWatcherStatus.enumerationCompleted with Double = js.native
      
      /* 1 */ val started: typings.winrtUwp.Windows.Networking.ServiceDiscovery.Dnssd.DnssdServiceWatcherStatus.started with Double = js.native
      
      /* 4 */ val stopped: typings.winrtUwp.Windows.Networking.ServiceDiscovery.Dnssd.DnssdServiceWatcherStatus.stopped with Double = js.native
      
      /* 3 */ val stopping: typings.winrtUwp.Windows.Networking.ServiceDiscovery.Dnssd.DnssdServiceWatcherStatus.stopping with Double = js.native
    }
  }
}
