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
  
  val cpu: cpu with java.lang.String = js.native
  val gpu: gpu with java.lang.String = js.native
  val gpuAndCpu: gpuAndCpu with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs.MediaMemoryTypes with java.lang.String
  ] = js.native
}

