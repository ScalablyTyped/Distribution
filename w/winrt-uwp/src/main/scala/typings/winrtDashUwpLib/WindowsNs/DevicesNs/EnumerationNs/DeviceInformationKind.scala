package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeviceInformationKind extends js.Object

/** Represents the kind of DeviceInformation object. */
@JSGlobal("Windows.Devices.Enumeration.DeviceInformationKind")
@js.native
object DeviceInformationKind extends js.Object {
  /** The DeviceInformation object represents a device association endpoint (AEP). AEPs usually represent a device discovered over a wireless or network protocol. Some of these endpoints can be used without needing to first pair the device. Use CanPair to determine if a device supports pairing and IsPaired to determine if a device is already paired with the system. Only AssociationEndpoint objects have a non-NULL value for Pairing . For more information about pairing over a network, see Enumerate devices over a network. An AssociationEndpoint object is a child of a single AssociationEndpointContainer object and can contain 0 or more AssociationEndpointService objects. */
  @js.native
  sealed trait associationEndpoint
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceInformationKind
  
  /** The DeviceInformation object represents an association endpoint (AEP) container. An AssociationEndpointContainer object represents a single physical device that might have more than one AssociationEndpoint objects associated with it. For example, if a television supports two different network protocols, the AssociationEndpointContainer would be the television. It would also have two AssociationEndpoint objects to represent each protocol. */
  @js.native
  sealed trait associationEndpointContainer
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceInformationKind
  
  /** The DeviceInformation object represents an association endpoint (AEP) Service. An AssociationEndpointService object represents a functional service contract exposed by the device. Not all protocols support AEP services. An AssociationEndpointService can have a single parent AssociationEndpointContainer object. */
  @js.native
  sealed trait associationEndpointService
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceInformationKind
  
  /** The DeviceInformation object represents a device object. This could also be referred to as a devnode. These devices are objects that represent a piece of the device functionality and optionally have drivers loaded on them. When a physical device is paired with windows, multiple Device objects are created for it. A device contains 0 or more DeviceInterface objects, is a child to one DeviceContainer object, and is related to 0 or 1 AssociationEndpoint objects. */
  @js.native
  sealed trait device
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceInformationKind
  
  /** The DeviceInformation object represents a device container. DeviceContainer objects describe a collection of device objects that exist in the same physical device. For example, a multi-function printer may have several different devices included, but they would all exist as part of the parent DeviceContainer object. */
  @js.native
  sealed trait deviceContainer
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceInformationKind
  
  /** The DeviceInformation object represents a PnP device interface. These are exposed by device drivers to enable an app to talk to the device, typically using device IOCTLS (input output controls). */
  @js.native
  sealed trait deviceInterface
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceInformationKind
  
  /** The DeviceInformation object represents a device interface class. Every DeviceInterface object belongs to a certain DeviceInterfaceClass. This is similar to a contract definition. These contracts are represented with an id and properties, just like every other PnP object. DeviceInterfaceClass objects contain little more information than a unique identifier and possibly a name. */
  @js.native
  sealed trait deviceInterfaceClass
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceInformationKind
  
  /** The object is of an unknown type. This value is not used. */
  @js.native
  sealed trait unknown
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceInformationKind
  
  val associationEndpoint: associationEndpoint with java.lang.String = js.native
  val associationEndpointContainer: associationEndpointContainer with java.lang.String = js.native
  val associationEndpointService: associationEndpointService with java.lang.String = js.native
  val device: device with java.lang.String = js.native
  val deviceContainer: deviceContainer with java.lang.String = js.native
  val deviceInterface: deviceInterface with java.lang.String = js.native
  val deviceInterfaceClass: deviceInterfaceClass with java.lang.String = js.native
  val unknown: unknown with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceInformationKind with java.lang.String
  ] = js.native
}

