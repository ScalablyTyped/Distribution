package typings.tabris

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("fetch")
@js.native
object fetch extends js.Object {
  // fetch
  def apply(url: String): js.Promise[Response] = js.native
  def apply(url: String, init: RequestInit): js.Promise[Response] = js.native
  def apply(url: Request): js.Promise[Response] = js.native
  def apply(url: Request, init: RequestInit): js.Promise[Response] = js.native
}

