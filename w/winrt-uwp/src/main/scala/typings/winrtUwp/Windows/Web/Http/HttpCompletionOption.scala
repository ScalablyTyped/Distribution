package typings.winrtUwp.Windows.Web.Http

import org.scalablytyped.runtime.TopLevel
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
  sealed trait responseContentRead extends HttpCompletionOption
  
  /** The operation should complete as soon as a response is available and headers are read. The content is not read yet. */
  @js.native
  sealed trait responseHeadersRead extends HttpCompletionOption
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HttpCompletionOption with Double] = js.native
  /* 0 */ @js.native
  object responseContentRead extends TopLevel[responseContentRead with Double]
  
  /* 1 */ @js.native
  object responseHeadersRead extends TopLevel[responseHeadersRead with Double]
  
}

