package typings
package typedDashRestDashClientLib.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHttpClient extends js.Object {
  def del(requestUrl: java.lang.String): stdLib.Promise[IHttpClientResponse] = js.native
  def del(requestUrl: java.lang.String, additionalHeaders: IHeaders): stdLib.Promise[IHttpClientResponse] = js.native
  def get(requestUrl: java.lang.String): stdLib.Promise[IHttpClientResponse] = js.native
  def get(requestUrl: java.lang.String, additionalHeaders: IHeaders): stdLib.Promise[IHttpClientResponse] = js.native
  def options(requestUrl: java.lang.String): stdLib.Promise[IHttpClientResponse] = js.native
  def options(requestUrl: java.lang.String, additionalHeaders: IHeaders): stdLib.Promise[IHttpClientResponse] = js.native
  def patch(requestUrl: java.lang.String, data: java.lang.String): stdLib.Promise[IHttpClientResponse] = js.native
  def patch(requestUrl: java.lang.String, data: java.lang.String, additionalHeaders: IHeaders): stdLib.Promise[IHttpClientResponse] = js.native
  def post(requestUrl: java.lang.String, data: java.lang.String): stdLib.Promise[IHttpClientResponse] = js.native
  def post(requestUrl: java.lang.String, data: java.lang.String, additionalHeaders: IHeaders): stdLib.Promise[IHttpClientResponse] = js.native
  def put(requestUrl: java.lang.String, data: java.lang.String): stdLib.Promise[IHttpClientResponse] = js.native
  def put(requestUrl: java.lang.String, data: java.lang.String, additionalHeaders: IHeaders): stdLib.Promise[IHttpClientResponse] = js.native
  def request(verb: java.lang.String, requestUrl: java.lang.String, data: java.lang.String, headers: IHeaders): stdLib.Promise[IHttpClientResponse] = js.native
  def request(
    verb: java.lang.String,
    requestUrl: java.lang.String,
    data: nodeLib.NodeJSNs.ReadableStream,
    headers: IHeaders
  ): stdLib.Promise[IHttpClientResponse] = js.native
  def requestRaw(info: IRequestInfo, data: java.lang.String): stdLib.Promise[IHttpClientResponse] = js.native
  def requestRaw(info: IRequestInfo, data: nodeLib.NodeJSNs.ReadableStream): stdLib.Promise[IHttpClientResponse] = js.native
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
  def sendStream(verb: java.lang.String, requestUrl: java.lang.String, stream: nodeLib.NodeJSNs.ReadableStream): stdLib.Promise[IHttpClientResponse] = js.native
  def sendStream(
    verb: java.lang.String,
    requestUrl: java.lang.String,
    stream: nodeLib.NodeJSNs.ReadableStream,
    additionalHeaders: IHeaders
  ): stdLib.Promise[IHttpClientResponse] = js.native
}

