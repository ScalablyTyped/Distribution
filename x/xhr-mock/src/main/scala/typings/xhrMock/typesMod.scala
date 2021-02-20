package typings.xhrMock

import typings.std.Error
import typings.xhrMock.mockHeadersMod.MockHeaders
import typings.xhrMock.mockRequestMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait ErrorCallbackEvent extends StObject {
    
    var err: Error = js.native
    
    var req: default = js.native
  }
  object ErrorCallbackEvent {
    
    @scala.inline
    def apply(err: Error, req: default): ErrorCallbackEvent = {
      val __obj = js.Dynamic.literal(err = err.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorCallbackEvent]
    }
    
    @scala.inline
    implicit class ErrorCallbackEventMutableBuilder[Self <: ErrorCallbackEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErr(value: Error): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReq(value: default): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    }
  }
  
  type Mock = MockObject | MockFunction
  
  type MockFunction = js.Function2[
    /* request */ default, 
    /* response */ typings.xhrMock.mockResponseMod.default, 
    js.UndefOr[
      typings.xhrMock.mockResponseMod.default | js.Promise[js.UndefOr[typings.xhrMock.mockResponseMod.default]]
    ]
  ]
  
  @js.native
  trait MockObject extends StObject {
    
    var body: js.UndefOr[js.Any] = js.native
    
    var headers: js.UndefOr[MockHeaders] = js.native
    
    var reason: js.UndefOr[String] = js.native
    
    var status: js.UndefOr[Double] = js.native
  }
  object MockObject {
    
    @scala.inline
    def apply(): MockObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MockObject]
    }
    
    @scala.inline
    implicit class MockObjectMutableBuilder[Self <: MockObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setHeaders(value: MockHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
}
