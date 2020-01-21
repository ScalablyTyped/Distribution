package typings.weappApi.mod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.weappApi.weappApiStrings.success
  - typings.weappApi.weappApiStrings.loading
  - typings.weappApi.weappApiStrings.none
*/
trait icon extends js.Object

object icon {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def loading: typings.weappApi.weappApiStrings.loading = this.cast("loading")
  @scala.inline
  def none: typings.weappApi.weappApiStrings.none = this.cast("none")
  @scala.inline
  def success: typings.weappApi.weappApiStrings.success = this.cast("success")
}

