package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.ServiceDiscoveryNs.DnssdNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A collection of DNS Service Discovery (DNS-SD) service instances. */
@JSGlobal("Windows.Networking.ServiceDiscovery.Dnssd.DnssdServiceInstanceCollection")
@js.native
abstract class DnssdServiceInstanceCollection ()
  extends stdLib.Array[DnssdServiceInstance] {
  /** Gets the number of items in the collection */
  var size: scala.Double = js.native
  /**
                       * Gets an iterator that is initialized to refer to the first item in the instance collection.
                       * @return Gets an iterator instance initialized to the first item in the service instance collection. Your code can use this iterator to enumerate all members of the collection.
                       */
  def first(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterator[DnssdServiceInstance] = js.native
  /**
                       * Gets the DnssdServiceInstance at a given index into the DnssdServiceInstanceCollection .
                       * @param index The index of the instance to be retrieved. Indices are 0-based. If your code specifies an index that is out of bounds, an exception is thrown. The maximum valid index is equal to one less than the DnssdServiceInstanceCollection.Size value.
                       * @return The DnssdServiceInstance at the given index in the collection.
                       */
  def getAt(index: scala.Double): DnssdServiceInstance = js.native
  /**
                       * Gets multiple DnssdServiceInstance objects from a DNS-SD service instance collection.
                       * @param startIndex Index of the first collection item to be retrieved.
                       */
  def getMany(startIndex: scala.Double): winrtDashUwpLib.Anon_ItemsReturnValueDnssdServiceInstance = js.native
  def indexOf(value: DnssdServiceInstance, extra: js.Any*): winrtDashUwpLib.Anon_Index = js.native
  /**
                       * Gets a value indicating whether a given DnssdServiceInstance is at the specified index in this service instance collection.
                       * @param value The DnssdServiceInstance to get the index of.
                       */
  @JSName("indexOf")
  def indexOf_Anon_Index(value: DnssdServiceInstance): winrtDashUwpLib.Anon_Index = js.native
}

