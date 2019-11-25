package typings.weixinDashApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.weixinDashApp.weixinDashAppStrings.album
  - typings.weixinDashApp.weixinDashAppStrings.camera
*/
trait VideoSourceType extends js.Object

object VideoSourceType {
  @scala.inline
  def album: typings.weixinDashApp.weixinDashAppStrings.album = this.cast("album")
  @scala.inline
  def camera: typings.weixinDashApp.weixinDashAppStrings.camera = this.cast("camera")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

