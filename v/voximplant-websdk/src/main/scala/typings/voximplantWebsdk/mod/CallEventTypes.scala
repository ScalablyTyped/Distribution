package typings.voximplantWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CallEventTypes {
  
  /**
    *    Event dispatched after call was connected
    */
  trait Connected
    extends StObject
       with VoxImplantCallEvent {
    
    /**
      *    Call that dispatched the event
      */
    var call: Call
    
    /**
      *    Optional SIP headers received with the message
      */
    var headers: js.UndefOr[js.Object] = js.undefined
  }
  object Connected {
    
    @scala.inline
    def apply(call: Call): Connected = {
      val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any])
      __obj.asInstanceOf[Connected]
    }
    
    @scala.inline
    implicit class ConnectedMutableBuilder[Self <: Connected] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCall(value: Call): Self = StObject.set(x, "call", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    }
  }
  
  /**
    *    Event dispatched after call was disconnected
    */
  trait Disconnected
    extends StObject
       with VoxImplantCallEvent {
    
    /**
      *    Call that dispatched the event
      */
    var call: Call
    
    /**
      *    Optional SIP headers received with the message
      */
    var headers: js.UndefOr[js.Object] = js.undefined
  }
  object Disconnected {
    
    @scala.inline
    def apply(call: Call): Disconnected = {
      val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any])
      __obj.asInstanceOf[Disconnected]
    }
    
    @scala.inline
    implicit class DisconnectedMutableBuilder[Self <: Disconnected] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCall(value: Call): Self = StObject.set(x, "call", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    }
  }
  
  /**
    *    Event dispatched after if call failed
    */
  trait Failed
    extends StObject
       with VoxImplantCallEvent {
    
    /**
      *    Call that dispatched the event
      */
    var call: Call
    
    /**
      *    Status code of the call (i.e. 486)
      */
    var code: Double
    
    /**
      *    Optional SIP headers received with the message
      */
    var headers: js.UndefOr[js.Object] = js.undefined
    
    /**
      *    Status message of call failure (i.e. Busy Here)
      */
    var reason: String
  }
  object Failed {
    
    @scala.inline
    def apply(call: Call, code: Double, reason: String): Failed = {
      val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
      __obj.asInstanceOf[Failed]
    }
    
    @scala.inline
    implicit class FailedMutableBuilder[Self <: Failed] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCall(value: Call): Self = StObject.set(x, "call", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    *    Event dispatched in case of network connection problem between 2 peers
    */
  trait ICETimeout extends StObject {
    
    /**
      *    Call that dispatched the event
      */
    var call: Call
  }
  object ICETimeout {
    
    @scala.inline
    def apply(call: Call): ICETimeout = {
      val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICETimeout]
    }
    
    @scala.inline
    implicit class ICETimeoutMutableBuilder[Self <: ICETimeout] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCall(value: Call): Self = StObject.set(x, "call", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    *    Event dispatched when INFO message is received
    */
  trait InfoReceived
    extends StObject
       with VoxImplantCallEvent {
    
    /**
      *    Content of the message
      */
    var body: String
    
    /**
      *    Call that dispatched the event
      */
    var call: Call
    
    /**
      *    Optional SIP headers received with the message
      */
    var headers: js.UndefOr[js.Object] = js.undefined
    
    /**
      *    MIME type of INFO message
      */
    var mimeType: String
  }
  object InfoReceived {
    
    @scala.inline
    def apply(body: String, call: Call, mimeType: String): InfoReceived = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], call = call.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any])
      __obj.asInstanceOf[InfoReceived]
    }
    
    @scala.inline
    implicit class InfoReceivedMutableBuilder[Self <: InfoReceived] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCall(value: Call): Self = StObject.set(x, "call", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    *    Event dispatched when text message is received
    */
  trait MessageReceived
    extends StObject
       with VoxImplantCallEvent {
    
    /**
      *    Call that dispatched the event
      */
    var call: Call
    
    /**
      *    Content of the message
      */
    var text: String
  }
  object MessageReceived {
    
    @scala.inline
    def apply(call: Call, text: String): MessageReceived = {
      val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageReceived]
    }
    
    @scala.inline
    implicit class MessageReceivedMutableBuilder[Self <: MessageReceived] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCall(value: Call): Self = StObject.set(x, "call", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    *    Event dispatched when progress tone playback starts
    */
  trait ProgressToneStart
    extends StObject
       with VoxImplantCallEvent {
    
    /**
      *    Call that dispatched the event
      */
    var call: Call
  }
  object ProgressToneStart {
    
    @scala.inline
    def apply(call: Call): ProgressToneStart = {
      val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProgressToneStart]
    }
    
    @scala.inline
    implicit class ProgressToneStartMutableBuilder[Self <: ProgressToneStart] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCall(value: Call): Self = StObject.set(x, "call", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    *    Event dispatched when progress tone playback stops
    */
  trait ProgressToneStop
    extends StObject
       with VoxImplantCallEvent {
    
    /**
      *    Call that dispatched the event
      */
    var call: Call
  }
  object ProgressToneStop {
    
    @scala.inline
    def apply(call: Call): ProgressToneStop = {
      val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProgressToneStop]
    }
    
    @scala.inline
    implicit class ProgressToneStopMutableBuilder[Self <: ProgressToneStop] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCall(value: Call): Self = StObject.set(x, "call", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    *    Event dispatched when call has been transferred successfully
    */
  trait TransferComplete
    extends StObject
       with VoxImplantCallEvent {
    
    /**
      *    Call that dispatched the event
      */
    var call: Call
  }
  object TransferComplete {
    
    @scala.inline
    def apply(call: Call): TransferComplete = {
      val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransferComplete]
    }
    
    @scala.inline
    implicit class TransferCompleteMutableBuilder[Self <: TransferComplete] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCall(value: Call): Self = StObject.set(x, "call", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    *    Event dispatched when call transfer failed
    */
  trait TransferFailed
    extends StObject
       with VoxImplantCallEvent {
    
    /**
      *    Call that dispatched the event
      */
    var call: Call
  }
  object TransferFailed {
    
    @scala.inline
    def apply(call: Call): TransferFailed = {
      val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransferFailed]
    }
    
    @scala.inline
    implicit class TransferFailedMutableBuilder[Self <: TransferFailed] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCall(value: Call): Self = StObject.set(x, "call", value.asInstanceOf[js.Any])
    }
  }
}
