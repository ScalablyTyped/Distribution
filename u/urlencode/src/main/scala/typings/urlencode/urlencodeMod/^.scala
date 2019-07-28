package typings.urlencode.urlencodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("urlencode", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Encode string
    * @param str The string for encoding.
    */
  def apply(str: String): String = js.native
  def apply(str: String, charset: String): String = js.native
  /**
  	 * Decode string
  	 * @param encodedString The encoded string.
  	 */
  def decode(encodedString: String): String = js.native
  def decode(encodedString: String, charset: String): String = js.native
  /**
  	 * Encode string
  	 * @param str The string for encoding.
  	 */
  def encode(str: String): String = js.native
  def encode(str: String, charset: String): String = js.native
  /**
  	 * Parse querystring
  	 * @param queryString Querystring
  	 * @param charsetParam The charset for parsing
  	 */
  def parse(queryString: String, charsetParam: charsetParam): js.Any = js.native
  /**
  	 * Stringify object
  	 * @param obj Query Object
  	 * @param charsetParam The charset for parsing
  	 */
  def stringify(obj: js.Any): String = js.native
  def stringify(obj: js.Any, prefix: charsetParam): String = js.native
  def stringify(obj: js.Any, prefix: charsetParam, charsetParam: charsetParam): String = js.native
}

