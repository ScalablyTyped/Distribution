package typings
package vortexDashWebDashClientLib.DDSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReliabilityKind extends js.Object

@JSGlobal("DDS.ReliabilityKind")
@js.native
object ReliabilityKind extends js.Object {
  @js.native
  sealed trait BestEffort
    extends vortexDashWebDashClientLib.DDSNs.ReliabilityKind
  
  @js.native
  sealed trait Reliable
    extends vortexDashWebDashClientLib.DDSNs.ReliabilityKind
  
  /* 1 */ val BestEffort: BestEffort with scala.Double = js.native
  /* 0 */ val Reliable: Reliable with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vortexDashWebDashClientLib.DDSNs.ReliabilityKind with scala.Double] = js.native
}

