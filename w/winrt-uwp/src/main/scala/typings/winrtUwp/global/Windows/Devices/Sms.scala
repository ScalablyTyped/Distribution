package typings.winrtUwp.global.Windows.Devices

import typings.std.Date
import typings.winrtUwp.Windows.Devices.Sms.CellularClass
import typings.winrtUwp.Windows.Devices.Sms.ISmsBinaryMessage
import typings.winrtUwp.Windows.Devices.Sms.ISmsMessage
import typings.winrtUwp.Windows.Devices.Sms.SmsBroadcastType
import typings.winrtUwp.Windows.Devices.Sms.SmsDataFormat
import typings.winrtUwp.Windows.Devices.Sms.SmsEncoding
import typings.winrtUwp.Windows.Devices.Sms.SmsFilterActionType
import typings.winrtUwp.Windows.Devices.Sms.SmsGeographicalScope
import typings.winrtUwp.Windows.Devices.Sms.SmsMessageClass
import typings.winrtUwp.Windows.Devices.Sms.SmsMessageFilter
import typings.winrtUwp.Windows.Devices.Sms.SmsMessageType
import typings.winrtUwp.Windows.Devices.Sms.SmsModemErrorCode
import typings.winrtUwp.Windows.Foundation.AsyncActionCompletedHandler
import typings.winrtUwp.Windows.Foundation.AsyncOperationCompletedHandler
import typings.winrtUwp.Windows.Foundation.AsyncOperationProgressHandler
import typings.winrtUwp.Windows.Foundation.AsyncOperationWithProgressCompletedHandler
import typings.winrtUwp.Windows.Foundation.AsyncStatus
import typings.winrtUwp.Windows.Foundation.Collections.IMap
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IAsyncAction
import typings.winrtUwp.Windows.Foundation.IAsyncOperation
import typings.winrtUwp.Windows.Foundation.IAsyncOperationWithProgress
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import typings.winrtUwp.Windows.WinRTError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the ability to send and receive Short Message Service (SMS) messages, filter incoming messages, and send messages silently, as well as to query properties about a Mobile Broadband SMS Device. Use this API to implement Mobile Operator (MO) applications that use app-directed SMS to implement MO features such as visual voice mail apps. */
object Sms {
  
