package typings.webappsecDashCredentialDashManagement

import typings.std.Request
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowOrWorkerGlobalScope extends js.Object {
  def fetch(url: String): js.Promise[Response] = js.native
  def fetch(url: String, init: CMRequestInit): js.Promise[Response] = js.native
  def fetch(url: Request): js.Promise[Response] = js.native
  def fetch(url: Request, init: CMRequestInit): js.Promise[Response] = js.native
}

