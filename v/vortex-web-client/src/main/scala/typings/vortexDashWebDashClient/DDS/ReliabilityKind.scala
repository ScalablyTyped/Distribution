package typings.vortexDashWebDashClient.DDS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReliabilityKind extends js.Object

@JSGlobal("DDS.ReliabilityKind")
@js.native
object ReliabilityKind extends js.Object {
  @js.native
  sealed trait BestEffort extends ReliabilityKind
  
  @js.native
  sealed trait Reliable extends ReliabilityKind
  
  /* 1 */ val BestEffort: typings.vortexDashWebDashClient.DDS.ReliabilityKind.BestEffort with Double = js.native
  /* 0 */ val Reliable: typings.vortexDashWebDashClient.DDS.ReliabilityKind.Reliable with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReliabilityKind with Double] = js.native
}

