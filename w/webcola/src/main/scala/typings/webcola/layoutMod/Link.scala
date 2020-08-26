package typings.webcola.layoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Link[NodeRefType] extends js.Object {
  var length: js.UndefOr[Double] = js.native
  var source: NodeRefType = js.native
  var target: NodeRefType = js.native
  var weight: js.UndefOr[Double] = js.native
}

object Link {
  @scala.inline
  def apply[NodeRefType](source: NodeRefType, target: NodeRefType): Link[NodeRefType] = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Link[NodeRefType]]
  }
  @scala.inline
  implicit class LinkOps[Self <: Link[_], NodeRefType] (val x: Self with Link[NodeRefType]) extends AnyVal {
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
    def setSource(value: NodeRefType): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: NodeRefType): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    @scala.inline
    def setWeight(value: Double): Self = this.set("weight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
  }
  
}

