package typings.wixStyleReact.loaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.wixStyleReact.wixStyleReactStrings.loading
  - typings.wixStyleReact.wixStyleReactStrings.success
  - typings.wixStyleReact.wixStyleReactStrings.error
*/
trait LoaderStatus extends js.Object

object LoaderStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typings.wixStyleReact.wixStyleReactStrings.error = this.cast("error")
  @scala.inline
  def loading: typings.wixStyleReact.wixStyleReactStrings.loading = this.cast("loading")
  @scala.inline
  def success: typings.wixStyleReact.wixStyleReactStrings.success = this.cast("success")
}

