package typings.wegameApi.wx.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.wegameApi.wegameApiStrings.text
  - typings.wegameApi.wegameApiStrings.image
*/
trait ButtonType extends js.Object

object ButtonType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def image: typings.wegameApi.wegameApiStrings.image = this.cast("image")
  @scala.inline
  def text: typings.wegameApi.wegameApiStrings.text = this.cast("text")
}

