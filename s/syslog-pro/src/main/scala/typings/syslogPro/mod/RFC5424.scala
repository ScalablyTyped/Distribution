package typings.syslogPro.mod

import typings.syslogPro.mod.RFC5424.MessageOptions
import typings.syslogPro.mod.RFC5424.Options
import typings.syslogPro.syslogProBooleans.`false`
import typings.syslogPro.syslogProStrings.`-_`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.syslogPro.mod.RFC5424.Options because var conflicts: extendedColor. Inlined applicationName, hostname, timestamp, timestampUTC, timestampMS, timestampTZ, includeStructuredData, utf8BOM, color, colors, server */ @JSImport("syslog-pro", "RFC5424")
@js.native
/**
  * Construct a new RFC5424 formatted Syslog object with user options.
  */
open class RFC5424 ()
  extends StObject
     with RFC {
  def this(options: Options) = this()
  
  val applicationName: js.UndefOr[String] = js.native
  
  /**
    * Build a formatted message.
    *
    * @param msg The unformatted Syslog message to format.
    * @return A Syslog formatted string according to the selected RFC.
    * @throws A standard error object.
    */
  def buildMessage(msg: String): String = js.native
  def buildMessage(msg: String, options: MessageOptions): String = js.native
  
  val color: js.UndefOr[Boolean] = js.native
  
  /**
    * User defined colors for severities.
    */
  var colors: js.UndefOr[Colors] = js.native
  
  val hostname: js.UndefOr[String] = js.native
  
  val includeStructuredData: js.UndefOr[Boolean] = js.native
  
  /**
    * Send a RFC5424 formatted message.
    *
    * @param msg The unformatted Syslog message to send.
    * @returns Returns the formatted message that was sent. If no server connection was defined when the
    * class was created a default Syslog connector will be used.
    * @throws A standard error object.
    */
  def send(msg: String): js.Promise[String] = js.native
  def send(msg: String, options: MessageOptions): js.Promise[String] = js.native
  
  val server: js.UndefOr[typings.syslogPro.mod.Syslog.Options | Syslog | `false`] = js.native
  
  val timestamp: js.UndefOr[Boolean] = js.native
  
  val timestampMS: js.UndefOr[Boolean] = js.native
  
  val timestampTZ: js.UndefOr[Boolean] = js.native
  
  val timestampUTC: js.UndefOr[Boolean] = js.native
  
  val utf8BOM: js.UndefOr[Boolean] = js.native
}
object RFC5424 {
  
  trait MessageOptions extends StObject {
    
    /**
      * Facility code to use sending this message.
      *
      * @default 23
      */
    var facility: js.UndefOr[Double] = js.undefined
    
    /**
      * @default '-'
      */
    var id: js.UndefOr[Double | `-_`] = js.undefined
    
    /**
      * The ANSI color code to use if message coloration is selected.
      *
      * @default 36
      */
    var msgColor: js.UndefOr[Double] = js.undefined
    
    /**
      * An array of structured data strings conforming to the IETF/IANA defined SD-IDs or IANA
      * registered SMI Network Management Private Enterprise Code SD-ID conforming to the format
      * `[name@<private enterprise number> parameter=value]`.
      */
    var msgStructuredData: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The process id of the service sending this message.
      *
      * @default '-'
      */
    var pid: js.UndefOr[Double | `-_`] = js.undefined
    
    /**
      * The message severity (0-7).
      *
      * @default 6
      */
    var severity: js.UndefOr[Severity] = js.undefined
  }
  object MessageOptions {
    
