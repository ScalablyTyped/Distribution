package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinksOneHopDoesNotContain extends js.Object {
  var linksOneHopDoesNotContain: scala.Double
  var linksOneHopMayContain: scala.Double
  var linksOneHopMustContain: scala.Double
  var linksRecursiveDoesNotContain: scala.Double
  var linksRecursiveMayContain: scala.Double
  var linksRecursiveMustContain: scala.Double
  var workItems: scala.Double
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
}

