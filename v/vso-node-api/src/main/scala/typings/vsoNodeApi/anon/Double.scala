package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Double extends js.Object {
  var boolean: scala.Double = js.native
  var dateTime: scala.Double = js.native
  var double: scala.Double = js.native
  var integer: scala.Double = js.native
  var plainText: scala.Double = js.native
  var string: scala.Double = js.native
  var treePath: scala.Double = js.native
}

object Double {
  @scala.inline
  def apply(
    boolean: scala.Double,
    dateTime: scala.Double,
    double: scala.Double,
    integer: scala.Double,
    plainText: scala.Double,
    string: scala.Double,
    treePath: scala.Double
  ): Double = {
    val __obj = js.Dynamic.literal(boolean = boolean.asInstanceOf[js.Any], dateTime = dateTime.asInstanceOf[js.Any], double = double.asInstanceOf[js.Any], integer = integer.asInstanceOf[js.Any], plainText = plainText.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], treePath = treePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Double]
  }
  @scala.inline
  implicit class DoubleOps[Self <: Double] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBoolean(value: scala.Double): Self = this.set("boolean", value.asInstanceOf[js.Any])
    @scala.inline
    def setDateTime(value: scala.Double): Self = this.set("dateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setDouble(value: scala.Double): Self = this.set("double", value.asInstanceOf[js.Any])
    @scala.inline
    def setInteger(value: scala.Double): Self = this.set("integer", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlainText(value: scala.Double): Self = this.set("plainText", value.asInstanceOf[js.Any])
    @scala.inline
    def setString(value: scala.Double): Self = this.set("string", value.asInstanceOf[js.Any])
    @scala.inline
    def setTreePath(value: scala.Double): Self = this.set("treePath", value.asInstanceOf[js.Any])
  }
  
}

