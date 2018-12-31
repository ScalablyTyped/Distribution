package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An abstract datatype for specifying an attributed string attribute.
  */
trait Attribute extends js.Object {
  /**
  	 * Attribute range.
  	 */
  var range: js.Array[scala.Double]
  /**
  	 * Attribute to apply to the text.
  	 */
  var `type`: scala.Double
  /**
  	 * Attribute value.
  	 */
  var value: scala.Double
}

