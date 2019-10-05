package typings.tampermonkey

import typings.tampermonkey.Tampermonkey.AbortHandle
import typings.tampermonkey.Tampermonkey.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GM_xmlhttpRequest")
@js.native
object GM_xmlhttpRequest extends js.Object {
  // Requests
  /** Makes an xmlHttpRequest */
  def apply[TContext](details: Request[TContext]): AbortHandle[Unit] = js.native
}

