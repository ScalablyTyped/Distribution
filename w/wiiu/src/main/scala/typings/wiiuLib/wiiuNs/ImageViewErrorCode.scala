package typings
package wiiuLib.wiiuNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - wiiuLib.wiiuLibNumbers.`202`
  - wiiuLib.wiiuLibNumbers.`203`
  - wiiuLib.wiiuLibNumbers.`204`
  - wiiuLib.wiiuLibNumbers.`205`
*/
trait ImageViewErrorCode extends js.Object

object ImageViewErrorCode {
  @scala.inline
  def DIMENSIONS_TOO_LARGE: wiiuLib.wiiuLibNumbers.`203` = this.cast(203)
  @scala.inline
  def FILE_SIZE_TOO_LARGE: wiiuLib.wiiuLibNumbers.`204` = this.cast(204)
  @scala.inline
  def TOO_MANY_PIXELS_PROGRESSIVE_JPEG: wiiuLib.wiiuLibNumbers.`205` = this.cast(205)
  @scala.inline
  def UNSUPPORTED_FORMAT: wiiuLib.wiiuLibNumbers.`202` = this.cast(202)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

