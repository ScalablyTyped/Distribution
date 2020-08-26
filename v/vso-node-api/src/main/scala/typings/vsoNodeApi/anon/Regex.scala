package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Regex extends js.Object {
  var regex: scala.Double = js.native
  var variable: scala.Double = js.native
}

object Regex {
  @scala.inline
  def apply(regex: scala.Double, variable: scala.Double): Regex = {
    val __obj = js.Dynamic.literal(regex = regex.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Regex]
  }
  @scala.inline
  implicit class RegexOps[Self <: Regex] (val x: Self) extends AnyVal {
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
    def setRegex(value: scala.Double): Self = this.set("regex", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariable(value: scala.Double): Self = this.set("variable", value.asInstanceOf[js.Any])
  }
  
}

