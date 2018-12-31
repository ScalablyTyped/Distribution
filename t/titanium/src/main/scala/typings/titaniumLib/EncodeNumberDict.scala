package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Named parameters for <Titanium.Codec.encodeNumber>.
  */
trait EncodeNumberDict extends js.Object {
  /**
  	 * Byte order to encode with.
  	 */
  var byteOrder: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Destination buffer.
  	 */
  var dest: titaniumLib.TitaniumNs.Buffer
  /**
  	 * Index in the `dest` buffer of the first byte of encoded data.
  	 */
  var position: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Number to encode.
  	 */
  var source: scala.Double
  /**
  	 * Encoding type to use.
  	 */
  var `type`: java.lang.String
}

