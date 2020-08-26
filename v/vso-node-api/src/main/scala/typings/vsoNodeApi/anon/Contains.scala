package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Contains extends js.Object {
  var contains: scala.Double = js.native
  var exact: scala.Double = js.native
  var startsWith: scala.Double = js.native
}

object Contains {
  @scala.inline
  def apply(contains: scala.Double, exact: scala.Double, startsWith: scala.Double): Contains = {
    val __obj = js.Dynamic.literal(contains = contains.asInstanceOf[js.Any], exact = exact.asInstanceOf[js.Any], startsWith = startsWith.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contains]
  }
  @scala.inline
  implicit class ContainsOps[Self <: Contains] (val x: Self) extends AnyVal {
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
    def setContains(value: scala.Double): Self = this.set("contains", value.asInstanceOf[js.Any])
    @scala.inline
    def setExact(value: scala.Double): Self = this.set("exact", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartsWith(value: scala.Double): Self = this.set("startsWith", value.asInstanceOf[js.Any])
  }
  
}

