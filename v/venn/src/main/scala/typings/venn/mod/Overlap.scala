package typings.venn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Overlap extends js.Object {
  var sets: js.Array[String] = js.native
  var size: Double = js.native
  var weight: js.UndefOr[Double] = js.native
}

object Overlap {
  @scala.inline
  def apply(sets: js.Array[String], size: Double): Overlap = {
    val __obj = js.Dynamic.literal(sets = sets.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Overlap]
  }
  @scala.inline
  implicit class OverlapOps[Self <: Overlap] (val x: Self) extends AnyVal {
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
    def setSetsVarargs(value: String*): Self = this.set("sets", js.Array(value :_*))
    @scala.inline
    def setSets(value: js.Array[String]): Self = this.set("sets", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeight(value: Double): Self = this.set("weight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
  }
  
}

