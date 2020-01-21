package typings.webvrApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.webvrApi.webvrApiStrings.mounted
  - typings.webvrApi.webvrApiStrings.navigation
  - typings.webvrApi.webvrApiStrings.requested
  - typings.webvrApi.webvrApiStrings.unmounted
*/
trait VRDisplayEventReasonDtAlias extends js.Object

object VRDisplayEventReasonDtAlias {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def mounted: typings.webvrApi.webvrApiStrings.mounted = this.cast("mounted")
  @scala.inline
  def navigation: typings.webvrApi.webvrApiStrings.navigation = this.cast("navigation")
  @scala.inline
  def requested: typings.webvrApi.webvrApiStrings.requested = this.cast("requested")
  @scala.inline
  def unmounted: typings.webvrApi.webvrApiStrings.unmounted = this.cast("unmounted")
}

