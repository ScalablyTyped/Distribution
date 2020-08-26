package typings.systeminformation.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Summary extends js.Object {
  var summary: Count = js.native
}

object Summary {
  @scala.inline
  def apply(summary: Count): Summary = {
    val __obj = js.Dynamic.literal(summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[Summary]
  }
  @scala.inline
  implicit class SummaryOps[Self <: Summary] (val x: Self) extends AnyVal {
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
    def setSummary(value: Count): Self = this.set("summary", value.asInstanceOf[js.Any])
  }
  
}

