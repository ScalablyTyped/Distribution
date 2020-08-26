package typings.vegaTypings.bindMod

import typings.vegaTypings.vegaTypingsStrings.radio
import typings.vegaTypings.vegaTypingsStrings.select
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BindRadioSelect
  extends BaseBinding
     with Binding {
  var input: radio | select = js.native
  var labels: js.UndefOr[js.Array[String]] = js.native
  var options: js.Array[_] = js.native
}

object BindRadioSelect {
  @scala.inline
  def apply(input: radio | select, options: js.Array[_]): BindRadioSelect = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindRadioSelect]
  }
  @scala.inline
  implicit class BindRadioSelectOps[Self <: BindRadioSelect] (val x: Self) extends AnyVal {
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
    def setInput(value: radio | select): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptionsVarargs(value: js.Any*): Self = this.set("options", js.Array(value :_*))
    @scala.inline
    def setOptions(value: js.Array[_]): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelsVarargs(value: String*): Self = this.set("labels", js.Array(value :_*))
    @scala.inline
    def setLabels(value: js.Array[String]): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
  }
  
}

