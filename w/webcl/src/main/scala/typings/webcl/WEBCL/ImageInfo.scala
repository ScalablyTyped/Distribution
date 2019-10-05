package typings.webcl.WEBCL

import typings.webcl.webclNumbers.`0x1110`
import typings.webcl.webclNumbers.`0x1111`
import typings.webcl.webclNumbers.`0x1112`
import typings.webcl.webclNumbers.`0x1114`
import typings.webcl.webclNumbers.`0x1115`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* cl_image_info */
/* Rewritten from type alias, can be one of: 
  - typings.webcl.webclNumbers.`0x1110`
  - typings.webcl.webclNumbers.`0x1111`
  - typings.webcl.webclNumbers.`0x1112`
  - typings.webcl.webclNumbers.`0x1114`
  - typings.webcl.webclNumbers.`0x1115`
*/
trait ImageInfo extends js.Object

object ImageInfo {
  @scala.inline
  def IMAGE_ELEMENT_SIZE: `0x1111` = this.cast(0x1111)
  @scala.inline
  def IMAGE_FORMAT: `0x1110` = this.cast(0x1110)
  @scala.inline
  def IMAGE_HEIGHT: `0x1115` = this.cast(0x1115)
  @scala.inline
  def IMAGE_ROW_PITCH: `0x1112` = this.cast(0x1112)
  @scala.inline
  def IMAGE_WIDTH: `0x1114` = this.cast(0x1114)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

