package typings
package winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs

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
  sealed trait cpu
    extends winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs.MediaMemoryTypes
  
  /** GPU memory. */
  @js.native
  sealed trait gpu
    extends winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs.MediaMemoryTypes
  
  /** Both GPU and CPU memory. */
  @js.native
  sealed trait gpuAndCpu
    extends winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs.MediaMemoryTypes
  
  /* 1 */ val cpu: cpu with scala.Double = js.native
  /* 0 */ val gpu: gpu with scala.Double = js.native
  /* 2 */ val gpuAndCpu: gpuAndCpu with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs.MediaMemoryTypes with scala.Double] = js.native
}

