package typings.webvrDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.webvrDashApi.webvrDashApiStrings.mounted
  - typings.webvrDashApi.webvrDashApiStrings.navigation
  - typings.webvrDashApi.webvrDashApiStrings.requested
  - typings.webvrDashApi.webvrDashApiStrings.unmounted
*/
trait VRDisplayEventReason_dt_alias extends js.Object

object VRDisplayEventReason_dt_alias {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def mounted: typings.webvrDashApi.webvrDashApiStrings.mounted = this.cast("mounted")
  @scala.inline
  def navigation: typings.webvrDashApi.webvrDashApiStrings.navigation = this.cast("navigation")
  @scala.inline
  def requested: typings.webvrDashApi.webvrDashApiStrings.requested = this.cast("requested")
  @scala.inline
  def unmounted: typings.webvrDashApi.webvrDashApiStrings.unmounted = this.cast("unmounted")
}