  /** This enumerated type defines the type of radio standard in a device. */
  @JSGlobal("Windows.Devices.Sms.CellularClass")
  @js.native
  object CellularClass extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Sms.CellularClass & Double] = js.native
    
    /* 2 */ val cdma: typings.winrtUwp.Windows.Devices.Sms.CellularClass.cdma & Double = js.native
    
    /* 1 */ val gsm: typings.winrtUwp.Windows.Devices.Sms.CellularClass.gsm & Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Devices.Sms.CellularClass.none & Double = js.native
  }
  
  /** Enables start, track, and end an asynchronous message delete operation for a single message. */
  @JSGlobal("Windows.Devices.Sms.DeleteSmsMessageOperation")
  @js.native
  abstract class DeleteSmsMessageOperation ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Sms.DeleteSmsMessageOperation {
    
    /** Cancels the asynchronous SMS message delete operation. */
    /* CompleteClass */
    override def cancel(): Unit = js.native
    
    /** Closes the asynchronous SMS message delete operation. */
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /** Specifies whether the asynchronous SMS message delete operation has completed or not. */
    /* CompleteClass */
    override def completed(asyncInfo: IAsyncAction, asyncStatus: AsyncStatus): Unit = js.native
    /** Specifies whether the asynchronous SMS message delete operation has completed or not. */
    /* CompleteClass */
    @JSName("completed")
    var completed_Original: AsyncActionCompletedHandler = js.native
    
    /** Specifies the error code for the asynchronous SMS message delete operation. */
    /* CompleteClass */
    var errorCode: WinRTError = js.native
    
    /** Retrieves the result of the asynchronous SMS message delete operation. */
    /* CompleteClass */
    override def getResults(): Unit = js.native
    
    /** Specifies the ID of the asynchronous SMS message delete operation. */
    /* CompleteClass */
    var id: Double = js.native
    
    /** Specifies the status of the asynchronous SMS message delete operation. */
    /* CompleteClass */
    var status: AsyncStatus = js.native
  }
  
  /** Enables start, track, and end asynchronous SMS message delete operations for multiple messages. */
  @JSGlobal("Windows.Devices.Sms.DeleteSmsMessagesOperation")
  @js.native
  abstract class DeleteSmsMessagesOperation ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Sms.DeleteSmsMessagesOperation {
    
    /** Cancels the asynchronous SMS message delete operations. */
    /* CompleteClass */
    override def cancel(): Unit = js.native
    
    /** Closes the asynchronous SMS message delete operations. */
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /** Specifies whether the asynchronous SMS message delete operations have completed or not. */
    /* CompleteClass */
    override def completed(asyncInfo: IAsyncAction, asyncStatus: AsyncStatus): Unit = js.native
    /** Specifies whether the asynchronous SMS message delete operations have completed or not. */
    /* CompleteClass */
    @JSName("completed")
    var completed_Original: AsyncActionCompletedHandler = js.native
    
    /** Specifies the error code for the asynchronous SMS message delete operations. */
    /* CompleteClass */
    var errorCode: WinRTError = js.native
    
    /** Retrieves the result of the asynchronous message operations. */
    /* CompleteClass */
    override def getResults(): Unit = js.native
    
    /** Specifies the ID of the asynchronous SMS message delete operations. */
    /* CompleteClass */
    var id: Double = js.native
    
    /** Specifies the status of the asynchronous SMS message delete operations. */
    /* CompleteClass */
    var status: AsyncStatus = js.native
  }
  
  /** Retrieves an SmsDevice object asynchronously. */
  @JSGlobal("Windows.Devices.Sms.GetSmsDeviceOperation")
  @js.native
  abstract class GetSmsDeviceOperation ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Sms.GetSmsDeviceOperation {
    
    /** Cancels the asynchronous SmsDevice object retrieval. */
    /* CompleteClass */
    override def cancel(): Unit = js.native
    
    /** Closes the asynchronous SmsDevice object retrieval operation. */
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /** Specifies whether the asynchronous SmsDevice object retrieval operation has completed or not. */
    /* CompleteClass */
    override def completed(
      asyncInfo: IAsyncOperation[typings.winrtUwp.Windows.Devices.Sms.SmsDevice],
      asyncStatus: AsyncStatus
    ): Unit = js.native
    /** Specifies whether the asynchronous SmsDevice object retrieval operation has completed or not. */
    /* CompleteClass */
    @JSName("completed")
    var completed_Original: AsyncOperationCompletedHandler[typings.winrtUwp.Windows.Devices.Sms.SmsDevice] = js.native
    
    /** Specifies the error code for the asynchronous SmsDevice object retrieval operation */
    /* CompleteClass */
    var errorCode: WinRTError = js.native
    
    /**
      * Gets the results of the asynchronous SmsDevice object retrieval operation.
      * @return A reference to an SmsDevice object.
      */
    /* CompleteClass */
    override def getResults(): typings.winrtUwp.Windows.Devices.Sms.SmsDevice = js.native
    
    /** Specifies the ID of the asynchronous SmsDevice object retrieval operation. */
    /* CompleteClass */
    var id: Double = js.native
    
    /** Specifies the status of the asynchronous SmsDevice object retrieval operation. */
    /* CompleteClass */
    var status: AsyncStatus = js.native
  }
  
  /** Supports the retrieval of a message from the SMS message store. */
  @JSGlobal("Windows.Devices.Sms.GetSmsMessageOperation")
  @js.native
  abstract class GetSmsMessageOperation ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Sms.GetSmsMessageOperation {
    
    /** Cancels the asynchronous SMS message retrieval operation. */
    /* CompleteClass */
    override def cancel(): Unit = js.native
    
    /** Closes the asynchronous SMS message retrieval operation. */
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /** A handler for the completed event of an asynchronous SMS message retrieval operation. */
    /* CompleteClass */
    override def completed(asyncInfo: IAsyncOperation[ISmsMessage], asyncStatus: AsyncStatus): Unit = js.native
    /** A handler for the completed event of an asynchronous SMS message retrieval operation. */
    /* CompleteClass */
    @JSName("completed")
    var completed_Original: AsyncOperationCompletedHandler[ISmsMessage] = js.native
    
    /** Specifies the error code for the asynchronous SMS message retrieval operation. */
    /* CompleteClass */
    var errorCode: WinRTError = js.native
    
    /**
      * Retrieves the result of the asynchronous SMS message retrieval operation.
      * @return An interface that accesses the retrieved message.
      */
    /* CompleteClass */
    override def getResults(): ISmsMessage = js.native
    
    /** Specifies the ID of the asynchronous SMS message retrieval operation. */
    /* CompleteClass */
    var id: Double = js.native
    
    /** Specifies the status of the asynchronous SMS message retrieval operation. */
    /* CompleteClass */
    var status: AsyncStatus = js.native
  }
  
  /** Supports the retrieval of messages. */
  @JSGlobal("Windows.Devices.Sms.GetSmsMessagesOperation")
  @js.native
  abstract class GetSmsMessagesOperation ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Sms.GetSmsMessagesOperation {
    
    /** Cancels the asynchronous operations. */
    /* CompleteClass */
    override def cancel(): Unit = js.native
    
    /** Closes the asynchronous operations. */
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /** Specifies whether the asynchronous message retrieval operation has completed or not. */
    /* CompleteClass */
    override def completed(asyncInfo: IAsyncOperationWithProgress[IVectorView[js.Any], Double], asyncStatus: AsyncStatus): Unit = js.native
    /** Specifies whether the asynchronous message retrieval operation has completed or not. */
    /* CompleteClass */
    @JSName("completed")
    var completed_Original: AsyncOperationWithProgressCompletedHandler[IVectorView[js.Any], Double] = js.native
    
    /** Specifies the error code for the asynchronous message operation. */
    /* CompleteClass */
    var errorCode: WinRTError = js.native
    
    /**
      * Retrieves the result of the asynchronous message retrieval operation.
      * @return A reference to the SMS messages retrieved.
      */
    /* CompleteClass */
    override def getResults(): IVectorView[ISmsMessage] = js.native
    
    /** Indicates the ID of the asynchronous message operation. */
    /* CompleteClass */
    var id: Double = js.native
    
    /** Specifies the progress status of the asynchronous message operation. */
    /* CompleteClass */
    override def progress(asyncInfo: IAsyncOperationWithProgress[IVectorView[js.Any], Double], progressInfo: Double): Unit = js.native
    /** Specifies the progress status of the asynchronous message operation. */
    /* CompleteClass */
    @JSName("progress")
    var progress_Original: AsyncOperationProgressHandler[IVectorView[js.Any], Double] = js.native
    
    /** Specifies the status of the asynchronous message operations. */
    /* CompleteClass */
    var status: AsyncStatus = js.native
  }
  
  /** Enables the sending of a message. */
  @JSGlobal("Windows.Devices.Sms.SendSmsMessageOperation")
  @js.native
  abstract class SendSmsMessageOperation ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Sms.SendSmsMessageOperation {
    
    /** Cancels the asynchronous operation. */
    /* CompleteClass */
    override def cancel(): Unit = js.native
    
    /** Closes the asynchronous operation. */
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /** A handler for the completed event of an asynchronous action. */
    /* CompleteClass */
    override def completed(asyncInfo: IAsyncAction, asyncStatus: AsyncStatus): Unit = js.native
    /** A handler for the completed event of an asynchronous action. */
    /* CompleteClass */
    @JSName("completed")
    var completed_Original: AsyncActionCompletedHandler = js.native
    
    /** Specifies the error code for the asynchronous message operation. */
    /* CompleteClass */
    var errorCode: WinRTError = js.native
    
    /** Retrieves the result of the asynchronous operation. */
    /* CompleteClass */
    override def getResults(): Unit = js.native
    
    /** Indicates the ID of the asynchronous message operation. */
    /* CompleteClass */
    var id: Double = js.native
    
    /** Specifies the status of the asynchronous message operation. */
    /* CompleteClass */
    var status: AsyncStatus = js.native
  }
  
  /** The interface for manipulating an SMS Application message. Application messages are those which cannot be characterized as any other message type. */
  @JSGlobal("Windows.Devices.Sms.SmsAppMessage")
  @js.native
  /** Constructor. Used to create an SmsAppMessage prior to sending it. */
  class SmsAppMessage ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Sms.SmsAppMessage {
    
    /** Reads or writes the binary part of the Application message. */
    /* CompleteClass */
    var binaryBody: IBuffer = js.native
    
    /** The plain text body of the message. */
    /* CompleteClass */
    var body: String = js.native
    
    /** The number to be dialed in reply to a received SMS message. */
    /* CompleteClass */
    var callbackNumber: String = js.native
    
    /** The class of the cellular device that received the message. */
    /* CompleteClass */
    var cellularClass: CellularClass = js.native
    
    /** The device ID of the device that received the message. */
    /* CompleteClass */
    var deviceId: String = js.native
    
    /** The encoding used to send the message. */
    /* CompleteClass */
    var encoding: SmsEncoding = js.native
    
    /** The telephone number of the sender of the message. */
    /* CompleteClass */
    var from: String = js.native
    
    /** Indicates whether an SMS delivery status report was sent by the SMSC. */
    /* CompleteClass */
    var isDeliveryNotificationEnabled: Boolean = js.native
    
    /** The message class of the message. */
    /* CompleteClass */
    var messageClass: SmsMessageClass = js.native
    
    /** The message type of the message. */
    /* CompleteClass */
    var messageType: SmsMessageType = js.native
    
    /** The port number of the message. */
    /* CompleteClass */
    var portNumber: Double = js.native
    
    /** The Protocol identifier for the message. */
    /* CompleteClass */
    var protocolId: Double = js.native
    
    /** The retry attempt count for the message. */
    /* CompleteClass */
    var retryAttemptCount: Double = js.native
    
    /** Gets the ICCID (Integrated Circuit Card Identifier) of the SIM that received the message. */
    /* CompleteClass */
    var simIccId: String = js.native
    
    /** The Teleservice identifier for the message. */
    /* CompleteClass */
    var teleserviceId: Double = js.native
    
    /** The timestamp of the message. */
    /* CompleteClass */
    var timestamp: Date = js.native
    
    /** The telephone number of the recipient of this message. */
    /* CompleteClass */
    var to: String = js.native
  }
  
  /** Represents an SMS message in raw PDU format. The data format differs depending on whether the message format (indicated by the value of the Format property) is GSM or CDMA. */
  @JSGlobal("Windows.Devices.Sms.SmsBinaryMessage")
  @js.native
  /** Creates an instance of the SmsBinaryMessage class. */
  class SmsBinaryMessage ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Sms.SmsBinaryMessage {
    
    /** Retrieves the detected protocol description unit (PDU) format of this message. */
    /* CompleteClass */
    var format: SmsDataFormat = js.native
    
    /**
      * Returns the raw buffer of the message in binary protocol description unit (PDU) format as a byte array.
      * @return A byte array representing message data. If there is no message data, the returned array is empty.
      */
    /* CompleteClass */
    override def getData(): js.Array[Double] = js.native
    
    /** Indicates the ID of the asynchronous message operation. */
    /* CompleteClass */
    var id: Double = js.native
    
    /** Returns the message class, as determined by the operator's message network. The two most common classes are None (normal message) or Class0 (special operator message, such as a roaming warning that must be shown immediately to the user). A typical client for end-user messages ignores Class0 messages. */
    /* CompleteClass */
    var messageClass: SmsMessageClass = js.native
    
    /**
      * Specifies the raw binary payload of the SMS message. It should be formatted according to the protocol description unit (PDU) standard.
      * @param value A byte array representing message data. If there is no message data, the returned array is empty.
      */
    /* CompleteClass */
    override def setData(value: js.Array[Double]): Unit = js.native
  }
  
  /** Represents a broadcast SMS message. */
  @JSGlobal("Windows.Devices.Sms.SmsBroadcastMessage")
  @js.native
  abstract class SmsBroadcastMessage ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Sms.SmsBroadcastMessage {
    
    /** Gets the body of the broadcast SMS message. */
    /* CompleteClass */
    var body: String = js.native
    
    /** Gets the type of this broadcast SMS message. */
    /* CompleteClass */
    var broadcastType: SmsBroadcastType = js.native
    
    /** Gets the cellular class of this broadcast message. */
    /* CompleteClass */
    var cellularClass: CellularClass = js.native
    
    /** Gets the channel associated with the broadcast SMS message. */
    /* CompleteClass */
    var channel: Double = js.native
    
    /** Gets the device ID of the device that received the broadcast SMS message. */
    /* CompleteClass */
    var deviceId: String = js.native
    
    /** Gets the geographical scope associated with this broadcast SMS message. */
    /* CompleteClass */
    var geographicalScope: SmsGeographicalScope = js.native
    
    /** True when the broadcast SMS message is an emergency alert. */
    /* CompleteClass */
    var isEmergencyAlert: Boolean = js.native
    
    /** True when a user popup is requested by this broadcast SMS message. */
    /* CompleteClass */
    var isUserPopupRequested: Boolean = js.native
    
    /** Gets the message class associated with this broadcast SMS message. */
    /* CompleteClass */
    var messageClass: SmsMessageClass = js.native
    
    /** Gets a code value associated with this broadcast SMS message. */
    /* CompleteClass */
    var messageCode: Double = js.native
    
    /** Gets the message type of the broadcast SMS message. */
    /* CompleteClass */
    var messageType: SmsMessageType = js.native
    
    /** Gets the ICCID (Integrated Circuit Card Identifier) of the SIM that received the message. */
    /* CompleteClass */
    var simIccId: String = js.native
    
    /** Gets the timestamp of the broadcast SMS message. */
    /* CompleteClass */
    var timestamp: Date = js.native
    
    /** Gets the recipient phone number of the broadcast SMS message. */
    /* CompleteClass */
    var to: String = js.native
    
    /** Gets the update number associated with this broadcast SMS message. */
    /* CompleteClass */
    var updateNumber: Double = js.native
  }
  
  /** Values that describe the type of a broadcast (emergency alert) message. */
  @JSGlobal("Windows.Devices.Sms.SmsBroadcastType")
  @js.native
  object SmsBroadcastType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Sms.SmsBroadcastType & Double] = js.native
    
    /* 4 */ val cmasAmber: typings.winrtUwp.Windows.Devices.Sms.SmsBroadcastType.cmasAmber & Double = js.native
    
    /* 2 */ val cmasExtreme: typings.winrtUwp.Windows.Devices.Sms.SmsBroadcastType.cmasExtreme & Double = js.native
    
    /* 1 */ val cmasPresidential: typings.winrtUwp.Windows.Devices.Sms.SmsBroadcastType.cmasPresidential & Double = js.native
    
    /* 3 */ val cmasSevere: typings.winrtUwp.Windows.Devices.Sms.SmsBroadcastType.cmasSevere & Double = js.native
    
    /* 5 */ val cmasTest: typings.winrtUwp.Windows.Devices.Sms.SmsBroadcastType.cmasTest & Double = js.native
    
    /* 11 */ val etwsEarthquake: typings.winrtUwp.Windows.Devices.Sms.SmsBroadcastType.etwsEarthquake & Double = js.native
    
    /* 12 */ val etwsTsunami: typings.winrtUwp.Windows.Devices.Sms.SmsBroadcastType.etwsTsunami & Double = js.native
    
    /* 13 */ val etwsTsunamiAndEarthquake: typings.winrtUwp.Windows.Devices.Sms.SmsBroadcastType.etwsTsunamiAndEarthquake & Double = js.native
    
    /* 6 */ val euAlert1: typings.winrtUwp.Windows.Devices.Sms.SmsBroadcastType.euAlert1 & Double = js.native
    
    /* 7 */ val euAlert2: typings.winrtUwp.Windows.Devices.Sms.SmsBroadcastType.euAlert2 & Double = js.native
    
    /* 8 */ val euAlert3: typings.winrtUwp.Windows.Devices.Sms.SmsBroadcastType.euAlert3 & Double = js.native
    
    /* 9 */ val euAlertAmber: typings.winrtUwp.Windows.Devices.Sms.SmsBroadcastType.euAlertAmber & Double = js.native
    
    /* 10 */ val euAlertInfo: typings.winrtUwp.Windows.Devices.Sms.SmsBroadcastType.euAlertInfo & Double = js.native
    
    /* 14 */ val latAlertLocal: typings.winrtUwp.Windows.Devices.Sms.SmsBroadcastType.latAlertLocal & Double = js.native
    
    /* 0 */ val other: typings.winrtUwp.Windows.Devices.Sms.SmsBroadcastType.other & Double = js.native
  }
  
  /** This enumerated type identifies the format of a given protocol description unit (PDU) buffer. */
  @JSGlobal("Windows.Devices.Sms.SmsDataFormat")
  @js.native
  object SmsDataFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Sms.SmsDataFormat & Double] = js.native
    
    /* 3 */ val cdmaDeliver: typings.winrtUwp.Windows.Devices.Sms.SmsDataFormat.cdmaDeliver & Double = js.native
    
    /* 1 */ val cdmaSubmit: typings.winrtUwp.Windows.Devices.Sms.SmsDataFormat.cdmaSubmit & Double = js.native
    
    /* 4 */ val gsmDeliver: typings.winrtUwp.Windows.Devices.Sms.SmsDataFormat.gsmDeliver & Double = js.native
    
    /* 2 */ val gsmSubmit: typings.winrtUwp.Windows.Devices.Sms.SmsDataFormat.gsmSubmit & Double = js.native
    
    /* 0 */ val unknown: typings.winrtUwp.Windows.Devices.Sms.SmsDataFormat.unknown & Double = js.native
  }
  
  /** Supports the operation of a mobile broadband SMS device. */
  @JSGlobal("Windows.Devices.Sms.SmsDevice")
  @js.native
  abstract class SmsDevice ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Sms.SmsDevice
  object SmsDevice {
    
    @JSGlobal("Windows.Devices.Sms.SmsDevice")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates an instance of SmsDevice for the device that received the SMS message.
      * @param deviceId A string representation of the DeviceInformation ID of the SMS device that received the SMS message.
      * @return The SMS device operation object.
      */
    /* static member */
    inline def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Sms.SmsDevice] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIdAsync")(deviceId.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Sms.SmsDevice]]
    
    /**
      * Creates an instance of SmsDevice for the specified Mobile Broadband network account ID.
      * @param networkAccountId The Mobile Broadband network account ID to use to select the corresponding mobile broadband device to use for the SMS device
      * @return When this method completes, it returns the SmsDevice for the specified Mobile Broadband network account ID.
      */
    /* static member */
    inline def fromNetworkAccountIdAsync(networkAccountId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Sms.SmsDevice] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNetworkAccountIdAsync")(networkAccountId.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Sms.SmsDevice]]
    
    /**
      * Creates an instance of an SmsDevice object associated with the default SMS device. Because the device might be busy, the operation executes asynchronously. The asynchronous operation object returns immediately.
      * @return A reference to an IAsyncOperation(SmsDevice) object that supports asynchronous SmsDevice object retrieval.
      */
    /* static member */
    inline def getDefaultAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Sms.SmsDevice] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultAsync")().asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Sms.SmsDevice]]
    
    /**
      * Retrieves the class selection string that can be used to enumerate SMS devices.
      * @return A reference to an Advanced Query Syntax (AQS) string that identifies an SMS device.
      */
    /* static member */
    inline def getDeviceSelector(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceSelector")().asInstanceOf[String]
  }
  
  /** Extends the SmsDevice class, and supports the operation of a mobile broadband SMS device. */
  @JSGlobal("Windows.Devices.Sms.SmsDevice2")
  @js.native
  abstract class SmsDevice2 ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Sms.SmsDevice2
  object SmsDevice2 {
    
    @JSGlobal("Windows.Devices.Sms.SmsDevice2")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates an instance of SmsDevice2 for a device that received an SMS message.
      * @param deviceId A string representation of the device ID of the device that received an SMS message.
      * @return An instance of SmsDevice2 initialized for the device with the given ID.
      */
    /* static member */
    inline def fromId(deviceId: String): typings.winrtUwp.Windows.Devices.Sms.SmsDevice2 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromId")(deviceId.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.Devices.Sms.SmsDevice2]
    
    /**
      * Creates an instance of SmsDevice2 for a device, given the device ID of the parent device.
      * @param parentDeviceId The device ID of the parent device.
      * @return An instance of SmsDevice2 initialized for the device with the given parent ID.
      */
    /* static member */
    inline def fromParentId(parentDeviceId: String): typings.winrtUwp.Windows.Devices.Sms.SmsDevice2 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromParentId")(parentDeviceId.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.Devices.Sms.SmsDevice2]
    
    /**
      * Creates an instance of SmsDevice2 associated with the default SMS device.
      * @return An instance of SmsDevice2 initialized for the default SMS device.
      */
    /* static member */
    inline def getDefault(): typings.winrtUwp.Windows.Devices.Sms.SmsDevice2 = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefault")().asInstanceOf[typings.winrtUwp.Windows.Devices.Sms.SmsDevice2]
    
    /**
      * Retrieves the class selection string that can be used to enumerate SMS devices.
      * @return A reference to an Advanced Query Syntax (AQS) string that identifies an SMS device.
      */
    /* static member */
    inline def getDeviceSelector(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceSelector")().asInstanceOf[String]
  }
  
  /** Provides access to the messages stored on an SMS Device and information about the message store. */
  @JSGlobal("Windows.Devices.Sms.SmsDeviceMessageStore")
  @js.native
  abstract class SmsDeviceMessageStore ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Sms.SmsDeviceMessageStore {
    
    /**
      * Deletes the message with the specified ID. Because the device might be busy, the operation executes asynchronously. The asynchronous operation object returns immediately.
      * @param messageId Integer ID of the message to delete, which was previously read from an SmsTextMessage object obtained from the device message store.
      * @return A new message operation object that is used to start and track the asynchronous operation.
      */
    /* CompleteClass */
    override def deleteMessageAsync(messageId: Double): IPromiseWithIAsyncAction = js.native
    
    /**
      * Deletes the messages to which the filter applies. The filter can be used to delete all messages, or only messages that are read, unread, sent, or in a draft state. Because the operation might not be instantaneous, it executes asynchronously. The asynchronous operation object returns immediately.
      * @param messageFilter A search filter that specifies which messages to delete.
      * @return A new message operation object that is used to start and track the asynchronous operation.
      */
    /* CompleteClass */
    override def deleteMessagesAsync(messageFilter: SmsMessageFilter): IPromiseWithIAsyncAction = js.native
    
    /**
      * Retrieves the message with the specified ID. The device might be busy, so the method executes asynchronously. The asynchronous operation object returns immediately.
      * @param messageId ID of the message to retrieve.
      * @return Returns a new message operation object that is used to start and track the asynchronous operation.
      */
    /* CompleteClass */
    override def getMessageAsync(messageId: Double): IPromiseWithIAsyncOperation[ISmsMessage] = js.native
    
    /**
      * Retrieves a list of messages that match the conditions specified in a filter. The messages can be filtered as read, unread, sent, or in the draft state.
      * @param messageFilter ID of the message to retrieve.
      * @return Returns a new message operation object that is used to start and track the asynchronous operation.
      */
    /* CompleteClass */
    override def getMessagesAsync(messageFilter: SmsMessageFilter): IPromiseWithIAsyncOperationWithProgress[IVectorView[js.Any], Double] = js.native
    
    /** Indicates the maximum number of messages that can be stored in the device store. The client can use this value to determine how to maintain enough space in the device store to receive new messages from the network. */
    /* CompleteClass */
    var maxMessages: Double = js.native
  }
  
  /** Contains values that indicate the readiness of an SMS device to engage in cellular network traffic operations. */
  @JSGlobal("Windows.Devices.Sms.SmsDeviceStatus")
  @js.native
  object SmsDeviceStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Sms.SmsDeviceStatus & Double] = js.native
    
    /* 3 */ val badSim: typings.winrtUwp.Windows.Devices.Sms.SmsDeviceStatus.badSim & Double = js.native
    
    /* 7 */ val deviceBlocked: typings.winrtUwp.Windows.Devices.Sms.SmsDeviceStatus.deviceBlocked & Double = js.native
    
    /* 4 */ val deviceFailure: typings.winrtUwp.Windows.Devices.Sms.SmsDeviceStatus.deviceFailure & Double = js.native
    
    /* 6 */ val deviceLocked: typings.winrtUwp.Windows.Devices.Sms.SmsDeviceStatus.deviceLocked & Double = js.native
    
    /* 0 */ val off: typings.winrtUwp.Windows.Devices.Sms.SmsDeviceStatus.off & Double = js.native
    
    /* 1 */ val ready: typings.winrtUwp.Windows.Devices.Sms.SmsDeviceStatus.ready & Double = js.native
    
    /* 2 */ val simNotInserted: typings.winrtUwp.Windows.Devices.Sms.SmsDeviceStatus.simNotInserted & Double = js.native
    
    /* 5 */ val subscriptionNotActivated: typings.winrtUwp.Windows.Devices.Sms.SmsDeviceStatus.subscriptionNotActivated & Double = js.native
  }
  
  /** This enumerated type is used to determine the encoding algorithm to send or calculate the length of an SmsTextMessage object. */
  @JSGlobal("Windows.Devices.Sms.SmsEncoding")
  @js.native
  object SmsEncoding extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Sms.SmsEncoding & Double] = js.native
    
    /* 5 */ val eightBit: typings.winrtUwp.Windows.Devices.Sms.SmsEncoding.eightBit & Double = js.native
    
    /* 4 */ val gsmSevenBit: typings.winrtUwp.Windows.Devices.Sms.SmsEncoding.gsmSevenBit & Double = js.native
    
    /* 8 */ val ia5: typings.winrtUwp.Windows.Devices.Sms.SmsEncoding.ia5 & Double = js.native
    
    /* 7 */ val korean: typings.winrtUwp.Windows.Devices.Sms.SmsEncoding.korean & Double = js.native
    
    /* 6 */ val latin: typings.winrtUwp.Windows.Devices.Sms.SmsEncoding.latin & Double = js.native
    
    /* 10 */ val latinHebrew: typings.winrtUwp.Windows.Devices.Sms.SmsEncoding.latinHebrew & Double = js.native
    
    /* 1 */ val optimal: typings.winrtUwp.Windows.Devices.Sms.SmsEncoding.optimal & Double = js.native
    
    /* 2 */ val sevenBitAscii: typings.winrtUwp.Windows.Devices.Sms.SmsEncoding.sevenBitAscii & Double = js.native
    
    /* 9 */ val shiftJis: typings.winrtUwp.Windows.Devices.Sms.SmsEncoding.shiftJis & Double = js.native
    
    /* 3 */ val unicode: typings.winrtUwp.Windows.Devices.Sms.SmsEncoding.unicode & Double = js.native
    
    /* 0 */ val unknown: typings.winrtUwp.Windows.Devices.Sms.SmsEncoding.unknown & Double = js.native
  }
  
  /** Values that describe the action to be taken on a message filter. */
  @JSGlobal("Windows.Devices.Sms.SmsFilterActionType")
  @js.native
  object SmsFilterActionType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Sms.SmsFilterActionType & Double] = js.native
    
    /* 3 */ val accept: typings.winrtUwp.Windows.Devices.Sms.SmsFilterActionType.accept & Double = js.native
    
    /* 0 */ val acceptImmediately: typings.winrtUwp.Windows.Devices.Sms.SmsFilterActionType.acceptImmediately & Double = js.native
    
    /* 1 */ val drop: typings.winrtUwp.Windows.Devices.Sms.SmsFilterActionType.drop & Double = js.native
    
    /* 2 */ val peek: typings.winrtUwp.Windows.Devices.Sms.SmsFilterActionType.peek & Double = js.native
  }
  
  /** Describes an SMS filtering rule. */
  @JSGlobal("Windows.Devices.Sms.SmsFilterRule")
  @js.native
  class SmsFilterRule protected ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Sms.SmsFilterRule {
    /**
      * Creates a new, empty SmsFilterRule .
      * @param messageType An enumeration value specifying the message type that will match this rule.
      */
    def this(messageType: SmsMessageType) = this()
    
    /** A list of broadcast channels that match this rule. */
    /* CompleteClass */
    var broadcastChannels: IVector[Double] = js.native
    
    /** Gets a list of broadcast types for an SMS message that matches this rule. */
    /* CompleteClass */
    var broadcastTypes: IVector[SmsBroadcastType] = js.native
    
    /** The cellular class identifier for SMS messages that match this rule. */
    /* CompleteClass */
    var cellularClass: CellularClass = js.native
    
    /** Gets a list of device identifiers for an SMS message that matches this rule. */
    /* CompleteClass */
    var deviceIds: IVector[String] = js.native
    
    /** Gets the IMSI prefixes for an SMS message that matches this rule. */
    /* CompleteClass */
    var imsiPrefixes: IVector[String] = js.native
    
    /** Gets the message type of an SMS message that matches this filter rule. */
    /* CompleteClass */
    var messageType: SmsMessageType = js.native
    
    /** Gets a list of port numbers associated with the SMS message that matches this rule. */
    /* CompleteClass */
    var portNumbers: IVector[Double] = js.native
    
    /** Gets a list of protocol identifiers associated with the SMS message that matches this rule.. */
    /* CompleteClass */
    var protocolIds: IVector[Double] = js.native
    
    /** Gets the sender numbers associated with an SMS message that matches this rule. */
    /* CompleteClass */
    var senderNumbers: IVector[String] = js.native
    
    /** Gets the list of teleservice identifiers for an SMS message that matches this rule. */
    /* CompleteClass */
    var teleserviceIds: IVector[Double] = js.native
    
    /** Gets a list of the text message prefixes for an SMS message that matches this filter. */
    /* CompleteClass */
    var textMessagePrefixes: IVector[String] = js.native
    
    /** Gets a list of WAP application identifiers for the SMS message that matches this rule. */
    /* CompleteClass */
    var wapApplicationIds: IVector[String] = js.native
    
    /** Gets a list of WAP content types for the SMS message that matches this rule. */
    /* CompleteClass */
    var wapContentTypes: IVector[String] = js.native
  }
  
  /** A collection of SmsFilterRule instances. */
  @JSGlobal("Windows.Devices.Sms.SmsFilterRules")
  @js.native
  class SmsFilterRules protected ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Sms.SmsFilterRules {
    /**
      * Creates an instance of SmsFilterRules .
      * @param actionType An enumeration value that specifies which action type is to be associated with the rules for this instance. Action type determines the order in which rules are evaluated, as well as the action to be taken when a rule is matched.
      */
    def this(actionType: SmsFilterActionType) = this()
    
    /** The SmsFilterActionType for this set of filter rules. */
    /* CompleteClass */
    var actionType: SmsFilterActionType = js.native
    
    /** Gets the list of rules in this SmsFilterRules instance. */
    /* CompleteClass */
    var rules: IVector[typings.winrtUwp.Windows.Devices.Sms.SmsFilterRule] = js.native
  }
  
  /** Values that describe the geographical scope of a cell broadcast message. */
  @JSGlobal("Windows.Devices.Sms.SmsGeographicalScope")
  @js.native
  object SmsGeographicalScope extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Sms.SmsGeographicalScope & Double] = js.native
    
    /* 4 */ val cell: typings.winrtUwp.Windows.Devices.Sms.SmsGeographicalScope.cell & Double = js.native
    
    /* 1 */ val cellWithImmediateDisplay: typings.winrtUwp.Windows.Devices.Sms.SmsGeographicalScope.cellWithImmediateDisplay & Double = js.native
    
    /* 2 */ val locationArea: typings.winrtUwp.Windows.Devices.Sms.SmsGeographicalScope.locationArea & Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Devices.Sms.SmsGeographicalScope.none & Double = js.native
    
    /* 3 */ val plmn: typings.winrtUwp.Windows.Devices.Sms.SmsGeographicalScope.plmn & Double = js.native
  }
  
  /** This enumerated type specifies the message class of a message. The message class typically originates on the network, not the mobile device. */
  @JSGlobal("Windows.Devices.Sms.SmsMessageClass")
  @js.native
  object SmsMessageClass extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Sms.SmsMessageClass & Double] = js.native
    
    /* 1 */ val class0: typings.winrtUwp.Windows.Devices.Sms.SmsMessageClass.class0 & Double = js.native
    
    /* 2 */ val class1: typings.winrtUwp.Windows.Devices.Sms.SmsMessageClass.class1 & Double = js.native
    
    /* 3 */ val class2: typings.winrtUwp.Windows.Devices.Sms.SmsMessageClass.class2 & Double = js.native
    
    /* 4 */ val class3: typings.winrtUwp.Windows.Devices.Sms.SmsMessageClass.class3 & Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Devices.Sms.SmsMessageClass.none & Double = js.native
  }
  
  /** This enumerated type specifies which messages in the device message store an operation is performed on. */
  @JSGlobal("Windows.Devices.Sms.SmsMessageFilter")
  @js.native
  object SmsMessageFilter extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Sms.SmsMessageFilter & Double] = js.native
    
    /* 0 */ val all: typings.winrtUwp.Windows.Devices.Sms.SmsMessageFilter.all & Double = js.native
    
    /* 4 */ val draft: typings.winrtUwp.Windows.Devices.Sms.SmsMessageFilter.draft & Double = js.native
    
    /* 2 */ val read: typings.winrtUwp.Windows.Devices.Sms.SmsMessageFilter.read & Double = js.native
    
    /* 3 */ val sent: typings.winrtUwp.Windows.Devices.Sms.SmsMessageFilter.sent & Double = js.native
    
    /* 1 */ val unread: typings.winrtUwp.Windows.Devices.Sms.SmsMessageFilter.unread & Double = js.native
  }
  
  /** Provides data for ISmsBinaryMessage event handlers. */
  @JSGlobal("Windows.Devices.Sms.SmsMessageReceivedEventArgs")
  @js.native
  abstract class SmsMessageReceivedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Sms.SmsMessageReceivedEventArgs {
    
    /** Retrieves an object that holds the binary representation of the message. This is of interest only to clients who want to pass binary messages on directly or do their own interpretation of the binary message contents. */
    /* CompleteClass */
    var binaryMessage: typings.winrtUwp.Windows.Devices.Sms.SmsBinaryMessage = js.native
    
    /** Retrieves an object that holds the text representation of the message. If the message is not successfully decoded, an error is returned. */
    /* CompleteClass */
    var textMessage: typings.winrtUwp.Windows.Devices.Sms.SmsTextMessage = js.native
  }
  
  /** Contains event details for the event raised when an SMS message is received. */
  @JSGlobal("Windows.Devices.Sms.SmsMessageReceivedTriggerDetails")
  @js.native
  abstract class SmsMessageReceivedTriggerDetails ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Sms.SmsMessageReceivedTriggerDetails {
    
    /** Delivers the filtered message to the messaging app. */
    /* CompleteClass */
    override def accept(): Unit = js.native
    
    /** When MessageType is App, the message details for the message. */
    /* CompleteClass */
    var appMessage: typings.winrtUwp.Windows.Devices.Sms.SmsAppMessage = js.native
    
    /** When MessageType is Broadcast, the message details for the message. */
    /* CompleteClass */
    var broadcastMessage: typings.winrtUwp.Windows.Devices.Sms.SmsBroadcastMessage = js.native
    
    /** Drops the filtered message, so that it is not passed on to the messaging app. */
    /* CompleteClass */
    override def drop(): Unit = js.native
    
    /** The SmsMessageType of the received message. */
    /* CompleteClass */
    var messageType: SmsMessageType = js.native
    
    /** When MessageType is Status, the message details for the message. */
    /* CompleteClass */
    var statusMessage: typings.winrtUwp.Windows.Devices.Sms.SmsStatusMessage = js.native
    
    /** When MessageType is Text, the message details for the message. */
    /* CompleteClass */
    var textMessage: typings.winrtUwp.Windows.Devices.Sms.SmsTextMessage2 = js.native
    
    /** When MessageType is Voicemail, the message details for the message. */
    /* CompleteClass */
    var voicemailMessage: typings.winrtUwp.Windows.Devices.Sms.SmsVoicemailMessage = js.native
    
    /** When MessageType is Wap, the message details for the message. */
    /* CompleteClass */
    var wapMessage: typings.winrtUwp.Windows.Devices.Sms.SmsWapMessage = js.native
  }
  
  /** Class used to represent registered message filters. */
  @JSGlobal("Windows.Devices.Sms.SmsMessageRegistration")
  @js.native
  abstract class SmsMessageRegistration ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Sms.SmsMessageRegistration
  object SmsMessageRegistration {
    
    @JSGlobal("Windows.Devices.Sms.SmsMessageRegistration")
    @js.native
    val ^ : js.Any = js.native
    
    /** Static property that gets a list of currently registered message filters.. */
    /* static member */
    @JSGlobal("Windows.Devices.Sms.SmsMessageRegistration.allRegistrations")
    @js.native
    def allRegistrations: IVectorView[typings.winrtUwp.Windows.Devices.Sms.SmsMessageRegistration] = js.native
    inline def allRegistrations_=(x: IVectorView[typings.winrtUwp.Windows.Devices.Sms.SmsMessageRegistration]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allRegistrations")(x.asInstanceOf[js.Any])
    
    /**
      * Registers a message filter.
      * @param id Identifier used to describe this message filter.
      * @param filterRules An object that represents the filter rules to be used for this registered message filter.
      * @return On successful completion, the SmsMessageRegistration object that represents this registered message filter.
      */
    /* static member */
    inline def register(id: String, filterRules: typings.winrtUwp.Windows.Devices.Sms.SmsFilterRules): typings.winrtUwp.Windows.Devices.Sms.SmsMessageRegistration = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(id.asInstanceOf[js.Any], filterRules.asInstanceOf[js.Any])).asInstanceOf[typings.winrtUwp.Windows.Devices.Sms.SmsMessageRegistration]
  }
  
  /** This enumerated type defines the format of the SMS message. */
  @JSGlobal("Windows.Devices.Sms.SmsMessageType")
  @js.native
  object SmsMessageType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Sms.SmsMessageType & Double] = js.native
    
    /* 3 */ val app: typings.winrtUwp.Windows.Devices.Sms.SmsMessageType.app & Double = js.native
    
    /* 0 */ val binary: typings.winrtUwp.Windows.Devices.Sms.SmsMessageType.binary & Double = js.native
    
    /* 4 */ val broadcast: typings.winrtUwp.Windows.Devices.Sms.SmsMessageType.broadcast & Double = js.native
    
    /* 6 */ val status: typings.winrtUwp.Windows.Devices.Sms.SmsMessageType.status & Double = js.native
    
    /* 1 */ val text: typings.winrtUwp.Windows.Devices.Sms.SmsMessageType.text & Double = js.native
    
    /* 5 */ val voicemail: typings.winrtUwp.Windows.Devices.Sms.SmsMessageType.voicemail & Double = js.native
    
    /* 2 */ val wap: typings.winrtUwp.Windows.Devices.Sms.SmsMessageType.wap & Double = js.native
  }
  
  /** Values that describe error codes from the SMS modem in an SmsSendMessageResult. */
  @JSGlobal("Windows.Devices.Sms.SmsModemErrorCode")
  @js.native
  object SmsModemErrorCode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Sms.SmsModemErrorCode & Double] = js.native
    
    /* 4 */ val deviceFailure: typings.winrtUwp.Windows.Devices.Sms.SmsModemErrorCode.deviceFailure & Double = js.native
    
    /* 7 */ val deviceNotReady: typings.winrtUwp.Windows.Devices.Sms.SmsModemErrorCode.deviceNotReady & Double = js.native
    
    /* 11 */ val fixedDialingNumberRestricted: typings.winrtUwp.Windows.Devices.Sms.SmsModemErrorCode.fixedDialingNumberRestricted & Double = js.native
    
    /* 9 */ val invalidSmscAddress: typings.winrtUwp.Windows.Devices.Sms.SmsModemErrorCode.invalidSmscAddress & Double = js.native
    
    /* 5 */ val messageNotEncodedProperly: typings.winrtUwp.Windows.Devices.Sms.SmsModemErrorCode.messageNotEncodedProperly & Double = js.native
    
    /* 6 */ val messageTooLarge: typings.winrtUwp.Windows.Devices.Sms.SmsModemErrorCode.messageTooLarge & Double = js.native
    
    /* 1 */ val messagingNetworkError: typings.winrtUwp.Windows.Devices.Sms.SmsModemErrorCode.messagingNetworkError & Double = js.native
    
    /* 10 */ val networkFailure: typings.winrtUwp.Windows.Devices.Sms.SmsModemErrorCode.networkFailure & Double = js.native
    
    /* 8 */ val networkNotReady: typings.winrtUwp.Windows.Devices.Sms.SmsModemErrorCode.networkNotReady & Double = js.native
    
    /* 0 */ val other: typings.winrtUwp.Windows.Devices.Sms.SmsModemErrorCode.other & Double = js.native
    
    /* 2 */ val smsOperationNotSupportedByDevice: typings.winrtUwp.Windows.Devices.Sms.SmsModemErrorCode.smsOperationNotSupportedByDevice & Double = js.native
    
    /* 3 */ val smsServiceNotSupportedByNetwork: typings.winrtUwp.Windows.Devices.Sms.SmsModemErrorCode.smsServiceNotSupportedByNetwork & Double = js.native
  }
  
  /** Presents the details of SMS message events to the background work item that handles messages while your app is suspended. */
  @JSGlobal("Windows.Devices.Sms.SmsReceivedEventDetails")
  @js.native
  abstract class SmsReceivedEventDetails ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Sms.SmsReceivedEventDetails {
    
    /** Gets the binary message object for the SMS message received by the background task. */
    /* CompleteClass */
    var binaryMessage: typings.winrtUwp.Windows.Devices.Sms.SmsBinaryMessage = js.native
    
    /** Returns the DeviceInformation ID of the network interface that received the SMS message. This ID can be passed to SmsDevice.FromIdAsync to activate the device and retrieve additional message details. */
    /* CompleteClass */
    var deviceId: String = js.native
    
    /** Gets the message class for the SMS message received by the background task. */
    /* CompleteClass */
    var messageClass: SmsMessageClass = js.native
    
    /** Returns the index of the new message that raised the event. You can pass this to SmsDevice.GetMessageAsync to retrieve the new message itself. */
    /* CompleteClass */
    var messageIndex: Double = js.native
  }
  
  /** Encapsulates the results of calling SmsDevice2.SendMessageAndGetResultAsync . */
  @JSGlobal("Windows.Devices.Sms.SmsSendMessageResult")
  @js.native
  abstract class SmsSendMessageResult ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Sms.SmsSendMessageResult {
    
    /** Gets the cellular class used in the send operation. */
    /* CompleteClass */
    var cellularClass: CellularClass = js.native
    
    /** Gets a boolean value indicating whether the send operation has encountered a transient error. */
    /* CompleteClass */
    var isErrorTransient: Boolean = js.native
    
    /** Gets a value indicating whether the send operation was successful. */
    /* CompleteClass */
    var isSuccessful: Boolean = js.native
    
    /** Gets a list of message numbers sent. */
    /* CompleteClass */
    var messageReferenceNumbers: IVectorView[Double] = js.native
    
    /** Gets the error code for a modem error associated with the send operation. */
    /* CompleteClass */
    var modemErrorCode: SmsModemErrorCode = js.native
    
    /** Gets the error code for a network error associated with the send operation. */
    /* CompleteClass */
    var networkCauseCode: Double = js.native
    
    /** Gets the error code for a transport failure associated with the send operation. */
    /* CompleteClass */
    var transportFailureCause: Double = js.native
  }
  
  /** Encapsulates an SMS status message. */
  @JSGlobal("Windows.Devices.Sms.SmsStatusMessage")
  @js.native
  abstract class SmsStatusMessage ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Sms.SmsStatusMessage {
    
    /** Gets the body of the status message. */
    /* CompleteClass */
    var body: String = js.native
    
    /** Gets the cellular class of the message. */
    /* CompleteClass */
    var cellularClass: CellularClass = js.native
    
    /** Gets the device identifier associated with the status message. */
    /* CompleteClass */
    var deviceId: String = js.native
    
    /** The discharge time of the status message. */
    /* CompleteClass */
    var dischargeTime: Date = js.native
    
    /** Gets the phone number that sent the status message. */
    /* CompleteClass */
    var from: String = js.native
    
    /** Gets the message class of the status message. */
    /* CompleteClass */
    var messageClass: SmsMessageClass = js.native
    
    /** Gets the reference number of the status message. */
    /* CompleteClass */
    var messageReferenceNumber: Double = js.native
    
    /** Gets the message type of the status message. */
    /* CompleteClass */
    var messageType: SmsMessageType = js.native
    
    /** Gets the service center timestamp of the status message. */
    /* CompleteClass */
    var serviceCenterTimestamp: Date = js.native
    
    /** Gets the ICCID (Integrated Circuit Card Identifier) of the SIM that received the message. */
    /* CompleteClass */
    var simIccId: String = js.native
    
    /** The status code associated with this message. */
    /* CompleteClass */
    var status: Double = js.native
    
    /** Gets the phone number the status message was sent to. */
    /* CompleteClass */
    var to: String = js.native
  }
  
  /** Manages a decoded SMS text message, providing direct access to the plain text body of the message, as well as key header properties, such as time stamp. */
  @JSGlobal("Windows.Devices.Sms.SmsTextMessage")
  @js.native
  /** Creates an instance of the SmsTextMessage class. */
  class SmsTextMessage ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Sms.SmsTextMessage {
    
    /** Specifies the plain text body of the message. */
    /* CompleteClass */
    var body: String = js.native
    
    /** Specifies the encoding type that has been set to use when sending this message. */
    /* CompleteClass */
    var encoding: SmsEncoding = js.native
    
    /** Specifies the phone number of the sender of the message. */
    /* CompleteClass */
    var from: String = js.native
    
    /** Indicates the ID of the SMS text message. */
    /* CompleteClass */
    var id: Double = js.native
    
    /** Specifies the message class of a message. This message class typically originates on the network, not the mobile device. */
    /* CompleteClass */
    var messageClass: SmsMessageClass = js.native
    
    /** Indicates the total number of parts in the original message if the message is part of a multi-part message. */
    /* CompleteClass */
    var partCount: Double = js.native
    
    /** Indicates the part number of a multi-part message if this message is part of a multi-part message. It can be used to reconstruct the original message by joining the parts together, in conjunction with the PartReferenceId and PartCount properties. */
    /* CompleteClass */
    var partNumber: Double = js.native
    
    /** Indicates a reference value that can be used if the message is part of a multi-part message. If this message belongs to a multi-part message, the PartNumber value can be used to reconstruct the full original message, and each part of that message will have the same value for PartReferenceId. */
    /* CompleteClass */
    var partReferenceId: Double = js.native
    
    /** Indicates the timestamp of the message. It is determined locally for a constructed message instance or from the service center timestamp of a received message. */
    /* CompleteClass */
    var timestamp: Date = js.native
    
    /** Indicates the recipient phone number of this message. */
    /* CompleteClass */
    var to: String = js.native
    
    /**
      * Reads a message in the specified format and places the results in a new instance of a binary message.
      * @param format A value from the SmsDataFormat enumeration.
      * @return The new binary message that holds the result of this method call.
      */
    /* CompleteClass */
    override def toBinaryMessages(format: SmsDataFormat): IVectorView[ISmsBinaryMessage] = js.native
  }
  object SmsTextMessage {
    
    @JSGlobal("Windows.Devices.Sms.SmsTextMessage")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Decodes a binary message and places the results in a new instance of a text message. This method represents the binary message as a reference to a buffer of bytes and a selection of how the buffer is encoded. Therefore, it can be used when the message did not originate directly from the device or as an instance of an SmsBinaryMessage class.
      * @param format An SmsDataFormat enumerated value that identifies the format of a particular protocol description unit (PDU) buffer.
      * @param value An array of bytes containing the binary data to decode.
      * @return A new SmsTextMessage object if the decoding was successful.
      */
    /* static member */
    inline def fromBinaryData(format: SmsDataFormat, value: js.Array[Double]): typings.winrtUwp.Windows.Devices.Sms.SmsTextMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinaryData")(format.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.winrtUwp.Windows.Devices.Sms.SmsTextMessage]
    
    /**
      * Reads a binary message and decodes it. The results are placed in a new instance of a text message.
      * @param binaryMessage An instance of a binary message to decode.
      * @return A new SmsTextMessage object.
      */
    /* static member */
    inline def fromBinaryMessage(binaryMessage: typings.winrtUwp.Windows.Devices.Sms.SmsBinaryMessage): typings.winrtUwp.Windows.Devices.Sms.SmsTextMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBinaryMessage")(binaryMessage.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.Devices.Sms.SmsTextMessage]
  }
  
  /** Encapsulates a decoded SMS text message. Prefer this class to the older SmsTextMessage class. */
  @JSGlobal("Windows.Devices.Sms.SmsTextMessage2")
  @js.native
  /** Constructs a new, default instance of this class. */
  class SmsTextMessage2 ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Sms.SmsTextMessage2 {
    
    /** Gets or sets the body of the text message. */
    /* CompleteClass */
    var body: String = js.native
    
    /** Gets or sets the callback number for the message. */
    /* CompleteClass */
    var callbackNumber: String = js.native
    
    /** Gets the cellular class of the message. */
    /* CompleteClass */
    var cellularClass: CellularClass = js.native
    
    /** Gets the device identifier for the device associated with the SMS text message. */
    /* CompleteClass */
    var deviceId: String = js.native
    
    /** Gets or sets the encoding scheme used for the message. */
    /* CompleteClass */
    var encoding: SmsEncoding = js.native
    
    /** gets the phone number of the sender of the message. */
    /* CompleteClass */
    var from: String = js.native
    
    /** Gets or sets whether text message delivery notification is enabled for this message. */
    /* CompleteClass */
    var isDeliveryNotificationEnabled: Boolean = js.native
    
    /** Gets the message class of the message. */
    /* CompleteClass */
    var messageClass: SmsMessageClass = js.native
    
    /** Gets the message type of the message. */
    /* CompleteClass */
    var messageType: SmsMessageType = js.native
    
    /** Gets the protocol identifier for the message. */
    /* CompleteClass */
    var protocolId: Double = js.native
    
    /** Gets or sets the number of retry attempts for the message. */
    /* CompleteClass */
    var retryAttemptCount: Double = js.native
    
    /** Gets the ICCID (Integrated Circuit Card Identifier) of the SIM that received the message. */
    /* CompleteClass */
    var simIccId: String = js.native
    
    /** Gets the teleservice identifier associated with this message. */
    /* CompleteClass */
    var teleserviceId: Double = js.native
    
    /** The timestamp of this message. */
    /* CompleteClass */
    var timestamp: Date = js.native
    
    /** Gets or sets the recipient phone number for the message. */
    /* CompleteClass */
    var to: String = js.native
  }
  
  /** Encapsulates an SMS voicemail message. */
  @JSGlobal("Windows.Devices.Sms.SmsVoicemailMessage")
  @js.native
  abstract class SmsVoicemailMessage ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Sms.SmsVoicemailMessage {
    
    /** Gets the body of the voicemail message. */
    /* CompleteClass */
    var body: String = js.native
    
    /** Gets the cellular class of the message. */
    /* CompleteClass */
    var cellularClass: CellularClass = js.native
    
    /** Gets the unique device identifier associated with the message. */
    /* CompleteClass */
    var deviceId: String = js.native
    
    /** Gets the message class of the message. */
    /* CompleteClass */
    var messageClass: SmsMessageClass = js.native
    
    /** Gets the number of available messages. */
    /* CompleteClass */
    var messageCount: Double = js.native
    
    /** Gets the type of the message. */
    /* CompleteClass */
    var messageType: SmsMessageType = js.native
    
    /** Gets the ICCID (Integrated Circuit Card Identifier) of the SIM that received the message. */
    /* CompleteClass */
    var simIccId: String = js.native
    
    /** The timestamp of the message. */
    /* CompleteClass */
    var timestamp: Date = js.native
    
    /** The phone number the message was sent to. */
    /* CompleteClass */
    var to: String = js.native
  }
  
  /** Represents an SMS WAP push message. */
  @JSGlobal("Windows.Devices.Sms.SmsWapMessage")
  @js.native
  abstract class SmsWapMessage ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Sms.SmsWapMessage {
    
    /** Gets the value of the X-Wap-Application-Id header of the SmsWapMessage . */
    /* CompleteClass */
    var applicationId: String = js.native
    
    /** Gets the binary body of the blob in the SmsWapMessage . */
    /* CompleteClass */
    var binaryBody: IBuffer = js.native
    
    /** Gets the cellular class of the SMS device that received the message. */
    /* CompleteClass */
    var cellularClass: CellularClass = js.native
    
    /** Gets the value of the Content-Type header in the SmsWapMessage . Parameters are presents in the Headers property. */
    /* CompleteClass */
    var contentType: String = js.native
    
    /** Gets the device information ID of the SmsDevice that receives the SmsWapMessage . */
    /* CompleteClass */
    var deviceId: String = js.native
    
    /** Gets the phone number of the sender of the SmsWapMessage . */
    /* CompleteClass */
    var from: String = js.native
    
    /** Gets the header name-value pairs of the WAP push message. */
    /* CompleteClass */
    var headers: IMap[String, String] = js.native
    
    /** Gets the message class of the SmsWapMessage . */
    /* CompleteClass */
    var messageClass: SmsMessageClass = js.native
    
    /** Gets the message type of the SmsWapMessage . */
    /* CompleteClass */
    var messageType: SmsMessageType = js.native
    
    /** Gets the ICCID (Integrated Circuit Card Identifier) of the SIM that received the message. */
    /* CompleteClass */
    var simIccId: String = js.native
    
    /** Gets the timestamp of the SmsWapMessage . */
    /* CompleteClass */
    var timestamp: Date = js.native
    
    /** Gets the recipient phone number of this SmsWapMessage . */
    /* CompleteClass */
    var to: String = js.native
  }
}
