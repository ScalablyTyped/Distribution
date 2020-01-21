package typings.weappApi.mod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.weappApi.weappApiStrings.album
  - typings.weappApi.weappApiStrings.camera
*/
trait VideoSourceType extends js.Object

object VideoSourceType {
  @scala.inline
  def album: typings.weappApi.weappApiStrings.album = this.cast("album")
  @scala.inline
  def camera: typings.weappApi.weappApiStrings.camera = this.cast("camera")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

