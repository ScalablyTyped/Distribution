package typings.vortexDashWebDashClient.DDS

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DurabilityKind with Double] = js.native
  /* 3 */ @js.native
  object Persistent extends TopLevel[Persistent with Double]
  
  /* 2 */ @js.native
  object Transient extends TopLevel[Transient with Double]
  
  /* 1 */ @js.native
  object TransientLocal extends TopLevel[TransientLocal with Double]
  
  /* 0 */ @js.native
  object Volatile extends TopLevel[Volatile with Double]
  
}

