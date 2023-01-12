package typings.woothee

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("woothee", JSImport.Namespace)
  @js.native
  val ^ : Woothee = js.native
  
  /**
    * The Woothee object.
    */
  trait Woothee extends StObject {
    
    /**
      * Package version.
      */
    var VERSION: String
    
    /**
      * Finding crawler.
      */
    def isCrawler(ua: String): Boolean
    
    /**
      * Parsing user-agent.
      */
    def parse(uaString: String): WootheeParseResult
  }
  object Woothee {
    
    inline def apply(VERSION: String, isCrawler: String => Boolean, parse: String => WootheeParseResult): Woothee = {
      val __obj = js.Dynamic.literal(VERSION = VERSION.asInstanceOf[js.Any], isCrawler = js.Any.fromFunction1(isCrawler), parse = js.Any.fromFunction1(parse))
      __obj.asInstanceOf[Woothee]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Woothee] (val x: Self) extends AnyVal {
      
      inline def setIsCrawler(value: String => Boolean): Self = StObject.set(x, "isCrawler", js.Any.fromFunction1(value))
      
      inline def setParse(value: String => WootheeParseResult): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
      
      inline def setVERSION(value: String): Self = StObject.set(x, "VERSION", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * The Woothee parse result object.
    */
  trait WootheeParseResult extends StObject {
    
    /**
      * labels of user terminal type, one of 'pc', 'smartphone', 'mobilephone', 'appliance', 'crawler' or 'misc' (or 'UNKNOWN').
      */
    var category: String
    
    /**
      * the name of browser, like 'Internet Explorer', 'Firefox', 'GoogleBot'.
      */
    var name: String
    
    /**
      * ex: 'Windows 7', 'Mac OSX', 'iPhone', 'iPad', 'Android'.
      * This field used to indicate cellar phone carrier for category 'mobilephone'.
      */
    var os: String
    
    /**
      * optional field, shows version of operating systems
      */
    var os_version: String
    
    /**
      * optional field, shows browser vendor
      */
    var vendor: String
    
    /**
      * version string, like '8.0' for IE, '9.0.1' for Firefix, '0.2.149.27' for Chrome, and so on.
      */
    var version: String
  }
  object WootheeParseResult {
    
    inline def apply(category: String, name: String, os: String, os_version: String, vendor: String, version: String): WootheeParseResult = {
      val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], os_version = os_version.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[WootheeParseResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WootheeParseResult] (val x: Self) extends AnyVal {
      
      inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOs(value: String): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
      
      inline def setOs_version(value: String): Self = StObject.set(x, "os_version", value.asInstanceOf[js.Any])
      
      inline def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Woothee
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Woothee = ^
}
