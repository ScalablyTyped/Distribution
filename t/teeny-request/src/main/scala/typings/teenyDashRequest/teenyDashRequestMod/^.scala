package typings.teenyDashRequest.teenyDashRequestMod

import typings.request.requestMod.Options
import typings.request.requestMod.Request
import typings.request.requestMod.RequestCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("teeny-request", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def teenyRequest(reqOpts: Options): Request = js.native
  def teenyRequest(reqOpts: Options, callback: RequestCallback): Unit = js.native
}

