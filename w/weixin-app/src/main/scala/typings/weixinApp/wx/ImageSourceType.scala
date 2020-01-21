package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.weixinApp.weixinAppStrings.album
  - typings.weixinApp.weixinAppStrings.camera
*/
trait ImageSourceType extends js.Object

object ImageSourceType {
  @scala.inline
  def album: typings.weixinApp.weixinAppStrings.album = this.cast("album")
  @scala.inline
  def camera: typings.weixinApp.weixinAppStrings.camera = this.cast("camera")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

