package typings.wegameDashApi.wx.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.wegameDashApi.wegameDashApiStrings.text
  - typings.wegameDashApi.wegameDashApiStrings.image
*/
trait ButtonType extends js.Object

object ButtonType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def image: typings.wegameDashApi.wegameDashApiStrings.image = this.cast("image")
  @scala.inline
  def text: typings.wegameDashApi.wegameDashApiStrings.text = this.cast("text")
}

