package typings.syslogClient

import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import typings.std.Date
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("syslog-client", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("syslog-client", "Client")
  @js.native
  class Client () extends EventEmitter {
    def this(target: String) = this()
    def this(target: String, options: ClientOptions) = this()
    def this(target: Unit, options: ClientOptions) = this()
    
    def buildFormattedMessage(message: String, options: MessageOptions): Buffer = js.native
    
    def close(): Client = js.native
    
    def getTransport(cb: js.Function2[/* error */ Error | Null, /* transport */ Transport, Unit]): Unit = js.native
    
    def log(message: String): Client = js.native
    def log(message: String, options: Unit, cb: js.Function1[/* error */ Error | Null, Unit]): Client = js.native
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
    def apply(value: Double): js.UndefOr[Facility & Double] = js.native
    
    @js.native
    sealed trait Alert
      extends StObject
         with Facility
    /* 14 */ val Alert: typings.syslogClient.mod.Facility.Alert & Double = js.native
    
    @js.native
    sealed trait Audit
      extends StObject
         with Facility
    /* 13 */ val Audit: typings.syslogClient.mod.Facility.Audit & Double = js.native
    
    @js.native
    sealed trait Kernel
      extends StObject
         with Facility
    /* 0 */ val Kernel: typings.syslogClient.mod.Facility.Kernel & Double = js.native
    
    @js.native
    sealed trait Local0
      extends StObject
         with Facility
    /* 16 */ val Local0: typings.syslogClient.mod.Facility.Local0 & Double = js.native
    
    @js.native
    sealed trait Local1
      extends StObject
         with Facility
    /* 17 */ val Local1: typings.syslogClient.mod.Facility.Local1 & Double = js.native
    
    @js.native
    sealed trait Local2
      extends StObject
         with Facility
    /* 18 */ val Local2: typings.syslogClient.mod.Facility.Local2 & Double = js.native
    
    @js.native
    sealed trait Local3
      extends StObject
         with Facility
    /* 19 */ val Local3: typings.syslogClient.mod.Facility.Local3 & Double = js.native
    
    @js.native
    sealed trait Local4
      extends StObject
         with Facility
    /* 20 */ val Local4: typings.syslogClient.mod.Facility.Local4 & Double = js.native
    
    @js.native
    sealed trait Local5
      extends StObject
         with Facility
    /* 21 */ val Local5: typings.syslogClient.mod.Facility.Local5 & Double = js.native
    
    @js.native
    sealed trait Local6
      extends StObject
         with Facility
    /* 22 */ val Local6: typings.syslogClient.mod.Facility.Local6 & Double = js.native
    
    @js.native
    sealed trait Local7
      extends StObject
         with Facility
    /* 23 */ val Local7: typings.syslogClient.mod.Facility.Local7 & Double = js.native
    
    @js.native
    sealed trait System
      extends StObject
         with Facility
    /* 3 */ val System: typings.syslogClient.mod.Facility.System & Double = js.native
    
    @js.native
    sealed trait User
      extends StObject
         with Facility
    /* 1 */ val User: typings.syslogClient.mod.Facility.User & Double = js.native
  }
  
  @js.native
  sealed trait Severity extends StObject
  @JSImport("syslog-client", "Severity")
  @js.native
  object Severity extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Severity & Double] = js.native
    
    @js.native
    sealed trait Alert
      extends StObject
         with Severity
    /* 1 */ val Alert: typings.syslogClient.mod.Severity.Alert & Double = js.native
    
    @js.native
    sealed trait Critical
      extends StObject
         with Severity
    /* 2 */ val Critical: typings.syslogClient.mod.Severity.Critical & Double = js.native
    
    @js.native
    sealed trait Debug
      extends StObject
         with Severity
    /* 7 */ val Debug: typings.syslogClient.mod.Severity.Debug & Double = js.native
    
    @js.native
    sealed trait Emergency
      extends StObject
         with Severity
    /* 0 */ val Emergency: typings.syslogClient.mod.Severity.Emergency & Double = js.native
    
    @js.native
    sealed trait Error
      extends StObject
         with Severity
    /* 3 */ val Error: typings.syslogClient.mod.Severity.Error & Double = js.native
    
    @js.native
    sealed trait Informational
      extends StObject
         with Severity
    /* 6 */ val Informational: typings.syslogClient.mod.Severity.Informational & Double = js.native
    
    @js.native
    sealed trait Notice
      extends StObject
         with Severity
    /* 5 */ val Notice: typings.syslogClient.mod.Severity.Notice & Double = js.native
    
    @js.native
    sealed trait Warning
      extends StObject
         with Severity
    /* 4 */ val Warning: typings.syslogClient.mod.Severity.Warning & Double = js.native
  }
  
  @js.native
  sealed trait Transport extends StObject
  @JSImport("syslog-client", "Transport")
  @js.native
  object Transport extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Transport & Double] = js.native
    
    @js.native
    sealed trait Tcp
      extends StObject
         with Transport
    /* 1 */ val Tcp: typings.syslogClient.mod.Transport.Tcp & Double = js.native
    
    @js.native
    sealed trait Udp
      extends StObject
         with Transport
    /* 2 */ val Udp: typings.syslogClient.mod.Transport.Udp & Double = js.native
  }
  
  inline def createClient(target: String, options: ClientOptions): Client = (^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Client]
  
  trait ClientOptions extends StObject {
    
    var appName: js.UndefOr[String] = js.undefined
    
    var dateFormatter: js.UndefOr[js.Function0[String]] = js.undefined
    
    var facility: js.UndefOr[Facility] = js.undefined
    
    var msgid: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var rfc3164: js.UndefOr[Boolean] = js.undefined
    
    var severity: js.UndefOr[Severity] = js.undefined
    
    var syslogHostname: js.UndefOr[String] = js.undefined
    
    var tcpTimeout: js.UndefOr[Double] = js.undefined
    
    var timestamp: js.UndefOr[Date] = js.undefined
    
    var transport: js.UndefOr[Transport] = js.undefined
  }
  object ClientOptions {
    
    inline def apply(): ClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientOptions]
    }
    
    extension [Self <: ClientOptions](x: Self) {
      
      inline def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
      
      inline def setAppNameUndefined: Self = StObject.set(x, "appName", js.undefined)
      
      inline def setDateFormatter(value: () => String): Self = StObject.set(x, "dateFormatter", js.Any.fromFunction0(value))
      
      inline def setDateFormatterUndefined: Self = StObject.set(x, "dateFormatter", js.undefined)
      
      inline def setFacility(value: Facility): Self = StObject.set(x, "facility", value.asInstanceOf[js.Any])
      
      inline def setFacilityUndefined: Self = StObject.set(x, "facility", js.undefined)
      
      inline def setMsgid(value: String): Self = StObject.set(x, "msgid", value.asInstanceOf[js.Any])
      
      inline def setMsgidUndefined: Self = StObject.set(x, "msgid", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setRfc3164(value: Boolean): Self = StObject.set(x, "rfc3164", value.asInstanceOf[js.Any])
      
      inline def setRfc3164Undefined: Self = StObject.set(x, "rfc3164", js.undefined)
      
      inline def setSeverity(value: Severity): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
      
      inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
      
      inline def setSyslogHostname(value: String): Self = StObject.set(x, "syslogHostname", value.asInstanceOf[js.Any])
      
      inline def setSyslogHostnameUndefined: Self = StObject.set(x, "syslogHostname", js.undefined)
      
      inline def setTcpTimeout(value: Double): Self = StObject.set(x, "tcpTimeout", value.asInstanceOf[js.Any])
      
      inline def setTcpTimeoutUndefined: Self = StObject.set(x, "tcpTimeout", js.undefined)
      
      inline def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      inline def setTransport(value: Transport): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
      
      inline def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
    }
  }
  
  trait MessageOptions extends StObject {
    
    var appName: js.UndefOr[String] = js.undefined
    
    var facility: js.UndefOr[Facility] = js.undefined
    
    var msgid: js.UndefOr[String] = js.undefined
    
    var rfc3164: js.UndefOr[Boolean] = js.undefined
    
    var severity: js.UndefOr[Severity] = js.undefined
    
    var syslogHostname: js.UndefOr[String] = js.undefined
    
    var timestamp: js.UndefOr[Date] = js.undefined
  }
  object MessageOptions {
    
    inline def apply(): MessageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageOptions]
    }
    
    extension [Self <: MessageOptions](x: Self) {
      
      inline def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
      
      inline def setAppNameUndefined: Self = StObject.set(x, "appName", js.undefined)
      
      inline def setFacility(value: Facility): Self = StObject.set(x, "facility", value.asInstanceOf[js.Any])
      
      inline def setFacilityUndefined: Self = StObject.set(x, "facility", js.undefined)
      
      inline def setMsgid(value: String): Self = StObject.set(x, "msgid", value.asInstanceOf[js.Any])
      
      inline def setMsgidUndefined: Self = StObject.set(x, "msgid", js.undefined)
      
      inline def setRfc3164(value: Boolean): Self = StObject.set(x, "rfc3164", value.asInstanceOf[js.Any])
      
      inline def setRfc3164Undefined: Self = StObject.set(x, "rfc3164", js.undefined)
      
      inline def setSeverity(value: Severity): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
      
      inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
      
      inline def setSyslogHostname(value: String): Self = StObject.set(x, "syslogHostname", value.asInstanceOf[js.Any])
      
      inline def setSyslogHostnameUndefined: Self = StObject.set(x, "syslogHostname", js.undefined)
      
      inline def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    }
  }
}
