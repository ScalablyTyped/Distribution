package typings.syslogPro.mod

import typings.syslogPro.mod.Syslog.Format
import typings.syslogPro.mod.Syslog.Options
import typings.syslogPro.mod.Syslog.Protocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("syslog-pro", "Syslog")
@js.native
/**
  * Construct a new Syslog transport object with user options.
  */
open class Syslog ()
  extends StObject
     with Options {
  def this(options: Options) = this()
  
  @JSName("cef")
  val cef_Syslog: js.UndefOr[CEF] = js.native
  
  @JSName("format")
  val format_Syslog: Format = js.native
  
  @JSName("leef")
  val leef_Syslog: js.UndefOr[LEEF] = js.native
  
  @JSName("port")
  val port_Syslog: Double = js.native
  
  @JSName("protocol")
  val protocol_Syslog: Protocol = js.native
  
  @JSName("rfc3164")
  val rfc3164_Syslog: js.UndefOr[RFC3164] = js.native
  
  @JSName("rfc5424")
  val rfc5424_Syslog: js.UndefOr[RFC5424] = js.native
  
  @JSName("target")
  val target_Syslog: String = js.native
  
  @JSName("tcpTimeout")
  val tcpTimeout_Syslog: Double = js.native
  
  @JSName("tlsServerCerts")
  val tlsServerCerts_Syslog: js.Array[String] = js.native
}
object Syslog {
  
  /* Rewritten from type alias, can be one of: 
    - typings.syslogPro.syslogProStrings.none
    - typings.syslogPro.syslogProStrings.rfc3164
    - typings.syslogPro.syslogProStrings.rfc5424
    - typings.syslogPro.syslogProStrings.leef
    - typings.syslogPro.syslogProStrings.cef
  */
  trait Format extends StObject
  object Format {
    
    inline def cef: typings.syslogPro.syslogProStrings.cef = "cef".asInstanceOf[typings.syslogPro.syslogProStrings.cef]
    
    inline def leef: typings.syslogPro.syslogProStrings.leef = "leef".asInstanceOf[typings.syslogPro.syslogProStrings.leef]
    
    inline def none: typings.syslogPro.syslogProStrings.none = "none".asInstanceOf[typings.syslogPro.syslogProStrings.none]
    
    inline def rfc3164: typings.syslogPro.syslogProStrings.rfc3164 = "rfc3164".asInstanceOf[typings.syslogPro.syslogProStrings.rfc3164]
    
    inline def rfc5424: typings.syslogPro.syslogProStrings.rfc5424 = "rfc5424".asInstanceOf[typings.syslogPro.syslogProStrings.rfc5424]
  }
  
  trait Options extends StObject {
    
    /**
      * HP CEF (Common Event Format) settings.
      */
    var cef: js.UndefOr[typings.syslogPro.mod.CEF.Options] = js.undefined
    
    /**
      * Syslog format.
      *
      * @default 'none'
      */
    var format: js.UndefOr[Format] = js.undefined
    
    /**
      * IBM LEEF (Log Event Extended Format) settings.
      */
    var leef: js.UndefOr[typings.syslogPro.mod.LEEF.Options] = js.undefined
    
    /**
      * IP port, this option if set will take precedence over any IP Port set in a formatting object.
      *
      * @default 514
      */
    var port: js.UndefOr[Double] = js.undefined
    
    /**
      * L4 transport protocol, this option if set will take precedence over any
      * transport set in a formatting object.
      *
      * @default 'udp'
      */
    var protocol: js.UndefOr[Protocol] = js.undefined
    
    /**
      * RFC3164 related settings.
      */
    var rfc3164: js.UndefOr[typings.syslogPro.mod.RFC3164.Options] = js.undefined
    
    /**
      * RFC5424 related settings.
      */
    var rfc5424: js.UndefOr[typings.syslogPro.mod.RFC5424.Options] = js.undefined
    
    /**
      * The IP Address|FQDN of the Syslog Server, this option if set will take precedence over any target
      * set in a formatting object.
      *
      * @default 'localhost'
      */
    var target: js.UndefOr[String] = js.undefined
    
    /**
      * Ignored for all other transports, this option if set will take precedence over any timeout
      * set in a formatting object.
      *
      * @default 10000
      */
    var tcpTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * Client TLS certificate file location that this client should use, this option if set will take
      * precedence over any certificates set in a formatting object.
      */
    var tlsClientCert: js.UndefOr[String] = js.undefined
    
    /**
      * Client TLS key file location that this client should use, this option if set will take
      * precedence over any certificates set in a formatting object.
      */
    var tlsClientKey: js.UndefOr[String] = js.undefined
    
    /**
      * Authorized TLS server certificates file locations, this option if set will take precedence
      * over any certificates set in a formatting object.
      */
    var tlsServerCerts: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCef(value: typings.syslogPro.mod.CEF.Options): Self = StObject.set(x, "cef", value.asInstanceOf[js.Any])
      
      inline def setCefUndefined: Self = StObject.set(x, "cef", js.undefined)
      
      inline def setFormat(value: Format): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setLeef(value: typings.syslogPro.mod.LEEF.Options): Self = StObject.set(x, "leef", value.asInstanceOf[js.Any])
      
      inline def setLeefUndefined: Self = StObject.set(x, "leef", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProtocol(value: Protocol): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setRfc3164(value: typings.syslogPro.mod.RFC3164.Options): Self = StObject.set(x, "rfc3164", value.asInstanceOf[js.Any])
      
      inline def setRfc3164Undefined: Self = StObject.set(x, "rfc3164", js.undefined)
      
      inline def setRfc5424(value: typings.syslogPro.mod.RFC5424.Options): Self = StObject.set(x, "rfc5424", value.asInstanceOf[js.Any])
      
      inline def setRfc5424Undefined: Self = StObject.set(x, "rfc5424", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTcpTimeout(value: Double): Self = StObject.set(x, "tcpTimeout", value.asInstanceOf[js.Any])
      
      inline def setTcpTimeoutUndefined: Self = StObject.set(x, "tcpTimeout", js.undefined)
      
      inline def setTlsClientCert(value: String): Self = StObject.set(x, "tlsClientCert", value.asInstanceOf[js.Any])
      
      inline def setTlsClientCertUndefined: Self = StObject.set(x, "tlsClientCert", js.undefined)
      
      inline def setTlsClientKey(value: String): Self = StObject.set(x, "tlsClientKey", value.asInstanceOf[js.Any])
      
      inline def setTlsClientKeyUndefined: Self = StObject.set(x, "tlsClientKey", js.undefined)
      
      inline def setTlsServerCerts(value: String | js.Array[String]): Self = StObject.set(x, "tlsServerCerts", value.asInstanceOf[js.Any])
      
      inline def setTlsServerCertsUndefined: Self = StObject.set(x, "tlsServerCerts", js.undefined)
      
      inline def setTlsServerCertsVarargs(value: String*): Self = StObject.set(x, "tlsServerCerts", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.syslogPro.syslogProStrings.udp
    - typings.syslogPro.syslogProStrings.tcp
    - typings.syslogPro.syslogProStrings.tls
  */
  trait Protocol extends StObject
  object Protocol {
    
    inline def tcp: typings.syslogPro.syslogProStrings.tcp = "tcp".asInstanceOf[typings.syslogPro.syslogProStrings.tcp]
    
    inline def tls: typings.syslogPro.syslogProStrings.tls = "tls".asInstanceOf[typings.syslogPro.syslogProStrings.tls]
    
    inline def udp: typings.syslogPro.syslogProStrings.udp = "udp".asInstanceOf[typings.syslogPro.syslogProStrings.udp]
  }
}
