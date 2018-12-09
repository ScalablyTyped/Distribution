package typings
package wreckLib.wreckMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WreckObject extends js.Object {
  var agents: wreckLib.Anon_HttpsAllowUnauthorized = js.native
  var events: js.UndefOr[WreckEventEmitter] = js.native
  def defaults(options: RequestOptions): WreckObject = js.native
  def delete(uri: java.lang.String, options: RequestOptions with ReadOptions): js.Promise[RequestResponse] = js.native
  def get(uri: java.lang.String, options: RequestOptions with ReadOptions): js.Promise[RequestResponse] = js.native
  def parseCacheControl(field: java.lang.String): js.Any = js.native
  def patch(uri: java.lang.String, options: RequestOptions with ReadOptions): js.Promise[RequestResponse] = js.native
  def post(uri: java.lang.String, options: RequestOptions with ReadOptions): js.Promise[RequestResponse] = js.native
  def put(uri: java.lang.String, options: RequestOptions with ReadOptions): js.Promise[RequestResponse] = js.native
  def read(response: nodeLib.httpMod.IncomingMessage, options: ReadOptions): js.Promise[_] = js.native
  def request(method: java.lang.String, uri: java.lang.String, options: RequestOptions): js.Promise[nodeLib.httpMod.IncomingMessage] with wreckLib.Anon_Req = js.native
  def toReadableStream(payload: js.Any): nodeLib.streamMod.Readable = js.native
  def toReadableStream(payload: js.Any, encoding: java.lang.String): nodeLib.streamMod.Readable = js.native
}

