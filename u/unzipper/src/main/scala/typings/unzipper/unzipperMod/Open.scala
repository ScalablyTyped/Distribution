package typings.unzipper.unzipperMod

import typings.node.Buffer
import typings.node.httpMod.ClientRequest
import typings.node.httpMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("unzipper", "Open")
@js.native
object Open extends js.Object {
  def buffer(data: Buffer): js.Promise[CentralDirectory] = js.native
  def file(filename: String): js.Promise[CentralDirectory] = js.native
  def s3(client: js.Any, params: js.Any): js.Promise[CentralDirectory] = js.native
  def url(request: ClientRequest, opt: String): js.Promise[CentralDirectory] = js.native
  def url(request: ClientRequest, opt: RequestOptions): js.Promise[CentralDirectory] = js.native
}

