package typings
package urlencodeLib.urlencodeMod

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
  def apply(str: java.lang.String): java.lang.String = js.native
  def apply(str: java.lang.String, charset: java.lang.String): java.lang.String = js.native
  /**
  	 * Decode string
  	 * @param encodedString The encoded string.
  	 */
  def decode(encodedString: java.lang.String): java.lang.String = js.native
  def decode(encodedString: java.lang.String, charset: java.lang.String): java.lang.String = js.native
  /**
  	 * Encode string
  	 * @param str The string for encoding.
  	 */
  def encode(str: java.lang.String): java.lang.String = js.native
  def encode(str: java.lang.String, charset: java.lang.String): java.lang.String = js.native
  /**
  	 * Parse querystring
  	 * @param queryString Querystring
  	 * @param charsetParam The charset for parsing
  	 */
  def parse(queryString: java.lang.String, charsetParam: urlencodeLib.urlencodeMod.urlencodeNs.charsetParam): js.Any = js.native
  /**
  	 * Stringify object
  	 * @param obj Query Object
  	 * @param charsetParam The charset for parsing
  	 */
  def stringify(obj: js.Any): java.lang.String = js.native
  def stringify(obj: js.Any, prefix: urlencodeLib.urlencodeMod.urlencodeNs.charsetParam): java.lang.String = js.native
  def stringify(
    obj: js.Any,
    prefix: urlencodeLib.urlencodeMod.urlencodeNs.charsetParam,
    charsetParam: urlencodeLib.urlencodeMod.urlencodeNs.charsetParam
  ): java.lang.String = js.native
}

