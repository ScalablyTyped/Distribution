package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Named parameters for <Titanium.Codec.encodeString>.
  */
trait EncodeStringDict extends js.Object {
  /**
  	 * Character encoding to use when encoding this string to bytes.
  	 */
  var charset: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Destination buffer.
  	 */
  var dest: titaniumLib.TitaniumNs.Buffer
  /**
  	 * Index in the `dest` buffer of the first byte of the encoded string.
  	 */
  var destPosition: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Source string to encode.
  	 */
  var source: java.lang.String
  /**
  	 * Number of characters in `source` to encode.
  	 */
  var sourceLength: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Position in `source` to start encoding.
  	 */
  var sourcePosition: js.UndefOr[scala.Double] = js.undefined
}

