package typings.winrtDashUwp.WindowsNs.MediaNs.EffectsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MediaMemoryTypes extends js.Object

/** Specifies the types of memory that can be used for a media operation. */
@JSGlobal("Windows.Media.Effects.MediaMemoryTypes")
@js.native
object MediaMemoryTypes extends js.Object {
  /** CPU memory. */
  @js.native
  sealed trait cpu extends MediaMemoryTypes
  
  /** GPU memory. */
  @js.native
  sealed trait gpu extends MediaMemoryTypes
  
  /** Both GPU and CPU memory. */
  @js.native
  sealed trait gpuAndCpu extends MediaMemoryTypes
  
  /* 1 */ val cpu: typings.winrtDashUwp.WindowsNs.MediaNs.EffectsNs.MediaMemoryTypes.cpu with Double = js.native
  /* 0 */ val gpu: typings.winrtDashUwp.WindowsNs.MediaNs.EffectsNs.MediaMemoryTypes.gpu with Double = js.native
  /* 2 */ val gpuAndCpu: typings.winrtDashUwp.WindowsNs.MediaNs.EffectsNs.MediaMemoryTypes.gpuAndCpu with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MediaMemoryTypes with Double] = js.native
}

