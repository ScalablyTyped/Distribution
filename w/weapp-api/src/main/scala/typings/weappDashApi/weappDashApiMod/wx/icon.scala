package typings.weappDashApi.weappDashApiMod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.weappDashApi.weappDashApiStrings.success
  - typings.weappDashApi.weappDashApiStrings.loading
  - typings.weappDashApi.weappDashApiStrings.none
*/
trait icon extends js.Object

object icon {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def loading: typings.weappDashApi.weappDashApiStrings.loading = this.cast("loading")
  @scala.inline
  def none: typings.weappDashApi.weappDashApiStrings.none = this.cast("none")
  @scala.inline
  def success: typings.weappDashApi.weappDashApiStrings.success = this.cast("success")
}

