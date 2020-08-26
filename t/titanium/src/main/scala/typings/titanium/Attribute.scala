package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An abstract datatype for specifying an attributed string attribute.
  */
@js.native
trait Attribute extends js.Object {
  /**
    * Attribute range.
    */
  var range: js.Array[Double] = js.native
  /**
    * Attribute to apply to the text.
    */
  var `type`: Double = js.native
  /**
    * Attribute value.
    */
  var value: Double = js.native
}

object Attribute {
  @scala.inline
  def apply(range: js.Array[Double], `type`: Double, value: Double): Attribute = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attribute]
  }
  @scala.inline
  implicit class AttributeOps[Self <: Attribute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRangeVarargs(value: Double*): Self = this.set("range", js.Array(value :_*))
    @scala.inline
    def setRange(value: js.Array[Double]): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: Double): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

