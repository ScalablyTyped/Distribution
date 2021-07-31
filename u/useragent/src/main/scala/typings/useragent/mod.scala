package typings.useragent

import typings.useragent.anon.Family
import typings.useragent.anon.Major
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  @scala.inline
  def apply(refresh: Boolean): Unit = ^.asInstanceOf[js.Dynamic].apply(refresh.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("useragent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("useragent", "Agent")
  @js.native
  /**
    * The representation of a parsed user agent.
    * @param [family=`Other`] The name of the browser
    * @param [major='0'] Major version of the browser
    * @param [minor='0'] Minor version of the browser
    * @param [patch='0'] Patch version of the browser
    * @param [source] The actual user agent string
    */
  class Agent () extends StObject {
    def this(family: String) = this()
    def this(family: String, major: String) = this()
    def this(family: Unit, major: String) = this()
    def this(family: String, major: String, minor: String) = this()
    def this(family: String, major: Unit, minor: String) = this()
    def this(family: Unit, major: String, minor: String) = this()
    def this(family: Unit, major: Unit, minor: String) = this()
    def this(family: String, major: String, minor: String, patch: String) = this()
    def this(family: String, major: String, minor: Unit, patch: String) = this()
    def this(family: String, major: Unit, minor: String, patch: String) = this()
    def this(family: String, major: Unit, minor: Unit, patch: String) = this()
    def this(family: Unit, major: String, minor: String, patch: String) = this()
    def this(family: Unit, major: String, minor: Unit, patch: String) = this()
    def this(family: Unit, major: Unit, minor: String, patch: String) = this()
    def this(family: Unit, major: Unit, minor: Unit, patch: String) = this()
    def this(family: String, major: String, minor: String, patch: String, source: String) = this()
    def this(family: String, major: String, minor: String, patch: Unit, source: String) = this()
    def this(family: String, major: String, minor: Unit, patch: String, source: String) = this()
    def this(family: String, major: String, minor: Unit, patch: Unit, source: String) = this()
    def this(family: String, major: Unit, minor: String, patch: String, source: String) = this()
    def this(family: String, major: Unit, minor: String, patch: Unit, source: String) = this()
    def this(family: String, major: Unit, minor: Unit, patch: String, source: String) = this()
    def this(family: String, major: Unit, minor: Unit, patch: Unit, source: String) = this()
    def this(family: Unit, major: String, minor: String, patch: String, source: String) = this()
    def this(family: Unit, major: String, minor: String, patch: Unit, source: String) = this()
    def this(family: Unit, major: String, minor: Unit, patch: String, source: String) = this()
    def this(family: Unit, major: String, minor: Unit, patch: Unit, source: String) = this()
    def this(family: Unit, major: Unit, minor: String, patch: String, source: String) = this()
    def this(family: Unit, major: Unit, minor: String, patch: Unit, source: String) = this()
    def this(family: Unit, major: Unit, minor: Unit, patch: String, source: String) = this()
    def this(family: Unit, major: Unit, minor: Unit, patch: Unit, source: String) = this()
    
    var device: Device = js.native
    
    var family: String = js.native
    
    var major: String = js.native
    
    var minor: String = js.native
    
    var os: OperatingSystem = js.native
    
    var patch: String = js.native
    
    var source: String = js.native
    
    /**
      * Generates a string output of the parsed user agent.
      */
    def toAgent(): String = js.native
    
    /**
      * The representation of a parsed Operating System.
      */
    def toJSON(): typings.useragent.anon.Device = js.native
    
    /**
      * Outputs a compiled veersion number of the user agent.
      */
    def toVersion(): String = js.native
  }
  
  @JSImport("useragent", "Device")
  @js.native
  /**
    * The representation of a parsed Device.
    * @param [family='Other'] The name of the device
    * @param [major='0'] Major version of the device
    * @param [minor='0'] Minor version of the device
    * @param [patch='0'] Patch version of the device
    */
  class Device () extends StObject {
    def this(family: String) = this()
    def this(family: String, major: String) = this()
    def this(family: Unit, major: String) = this()
    def this(family: String, major: String, minor: String) = this()
    def this(family: String, major: Unit, minor: String) = this()
    def this(family: Unit, major: String, minor: String) = this()
    def this(family: Unit, major: Unit, minor: String) = this()
    def this(family: String, major: String, minor: String, patch: String) = this()
    def this(family: String, major: String, minor: Unit, patch: String) = this()
    def this(family: String, major: Unit, minor: String, patch: String) = this()
    def this(family: String, major: Unit, minor: Unit, patch: String) = this()
    def this(family: Unit, major: String, minor: String, patch: String) = this()
    def this(family: Unit, major: String, minor: Unit, patch: String) = this()
    def this(family: Unit, major: Unit, minor: String, patch: String) = this()
    def this(family: Unit, major: Unit, minor: Unit, patch: String) = this()
    
    var family: String = js.native
    
    var major: String = js.native
    
    var minor: String = js.native
    
    var patch: String = js.native
    
    /**
      * Outputs a JSON string of the Device, values are defaulted to undefined so they are not outputed in the stringify.
      */
    def toJSON(): Family = js.native
    
    /**
      * Generates the version of the Device.
      */
    def toVersion(): String = js.native
  }
  
  @JSImport("useragent", "OperatingSystem")
  @js.native
  /**
    * The representation of a parsed Operating System.
    * @param [family='Other'] The name of the os
    * @param [major='0'] Major version of the os
    * @param [minor='0'] Minor version of the os
    * @param [patch='0'] Patch version of the os
    */
  class OperatingSystem () extends StObject {
    def this(family: String) = this()
    def this(family: String, major: String) = this()
    def this(family: Unit, major: String) = this()
    def this(family: String, major: String, minor: String) = this()
    def this(family: String, major: Unit, minor: String) = this()
    def this(family: Unit, major: String, minor: String) = this()
    def this(family: Unit, major: Unit, minor: String) = this()
    def this(family: String, major: String, minor: String, patch: String) = this()
    def this(family: String, major: String, minor: Unit, patch: String) = this()
    def this(family: String, major: Unit, minor: String, patch: String) = this()
    def this(family: String, major: Unit, minor: Unit, patch: String) = this()
    def this(family: Unit, major: String, minor: String, patch: String) = this()
    def this(family: Unit, major: String, minor: Unit, patch: String) = this()
    def this(family: Unit, major: Unit, minor: String, patch: String) = this()
    def this(family: Unit, major: Unit, minor: Unit, patch: String) = this()
    
    var family: String = js.native
    
    var major: String = js.native
    
    var minor: String = js.native
    
    var patch: String = js.native
    
    /**
      * Outputs a JSON string of the OS, values are defaulted to undefined so they are not outputed in the stringify.
      */
    def toJSON(): Family = js.native
    
    /**
      * Generates the version of the Operating System.
      */
    def toVersion(): String = js.native
  }
  
  /**
    * Transform a JSON object back to a valid userAgent string
    * @param obj A JSON object or stringified JSON object
    */
  @scala.inline
  def fromJSON(obj: String): Agent = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(obj.asInstanceOf[js.Any]).asInstanceOf[Agent]
  @scala.inline
  def fromJSON(obj: Major): Agent = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(obj.asInstanceOf[js.Any]).asInstanceOf[Agent]
  
  /**
    * Does a more inaccurate but more common check for useragents identification.
    * @param useragent The user agent
    */
  @scala.inline
  def is(): Details = ^.asInstanceOf[js.Dynamic].applyDynamic("is")().asInstanceOf[Details]
  @scala.inline
  def is(useragent: String): Details = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(useragent.asInstanceOf[js.Any]).asInstanceOf[Details]
  
  /**
    * If you are doing a lot of lookups you might want to cache the results of the parsed user agent string instead, in memory.
    * @param userAgent The user agent string
    * @param jsAgent Optional UA from js to detect chrome frame
    */
  @scala.inline
  def lookup(): Agent = ^.asInstanceOf[js.Dynamic].applyDynamic("lookup")().asInstanceOf[Agent]
  @scala.inline
  def lookup(userAgent: String): Agent = ^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(userAgent.asInstanceOf[js.Any]).asInstanceOf[Agent]
  @scala.inline
  def lookup(userAgent: String, jsAgent: String): Agent = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(userAgent.asInstanceOf[js.Any], jsAgent.asInstanceOf[js.Any])).asInstanceOf[Agent]
  @scala.inline
  def lookup(userAgent: Unit, jsAgent: String): Agent = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(userAgent.asInstanceOf[js.Any], jsAgent.asInstanceOf[js.Any])).asInstanceOf[Agent]
  
  /**
    * Parses the user agent string with the generated parsers from the ua-parser project on google code.
    * @param userAgent The user agent string
    * @param jsAgent Optional UA from js to detect chrome frame
    */
  @scala.inline
  def parse(): Agent = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")().asInstanceOf[Agent]
  @scala.inline
  def parse(userAgent: String): Agent = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(userAgent.asInstanceOf[js.Any]).asInstanceOf[Agent]
  @scala.inline
  def parse(userAgent: String, jsAgent: String): Agent = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(userAgent.asInstanceOf[js.Any], jsAgent.asInstanceOf[js.Any])).asInstanceOf[Agent]
  @scala.inline
  def parse(userAgent: Unit, jsAgent: String): Agent = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(userAgent.asInstanceOf[js.Any], jsAgent.asInstanceOf[js.Any])).asInstanceOf[Agent]
  
  /**
    * Library version
    */
  @JSImport("useragent", "version")
  @js.native
  val version: Double = js.native
  
  trait Details extends StObject {
    
    var android: Boolean
    
    var chrome: Boolean
    
    var firefox: Boolean
    
    var ie: Boolean
    
    var mobile_safari: Boolean
    
    var mozilla: Boolean
    
    var opera: Boolean
    
    var safari: Boolean
    
    var version: String
    
    var webkit: Boolean
  }
  object Details {
    
    @scala.inline
    def apply(
      android: Boolean,
      chrome: Boolean,
      firefox: Boolean,
      ie: Boolean,
      mobile_safari: Boolean,
      mozilla: Boolean,
      opera: Boolean,
      safari: Boolean,
      version: String,
      webkit: Boolean
    ): Details = {
      val __obj = js.Dynamic.literal(android = android.asInstanceOf[js.Any], chrome = chrome.asInstanceOf[js.Any], firefox = firefox.asInstanceOf[js.Any], ie = ie.asInstanceOf[js.Any], mobile_safari = mobile_safari.asInstanceOf[js.Any], mozilla = mozilla.asInstanceOf[js.Any], opera = opera.asInstanceOf[js.Any], safari = safari.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], webkit = webkit.asInstanceOf[js.Any])
      __obj.asInstanceOf[Details]
    }
    
    @scala.inline
    implicit class DetailsMutableBuilder[Self <: Details] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAndroid(value: Boolean): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChrome(value: Boolean): Self = StObject.set(x, "chrome", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirefox(value: Boolean): Self = StObject.set(x, "firefox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIe(value: Boolean): Self = StObject.set(x, "ie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMobile_safari(value: Boolean): Self = StObject.set(x, "mobile_safari", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozilla(value: Boolean): Self = StObject.set(x, "mozilla", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpera(value: Boolean): Self = StObject.set(x, "opera", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSafari(value: Boolean): Self = StObject.set(x, "safari", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkit(value: Boolean): Self = StObject.set(x, "webkit", value.asInstanceOf[js.Any])
    }
  }
}
