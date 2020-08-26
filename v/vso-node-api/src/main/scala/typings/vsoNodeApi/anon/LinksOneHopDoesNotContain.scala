package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinksOneHopDoesNotContain extends js.Object {
  var linksOneHopDoesNotContain: scala.Double = js.native
  var linksOneHopMayContain: scala.Double = js.native
  var linksOneHopMustContain: scala.Double = js.native
  var linksRecursiveDoesNotContain: scala.Double = js.native
  var linksRecursiveMayContain: scala.Double = js.native
  var linksRecursiveMustContain: scala.Double = js.native
  var workItems: scala.Double = js.native
}

object LinksOneHopDoesNotContain {
  @scala.inline
  def apply(
    linksOneHopDoesNotContain: scala.Double,
    linksOneHopMayContain: scala.Double,
    linksOneHopMustContain: scala.Double,
    linksRecursiveDoesNotContain: scala.Double,
    linksRecursiveMayContain: scala.Double,
    linksRecursiveMustContain: scala.Double,
    workItems: scala.Double
  ): LinksOneHopDoesNotContain = {
    val __obj = js.Dynamic.literal(linksOneHopDoesNotContain = linksOneHopDoesNotContain.asInstanceOf[js.Any], linksOneHopMayContain = linksOneHopMayContain.asInstanceOf[js.Any], linksOneHopMustContain = linksOneHopMustContain.asInstanceOf[js.Any], linksRecursiveDoesNotContain = linksRecursiveDoesNotContain.asInstanceOf[js.Any], linksRecursiveMayContain = linksRecursiveMayContain.asInstanceOf[js.Any], linksRecursiveMustContain = linksRecursiveMustContain.asInstanceOf[js.Any], workItems = workItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinksOneHopDoesNotContain]
  }
  @scala.inline
  implicit class LinksOneHopDoesNotContainOps[Self <: LinksOneHopDoesNotContain] (val x: Self) extends AnyVal {
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
    def setLinksOneHopDoesNotContain(value: scala.Double): Self = this.set("linksOneHopDoesNotContain", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinksOneHopMayContain(value: scala.Double): Self = this.set("linksOneHopMayContain", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinksOneHopMustContain(value: scala.Double): Self = this.set("linksOneHopMustContain", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinksRecursiveDoesNotContain(value: scala.Double): Self = this.set("linksRecursiveDoesNotContain", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinksRecursiveMayContain(value: scala.Double): Self = this.set("linksRecursiveMayContain", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinksRecursiveMustContain(value: scala.Double): Self = this.set("linksRecursiveMustContain", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorkItems(value: scala.Double): Self = this.set("workItems", value.asInstanceOf[js.Any])
  }
  
}

