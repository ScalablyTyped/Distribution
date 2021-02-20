package typings.twilioChat

import typings.std.Date
import typings.twilioChat.loggerMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
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
  @JSImport("twilio-chat/lib/util", "deepClone")
  @js.native
  def deepClone[T](obj: T): T = js.native
  
  /**
    * Checks if objects are equal
    */
  @JSImport("twilio-chat/lib/util", "isDeepEqual")
  @js.native
  def isDeepEqual(o1: js.Object, o2: js.Object): Boolean = js.native
  
  @JSImport("twilio-chat/lib/util", "parseAttributes")
  @js.native
  def parseAttributes(rawAttributes: js.Any, warningMessage: String, log: Logger): js.Object = js.native
  
  @JSImport("twilio-chat/lib/util", "parseTime")
  @js.native
  def parseTime(timeString: js.Any): Date = js.native
  
  @JSImport("twilio-chat/lib/util", "parseToNumber")
  @js.native
  def parseToNumber(value: js.Any): Double = js.native
}
