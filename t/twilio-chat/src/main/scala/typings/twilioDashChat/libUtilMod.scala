package typings.twilioDashChat

import typings.std.Date
import typings.twilioDashChat.libLoggerMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-chat/lib/util", JSImport.Namespace)
@js.native
object libUtilMod extends js.Object {
  /**
    * Construct URI with query parameters
    */
  @js.native
  class UriBuilder protected () extends js.Object {
    def this(base: String) = this()
    var args: js.Any = js.native
    var base: js.Any = js.native
    var paths: js.Any = js.native
    def arg(name: String, value: js.Any): UriBuilder = js.native
    def build(): String = js.native
    def path(name: String): UriBuilder = js.native
  }
  
  /**
    * Deep-clone an object. Note that this does not work on object containing
    * functions.
    * @param {object} obj - the object to deep-clone
    * @returns {object}
    */
  def deepClone[T](obj: T): T = js.native
  /**
    * Checks if objects are equal
    */
  def isDeepEqual(o1: js.Object, o2: js.Object): Boolean = js.native
  def parseAttributes(rawAttributes: js.Any, warningMessage: String, log: Logger): js.Object = js.native
  def parseTime(timeString: js.Any): Date = js.native
  def parseToNumber(value: js.Any): Double = js.native
}

