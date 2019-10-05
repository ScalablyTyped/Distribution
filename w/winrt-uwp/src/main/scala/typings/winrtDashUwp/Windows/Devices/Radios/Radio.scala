package typings.winrtDashUwp.Windows.Devices.Radios

import typings.winrtDashUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtDashUwp.Windows.Foundation.EventHandler
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.Windows.Foundation.TypedEventHandler
import typings.winrtDashUwp.Windows.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.statechanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a radio device on the system. */
@JSGlobal("Windows.Devices.Radios.Radio")
@js.native
abstract class Radio () extends js.Object {
  /** Gets an enumeration value that describes what kind of radio this object represents. */
  var kind: RadioKind = js.native
  /** Gets the name of the radio represented by this object. */
  var name: String = js.native
  /** Event raised by a state change in the radio represented by this object. */
  @JSName("onstatechanged")
  var onstatechanged_Original: TypedEventHandler[Radio, _] = js.native
  /** Gets the current state of the radio represented by this object. */
  var state: RadioState = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statechanged(`type`: statechanged, listener: TypedEventHandler[Radio, _]): Unit = js.native
  /** Event raised by a state change in the radio represented by this object. */
  def onstatechanged(ev: js.Any with WinRTEvent[Radio]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statechanged(`type`: statechanged, listener: TypedEventHandler[Radio, _]): Unit = js.native
  /**
    * An asynchronous operation that attempts to set the state of the radio represented by this object.
    * @param value The desired radio state.
    * @return An asynchronous state setting operation. On successful completion, contains an enumeration value describing status of the state change request.
    */
  def setStateAsync(value: RadioState): IPromiseWithIAsyncOperation[RadioAccessStatus] = js.native
}

/* static members */
@JSGlobal("Windows.Devices.Radios.Radio")
@js.native
object Radio extends js.Object {
  /**
    * A static method that retrieves a Radio object corresponding to a device Id obtained through Windows.Devices.Enumeration.DeviceInformation.FindAllAsync and related APIs.
    * @param deviceId A string that identifies a particular radio device.
    * @return An asynchronous retrieval operation. On successful completion, it contains a Radio object that represents the specified radio device.
    */
  def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[Radio] = js.native
  /**
    * A static method that returns an Advanced Query Syntax (AQS) string to be used to enumerate or monitor Radio devices with Windows.Devices.Enumeration.DeviceInformation.FindAllAsync and related methods.
    * @return An identifier to be used to enumerate radio devices.
    */
  def getDeviceSelector(): String = js.native
  /**
    * A static, asynchronous method that retrieves a collection of Windows.Devices.Radios.Radio objects representing radio devices existing on the system.
    * @return An asynchronous retrieval operation. When the operation is complete, contains a list of Windows.Devices.Radios.Radio objects describing available radios.
    */
  def getRadiosAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * An asynchronous method that retrieves a value indicating what access the current user has to the radio represented by this object. In circumstances where user permission is required to access the radio, this method prompts the user for permission. Consequently, always call this method on the UI thread.
    * @return An asynchronous status retrieval operation. On successful completion, contains an enumeration value describing the current user's access to this radio.
    */
  def requestAccessAsync(): IPromiseWithIAsyncOperation[RadioAccessStatus] = js.native
}

