package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllOrNone extends js.Object {
  var allOrNone: scala.Double = js.native
  var bestEffort: scala.Double = js.native
}

object AllOrNone {
  @scala.inline
  def apply(allOrNone: scala.Double, bestEffort: scala.Double): AllOrNone = {
    val __obj = js.Dynamic.literal(allOrNone = allOrNone.asInstanceOf[js.Any], bestEffort = bestEffort.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllOrNone]
  }
  @scala.inline
  implicit class AllOrNoneOps[Self <: AllOrNone] (val x: Self) extends AnyVal {
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
    def setAllOrNone(value: scala.Double): Self = this.set("allOrNone", value.asInstanceOf[js.Any])
    @scala.inline
    def setBestEffort(value: scala.Double): Self = this.set("bestEffort", value.asInstanceOf[js.Any])
  }
  
}

