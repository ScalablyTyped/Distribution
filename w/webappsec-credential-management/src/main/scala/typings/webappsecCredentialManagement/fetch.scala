package typings.webappsecCredentialManagement

import typings.std.Request
import typings.std.RequestInit
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("fetch")
@js.native
object fetch extends js.Object {
  def apply(input: String): js.Promise[Response] = js.native
  def apply(input: String, init: RequestInit): js.Promise[Response] = js.native
  def apply(input: String, init: CMRequestInit): js.Promise[Response] = js.native
  def apply(input: Request): js.Promise[Response] = js.native
  def apply(input: Request, init: RequestInit): js.Promise[Response] = js.native
  def apply(input: Request, init: CMRequestInit): js.Promise[Response] = js.native
}

