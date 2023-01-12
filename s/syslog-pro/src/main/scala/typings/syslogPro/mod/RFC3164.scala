package typings.syslogPro.mod

import typings.syslogPro.mod.RFC3164.MessageOptions
import typings.syslogPro.mod.RFC3164.Options
import typings.syslogPro.syslogProBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.syslogPro.mod.RFC3164.Options because var conflicts: extendedColor. Inlined applicationName, hostname, facility, color, colors, server */ @JSImport("syslog-pro", "RFC3164")
@js.native
/**
  * Construct a new RFC3164 formatted Syslog object with user options.
  */
open class RFC3164 ()
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
  
  val facility: js.UndefOr[Double] = js.native
  
  val hostname: js.UndefOr[String] = js.native
  
  /**
    * Send a RFC3164 formatted message.
    *
    * @param msg The unformatted Syslog message to send.
    * @returns Returns the formatted message that was sent. If no server connection was defined when the
    * class was created a default Syslog connector will be used.
    * @throws A standard error object.
    */
  def send(msg: String): js.Promise[String] = js.native
  def send(msg: String, options: MessageOptions): js.Promise[String] = js.native
  
  val server: js.UndefOr[typings.syslogPro.mod.Syslog.Options | Syslog | `false`] = js.native
}
object RFC3164 {
  
  trait MessageOptions extends StObject {
    
    /**
      * The ANSI color code to use if message coloration is selected.
      *
      * @default 36
      */
    var msgColor: js.UndefOr[Double] = js.undefined
    
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MessageOptions] (val x: Self) extends AnyVal {
      
      inline def setMsgColor(value: Double): Self = StObject.set(x, "msgColor", value.asInstanceOf[js.Any])
      
      inline def setMsgColorUndefined: Self = StObject.set(x, "msgColor", js.undefined)
      
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
      * Facility code to use sending this message.
      *
      * @default 23
      */
    var facility: js.UndefOr[Double] = js.undefined
    
    /**
      * The name of this server.
      *
      * @default os.hostname
      */
    var hostname: js.UndefOr[String] = js.undefined
    
    /**
      * A Syslog server connection that should be used to send messages directly from this class.
      *
      * @default false
      */
    var server: js.UndefOr[typings.syslogPro.mod.Syslog.Options | `false`] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setApplicationName(value: String): Self = StObject.set(x, "applicationName", value.asInstanceOf[js.Any])
      
      inline def setApplicationNameUndefined: Self = StObject.set(x, "applicationName", js.undefined)
      
      inline def setColor(value: Boolean): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setColors(value: Colors): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setExtendedColor(value: Boolean): Self = StObject.set(x, "extendedColor", value.asInstanceOf[js.Any])
      
      inline def setExtendedColorUndefined: Self = StObject.set(x, "extendedColor", js.undefined)
      
      inline def setFacility(value: Double): Self = StObject.set(x, "facility", value.asInstanceOf[js.Any])
      
      inline def setFacilityUndefined: Self = StObject.set(x, "facility", js.undefined)
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setServer(value: typings.syslogPro.mod.Syslog.Options | `false`): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.syslogPro.syslogProInts.`0`
    - typings.syslogPro.syslogProInts.`1`
    - typings.syslogPro.syslogProInts.`2`
    - typings.syslogPro.syslogProInts.`3`
    - typings.syslogPro.syslogProInts.`4`
    - typings.syslogPro.syslogProInts.`5`
    - typings.syslogPro.syslogProInts.`6`
    - typings.syslogPro.syslogProInts.`7`
  */
  trait Severity extends StObject
  object Severity {
    
    inline def `0`: typings.syslogPro.syslogProInts.`0` = 0.asInstanceOf[typings.syslogPro.syslogProInts.`0`]
    
    inline def `1`: typings.syslogPro.syslogProInts.`1` = 1.asInstanceOf[typings.syslogPro.syslogProInts.`1`]
    
    inline def `2`: typings.syslogPro.syslogProInts.`2` = 2.asInstanceOf[typings.syslogPro.syslogProInts.`2`]
    
    inline def `3`: typings.syslogPro.syslogProInts.`3` = 3.asInstanceOf[typings.syslogPro.syslogProInts.`3`]
    
    inline def `4`: typings.syslogPro.syslogProInts.`4` = 4.asInstanceOf[typings.syslogPro.syslogProInts.`4`]
    
    inline def `5`: typings.syslogPro.syslogProInts.`5` = 5.asInstanceOf[typings.syslogPro.syslogProInts.`5`]
    
    inline def `6`: typings.syslogPro.syslogProInts.`6` = 6.asInstanceOf[typings.syslogPro.syslogProInts.`6`]
    
    inline def `7`: typings.syslogPro.syslogProInts.`7` = 7.asInstanceOf[typings.syslogPro.syslogProInts.`7`]
  }
}
