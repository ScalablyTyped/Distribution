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
  val request_Original: requestLib.requestMod.requestNs.RequestAPI[
    requestLib.requestMod.requestNs.Request, 
    requestLib.requestMod.requestNs.CoreOptions, 
    requestLib.requestMod.requestNs.RequiredUriUrl
  ] = js.native
  def get(path: java.lang.String): js.Promise[twitterLib.twitterMod.TwitterNs.ResponseData] = js.native
  def get(path: java.lang.String, callback: twitterLib.twitterMod.TwitterNs.Callback): scala.Unit = js.native
  def get(path: java.lang.String, params: twitterLib.twitterMod.TwitterNs.RequestParams): js.Promise[twitterLib.twitterMod.TwitterNs.ResponseData] = js.native
  def get(
    path: java.lang.String,
    params: twitterLib.twitterMod.TwitterNs.RequestParams,
    callback: twitterLib.twitterMod.TwitterNs.Callback
  ): scala.Unit = js.native
  def post(path: java.lang.String): js.Promise[twitterLib.twitterMod.TwitterNs.ResponseData] = js.native
  def post(path: java.lang.String, callback: twitterLib.twitterMod.TwitterNs.Callback): scala.Unit = js.native
  def post(path: java.lang.String, params: twitterLib.twitterMod.TwitterNs.RequestParams): js.Promise[twitterLib.twitterMod.TwitterNs.ResponseData] = js.native
  def post(
    path: java.lang.String,
    params: twitterLib.twitterMod.TwitterNs.RequestParams,
    callback: twitterLib.twitterMod.TwitterNs.Callback
  ): scala.Unit = js.native
  def request(
    options: requestLib.requestMod.requestNs.RequiredUriUrl with requestLib.requestMod.requestNs.CoreOptions
  ): requestLib.requestMod.requestNs.Request = js.native
  def request(
    options: requestLib.requestMod.requestNs.RequiredUriUrl with requestLib.requestMod.requestNs.CoreOptions,
    callback: requestLib.requestMod.requestNs.RequestCallback
  ): requestLib.requestMod.requestNs.Request = js.native
  def request(uri: java.lang.String): requestLib.requestMod.requestNs.Request = js.native
  def request(uri: java.lang.String, callback: requestLib.requestMod.requestNs.RequestCallback): requestLib.requestMod.requestNs.Request = js.native
  def request(uri: java.lang.String, options: requestLib.requestMod.requestNs.CoreOptions): requestLib.requestMod.requestNs.Request = js.native
  def request(
    uri: java.lang.String,
    options: requestLib.requestMod.requestNs.CoreOptions,
    callback: requestLib.requestMod.requestNs.RequestCallback
  ): requestLib.requestMod.requestNs.Request = js.native
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

