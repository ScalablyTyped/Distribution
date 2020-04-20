package typings.tabris.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebViewNavigateEvent[Target] extends EventObject[Target] {
  val preventDefault: js.Function = js.native
  val url: String = js.native
}

