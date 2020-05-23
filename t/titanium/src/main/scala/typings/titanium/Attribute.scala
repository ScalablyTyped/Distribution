package typings.titanium

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
  var range: js.Array[Double]
  /**
    * Attribute to apply to the text.
    */
  var `type`: Double
  /**
    * Attribute value.
    */
  var value: Double
}

object Attribute {
  @scala.inline
  def apply(range: js.Array[Double], `type`: Double, value: Double): Attribute = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attribute]
  }
}

