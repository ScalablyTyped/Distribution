package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LinksOneHopDoesNotContain extends js.Object {
  var linksOneHopDoesNotContain: scala.Double
  var linksOneHopMayContain: scala.Double
  var linksOneHopMustContain: scala.Double
  var linksRecursiveDoesNotContain: scala.Double
  var linksRecursiveMayContain: scala.Double
  var linksRecursiveMustContain: scala.Double
  var workItems: scala.Double
}

object Anon_LinksOneHopDoesNotContain {
  @scala.inline
  def apply(
    linksOneHopDoesNotContain: scala.Double,
    linksOneHopMayContain: scala.Double,
    linksOneHopMustContain: scala.Double,
    linksRecursiveDoesNotContain: scala.Double,
    linksRecursiveMayContain: scala.Double,
    linksRecursiveMustContain: scala.Double,
    workItems: scala.Double
  ): Anon_LinksOneHopDoesNotContain = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("linksOneHopDoesNotContain")(linksOneHopDoesNotContain)
    __obj.updateDynamic("linksOneHopMayContain")(linksOneHopMayContain)
    __obj.updateDynamic("linksOneHopMustContain")(linksOneHopMustContain)
    __obj.updateDynamic("linksRecursiveDoesNotContain")(linksRecursiveDoesNotContain)
    __obj.updateDynamic("linksRecursiveMayContain")(linksRecursiveMayContain)
    __obj.updateDynamic("linksRecursiveMustContain")(linksRecursiveMustContain)
    __obj.updateDynamic("workItems")(workItems)
    __obj.asInstanceOf[Anon_LinksOneHopDoesNotContain]
  }
}

