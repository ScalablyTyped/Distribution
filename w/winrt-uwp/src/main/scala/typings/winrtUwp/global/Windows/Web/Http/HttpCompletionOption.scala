package typings.winrtUwp.global.Windows.Web.Http

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Indicates whether asynchronous HttpClient operations are considered completed when all of the response is read, or when just the headers are read. */
@JSGlobal("Windows.Web.Http.HttpCompletionOption")
@js.native
object HttpCompletionOption extends js.Object {
  /* 0 */ val responseContentRead: typings.winrtUwp.Windows.Web.Http.HttpCompletionOption.responseContentRead with Double = js.native
  /* 1 */ val responseHeadersRead: typings.winrtUwp.Windows.Web.Http.HttpCompletionOption.responseHeadersRead with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Web.Http.HttpCompletionOption with Double] = js.native
}

