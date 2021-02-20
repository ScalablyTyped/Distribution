package typings.winrtUwp.global.Windows.Networking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ServiceDiscovery {
  
  /** Supports the registration and discovery of services that advertise themselves using DNS Service Discovery (DNS-SD). */
  object Dnssd {
    
    /** Encapsulates detailed information about the result of an attempt to register a service instance using DNS-SD. */
    @JSGlobal("Windows.Networking.ServiceDiscovery.Dnssd.DnssdRegistrationResult")
    @js.native
    /** Constructor. */
    class DnssdRegistrationResult ()
      extends typings.winrtUwp.Windows.Networking.ServiceDiscovery.Dnssd.DnssdRegistrationResult
    
    /** Values representing the status of a DNS-SD registration attempt. */
    @JSGlobal("Windows.Networking.ServiceDiscovery.Dnssd.DnssdRegistrationStatus")
    @js.native
    object DnssdRegistrationStatus extends StObject {
      
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
    @JSGlobal("Windows.Networking.ServiceDiscovery.Dnssd.DnssdServiceInstance")
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
    @JSGlobal("Windows.Networking.ServiceDiscovery.Dnssd.DnssdServiceInstanceCollection")
    @js.native
    abstract class DnssdServiceInstanceCollection ()
      extends typings.winrtUwp.Windows.Networking.ServiceDiscovery.Dnssd.DnssdServiceInstanceCollection
    
    /** Maintains a collection of available DNS Service Discovery (DNS-SD) service instances. */
    @JSGlobal("Windows.Networking.ServiceDiscovery.Dnssd.DnssdServiceWatcher")
    @js.native
    abstract class DnssdServiceWatcher ()
      extends typings.winrtUwp.Windows.Networking.ServiceDiscovery.Dnssd.DnssdServiceWatcher
    
    /** Values representing the status of a DnssdServiceWatcher. */
    @JSGlobal("Windows.Networking.ServiceDiscovery.Dnssd.DnssdServiceWatcherStatus")
    @js.native
    object DnssdServiceWatcherStatus extends StObject {
      
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
