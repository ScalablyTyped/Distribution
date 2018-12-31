package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Named parameters for <Titanium.Codec.decodeString>.
  */
trait DecodeStringDict extends js.Object {
  /**
  	 * Character set to use when encoding this string to bytes.
  	 */
  var charset: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Number of bytes to decode.
  	 */
  var length: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Index in the `source` buffer of the first byte of data to decode.
  	 */
  var position: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Buffer to decode.
  	 */
  var source: titaniumLib.TitaniumNs.Buffer
}