    inline def apply(): MessageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageOptions]
    }
    
    extension [Self <: MessageOptions](x: Self) {
      
      inline def setFacility(value: Double): Self = StObject.set(x, "facility", value.asInstanceOf[js.Any])
      
      inline def setFacilityUndefined: Self = StObject.set(x, "facility", js.undefined)
      
      inline def setId(value: Double | `-_`): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setMsgColor(value: Double): Self = StObject.set(x, "msgColor", value.asInstanceOf[js.Any])
      
      inline def setMsgColorUndefined: Self = StObject.set(x, "msgColor", js.undefined)
      
      inline def setMsgStructuredData(value: js.Array[String]): Self = StObject.set(x, "msgStructuredData", value.asInstanceOf[js.Any])
      
      inline def setMsgStructuredDataUndefined: Self = StObject.set(x, "msgStructuredData", js.undefined)
      
      inline def setMsgStructuredDataVarargs(value: String*): Self = StObject.set(x, "msgStructuredData", js.Array(value*))
      
      inline def setPid(value: Double | `-_`): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
      
      inline def setPidUndefined: Self = StObject.set(x, "pid", js.undefined)
      
      inline def setSeverity(value: Severity): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
      
      inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    /**
      * Application name.
      *
      * @default ''
      */
    var applicationName: js.UndefOr[String] = js.undefined
    
    /**
      * Apply color coding encoding tag with syslog message text.
      *
      * @default false
      */
    var color: js.UndefOr[Boolean] = js.undefined
    
    /**
      * User defined colors for severities.
      */
    var colors: js.UndefOr[Colors] = js.undefined
    
    /**
      * Use the extended ANSI color set encoding tag with syslog message text.
      *
      * @default false
      */
    var extendedColor: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The name of this server.
      *
      * @default os.hostname
      */
    var hostname: js.UndefOr[String] = js.undefined
    
    /**
      * Include any provided structured data.
      *
      * @default false
      */
    var includeStructuredData: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A Syslog server connection that should be used to send messages directly from this class.
      *
      * @default false
      */
    var server: js.UndefOr[typings.syslogPro.mod.Syslog.Options | `false`] = js.undefined
    
    /**
      * Include a timestamp.
      *
      * @default true
      */
    var timestamp: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Timestamp with ms resolution.
      *
      * @default false
      */
    var timestampMS: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Should the timestamp include time zone.
      *
      * @default true
      */
    var timestampTZ: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether timestamp should be relative to UTC timezone instead of local timezone.
      *
      * @default false
      */
    var timestampUTC: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Include the UTF8 encoding tag with syslog message text.
      *
      * @default true
      */
    var utf8BOM: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setApplicationName(value: String): Self = StObject.set(x, "applicationName", value.asInstanceOf[js.Any])
      
      inline def setApplicationNameUndefined: Self = StObject.set(x, "applicationName", js.undefined)
      
      inline def setColor(value: Boolean): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setColors(value: Colors): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setExtendedColor(value: Boolean): Self = StObject.set(x, "extendedColor", value.asInstanceOf[js.Any])
      
      inline def setExtendedColorUndefined: Self = StObject.set(x, "extendedColor", js.undefined)
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setIncludeStructuredData(value: Boolean): Self = StObject.set(x, "includeStructuredData", value.asInstanceOf[js.Any])
      
      inline def setIncludeStructuredDataUndefined: Self = StObject.set(x, "includeStructuredData", js.undefined)
      
      inline def setServer(value: typings.syslogPro.mod.Syslog.Options | `false`): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
      
      inline def setTimestamp(value: Boolean): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampMS(value: Boolean): Self = StObject.set(x, "timestampMS", value.asInstanceOf[js.Any])
      
      inline def setTimestampMSUndefined: Self = StObject.set(x, "timestampMS", js.undefined)
      
      inline def setTimestampTZ(value: Boolean): Self = StObject.set(x, "timestampTZ", value.asInstanceOf[js.Any])
      
      inline def setTimestampTZUndefined: Self = StObject.set(x, "timestampTZ", js.undefined)
      
      inline def setTimestampUTC(value: Boolean): Self = StObject.set(x, "timestampUTC", value.asInstanceOf[js.Any])
      
      inline def setTimestampUTCUndefined: Self = StObject.set(x, "timestampUTC", js.undefined)
      
      inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      inline def setUtf8BOM(value: Boolean): Self = StObject.set(x, "utf8BOM", value.asInstanceOf[js.Any])
      
      inline def setUtf8BOMUndefined: Self = StObject.set(x, "utf8BOM", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.syslogPro.syslogProNumbers.`0`
    - typings.syslogPro.syslogProNumbers.`1`
    - typings.syslogPro.syslogProNumbers.`2`
    - typings.syslogPro.syslogProNumbers.`3`
    - typings.syslogPro.syslogProNumbers.`4`
    - typings.syslogPro.syslogProNumbers.`5`
    - typings.syslogPro.syslogProNumbers.`6`
    - typings.syslogPro.syslogProNumbers.`7`
  */
  trait Severity extends StObject
  object Severity {
    
    inline def `0`: typings.syslogPro.syslogProNumbers.`0` = 0.asInstanceOf[typings.syslogPro.syslogProNumbers.`0`]
    
    inline def `1`: typings.syslogPro.syslogProNumbers.`1` = 1.asInstanceOf[typings.syslogPro.syslogProNumbers.`1`]
    
    inline def `2`: typings.syslogPro.syslogProNumbers.`2` = 2.asInstanceOf[typings.syslogPro.syslogProNumbers.`2`]
    
    inline def `3`: typings.syslogPro.syslogProNumbers.`3` = 3.asInstanceOf[typings.syslogPro.syslogProNumbers.`3`]
    
    inline def `4`: typings.syslogPro.syslogProNumbers.`4` = 4.asInstanceOf[typings.syslogPro.syslogProNumbers.`4`]
    
    inline def `5`: typings.syslogPro.syslogProNumbers.`5` = 5.asInstanceOf[typings.syslogPro.syslogProNumbers.`5`]
    
    inline def `6`: typings.syslogPro.syslogProNumbers.`6` = 6.asInstanceOf[typings.syslogPro.syslogProNumbers.`6`]
    
    inline def `7`: typings.syslogPro.syslogProNumbers.`7` = 7.asInstanceOf[typings.syslogPro.syslogProNumbers.`7`]
  }
}
