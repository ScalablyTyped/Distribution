package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Named parameters for <Titanium.Codec.decodeNumber>.
 */

trait DecodeNumberDict extends js.Object {
  /**
  	 * byte order to decode with.
  	 */
  var byteOrder: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Index in the `source` buffer of the first byte of data to decode.
  	 */
  var position: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Buffer to decode.
  	 */
  var source: titaniumLib.TitaniumNs.Buffer
  /**
  	 * The encoding type to use.
  	 */
  var `type`: java.lang.String
}

