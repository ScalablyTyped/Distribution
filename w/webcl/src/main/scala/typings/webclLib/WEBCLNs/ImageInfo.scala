package typings
package webclLib.WEBCLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* cl_image_info */
/* Rewritten from type alias, can be one of: 
  - webclLib.webclLibNumbers.`0x1110`
  - webclLib.webclLibNumbers.`0x1111`
  - webclLib.webclLibNumbers.`0x1112`
  - webclLib.webclLibNumbers.`0x1114`
  - webclLib.webclLibNumbers.`0x1115`
*/
trait ImageInfo extends js.Object

object ImageInfo {
  @scala.inline
  def IMAGE_ELEMENT_SIZE: webclLib.webclLibNumbers.`0x1111` = this.cast(0x1111)
  @scala.inline
  def IMAGE_FORMAT: webclLib.webclLibNumbers.`0x1110` = this.cast(0x1110)
  @scala.inline
  def IMAGE_HEIGHT: webclLib.webclLibNumbers.`0x1115` = this.cast(0x1115)
  @scala.inline
  def IMAGE_ROW_PITCH: webclLib.webclLibNumbers.`0x1112` = this.cast(0x1112)
  @scala.inline
  def IMAGE_WIDTH: webclLib.webclLibNumbers.`0x1114` = this.cast(0x1114)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

