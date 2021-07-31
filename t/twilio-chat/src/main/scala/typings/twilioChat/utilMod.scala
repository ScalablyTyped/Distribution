package typings.twilioChat

import typings.std.Date
import typings.twilioChat.loggerMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("twilio-chat/lib/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Construct URI with query parameters
    */
  @JSImport("twilio-chat/lib/util", "UriBuilder")
  @js.native
  class UriBuilder protected () extends StObject {
    def this(base: String) = this()
    
    def arg(name: String, value: js.Any): UriBuilder = js.native
    
    var args: js.Any = js.native
    
    var base: js.Any = js.native
    
    def build(): String = js.native
    
    def path(name: String): UriBuilder = js.native
    
    var paths: js.Any = js.native
  }
  
  /**
    * Deep-clone an object. Note that this does not work on object containing
    * functions.
    * @param {object} obj - the object to deep-clone
    * @returns {object}
    */
  @scala.inline
  def deepClone[T](obj: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("deepClone")(obj.asInstanceOf[js.Any]).asInstanceOf[T]
  
  /**
    * Checks if objects are equal
    */
  @scala.inline
  def isDeepEqual(o1: js.Object, o2: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDeepEqual")(o1.asInstanceOf[js.Any], o2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def parseAttributes(rawAttributes: js.Any, warningMessage: String, log: Logger): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("parseAttributes")(rawAttributes.asInstanceOf[js.Any], warningMessage.asInstanceOf[js.Any], log.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  @scala.inline
  def parseTime(timeString: js.Any): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("parseTime")(timeString.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  @scala.inline
  def parseToNumber(value: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("parseToNumber")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
}
