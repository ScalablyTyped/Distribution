package typings.vortexDashWebDashClient.DDSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DurabilityKind extends js.Object

@JSGlobal("DDS.DurabilityKind")
@js.native
object DurabilityKind extends js.Object {
  @js.native
  sealed trait Persistent extends DurabilityKind
  
  @js.native
  sealed trait Transient extends DurabilityKind
  
  @js.native
  sealed trait TransientLocal extends DurabilityKind
  
  @js.native
  sealed trait Volatile extends DurabilityKind
  
  /* 3 */ val Persistent: typings.vortexDashWebDashClient.DDSNs.DurabilityKind.Persistent with Double = js.native
  /* 2 */ val Transient: typings.vortexDashWebDashClient.DDSNs.DurabilityKind.Transient with Double = js.native
  /* 1 */ val TransientLocal: typings.vortexDashWebDashClient.DDSNs.DurabilityKind.TransientLocal with Double = js.native
  /* 0 */ val Volatile: typings.vortexDashWebDashClient.DDSNs.DurabilityKind.Volatile with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DurabilityKind with Double] = js.native
}

