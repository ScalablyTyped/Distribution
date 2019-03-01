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

object Attribute {
  @scala.inline
  def apply(range: js.Array[scala.Double], `type`: scala.Double, value: scala.Double): Attribute = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("range")(range)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Attribute]
  }
}

