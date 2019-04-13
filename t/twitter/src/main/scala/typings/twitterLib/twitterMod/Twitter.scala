package typings
package twitterLib.twitterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Twitter extends js.Object {
  val VERSION: java.lang.String = js.native
  val allow_promise: scala.Boolean = js.native
  @JSName("request")
  val request_Original: requestLib.requestMod.RequestAPI[
    requestLib.requestMod.Request, 
    requestLib.requestMod.CoreOptions, 
    requestLib.requestMod.RequiredUriUrl
  ] = js.native
  def get(path: java.lang.String): js.Promise[ResponseData] = js.native
  def get(path: java.lang.String, callback: Callback): scala.Unit = js.native
  def get(path: java.lang.String, params: RequestParams): js.Promise[ResponseData] = js.native
  def get(path: java.lang.String, params: RequestParams, callback: Callback): scala.Unit = js.native
  def post(path: java.lang.String): js.Promise[ResponseData] = js.native
  def post(path: java.lang.String, callback: Callback): scala.Unit = js.native
  def post(path: java.lang.String, params: RequestParams): js.Promise[ResponseData] = js.native
  def post(path: java.lang.String, params: RequestParams, callback: Callback): scala.Unit = js.native
  def request(options: requestLib.requestMod.RequiredUriUrl with requestLib.requestMod.CoreOptions): requestLib.requestMod.Request = js.native
  def request(
    options: requestLib.requestMod.RequiredUriUrl with requestLib.requestMod.CoreOptions,
    callback: requestLib.requestMod.RequestCallback
  ): requestLib.requestMod.Request = js.native
  def request(uri: java.lang.String): requestLib.requestMod.Request = js.native
  def request(uri: java.lang.String, callback: requestLib.requestMod.RequestCallback): requestLib.requestMod.Request = js.native
  def request(uri: java.lang.String, options: requestLib.requestMod.CoreOptions): requestLib.requestMod.Request = js.native
  def request(
    uri: java.lang.String,
    options: requestLib.requestMod.CoreOptions,
    callback: requestLib.requestMod.RequestCallback
  ): requestLib.requestMod.Request = js.native
  def stream(method: java.lang.String): nodeLib.eventsMod.EventEmitter = js.native
  def stream(
    method: java.lang.String,
    callback: js.Function1[/* stream */ nodeLib.eventsMod.EventEmitter, scala.Unit]
  ): scala.Unit = js.native
  def stream(method: java.lang.String, params: org.scalablytyped.runtime.StringDictionary[js.Any]): nodeLib.eventsMod.EventEmitter = js.native
  def stream(
    method: java.lang.String,
    params: org.scalablytyped.runtime.StringDictionary[js.Any],
    callback: js.Function1[/* stream */ nodeLib.eventsMod.EventEmitter, scala.Unit]
  ): scala.Unit = js.native
  @JSName("stream")
  def stream_site(method: twitterLib.twitterLibStrings.site): nodeLib.eventsMod.EventEmitter = js.native
  @JSName("stream")
  def stream_site(
    method: twitterLib.twitterLibStrings.site,
    callback: js.Function1[/* stream */ nodeLib.eventsMod.EventEmitter, scala.Unit]
  ): scala.Unit = js.native
  @JSName("stream")
  def stream_site(
    method: twitterLib.twitterLibStrings.site,
    params: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): nodeLib.eventsMod.EventEmitter = js.native
  @JSName("stream")
  def stream_site(
    method: twitterLib.twitterLibStrings.site,
    params: org.scalablytyped.runtime.StringDictionary[js.Any],
    callback: js.Function1[/* stream */ nodeLib.eventsMod.EventEmitter, scala.Unit]
  ): scala.Unit = js.native
  @JSName("stream")
  def stream_user(method: twitterLib.twitterLibStrings.user): nodeLib.eventsMod.EventEmitter = js.native
  @JSName("stream")
  def stream_user(
    method: twitterLib.twitterLibStrings.user,
    callback: js.Function1[/* stream */ nodeLib.eventsMod.EventEmitter, scala.Unit]
  ): scala.Unit = js.native
  @JSName("stream")
  def stream_user(
    method: twitterLib.twitterLibStrings.user,
    params: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): nodeLib.eventsMod.EventEmitter = js.native
  @JSName("stream")
  def stream_user(
    method: twitterLib.twitterLibStrings.user,
    params: org.scalablytyped.runtime.StringDictionary[js.Any],
    callback: js.Function1[/* stream */ nodeLib.eventsMod.EventEmitter, scala.Unit]
  ): scala.Unit = js.native
}

