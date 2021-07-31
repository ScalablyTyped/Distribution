package typings.winrtUwp.Windows.Media

import typings.winrtUwp.Windows.Devices.Enumeration.DevicePickerAppearance
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.Rect
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamWithContentType
import typings.winrtUwp.Windows.UI.Popups.Placement
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.castingdevicepickerdismissed
import typings.winrtUwp.winrtUwpStrings.castingdeviceselected
import typings.winrtUwp.winrtUwpStrings.erroroccurred
import typings.winrtUwp.winrtUwpStrings.statechanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This namespace lets an app to cast or send particular media content to a second device and is meant to be device-protocol agnostic. Today, the APIs work with Miracast, DLNA, and Bluetooth, and support images, audio, and video from HTML Tags, ImageElement and MediaElement. */
object Casting {
  
  @js.native
  sealed trait CastingConnectionErrorStatus extends StObject
  /** Indicates the error status when starting or ending a casting connection. */
  @JSGlobal("Windows.Media.Casting.CastingConnectionErrorStatus")
  @js.native
  object CastingConnectionErrorStatus extends StObject {
    
    /** The device did not respond to the attempt to start or end theconnection. */
    @js.native
    sealed trait deviceDidNotRespond
      extends StObject
         with CastingConnectionErrorStatus
    
    /** The device returned an error when attempting to start or end the connection. */
    @js.native
    sealed trait deviceError
      extends StObject
         with CastingConnectionErrorStatus
    
    /** The device was locked and a start or end the connection could not be made. */
    @js.native
    sealed trait deviceLocked
      extends StObject
         with CastingConnectionErrorStatus
    
    /** The casting source was invalid. */
    @js.native
    sealed trait invalidCastingSource
      extends StObject
         with CastingConnectionErrorStatus
    
    /** The device could not provide protected playback. */
    @js.native
    sealed trait protectedPlaybackFailed
      extends StObject
         with CastingConnectionErrorStatus
    
    /** Starting or ending the connection was successful. */
    @js.native
    sealed trait succeeded
      extends StObject
         with CastingConnectionErrorStatus
    
    /** An unknown error occurred when attempting to start or end the connection. */
    @js.native
    sealed trait unknown
      extends StObject
         with CastingConnectionErrorStatus
  }
  
  @js.native
  sealed trait CastingConnectionState extends StObject
  /** Indicates the current state of a casting connection. Rendering is used when actively playing content. */
  @JSGlobal("Windows.Media.Casting.CastingConnectionState")
  @js.native
  object CastingConnectionState extends StObject {
    
    /** The casting connection is active. */
    @js.native
    sealed trait connected
      extends StObject
         with CastingConnectionState
    
    /** The connection is connecting. */
    @js.native
    sealed trait connecting
      extends StObject
         with CastingConnectionState
    
    /** The casting connection has been disconnected. */
    @js.native
    sealed trait disconnected
      extends StObject
         with CastingConnectionState
    
    /** The connection is being disconnected. */
    @js.native
    sealed trait disconnecting
      extends StObject
         with CastingConnectionState
    
    /** The casting connection is actively playing content. */
    @js.native
    sealed trait rendering
      extends StObject
         with CastingConnectionState
  }
  
  @js.native
  sealed trait CastingPlaybackTypes extends StObject
  /** Indicates the capabilities of a particular casting device. */
  @JSGlobal("Windows.Media.Casting.CastingPlaybackTypes")
  @js.native
  object CastingPlaybackTypes extends StObject {
    
    /** The casting device supports audio playback. */
    @js.native
    sealed trait audio
      extends StObject
         with CastingPlaybackTypes
    
    /** The casting device does not support playback. */
    @js.native
    sealed trait none
      extends StObject
         with CastingPlaybackTypes
    
    /** The casting device supports image playback. */
    @js.native
    sealed trait picture
      extends StObject
         with CastingPlaybackTypes
    
    /** The casting device supports video playback. */
    @js.native
    sealed trait video
      extends StObject
         with CastingPlaybackTypes
  }
  
  /** Represents the actual connection with a casting device. */
  @js.native
  trait CastingConnection extends StObject {
    
