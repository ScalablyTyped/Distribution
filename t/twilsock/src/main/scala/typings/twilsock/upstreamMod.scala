package typings.twilsock

import org.scalablytyped.runtime.StringDictionary
import typings.twilsock.anon.Code
import typings.twilsock.configurationMod.Configuration
import typings.twilsock.packetinterfaceMod.PacketInterface
import typings.twilsock.twilsockMod.TwilsockImpl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object upstreamMod {
  
  @JSImport("twilsock/lib/services/upstream", "Upstream")
  @js.native
  class Upstream protected () extends StObject {
    def this(transport: PacketInterface, twilsock: TwilsockImpl, config: Configuration) = this()
    
    def actualSend(message: js.Any): js.Promise[Result] = js.native
    
    val config: js.Any = js.native
    
    val pendingMessages: js.Any = js.native
    
    def rejectPendingMessages(): Unit = js.native
    
    def saveMessage(message: js.Any): js.Promise[Result] = js.native
    
    /**
      * Send an upstream message
      * @param {Twilsock#Message} message Message structure with header, body and remote address
      * @returns {Promise<Result>} Result from remote side
      */
    def send(method: String, url: String): js.Promise[Result] = js.native
    def send(method: String, url: String, headers: Unit, body: js.Any): js.Promise[Result] = js.native
    def send(method: String, url: String, headers: Headers): js.Promise[Result] = js.native
    def send(method: String, url: String, headers: Headers, body: js.Any): js.Promise[Result] = js.native
    
    def sendPendingMessages(): Unit = js.native
    
    val transport: js.Any = js.native
    
    val twilsock: js.Any = js.native
  }
  
  type Headers = StringDictionary[String]
  
  trait Result extends StObject {
    
    var body: js.UndefOr[js.Any] = js.undefined
    
    var headers: Headers
    
    var status: Code
  }
  object Result {
    
    @scala.inline
    def apply(headers: Headers, status: Code): Result = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    @scala.inline
    implicit class ResultMutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: Code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
