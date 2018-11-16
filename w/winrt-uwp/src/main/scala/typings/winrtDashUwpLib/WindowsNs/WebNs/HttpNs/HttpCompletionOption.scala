package typings
package winrtDashUwpLib.WindowsNs.WebNs.HttpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HttpCompletionOption extends js.Object

/** Indicates whether asynchronous HttpClient operations are considered completed when all of the response is read, or when just the headers are read. */
@JSGlobal("Windows.Web.Http.HttpCompletionOption")
@js.native
object HttpCompletionOption extends js.Object {
  /** The operation should complete after reading the entire response including the content. */
  @js.native
  sealed trait responseContentRead
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpCompletionOption
  
  /** The operation should complete as soon as a response is available and headers are read. The content is not read yet. */
  @js.native
  sealed trait responseHeadersRead
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpCompletionOption
  
  val responseContentRead: responseContentRead with java.lang.String = js.native
  val responseHeadersRead: responseHeadersRead with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpCompletionOption with java.lang.String
  ] = js.native
}

