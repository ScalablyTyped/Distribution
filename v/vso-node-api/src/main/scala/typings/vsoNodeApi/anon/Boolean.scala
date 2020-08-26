package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Boolean extends js.Object {
  var boolean: scala.Double = js.native
  var branchFilter: scala.Double = js.native
  var multiLine: scala.Double = js.native
  var pickList: scala.Double = js.native
  var radio: scala.Double = js.native
  var string: scala.Double = js.native
  var stringList: scala.Double = js.native
}

object Boolean {
  @scala.inline
  def apply(
    boolean: scala.Double,
    branchFilter: scala.Double,
    multiLine: scala.Double,
    pickList: scala.Double,
    radio: scala.Double,
    string: scala.Double,
    stringList: scala.Double
  ): Boolean = {
    val __obj = js.Dynamic.literal(boolean = boolean.asInstanceOf[js.Any], branchFilter = branchFilter.asInstanceOf[js.Any], multiLine = multiLine.asInstanceOf[js.Any], pickList = pickList.asInstanceOf[js.Any], radio = radio.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], stringList = stringList.asInstanceOf[js.Any])
    __obj.asInstanceOf[Boolean]
  }
  @scala.inline
  implicit class BooleanOps[Self <: Boolean] (val x: Self) extends AnyVal {
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
    def setBranchFilter(value: scala.Double): Self = this.set("branchFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def setMultiLine(value: scala.Double): Self = this.set("multiLine", value.asInstanceOf[js.Any])
    @scala.inline
    def setPickList(value: scala.Double): Self = this.set("pickList", value.asInstanceOf[js.Any])
    @scala.inline
    def setRadio(value: scala.Double): Self = this.set("radio", value.asInstanceOf[js.Any])
    @scala.inline
    def setString(value: scala.Double): Self = this.set("string", value.asInstanceOf[js.Any])
    @scala.inline
    def setStringList(value: scala.Double): Self = this.set("stringList", value.asInstanceOf[js.Any])
  }
  
}

