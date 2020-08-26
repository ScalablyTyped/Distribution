package typings.vueSplitpane.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SplitpaneProps extends js.Object {
   // = ['vertical', 'horizontal']
  var className: String = js.native
  var defaultPercent: Double = js.native
  var minPercent: Double = js.native
  var split: String = js.native
}

object SplitpaneProps {
  @scala.inline
  def apply(className: String, defaultPercent: Double, minPercent: Double, split: String): SplitpaneProps = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], defaultPercent = defaultPercent.asInstanceOf[js.Any], minPercent = minPercent.asInstanceOf[js.Any], split = split.asInstanceOf[js.Any])
    __obj.asInstanceOf[SplitpaneProps]
  }
  @scala.inline
  implicit class SplitpanePropsOps[Self <: SplitpaneProps] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultPercent(value: Double): Self = this.set("defaultPercent", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinPercent(value: Double): Self = this.set("minPercent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSplit(value: String): Self = this.set("split", value.asInstanceOf[js.Any])
  }
  
}

