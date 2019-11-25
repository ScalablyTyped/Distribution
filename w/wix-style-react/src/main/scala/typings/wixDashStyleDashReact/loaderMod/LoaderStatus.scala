package typings.wixDashStyleDashReact.loaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.wixDashStyleDashReact.wixDashStyleDashReactStrings.loading
  - typings.wixDashStyleDashReact.wixDashStyleDashReactStrings.success
  - typings.wixDashStyleDashReact.wixDashStyleDashReactStrings.error
*/
trait LoaderStatus extends js.Object

object LoaderStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typings.wixDashStyleDashReact.wixDashStyleDashReactStrings.error = this.cast("error")
  @scala.inline
  def loading: typings.wixDashStyleDashReact.wixDashStyleDashReactStrings.loading = this.cast("loading")
  @scala.inline
  def success: typings.wixDashStyleDashReact.wixDashStyleDashReactStrings.success = this.cast("success")
}

