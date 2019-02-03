package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.PnpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a PnP object. This class allows access to well-known properties of a PnP object as well as a property store of additional properties that are specified to be retrieved from the the PnP object. */
@JSGlobal("Windows.Devices.Enumeration.Pnp.PnpObject")
@js.native
abstract class PnpObject () extends js.Object {
  /** A string representing the identity of the PnpObject . */
  var id: java.lang.String = js.native
  /** A property store containing well-known values as well as additional specified properties. */
  var properties: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, _] = js.native
  /** The type of the PnpObject . */
  var `type`: PnpObjectType = js.native
  /**
    * Updates the properties of an existing PnpObject by applying the changes described in a PnpObjectUpdate object.
    * @param updateInfo Indicates the properties to update.
    */
  def update(updateInfo: PnpObjectUpdate): scala.Unit = js.native
}

/* static members */
@JSGlobal("Windows.Devices.Enumeration.Pnp.PnpObject")
@js.native
object PnpObject extends js.Object {
  /**
    * Creates a PnpObject object asynchronously from a previously saved DeviceInformation ID.
    * @param type The type of the PnpObject .
    * @param id The string value identifying the PnpObject .
    * @param requestedProperties An iterable list of additional properties to include in the Properties property of the PnpObject object to create. For more info on what the properties represent, see Device information properties.
    * @return The PnpObject created from the previously saved DeviceInformation ID.
    */
  def createFromIdAsync(
    `type`: winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.PnpNs.PnpObjectType,
    id: java.lang.String,
    requestedProperties: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String]
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.PnpNs.PnpObject] = js.native
  /**
    * Returns a PnpObjectWatcher object that is used to enumerate the PnP objects in the collection using events.
    * @param type The type of the PnpObject .
    * @param requestedProperties An iterable list of additional properties to include in the Properties property of the PnpObject objects included in enumeration results. For more info on what the properties represent, see Device information properties.
    * @return A PnpObjectWatcher object used to enumerate the collection by registering event notification delegates and by issuing start and stop event notifications.
    */
  def createWatcher(
    `type`: winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.PnpNs.PnpObjectType,
    requestedProperties: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String]
  ): winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.PnpNs.PnpObjectWatcher = js.native
  /**
    * Returns a PnpObjectWatcher object that is used to enumerate a filtered collection of PnP objects using events.
    * @param type The type of the PnpObject .
    * @param requestedProperties An iterable list of additional properties to include in the Properties property of the PnpObject objects included in enumeration results. For more info on what the properties represent, see Device information properties.
    * @param aqsFilter An AQS string that filters the PnP objects that will be returned. Typically, this string is retrieved from the GetDeviceSelector method of a class that interacts with devices.
    * @return A PnpObjectWatcher object used to enumerate the collection by registering event notification delegates and by issuing start and stop event notifications.
    */
  def createWatcher(
    `type`: winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.PnpNs.PnpObjectType,
    requestedProperties: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String],
    aqsFilter: java.lang.String
  ): winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.PnpNs.PnpObjectWatcher = js.native
  /**
    * Returns all of the PnP objects of a specified type that match the specified criteria.
    * @param type The type of the PnpObject .
    * @param requestedProperties An iterable list of additional properties to include in the Properties property of the PnpObject objects included in enumeration results. For more info on what the properties represent, see Device information properties.
    * @return An object that represents the asynchronous operation.
    */
  def findAllAsync(
    `type`: winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.PnpNs.PnpObjectType,
    requestedProperties: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String]
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.PnpNs.PnpObjectCollection] = js.native
  /**
    * Returns all of the PnP objects of a specified type that match the specified filter.
    * @param type The type of the PnpObject .
    * @param requestedProperties An iterable list of additional properties to include in the Properties property of the PnpObject objects included in enumeration results. For more info on what the properties represent, see Device information properties.
    * @param aqsFilter An AQS string that filters the PnP objects that will be returned. Typically, this string is retrieved from the GetDeviceSelector method of a class that interacts with devices.
    * @return An object that represents the asynchronous operation.
    */
  def findAllAsync(
    `type`: winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.PnpNs.PnpObjectType,
    requestedProperties: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String],
    aqsFilter: java.lang.String
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.PnpNs.PnpObjectCollection] = js.native
}

