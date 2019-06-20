package typings
package webclLib.WEBCLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* cl_sampler_info */
/* Rewritten from type alias, can be one of: 
  - webclLib.webclLibNumbers.`0x1151`
  - webclLib.webclLibNumbers.`0x1152`
  - webclLib.webclLibNumbers.`0x1153`
  - webclLib.webclLibNumbers.`0x1154`
*/
trait SamplerInfo extends js.Object

object SamplerInfo {
  @scala.inline
  def SAMPLER_ADDRESSING_MODE: webclLib.webclLibNumbers.`0x1153` = this.cast(0x1153)
  //SAMPLER_REFERENCE_COUNT                   = 0x1150, // disallowed
  @scala.inline
  def SAMPLER_CONTEXT: webclLib.webclLibNumbers.`0x1151` = this.cast(0x1151)
  @scala.inline
  def SAMPLER_FILTER_MODE: webclLib.webclLibNumbers.`0x1154` = this.cast(0x1154)
  @scala.inline
  def SAMPLER_NORMALIZED_COORDS: webclLib.webclLibNumbers.`0x1152` = this.cast(0x1152)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

