package typings
package vortexDashWebDashClientLib.DDSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DurabilityKind extends js.Object

@JSGlobal("DDS.DurabilityKind")
@js.native
object DurabilityKind extends js.Object {
  @js.native
  sealed trait Persistent
    extends vortexDashWebDashClientLib.DDSNs.DurabilityKind
  
  @js.native
  sealed trait Transient
    extends vortexDashWebDashClientLib.DDSNs.DurabilityKind
  
  @js.native
  sealed trait TransientLocal
    extends vortexDashWebDashClientLib.DDSNs.DurabilityKind
  
  @js.native
  sealed trait Volatile
    extends vortexDashWebDashClientLib.DDSNs.DurabilityKind
  
  /* 3 */ val Persistent: Persistent with scala.Double = js.native
  /* 2 */ val Transient: Transient with scala.Double = js.native
  /* 1 */ val TransientLocal: TransientLocal with scala.Double = js.native
  /* 0 */ val Volatile: Volatile with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vortexDashWebDashClientLib.DDSNs.DurabilityKind with scala.Double] = js.native
}

