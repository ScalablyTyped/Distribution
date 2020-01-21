package typings.winrtUwp.Windows.Media.Effects

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MediaMemoryTypes with Double] = js.native
  /* 1 */ @js.native
  object cpu extends TopLevel[cpu with Double]
  
  /* 0 */ @js.native
  object gpu extends TopLevel[gpu with Double]
  
  /* 2 */ @js.native
  object gpuAndCpu extends TopLevel[gpuAndCpu with Double]
  
}

