package typings.vigourUa

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Returns an object representing the user agent including data such as browser, device and platform
    * @param _ua the raw user agent string to be converted
    * @param obj object to be merged to the output result
    * @returns object representing your user agent
    */
  @JSImport("vigour-ua", JSImport.Namespace)
  @js.native
  def apply(_ua: String): UserAgent = js.native
  /**
    * Returns an object representing the user agent including data such as browser, device and platform
    * @param _ua the raw user agent string to be converted
    * @returns object representing your user agent
    */
  @JSImport("vigour-ua", JSImport.Namespace)
  @js.native
  def apply[T /* <: js.Object */](_ua: String, obj: T): UserAgent with T = js.native
  
  @js.native
  trait UserAgent extends /* value */ StringDictionary[String | Double] {
    
    var browser: String = js.native
    
    var prefix: String = js.native
    
    var version: Double = js.native
  }
  object UserAgent {
    
    @scala.inline
    def apply(browser: String, prefix: String, version: Double): UserAgent = {
      val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserAgent]
    }
    
    @scala.inline
    implicit class UserAgentMutableBuilder[Self <: UserAgent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBrowser(value: String): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
