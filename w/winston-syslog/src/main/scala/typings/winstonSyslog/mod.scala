package typings.winstonSyslog

import org.scalablytyped.runtime.Instantiable1
import typings.glossy.mod.Produce
import typings.glossy.mod.ProduceOptions
import typings.node.dgramMod.Socket
import typings.winstonSyslog.winstonSyslogBooleans.`true`
import typings.winstonTransport.mod.TransportStreamOptions
import typings.winstonTransport.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("winston-syslog", "Syslog")
  @js.native
  open class Syslog () extends SyslogTransportInstance {
    def this(options: SyslogTransportOptions) = this()
  }
  @JSImport("winston-syslog", "Syslog")
  @js.native
  val Syslog: SyslogTransportInstance = js.native
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - scala.Any because Inheritance from two classes. Inlined getClass, hashCode, eq, equals, toString, ne, notify, notifyAll, wait, wait, wait, clone, finalize
  - js.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined 
  - js.Any because Inheritance from two classes. Inlined 
  - org.scalablytyped.runtime.StObject because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined hasOwnProperty, propertyIsEnumerable, valueOf, toLocaleString, isPrototypeOf
  - org.scalablytyped.runtime.Instantiable1 because Inheritance from two classes. Inlined 
  - org.scalablytyped.runtime.Instantiable0 because Inheritance from two classes. Inlined  */ @js.native
  trait SyslogTransportInstance extends ^ {
    
    @JSName("connect")
    def connect_true(callback: js.Function1[/* err */ `true` | Null, Any]): Unit = js.native
    
    var producer: Any = js.native
    
    var socket: Socket | typings.node.netMod.Socket = js.native
  }
  
  trait SyslogTransportOptions
    extends StObject
       with TransportStreamOptions {
    
    var app_name: js.UndefOr[String] = js.undefined
    
    var customProducer: js.UndefOr[Instantiable1[/* options */ ProduceOptions, Produce]] = js.undefined
    
    var eol: js.UndefOr[String] = js.undefined
    
    var facility: js.UndefOr[String] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var localhost: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var pid: js.UndefOr[Double] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var protocol: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object SyslogTransportOptions {
    
    inline def apply(): SyslogTransportOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyslogTransportOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyslogTransportOptions] (val x: Self) extends AnyVal {
      
      inline def setApp_name(value: String): Self = StObject.set(x, "app_name", value.asInstanceOf[js.Any])
      
      inline def setApp_nameUndefined: Self = StObject.set(x, "app_name", js.undefined)
      
      inline def setCustomProducer(value: Instantiable1[/* options */ ProduceOptions, Produce]): Self = StObject.set(x, "customProducer", value.asInstanceOf[js.Any])
      
      inline def setCustomProducerUndefined: Self = StObject.set(x, "customProducer", js.undefined)
      
      inline def setEol(value: String): Self = StObject.set(x, "eol", value.asInstanceOf[js.Any])
      
      inline def setEolUndefined: Self = StObject.set(x, "eol", js.undefined)
      
      inline def setFacility(value: String): Self = StObject.set(x, "facility", value.asInstanceOf[js.Any])
      
      inline def setFacilityUndefined: Self = StObject.set(x, "facility", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setLocalhost(value: String): Self = StObject.set(x, "localhost", value.asInstanceOf[js.Any])
      
      inline def setLocalhostUndefined: Self = StObject.set(x, "localhost", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
      
      inline def setPidUndefined: Self = StObject.set(x, "pid", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
