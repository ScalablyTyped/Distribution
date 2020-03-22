package typings.wreck.mod

import typings.node.httpMod.IncomingMessage
import typings.node.streamMod.Readable
import typings.wreck.AnonHttp
import typings.wreck.PromiseIncomingMessagereq
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WreckObject extends js.Object {
  var agents: AnonHttp = js.native
  var events: js.UndefOr[WreckEventEmitter] = js.native
  def defaults(options: RequestOptions): WreckObject = js.native
  def delete(uri: String, options: RequestOptions with ReadOptions): js.Promise[RequestResponse] = js.native
  def get(uri: String, options: RequestOptions with ReadOptions): js.Promise[RequestResponse] = js.native
  def parseCacheControl(field: String): js.Any = js.native
  def patch(uri: String, options: RequestOptions with ReadOptions): js.Promise[RequestResponse] = js.native
  def post(uri: String, options: RequestOptions with ReadOptions): js.Promise[RequestResponse] = js.native
  def put(uri: String, options: RequestOptions with ReadOptions): js.Promise[RequestResponse] = js.native
  def read(response: IncomingMessage, options: ReadOptions): js.Promise[_] = js.native
  def request(method: String, uri: String, options: RequestOptions): PromiseIncomingMessagereq = js.native
  def toReadableStream(payload: js.Any): Readable = js.native
  def toReadableStream(payload: js.Any, encoding: String): Readable = js.native
}

