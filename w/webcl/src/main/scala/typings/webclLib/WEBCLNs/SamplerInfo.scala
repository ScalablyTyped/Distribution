package typings
package webclLib.WEBCLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SamplerInfo extends js.Object

/* cl_sampler_info */
@JSGlobal("WEBCL.SamplerInfo")
@js.native
object SamplerInfo extends js.Object {
  @js.native
  sealed trait SAMPLER_ADDRESSING_MODE
    extends webclLib.WEBCLNs.SamplerInfo
  
  //SAMPLER_REFERENCE_COUNT                   = 0x1150, // disallowed
  @js.native
  sealed trait SAMPLER_CONTEXT
    extends webclLib.WEBCLNs.SamplerInfo
  
  @js.native
  sealed trait SAMPLER_FILTER_MODE
    extends webclLib.WEBCLNs.SamplerInfo
  
  @js.native
  sealed trait SAMPLER_NORMALIZED_COORDS
    extends webclLib.WEBCLNs.SamplerInfo
  
  /* 0x1153 */ val SAMPLER_ADDRESSING_MODE: SAMPLER_ADDRESSING_MODE with scala.Double = js.native
  /* 0x1151 */ val SAMPLER_CONTEXT: SAMPLER_CONTEXT with scala.Double = js.native
  /* 0x1154 */ val SAMPLER_FILTER_MODE: SAMPLER_FILTER_MODE with scala.Double = js.native
  /* 0x1152 */ val SAMPLER_NORMALIZED_COORDS: SAMPLER_NORMALIZED_COORDS with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[webclLib.WEBCLNs.SamplerInfo with scala.Double] = js.native
}

