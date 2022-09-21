package typings.winrtUwp.Windows.Devices

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.statechanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The members of this namespace allow your app to find and control radio adapters, like Wi-Fi and Bluetooth, on the device where your app runs, and to query those radios for certain attributes. */
object Radios {
  
  @js.native
  sealed trait RadioAccessStatus extends StObject
  /** Enumeration that describes possible access states that a user can have to a given radio. */
  @JSGlobal("Windows.Devices.Radios.RadioAccessStatus")
  @js.native
  object RadioAccessStatus extends StObject {
    
    /** Access is allowed. */
    @js.native
    sealed trait allowed
      extends StObject
         with RadioAccessStatus
    
    /** Access was denied by the system. One common reason for this result is that the user does not have suitable permission to manipulate the radio in question. */
    @js.native
    sealed trait deniedBySystem
      extends StObject
         with RadioAccessStatus
    
    /** Access was denied because of user action, usually through denying an operation through the radio privacy settings page. */
    @js.native
    sealed trait deniedByUser
      extends StObject
         with RadioAccessStatus
    
    /** Access state is unspecified. */
    @js.native
    sealed trait unspecified
      extends StObject
         with RadioAccessStatus
  }
  
  @js.native
  sealed trait RadioKind extends StObject
  /** Enumeration that represents the kinds of radio devices. */
  @JSGlobal("Windows.Devices.Radios.RadioKind")
  @js.native
  object RadioKind extends StObject {
    
    /** A Bluetooth radio. */
    @js.native
    sealed trait bluetooth
      extends StObject
         with RadioKind
    
    /** An FM radio. */
    @js.native
    sealed trait fm
      extends StObject
         with RadioKind
    
    /** A mobile broadband radio. */
    @js.native
    sealed trait mobileBroadband
      extends StObject
         with RadioKind
    
    /** An unspecified kind of radio device. */
    @js.native
    sealed trait other
      extends StObject
         with RadioKind
    
    /** A Wi-Fi radio. */
    @js.native
    sealed trait wiFi
      extends StObject
         with RadioKind
  }
  
  @js.native
  sealed trait RadioState extends StObject
  /** Enumeration that describes possible radio states. */
  @JSGlobal("Windows.Devices.Radios.RadioState")
  @js.native
  object RadioState extends StObject {
    
    /** The radio is powered off and disabled by the device firmware or a hardware switch on the device. */
    @js.native
    sealed trait disabled
      extends StObject
         with RadioState
    
    /** The radio is powered off. */
    @js.native
    sealed trait off
      extends StObject
         with RadioState
    
    /** The radio is powered on. */
    @js.native
    sealed trait on
      extends StObject
         with RadioState
    
    /** The radio state is unknown, or the radio is in a bad or uncontrollable state. */
    @js.native
    sealed trait unknown
      extends StObject
         with RadioState
  }
  
  /** Represents a radio device on the system. */
  @js.native
  trait Radio extends StObject {
    
    def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_statechanged(`type`: statechanged, listener: TypedEventHandler[Radio, Any]): Unit = js.native
    
    /** Gets an enumeration value that describes what kind of radio this object represents. */
    var kind: RadioKind = js.native
    
    /** Gets the name of the radio represented by this object. */
    var name: String = js.native
    
    /** Event raised by a state change in the radio represented by this object. */
    def onstatechanged(ev: Any & WinRTEvent[Radio]): Unit = js.native
    /** Event raised by a state change in the radio represented by this object. */
    @JSName("onstatechanged")
    var onstatechanged_Original: TypedEventHandler[Radio, Any] = js.native
    
    def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_statechanged(`type`: statechanged, listener: TypedEventHandler[Radio, Any]): Unit = js.native
    
    /**
      * An asynchronous operation that attempts to set the state of the radio represented by this object.
      * @param value The desired radio state.
      * @return An asynchronous state setting operation. On successful completion, contains an enumeration value describing status of the state change request.
      */
    def setStateAsync(value: RadioState): IPromiseWithIAsyncOperation[RadioAccessStatus] = js.native
    
    /** Gets the current state of the radio represented by this object. */
    var state: RadioState = js.native
  }
}
