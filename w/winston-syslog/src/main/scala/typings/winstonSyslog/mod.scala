package typings.winstonSyslog

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.node.dgramMod.Socket
import typings.winstonSyslog.winstonSyslogBooleans.`true`
import typings.winstonTransport.mod.TransportStreamOptions
import typings.winstonTransport.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("winston-syslog", "Syslog")
  @js.native
  class Syslog () extends SyslogTransportInstance {
    def this(options: SyslogTransportOptions) = this()
  }
  @JSImport("winston-syslog", "Syslog")
  @js.native
  val Syslog: SyslogTransportInstance = js.native
  
  @js.native
  trait SyslogTransportInstance
    extends ^
       with Instantiable0[SyslogTransportInstance]
       with Instantiable1[/* options */ SyslogTransportOptions, SyslogTransportInstance] {
    
    @JSName("connect")
    def connect_true(callback: js.Function1[/* err */ `true` | Null, _]): Unit = js.native
    
    var producer: js.Any = js.native
    
    var socket: Socket | typings.node.netMod.Socket = js.native
  }
  
  @js.native
  trait SyslogTransportOptions extends TransportStreamOptions {
    
    var app_name: js.UndefOr[String] = js.native
    
    var eol: js.UndefOr[String] = js.native
    
    var facility: js.UndefOr[String] = js.native
    
    var host: js.UndefOr[String] = js.native
    
    var localhost: js.UndefOr[String] = js.native
    
    var path: js.UndefOr[String] = js.native
    
    var pid: js.UndefOr[Double] = js.native
    
    var port: js.UndefOr[Double] = js.native
    
    var protocol: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[String] = js.native
  }
  object SyslogTransportOptions {
    
    @scala.inline
    def apply(): SyslogTransportOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyslogTransportOptions]
    }
    
    @scala.inline
    implicit class SyslogTransportOptionsMutableBuilder[Self <: SyslogTransportOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApp_name(value: String): Self = StObject.set(x, "app_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApp_nameUndefined: Self = StObject.set(x, "app_name", js.undefined)
      
      @scala.inline
      def setEol(value: String): Self = StObject.set(x, "eol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEolUndefined: Self = StObject.set(x, "eol", js.undefined)
      
      @scala.inline
      def setFacility(value: String): Self = StObject.set(x, "facility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFacilityUndefined: Self = StObject.set(x, "facility", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setLocalhost(value: String): Self = StObject.set(x, "localhost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalhostUndefined: Self = StObject.set(x, "localhost", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPidUndefined: Self = StObject.set(x, "pid", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
