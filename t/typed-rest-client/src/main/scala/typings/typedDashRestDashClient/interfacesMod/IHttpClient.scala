package typings.typedDashRestDashClient.interfacesMod

import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHttpClient extends js.Object {
  def del(requestUrl: String): js.Promise[IHttpClientResponse] = js.native
  def del(requestUrl: String, additionalHeaders: IHeaders): js.Promise[IHttpClientResponse] = js.native
  def get(requestUrl: String): js.Promise[IHttpClientResponse] = js.native
  def get(requestUrl: String, additionalHeaders: IHeaders): js.Promise[IHttpClientResponse] = js.native
  def options(requestUrl: String): js.Promise[IHttpClientResponse] = js.native
  def options(requestUrl: String, additionalHeaders: IHeaders): js.Promise[IHttpClientResponse] = js.native
  def patch(requestUrl: String, data: String): js.Promise[IHttpClientResponse] = js.native
  def patch(requestUrl: String, data: String, additionalHeaders: IHeaders): js.Promise[IHttpClientResponse] = js.native
  def post(requestUrl: String, data: String): js.Promise[IHttpClientResponse] = js.native
  def post(requestUrl: String, data: String, additionalHeaders: IHeaders): js.Promise[IHttpClientResponse] = js.native
  def put(requestUrl: String, data: String): js.Promise[IHttpClientResponse] = js.native
  def put(requestUrl: String, data: String, additionalHeaders: IHeaders): js.Promise[IHttpClientResponse] = js.native
  def request(verb: String, requestUrl: String, data: String, headers: IHeaders): js.Promise[IHttpClientResponse] = js.native
  def request(verb: String, requestUrl: String, data: ReadableStream, headers: IHeaders): js.Promise[IHttpClientResponse] = js.native
  def requestRaw(info: IRequestInfo, data: String): js.Promise[IHttpClientResponse] = js.native
  def requestRaw(info: IRequestInfo, data: ReadableStream): js.Promise[IHttpClientResponse] = js.native
  def requestRawWithCallback(
    info: IRequestInfo,
    data: String,
    onResult: js.Function2[/* err */ js.Any, /* res */ IHttpClientResponse, Unit]
  ): Unit = js.native
  def requestRawWithCallback(
    info: IRequestInfo,
    data: ReadableStream,
    onResult: js.Function2[/* err */ js.Any, /* res */ IHttpClientResponse, Unit]
  ): Unit = js.native
  def sendStream(verb: String, requestUrl: String, stream: ReadableStream): js.Promise[IHttpClientResponse] = js.native
  def sendStream(verb: String, requestUrl: String, stream: ReadableStream, additionalHeaders: IHeaders): js.Promise[IHttpClientResponse] = js.native
}

