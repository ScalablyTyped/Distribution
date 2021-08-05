package typings.winrt.global.Windows.Devices

import typings.std.Date
import typings.std.Uint8Array
import typings.winrt.Windows.Devices.Sms.CellularClass
import typings.winrt.Windows.Devices.Sms.ISmsBinaryMessage
import typings.winrt.Windows.Devices.Sms.ISmsMessage
import typings.winrt.Windows.Devices.Sms.SmsDataFormat
import typings.winrt.Windows.Devices.Sms.SmsDeviceStatus
import typings.winrt.Windows.Devices.Sms.SmsEncodedLength
import typings.winrt.Windows.Devices.Sms.SmsEncoding
import typings.winrt.Windows.Devices.Sms.SmsMessageClass
import typings.winrt.Windows.Devices.Sms.SmsMessageFilter
import typings.winrt.Windows.Foundation.AsyncStatus
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.IAsyncOperationWithProgress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Sms {
  
  @JSGlobal("Windows.Devices.Sms.CellularClass")
  @js.native
  object CellularClass extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Devices.Sms.CellularClass & Double] = js.native
    
    /* 2 */ val cdma: typings.winrt.Windows.Devices.Sms.CellularClass.cdma & Double = js.native
    
    /* 1 */ val gsm: typings.winrt.Windows.Devices.Sms.CellularClass.gsm & Double = js.native
    
    /* 0 */ val none: typings.winrt.Windows.Devices.Sms.CellularClass.none & Double = js.native
  }
  
  @JSGlobal("Windows.Devices.Sms.DeleteSmsMessageOperation")
  @js.native
  class DeleteSmsMessageOperation ()
    extends StObject
       with typings.winrt.Windows.Devices.Sms.DeleteSmsMessageOperation {
    
    /* CompleteClass */
    override def cancel(): Unit = js.native
    
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /* CompleteClass */
    var errorCode: Double = js.native
    
    /* CompleteClass */
    var id: Double = js.native
    
    /* CompleteClass */
    var status: AsyncStatus = js.native
  }
  
  @JSGlobal("Windows.Devices.Sms.DeleteSmsMessagesOperation")
  @js.native
  class DeleteSmsMessagesOperation ()
    extends StObject
       with typings.winrt.Windows.Devices.Sms.DeleteSmsMessagesOperation {
    
    /* CompleteClass */
    override def cancel(): Unit = js.native
    
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /* CompleteClass */
    var errorCode: Double = js.native
    
    /* CompleteClass */
    var id: Double = js.native
    
    /* CompleteClass */
    var status: AsyncStatus = js.native
  }
  
  @JSGlobal("Windows.Devices.Sms.GetSmsDeviceOperation")
  @js.native
  class GetSmsDeviceOperation ()
    extends StObject
       with typings.winrt.Windows.Devices.Sms.GetSmsDeviceOperation {
    
    /* InferMemberOverrides */
    override def cancel(): Unit = js.native
    
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /* CompleteClass */
    var errorCode: Double = js.native
    
    /* CompleteClass */
    var id: Double = js.native
    
    /* CompleteClass */
    var status: AsyncStatus = js.native
  }
  
  @JSGlobal("Windows.Devices.Sms.GetSmsMessageOperation")
  @js.native
  class GetSmsMessageOperation ()
    extends StObject
       with typings.winrt.Windows.Devices.Sms.GetSmsMessageOperation {
    
    /* InferMemberOverrides */
    override def cancel(): Unit = js.native
    
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /* CompleteClass */
    var errorCode: Double = js.native
    
    /* CompleteClass */
    var id: Double = js.native
    
    /* CompleteClass */
    var status: AsyncStatus = js.native
  }
  
  @JSGlobal("Windows.Devices.Sms.GetSmsMessagesOperation")
  @js.native
  class GetSmsMessagesOperation ()
    extends StObject
       with typings.winrt.Windows.Devices.Sms.GetSmsMessagesOperation {
    
    /* InferMemberOverrides */
    override def cancel(): Unit = js.native
    
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /* CompleteClass */
    var errorCode: Double = js.native
    
    /* CompleteClass */
    var id: Double = js.native
    
    /* CompleteClass */
    var status: AsyncStatus = js.native
  }
  
  @JSGlobal("Windows.Devices.Sms.SendSmsMessageOperation")
  @js.native
  class SendSmsMessageOperation ()
    extends StObject
       with typings.winrt.Windows.Devices.Sms.SendSmsMessageOperation {
    
    /* CompleteClass */
    override def cancel(): Unit = js.native
    
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /* CompleteClass */
    var errorCode: Double = js.native
    
    /* CompleteClass */
    var id: Double = js.native
    
    /* CompleteClass */
    var status: AsyncStatus = js.native
  }
  
  @JSGlobal("Windows.Devices.Sms.SmsBinaryMessage")
  @js.native
  class SmsBinaryMessage ()
    extends StObject
       with typings.winrt.Windows.Devices.Sms.SmsBinaryMessage {
    
    /* CompleteClass */
    var format: SmsDataFormat = js.native
    
    /* CompleteClass */
    override def getData(): Uint8Array = js.native
    
    /* CompleteClass */
    var id: Double = js.native
    
    /* CompleteClass */
    var messageClass: SmsMessageClass = js.native
    
    /* CompleteClass */
    override def setData(value: Uint8Array): Unit = js.native
  }
  
  @JSGlobal("Windows.Devices.Sms.SmsDataFormat")
  @js.native
  object SmsDataFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Devices.Sms.SmsDataFormat & Double] = js.native
    
    /* 3 */ val cdmaDeliver: typings.winrt.Windows.Devices.Sms.SmsDataFormat.cdmaDeliver & Double = js.native
    
    /* 1 */ val cdmaSubmit: typings.winrt.Windows.Devices.Sms.SmsDataFormat.cdmaSubmit & Double = js.native
    
    /* 4 */ val gsmDeliver: typings.winrt.Windows.Devices.Sms.SmsDataFormat.gsmDeliver & Double = js.native
    
    /* 2 */ val gsmSubmit: typings.winrt.Windows.Devices.Sms.SmsDataFormat.gsmSubmit & Double = js.native
    
    /* 0 */ val unknown: typings.winrt.Windows.Devices.Sms.SmsDataFormat.unknown & Double = js.native
  }
  
  @JSGlobal("Windows.Devices.Sms.SmsDevice")
  @js.native
  class SmsDevice ()
    extends StObject
       with typings.winrt.Windows.Devices.Sms.SmsDevice {
    
    /* CompleteClass */
    var accountPhoneNumber: String = js.native
    
    /* CompleteClass */
    override def calculateLength(message: typings.winrt.Windows.Devices.Sms.SmsTextMessage): SmsEncodedLength = js.native
    
    /* CompleteClass */
    var cellularClass: CellularClass = js.native
    
    /* CompleteClass */
    var deviceStatus: SmsDeviceStatus = js.native
    
    /* CompleteClass */
    var messageStore: typings.winrt.Windows.Devices.Sms.SmsDeviceMessageStore = js.native
    
    /* CompleteClass */
    var onsmsdevicestatuschanged: js.Any = js.native
    
    /* CompleteClass */
    var onsmsmessagereceived: js.Any = js.native
    
    /* CompleteClass */
    override def sendMessageAsync(message: ISmsMessage): typings.winrt.Windows.Devices.Sms.SendSmsMessageOperation = js.native
  }
  /* static members */
  object SmsDevice {
    
    @JSGlobal("Windows.Devices.Sms.SmsDevice")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromIdAsync(deviceInstanceId: String): IAsyncOperation[typings.winrt.Windows.Devices.Sms.SmsDevice] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIdAsync")(deviceInstanceId.asInstanceOf[js.Any]).asInstanceOf[IAsyncOperation[typings.winrt.Windows.Devices.Sms.SmsDevice]]
    
    inline def getDefaultAsync(): IAsyncOperation[typings.winrt.Windows.Devices.Sms.SmsDevice] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultAsync")().asInstanceOf[IAsyncOperation[typings.winrt.Windows.Devices.Sms.SmsDevice]]
    
    inline def getDeviceSelector(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceSelector")().asInstanceOf[String]
  }
  
  @JSGlobal("Windows.Devices.Sms.SmsDeviceMessageStore")
  @js.native
  class SmsDeviceMessageStore ()
    extends StObject
       with typings.winrt.Windows.Devices.Sms.SmsDeviceMessageStore {
    
    /* CompleteClass */
    override def deleteMessageAsync(messageId: Double): IAsyncAction = js.native
    
    /* CompleteClass */
    override def deleteMessagesAsync(messageFilter: SmsMessageFilter): IAsyncAction = js.native
    
    /* CompleteClass */
    override def getMessageAsync(messageId: Double): IAsyncOperation[ISmsMessage] = js.native
    
    /* CompleteClass */
    override def getMessagesAsync(messageFilter: SmsMessageFilter): IAsyncOperationWithProgress[IVectorView[ISmsMessage], Double] = js.native
    
    /* CompleteClass */
    var maxMessages: Double = js.native
  }
  
  @JSGlobal("Windows.Devices.Sms.SmsDeviceStatus")
  @js.native
  object SmsDeviceStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Devices.Sms.SmsDeviceStatus & Double] = js.native
    
    /* 3 */ val badSim: typings.winrt.Windows.Devices.Sms.SmsDeviceStatus.badSim & Double = js.native
    
    /* 7 */ val deviceBlocked: typings.winrt.Windows.Devices.Sms.SmsDeviceStatus.deviceBlocked & Double = js.native
    
    /* 4 */ val deviceFailure: typings.winrt.Windows.Devices.Sms.SmsDeviceStatus.deviceFailure & Double = js.native
    
    /* 6 */ val deviceLocked: typings.winrt.Windows.Devices.Sms.SmsDeviceStatus.deviceLocked & Double = js.native
    
    /* 0 */ val off: typings.winrt.Windows.Devices.Sms.SmsDeviceStatus.off & Double = js.native
    
    /* 1 */ val ready: typings.winrt.Windows.Devices.Sms.SmsDeviceStatus.ready & Double = js.native
    
    /* 2 */ val simNotInserted: typings.winrt.Windows.Devices.Sms.SmsDeviceStatus.simNotInserted & Double = js.native
    
    /* 5 */ val subscriptionNotActivated: typings.winrt.Windows.Devices.Sms.SmsDeviceStatus.subscriptionNotActivated & Double = js.native
  }
  
  @JSGlobal("Windows.Devices.Sms.SmsEncoding")
  @js.native
  object SmsEncoding extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Devices.Sms.SmsEncoding & Double] = js.native
    
    /* 4 */ val gsmSevenBit: typings.winrt.Windows.Devices.Sms.SmsEncoding.gsmSevenBit & Double = js.native
    
    /* 1 */ val optimal: typings.winrt.Windows.Devices.Sms.SmsEncoding.optimal & Double = js.native
    
    /* 2 */ val sevenBitAscii: typings.winrt.Windows.Devices.Sms.SmsEncoding.sevenBitAscii & Double = js.native
    
    /* 3 */ val unicode: typings.winrt.Windows.Devices.Sms.SmsEncoding.unicode & Double = js.native
    
    /* 0 */ val unknown: typings.winrt.Windows.Devices.Sms.SmsEncoding.unknown & Double = js.native
  }
  
  @JSGlobal("Windows.Devices.Sms.SmsMessageClass")
  @js.native
  object SmsMessageClass extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Devices.Sms.SmsMessageClass & Double] = js.native
    
    /* 1 */ val class0: typings.winrt.Windows.Devices.Sms.SmsMessageClass.class0 & Double = js.native
    
    /* 2 */ val class1: typings.winrt.Windows.Devices.Sms.SmsMessageClass.class1 & Double = js.native
    
    /* 3 */ val class2: typings.winrt.Windows.Devices.Sms.SmsMessageClass.class2 & Double = js.native
    
    /* 4 */ val class3: typings.winrt.Windows.Devices.Sms.SmsMessageClass.class3 & Double = js.native
    
    /* 0 */ val none: typings.winrt.Windows.Devices.Sms.SmsMessageClass.none & Double = js.native
  }
  
  @JSGlobal("Windows.Devices.Sms.SmsMessageFilter")
  @js.native
  object SmsMessageFilter extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Devices.Sms.SmsMessageFilter & Double] = js.native
    
    /* 0 */ val all: typings.winrt.Windows.Devices.Sms.SmsMessageFilter.all & Double = js.native
    
    /* 4 */ val draft: typings.winrt.Windows.Devices.Sms.SmsMessageFilter.draft & Double = js.native
    
    /* 2 */ val read: typings.winrt.Windows.Devices.Sms.SmsMessageFilter.read & Double = js.native
    
    /* 3 */ val sent: typings.winrt.Windows.Devices.Sms.SmsMessageFilter.sent & Double = js.native
    
    /* 1 */ val unread: typings.winrt.Windows.Devices.Sms.SmsMessageFilter.unread & Double = js.native
  }
  
  @JSGlobal("Windows.Devices.Sms.SmsMessageReceivedEventArgs")
  @js.native
  class SmsMessageReceivedEventArgs ()
    extends StObject
       with typings.winrt.Windows.Devices.Sms.SmsMessageReceivedEventArgs {
    
    /* CompleteClass */
    var binaryMessage: typings.winrt.Windows.Devices.Sms.SmsBinaryMessage = js.native
    
    /* CompleteClass */
    var textMessage: typings.winrt.Windows.Devices.Sms.SmsTextMessage = js.native
  }
  
  @JSGlobal("Windows.Devices.Sms.SmsMessageType")
  @js.native
  object SmsMessageType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Devices.Sms.SmsMessageType & Double] = js.native
    
    /* 0 */ val binary: typings.winrt.Windows.Devices.Sms.SmsMessageType.binary & Double = js.native
    
    /* 1 */ val text: typings.winrt.Windows.Devices.Sms.SmsMessageType.text & Double = js.native
  }
  
  @JSGlobal("Windows.Devices.Sms.SmsReceivedEventDetails")
  @js.native
  class SmsReceivedEventDetails ()
    extends StObject
       with typings.winrt.Windows.Devices.Sms.SmsReceivedEventDetails {
    
    /* CompleteClass */
    var deviceId: String = js.native
    
    /* CompleteClass */
    var messageIndex: Double = js.native
  }
  
  @JSGlobal("Windows.Devices.Sms.SmsTextMessage")
  @js.native
  class SmsTextMessage ()
    extends StObject
       with typings.winrt.Windows.Devices.Sms.SmsTextMessage {
    
    /* CompleteClass */
    var body: String = js.native
    
    /* CompleteClass */
    var encoding: SmsEncoding = js.native
    
    /* CompleteClass */
    var from: String = js.native
    
    /* CompleteClass */
    var id: Double = js.native
    
    /* CompleteClass */
    var messageClass: SmsMessageClass = js.native
    
    /* CompleteClass */
    var partCount: Double = js.native
    
    /* CompleteClass */
    var partNumber: Double = js.native
    
    /* CompleteClass */
    var partReferenceId: Double = js.native
    
    /* CompleteClass */
    var timestamp: Date = js.native
    
    /* CompleteClass */
    var to: String = js.native
    
    /* CompleteClass */
    override def toBinaryMessages(format: SmsDataFormat): IVectorView[ISmsBinaryMessage] = js.native
  }
  /* static members */
  object SmsTextMessage {
    
    @JSGlobal("Windows.Devices.Sms.SmsTextMessage")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromBinaryData(format: SmsDataFormat, value: Uint8Array): typings.winrt.Windows.Devices.Sms.SmsTextMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinaryData")(format.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.winrt.Windows.Devices.Sms.SmsTextMessage]
    
    inline def fromBinaryMessage(binaryMessage: typings.winrt.Windows.Devices.Sms.SmsBinaryMessage): typings.winrt.Windows.Devices.Sms.SmsTextMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBinaryMessage")(binaryMessage.asInstanceOf[js.Any]).asInstanceOf[typings.winrt.Windows.Devices.Sms.SmsTextMessage]
  }
}
