package typings
package typedDashRestDashClientLib.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHttpClient extends js.Object {
  def del(requestUrl: java.lang.String): js.Promise[IHttpClientResponse] = js.native
  def del(requestUrl: java.lang.String, additionalHeaders: IHeaders): js.Promise[IHttpClientResponse] = js.native
  def get(requestUrl: java.lang.String): js.Promise[IHttpClientResponse] = js.native
  def get(requestUrl: java.lang.String, additionalHeaders: IHeaders): js.Promise[IHttpClientResponse] = js.native
  def options(requestUrl: java.lang.String): js.Promise[IHttpClientResponse] = js.native
  def options(requestUrl: java.lang.String, additionalHeaders: IHeaders): js.Promise[IHttpClientResponse] = js.native
  def patch(requestUrl: java.lang.String, data: java.lang.String): js.Promise[IHttpClientResponse] = js.native
  def patch(requestUrl: java.lang.String, data: java.lang.String, additionalHeaders: IHeaders): js.Promise[IHttpClientResponse] = js.native
  def post(requestUrl: java.lang.String, data: java.lang.String): js.Promise[IHttpClientResponse] = js.native
  def post(requestUrl: java.lang.String, data: java.lang.String, additionalHeaders: IHeaders): js.Promise[IHttpClientResponse] = js.native
  def put(requestUrl: java.lang.String, data: java.lang.String): js.Promise[IHttpClientResponse] = js.native
  def put(requestUrl: java.lang.String, data: java.lang.String, additionalHeaders: IHeaders): js.Promise[IHttpClientResponse] = js.native
  def request(verb: java.lang.String, requestUrl: java.lang.String, data: java.lang.String, headers: IHeaders): js.Promise[IHttpClientResponse] = js.native
  def request(
    verb: java.lang.String,
    requestUrl: java.lang.String,
    data: nodeLib.NodeJSNs.ReadableStream,
    headers: IHeaders
  ): js.Promise[IHttpClientResponse] = js.native
  def requestRaw(info: IRequestInfo, data: java.lang.String): js.Promise[IHttpClientResponse] = js.native
  def requestRaw(info: IRequestInfo, data: nodeLib.NodeJSNs.ReadableStream): js.Promise[IHttpClientResponse] = js.native
  def requestRawWithCallback(
    info: IRequestInfo,
    data: java.lang.String,
    onResult: js.Function2[/* err */ js.Any, /* res */ IHttpClientResponse, scala.Unit]
  ): scala.Unit = js.native
  def requestRawWithCallback(
    info: IRequestInfo,
    data: nodeLib.NodeJSNs.ReadableStream,
    onResult: js.Function2[/* err */ js.Any, /* res */ IHttpClientResponse, scala.Unit]
  ): scala.Unit = js.native
  def sendStream(verb: java.lang.String, requestUrl: java.lang.String, stream: nodeLib.NodeJSNs.ReadableStream): js.Promise[IHttpClientResponse] = js.native
  def sendStream(
    verb: java.lang.String,
    requestUrl: java.lang.String,
    stream: nodeLib.NodeJSNs.ReadableStream,
    additionalHeaders: IHeaders
  ): js.Promise[IHttpClientResponse] = js.native
}

