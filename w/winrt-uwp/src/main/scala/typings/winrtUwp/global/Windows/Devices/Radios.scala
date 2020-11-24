package typings.winrtUwp.global.Windows.Devices

import typings.winrtUwp.Windows.Devices.Radios.RadioAccessStatus
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The members of this namespace allow your app to find and control radio adapters, like Wi-Fi and Bluetooth, on the device where your app runs, and to query those radios for certain attributes. */
@JSGlobal("Windows.Devices.Radios")
@js.native
object Radios extends js.Object {
  
  /** Represents a radio device on the system. */
  @js.native
  abstract class Radio ()
    extends typings.winrtUwp.Windows.Devices.Radios.Radio
  /* static members */
  @js.native
  object Radio extends js.Object {
    
    /**
      * A static method that retrieves a Radio object corresponding to a device Id obtained through Windows.Devices.Enumeration.DeviceInformation.FindAllAsync and related APIs.
      * @param deviceId A string that identifies a particular radio device.
      * @return An asynchronous retrieval operation. On successful completion, it contains a Radio object that represents the specified radio device.
      */
    def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Radios.Radio] = js.native
    
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
  
  /** Enumeration that describes possible access states that a user can have to a given radio. */
  @js.native
  object RadioAccessStatus extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Radios.RadioAccessStatus with Double] = js.native
    
    /* 1 */ val allowed: typings.winrtUwp.Windows.Devices.Radios.RadioAccessStatus.allowed with Double = js.native
    
    /* 3 */ val deniedBySystem: typings.winrtUwp.Windows.Devices.Radios.RadioAccessStatus.deniedBySystem with Double = js.native
    
    /* 2 */ val deniedByUser: typings.winrtUwp.Windows.Devices.Radios.RadioAccessStatus.deniedByUser with Double = js.native
    
    /* 0 */ val unspecified: typings.winrtUwp.Windows.Devices.Radios.RadioAccessStatus.unspecified with Double = js.native
  }
  
  /** Enumeration that represents the kinds of radio devices. */
  @js.native
  object RadioKind extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Radios.RadioKind with Double] = js.native
    
    /* 3 */ val bluetooth: typings.winrtUwp.Windows.Devices.Radios.RadioKind.bluetooth with Double = js.native
    
    /* 4 */ val fm: typings.winrtUwp.Windows.Devices.Radios.RadioKind.fm with Double = js.native
    
    /* 2 */ val mobileBroadband: typings.winrtUwp.Windows.Devices.Radios.RadioKind.mobileBroadband with Double = js.native
    
    /* 0 */ val other: typings.winrtUwp.Windows.Devices.Radios.RadioKind.other with Double = js.native
    
    /* 1 */ val wiFi: typings.winrtUwp.Windows.Devices.Radios.RadioKind.wiFi with Double = js.native
  }
  
  /** Enumeration that describes possible radio states. */
  @js.native
  object RadioState extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Radios.RadioState with Double] = js.native
    
    /* 3 */ val disabled: typings.winrtUwp.Windows.Devices.Radios.RadioState.disabled with Double = js.native
    
    /* 2 */ val off: typings.winrtUwp.Windows.Devices.Radios.RadioState.off with Double = js.native
    
    /* 1 */ val on: typings.winrtUwp.Windows.Devices.Radios.RadioState.on with Double = js.native
    
    /* 0 */ val unknown: typings.winrtUwp.Windows.Devices.Radios.RadioState.unknown with Double = js.native
  }
}
