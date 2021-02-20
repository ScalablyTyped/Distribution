package typings.syslogClient

import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import typings.std.Date
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("syslog-client", "Client")
  @js.native
  class Client () extends EventEmitter {
    def this(target: String) = this()
    def this(target: js.UndefOr[scala.Nothing], options: ClientOptions) = this()
    def this(target: String, options: ClientOptions) = this()
    
    def buildFormattedMessage(message: String, options: MessageOptions): Buffer = js.native
    
    def close(): Client = js.native
    
    def getTransport(cb: js.Function2[/* error */ Error | Null, /* transport */ Transport, Unit]): Unit = js.native
    
    def log(message: String): Client = js.native
    def log(
      message: String,
      options: js.UndefOr[scala.Nothing],
      cb: js.Function1[/* error */ Error | Null, Unit]
    ): Client = js.native
    def log(message: String, options: MessageOptions): Client = js.native
    def log(message: String, options: MessageOptions, cb: js.Function1[/* error */ Error | Null, Unit]): Client = js.native
    
    def onClose(): Client = js.native
    
    def onError(error: Error): Client = js.native
  }
  
  @js.native
  sealed trait Facility extends StObject
  @JSImport("syslog-client", "Facility")
  @js.native
  object Facility extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Facility with Double] = js.native
    
    @js.native
    sealed trait Alert extends Facility
    /* 14 */ val Alert: typings.syslogClient.mod.Facility.Alert with Double = js.native
    
    @js.native
    sealed trait Audit extends Facility
    /* 13 */ val Audit: typings.syslogClient.mod.Facility.Audit with Double = js.native
    
    @js.native
    sealed trait Kernel extends Facility
    /* 0 */ val Kernel: typings.syslogClient.mod.Facility.Kernel with Double = js.native
    
    @js.native
    sealed trait Local0 extends Facility
    /* 16 */ val Local0: typings.syslogClient.mod.Facility.Local0 with Double = js.native
    
    @js.native
    sealed trait Local1 extends Facility
    /* 17 */ val Local1: typings.syslogClient.mod.Facility.Local1 with Double = js.native
    
    @js.native
    sealed trait Local2 extends Facility
    /* 18 */ val Local2: typings.syslogClient.mod.Facility.Local2 with Double = js.native
    
    @js.native
    sealed trait Local3 extends Facility
    /* 19 */ val Local3: typings.syslogClient.mod.Facility.Local3 with Double = js.native
    
    @js.native
    sealed trait Local4 extends Facility
    /* 20 */ val Local4: typings.syslogClient.mod.Facility.Local4 with Double = js.native
    
    @js.native
    sealed trait Local5 extends Facility
    /* 21 */ val Local5: typings.syslogClient.mod.Facility.Local5 with Double = js.native
    
    @js.native
    sealed trait Local6 extends Facility
    /* 22 */ val Local6: typings.syslogClient.mod.Facility.Local6 with Double = js.native
    
    @js.native
    sealed trait Local7 extends Facility
    /* 23 */ val Local7: typings.syslogClient.mod.Facility.Local7 with Double = js.native
    
    @js.native
    sealed trait System extends Facility
    /* 3 */ val System: typings.syslogClient.mod.Facility.System with Double = js.native
    
    @js.native
    sealed trait User extends Facility
    /* 1 */ val User: typings.syslogClient.mod.Facility.User with Double = js.native
  }
  
  @js.native
  sealed trait Severity extends StObject
  @JSImport("syslog-client", "Severity")
  @js.native
  object Severity extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Severity with Double] = js.native
    
    @js.native
    sealed trait Alert extends Severity
    /* 1 */ val Alert: typings.syslogClient.mod.Severity.Alert with Double = js.native
    
    @js.native
    sealed trait Critical extends Severity
    /* 2 */ val Critical: typings.syslogClient.mod.Severity.Critical with Double = js.native
    
    @js.native
    sealed trait Debug extends Severity
    /* 7 */ val Debug: typings.syslogClient.mod.Severity.Debug with Double = js.native
    
    @js.native
    sealed trait Emergency extends Severity
    /* 0 */ val Emergency: typings.syslogClient.mod.Severity.Emergency with Double = js.native
    
    @js.native
    sealed trait Error extends Severity
    /* 3 */ val Error: typings.syslogClient.mod.Severity.Error with Double = js.native
    
    @js.native
    sealed trait Informational extends Severity
    /* 6 */ val Informational: typings.syslogClient.mod.Severity.Informational with Double = js.native
    
    @js.native
    sealed trait Notice extends Severity
    /* 5 */ val Notice: typings.syslogClient.mod.Severity.Notice with Double = js.native
    
    @js.native
    sealed trait Warning extends Severity
    /* 4 */ val Warning: typings.syslogClient.mod.Severity.Warning with Double = js.native
  }
  
  @js.native
  sealed trait Transport extends StObject
  @JSImport("syslog-client", "Transport")
  @js.native
  object Transport extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Transport with Double] = js.native
    
    @js.native
    sealed trait Tcp extends Transport
    /* 1 */ val Tcp: typings.syslogClient.mod.Transport.Tcp with Double = js.native
    
    @js.native
    sealed trait Udp extends Transport
    /* 2 */ val Udp: typings.syslogClient.mod.Transport.Udp with Double = js.native
  }
  
  @JSImport("syslog-client", "createClient")
  @js.native
  def createClient(target: String, options: ClientOptions): Client = js.native
  
  @js.native
  trait ClientOptions extends StObject {
    
    var appName: js.UndefOr[String] = js.native
    
    var dateFormatter: js.UndefOr[js.Function0[String]] = js.native
    
    var facility: js.UndefOr[Facility] = js.native
    
    var msgid: js.UndefOr[String] = js.native
    
    var port: js.UndefOr[Double] = js.native
    
    var rfc3164: js.UndefOr[Boolean] = js.native
    
    var severity: js.UndefOr[Severity] = js.native
    
    var syslogHostname: js.UndefOr[String] = js.native
    
    var tcpTimeout: js.UndefOr[Double] = js.native
    
    var timestamp: js.UndefOr[Date] = js.native
    
    var transport: js.UndefOr[Transport] = js.native
  }
  object ClientOptions {
    
    @scala.inline
    def apply(): ClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientOptions]
    }
    
    @scala.inline
    implicit class ClientOptionsMutableBuilder[Self <: ClientOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppNameUndefined: Self = StObject.set(x, "appName", js.undefined)
      
      @scala.inline
      def setDateFormatter(value: () => String): Self = StObject.set(x, "dateFormatter", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDateFormatterUndefined: Self = StObject.set(x, "dateFormatter", js.undefined)
      
      @scala.inline
      def setFacility(value: Facility): Self = StObject.set(x, "facility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFacilityUndefined: Self = StObject.set(x, "facility", js.undefined)
      
      @scala.inline
      def setMsgid(value: String): Self = StObject.set(x, "msgid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsgidUndefined: Self = StObject.set(x, "msgid", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setRfc3164(value: Boolean): Self = StObject.set(x, "rfc3164", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRfc3164Undefined: Self = StObject.set(x, "rfc3164", js.undefined)
      
      @scala.inline
      def setSeverity(value: Severity): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
      
      @scala.inline
      def setSyslogHostname(value: String): Self = StObject.set(x, "syslogHostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSyslogHostnameUndefined: Self = StObject.set(x, "syslogHostname", js.undefined)
      
      @scala.inline
      def setTcpTimeout(value: Double): Self = StObject.set(x, "tcpTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTcpTimeoutUndefined: Self = StObject.set(x, "tcpTimeout", js.undefined)
      
      @scala.inline
      def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      @scala.inline
      def setTransport(value: Transport): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
    }
  }
  
  @js.native
  trait MessageOptions extends StObject {
    
    var appName: js.UndefOr[String] = js.native
    
    var facility: js.UndefOr[Facility] = js.native
    
    var msgid: js.UndefOr[String] = js.native
    
    var rfc3164: js.UndefOr[Boolean] = js.native
    
    var severity: js.UndefOr[Severity] = js.native
    
    var syslogHostname: js.UndefOr[String] = js.native
    
    var timestamp: js.UndefOr[Date] = js.native
  }
  object MessageOptions {
    
    @scala.inline
    def apply(): MessageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageOptions]
    }
    
    @scala.inline
    implicit class MessageOptionsMutableBuilder[Self <: MessageOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppNameUndefined: Self = StObject.set(x, "appName", js.undefined)
      
      @scala.inline
      def setFacility(value: Facility): Self = StObject.set(x, "facility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFacilityUndefined: Self = StObject.set(x, "facility", js.undefined)
      
      @scala.inline
      def setMsgid(value: String): Self = StObject.set(x, "msgid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsgidUndefined: Self = StObject.set(x, "msgid", js.undefined)
      
      @scala.inline
      def setRfc3164(value: Boolean): Self = StObject.set(x, "rfc3164", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRfc3164Undefined: Self = StObject.set(x, "rfc3164", js.undefined)
      
      @scala.inline
      def setSeverity(value: Severity): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
      
      @scala.inline
      def setSyslogHostname(value: String): Self = StObject.set(x, "syslogHostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSyslogHostnameUndefined: Self = StObject.set(x, "syslogHostname", js.undefined)
      
      @scala.inline
      def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    }
  }
}
