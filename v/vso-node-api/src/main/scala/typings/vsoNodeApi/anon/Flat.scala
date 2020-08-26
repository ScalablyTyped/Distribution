package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Flat extends js.Object {
  var flat: scala.Double = js.native
  var oneHop: scala.Double = js.native
  var tree: scala.Double = js.native
}

object Flat {
  @scala.inline
  def apply(flat: scala.Double, oneHop: scala.Double, tree: scala.Double): Flat = {
    val __obj = js.Dynamic.literal(flat = flat.asInstanceOf[js.Any], oneHop = oneHop.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flat]
  }
  @scala.inline
  implicit class FlatOps[Self <: Flat] (val x: Self) extends AnyVal {
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
    def setFlat(value: scala.Double): Self = this.set("flat", value.asInstanceOf[js.Any])
    @scala.inline
    def setOneHop(value: scala.Double): Self = this.set("oneHop", value.asInstanceOf[js.Any])
    @scala.inline
    def setTree(value: scala.Double): Self = this.set("tree", value.asInstanceOf[js.Any])
  }
  
}