    def addEventListener(`type`: String, listener: EventHandler[js.Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_erroroccurred(
      `type`: erroroccurred,
      listener: TypedEventHandler[CastingConnection, CastingConnectionErrorOccurredEventArgs]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_statechanged(`type`: statechanged, listener: TypedEventHandler[CastingConnection, js.Any]): Unit = js.native
    
    /** Closes the casting connection. */
    def close(): Unit = js.native
    
    /** Gets the casting device with which a connection has been made. */
    var device: CastingDevice = js.native
    
    /**
      * Terminates a casting connection. The content that was rendering remotely returns to the local element that you retrieved the casting source from.
      * @return The status of the termination.
      */
    def disconnectAsync(): IPromiseWithIAsyncOperation[CastingConnectionErrorStatus] = js.native
    
    /** Indicates an error occurred while attempting to make a casting connection. */
    def onerroroccurred(ev: CastingConnectionErrorOccurredEventArgs & WinRTEvent[CastingConnection]): Unit = js.native
    /** Indicates an error occurred while attempting to make a casting connection. */
    @JSName("onerroroccurred")
    var onerroroccurred_Original: TypedEventHandler[CastingConnection, CastingConnectionErrorOccurredEventArgs] = js.native
    
    /** Indicates a change in the State property. */
    def onstatechanged(ev: js.Any & WinRTEvent[CastingConnection]): Unit = js.native
    /** Indicates a change in the State property. */
    @JSName("onstatechanged")
    var onstatechanged_Original: TypedEventHandler[CastingConnection, js.Any] = js.native
    
    def removeEventListener(`type`: String, listener: EventHandler[js.Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_erroroccurred(
      `type`: erroroccurred,
      listener: TypedEventHandler[CastingConnection, CastingConnectionErrorOccurredEventArgs]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_statechanged(`type`: statechanged, listener: TypedEventHandler[CastingConnection, js.Any]): Unit = js.native
    
    /**
      * Starts the process of casting to a casting device. When called, this method pairs the c sting device, if necessary, and verifies access to the casting device with the user. If the user denies the app access to the device, casting fails. Otherwise, a connection is established, and content is sent to the device. During this time, the connection state changes to connecting, then to connected. If a casting source is set, the state changes to rendering once playback begins.
      * @param value The content to be casted.
      * @return The status of the casting connection request.
      */
    def requestStartCastingAsync(value: CastingSource): IPromiseWithIAsyncOperation[CastingConnectionErrorStatus] = js.native
    
    /** Gets and sets the content source that is being casted through the connection to the casting device. The content can be set and changed at any time and doing so does not disconnect the connection. */
    var source: CastingSource = js.native
    
    /** Gets the current state of the connection. */
    var state: CastingConnectionState = js.native
  }
  
  /** Represents arguments for the ErrorOccurred event from the CastingConnection */
  trait CastingConnectionErrorOccurredEventArgs extends StObject {
    
    /** Gets the particular error that triggered the casting error event, ErrorOccurred . */
    var errorStatus: CastingConnectionErrorStatus
    
    /** Gets human-readable message to accompany the error status code, ErrorStatus . */
    var message: String
  }
  object CastingConnectionErrorOccurredEventArgs {
    
    @scala.inline
    def apply(errorStatus: CastingConnectionErrorStatus, message: String): CastingConnectionErrorOccurredEventArgs = {
      val __obj = js.Dynamic.literal(errorStatus = errorStatus.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[CastingConnectionErrorOccurredEventArgs]
    }
    
    @scala.inline
    implicit class CastingConnectionErrorOccurredEventArgsMutableBuilder[Self <: CastingConnectionErrorOccurredEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorStatus(value: CastingConnectionErrorStatus): Self = StObject.set(x, "errorStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  /** Represents a physical device that is capable of supporting casting connections and rendering media content sent to it. */
  trait CastingDevice extends StObject {
    
    /**
      * Creates a new CastingConnection object. This method does not establish a connection to the casting device.
      * @return The object that represents the casting connection.
      */
    def createCastingConnection(): CastingConnection
    
    /** A human-readable name for the device, retrieved from the device itself. */
    var friendlyName: String
    
    /**
      * Gets the media types supported by the device. containing
      * @return The media types, CastingPlaybackTypes , supported by the device.
      */
    def getSupportedCastingPlaybackTypesAsync(): IPromiseWithIAsyncOperation[CastingPlaybackTypes]
    
    /** An icon representing the device. */
    var icon: IRandomAccessStreamWithContentType
    
    /** The device ID. This is the same ID used with Windows.Devices.Enumeration APIs. */
    var id: String
  }
  object CastingDevice {
    
    @scala.inline
    def apply(
      createCastingConnection: () => CastingConnection,
      friendlyName: String,
      getSupportedCastingPlaybackTypesAsync: () => IPromiseWithIAsyncOperation[CastingPlaybackTypes],
      icon: IRandomAccessStreamWithContentType,
      id: String
    ): CastingDevice = {
      val __obj = js.Dynamic.literal(createCastingConnection = js.Any.fromFunction0(createCastingConnection), friendlyName = friendlyName.asInstanceOf[js.Any], getSupportedCastingPlaybackTypesAsync = js.Any.fromFunction0(getSupportedCastingPlaybackTypesAsync), icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[CastingDevice]
    }
    
    @scala.inline
    implicit class CastingDeviceMutableBuilder[Self <: CastingDevice] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateCastingConnection(value: () => CastingConnection): Self = StObject.set(x, "createCastingConnection", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetSupportedCastingPlaybackTypesAsync(value: () => IPromiseWithIAsyncOperation[CastingPlaybackTypes]): Self = StObject.set(x, "getSupportedCastingPlaybackTypesAsync", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIcon(value: IRandomAccessStreamWithContentType): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  /** Represents a device picker that contains a list of casting devices for the user to choose from. */
  @js.native
  trait CastingDevicePicker extends StObject {
    
    def addEventListener(`type`: String, listener: EventHandler[js.Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_castingdevicepickerdismissed(`type`: castingdevicepickerdismissed, listener: TypedEventHandler[CastingDevicePicker, js.Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_castingdeviceselected(
      `type`: castingdeviceselected,
      listener: TypedEventHandler[CastingDevicePicker, CastingDeviceSelectedEventArgs]
    ): Unit = js.native
    
    /** Gets the colors of the picker UI. */
    var appearance: DevicePickerAppearance = js.native
    
    /** Gets the filter information for which devices to show in the picker. */
    var filter: CastingDevicePickerFilter = js.native
    
    /** Hides the device picker UI. */
    def hide(): Unit = js.native
    
    /** Indicates that the user has dismissed the picker UI. */
    def oncastingdevicepickerdismissed(ev: js.Any & WinRTEvent[CastingDevicePicker]): Unit = js.native
    /** Indicates that the user has dismissed the picker UI. */
    @JSName("oncastingdevicepickerdismissed")
    var oncastingdevicepickerdismissed_Original: TypedEventHandler[CastingDevicePicker, js.Any] = js.native
    
    /** Indicates that the user has selected a device from the picker. */
    def oncastingdeviceselected(ev: CastingDeviceSelectedEventArgs & WinRTEvent[CastingDevicePicker]): Unit = js.native
    /** Indicates that the user has selected a device from the picker. */
    @JSName("oncastingdeviceselected")
    var oncastingdeviceselected_Original: TypedEventHandler[CastingDevicePicker, CastingDeviceSelectedEventArgs] = js.native
    
    def removeEventListener(`type`: String, listener: EventHandler[js.Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_castingdevicepickerdismissed(`type`: castingdevicepickerdismissed, listener: TypedEventHandler[CastingDevicePicker, js.Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_castingdeviceselected(
      `type`: castingdeviceselected,
      listener: TypedEventHandler[CastingDevicePicker, CastingDeviceSelectedEventArgs]
    ): Unit = js.native
    
    /**
      * Shows the casting device picker UI, which flies out from an edge of the provided rectangle.
      * @param selection The rectangle from which the picker UI should fly out.
      */
    def show(selection: Rect): Unit = js.native
    /**
      * Shows the casting device picker UI, which flies out from the specified edge of the provided rectangle.
      * @param selection The rectangle from which the picker should fly out.
      * @param preferredPlacement The edge of the rectangle from which the picker should fly out.
      */
    def show(selection: Rect, preferredPlacement: Placement): Unit = js.native
  }
  
  /** Represents the filter used to determine which devices to show in a casting device picker UI. The filter parameters are OR-ed together to build the resulting filter. In other words, if SupportsAudio and SupportsVideo are both true, the picker will display Audio-only devices, video-only devices, and audio/video devices. */
  trait CastingDevicePickerFilter extends StObject {
    
    /** Gets the casting sources supported. */
    var supportedCastingSources: IVector[CastingSource]
    
    /** Gets and sets whether the devices in the device picker should support audio playback. */
    var supportsAudio: Boolean
    
    /** Gets and sets whether the devices in the device picker should support rending still images. */
    var supportsPictures: Boolean
    
    /** Gets and sets whether the devices in the device picker should support video playback. */
    var supportsVideo: Boolean
  }
  object CastingDevicePickerFilter {
    
    @scala.inline
    def apply(
      supportedCastingSources: IVector[CastingSource],
      supportsAudio: Boolean,
      supportsPictures: Boolean,
      supportsVideo: Boolean
    ): CastingDevicePickerFilter = {
      val __obj = js.Dynamic.literal(supportedCastingSources = supportedCastingSources.asInstanceOf[js.Any], supportsAudio = supportsAudio.asInstanceOf[js.Any], supportsPictures = supportsPictures.asInstanceOf[js.Any], supportsVideo = supportsVideo.asInstanceOf[js.Any])
      __obj.asInstanceOf[CastingDevicePickerFilter]
    }
    
    @scala.inline
    implicit class CastingDevicePickerFilterMutableBuilder[Self <: CastingDevicePickerFilter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSupportedCastingSources(value: IVector[CastingSource]): Self = StObject.set(x, "supportedCastingSources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportsAudio(value: Boolean): Self = StObject.set(x, "supportsAudio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportsPictures(value: Boolean): Self = StObject.set(x, "supportsPictures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportsVideo(value: Boolean): Self = StObject.set(x, "supportsVideo", value.asInstanceOf[js.Any])
    }
  }
  
  /** Represents the event arguments for the CastingDeviceSelected event on the CastingDevicePicker object. */
  trait CastingDeviceSelectedEventArgs extends StObject {
    
    /** Represents the CastingDevice that has been selected by the user in a casting device picker. */
    var selectedCastingDevice: CastingDevice
  }
  object CastingDeviceSelectedEventArgs {
    
    @scala.inline
    def apply(selectedCastingDevice: CastingDevice): CastingDeviceSelectedEventArgs = {
      val __obj = js.Dynamic.literal(selectedCastingDevice = selectedCastingDevice.asInstanceOf[js.Any])
      __obj.asInstanceOf[CastingDeviceSelectedEventArgs]
    }
    
    @scala.inline
    implicit class CastingDeviceSelectedEventArgsMutableBuilder[Self <: CastingDeviceSelectedEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSelectedCastingDevice(value: CastingDevice): Self = StObject.set(x, "selectedCastingDevice", value.asInstanceOf[js.Any])
    }
  }
  
  /** Represents the media content that can be sent to another device. */
  trait CastingSource extends StObject {
    
    /** Gets or sets an alternative URI for the content for use with DLNA ByRef. */
    var preferredSourceUri: Uri
  }
  object CastingSource {
    
    @scala.inline
    def apply(preferredSourceUri: Uri): CastingSource = {
      val __obj = js.Dynamic.literal(preferredSourceUri = preferredSourceUri.asInstanceOf[js.Any])
      __obj.asInstanceOf[CastingSource]
    }
    
    @scala.inline
    implicit class CastingSourceMutableBuilder[Self <: CastingSource] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPreferredSourceUri(value: Uri): Self = StObject.set(x, "preferredSourceUri", value.asInstanceOf[js.Any])
    }
  }
}
