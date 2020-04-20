package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLinksOneHopDoesNotContain extends js.Object {
  var linksOneHopDoesNotContain: Double
  var linksOneHopMayContain: Double
  var linksOneHopMustContain: Double
  var linksRecursiveDoesNotContain: Double
  var linksRecursiveMayContain: Double
  var linksRecursiveMustContain: Double
  var workItems: Double
}

object AnonLinksOneHopDoesNotContain {
  @scala.inline
  def apply(
    linksOneHopDoesNotContain: Double,
    linksOneHopMayContain: Double,
    linksOneHopMustContain: Double,
    linksRecursiveDoesNotContain: Double,
    linksRecursiveMayContain: Double,
    linksRecursiveMustContain: Double,
    workItems: Double
  ): AnonLinksOneHopDoesNotContain = {
    val __obj = js.Dynamic.literal(linksOneHopDoesNotContain = linksOneHopDoesNotContain.asInstanceOf[js.Any], linksOneHopMayContain = linksOneHopMayContain.asInstanceOf[js.Any], linksOneHopMustContain = linksOneHopMustContain.asInstanceOf[js.Any], linksRecursiveDoesNotContain = linksRecursiveDoesNotContain.asInstanceOf[js.Any], linksRecursiveMayContain = linksRecursiveMayContain.asInstanceOf[js.Any], linksRecursiveMustContain = linksRecursiveMustContain.asInstanceOf[js.Any], workItems = workItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLinksOneHopDoesNotContain]
  }
}

