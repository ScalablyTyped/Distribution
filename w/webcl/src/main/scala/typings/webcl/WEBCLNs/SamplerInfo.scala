package typings.webcl.WEBCLNs

import typings.webcl.webclNumbers.`0x1151`
import typings.webcl.webclNumbers.`0x1152`
import typings.webcl.webclNumbers.`0x1153`
import typings.webcl.webclNumbers.`0x1154`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* cl_sampler_info */
/* Rewritten from type alias, can be one of: 
  - typings.webcl.webclNumbers.`0x1151`
  - typings.webcl.webclNumbers.`0x1152`
  - typings.webcl.webclNumbers.`0x1153`
  - typings.webcl.webclNumbers.`0x1154`
*/
trait SamplerInfo extends js.Object

object SamplerInfo {
  @scala.inline
  def SAMPLER_ADDRESSING_MODE: `0x1153` = this.cast(0x1153)
  //SAMPLER_REFERENCE_COUNT                   = 0x1150, // disallowed
  @scala.inline
  def SAMPLER_CONTEXT: `0x1151` = this.cast(0x1151)
  @scala.inline
  def SAMPLER_FILTER_MODE: `0x1154` = this.cast(0x1154)
  @scala.inline
  def SAMPLER_NORMALIZED_COORDS: `0x1152` = this.cast(0x1152)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

